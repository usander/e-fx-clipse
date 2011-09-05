package at.bestsolution.efxclipse.tooling.jdt.ui.internal.handler

import java.util.Properties
import java.util.Set
import java.util.Map
import java.util.Collection
import java.io.File

class AntTemplate {
	def generateAnt(Map<String,Object> properties) {
		val projectName = properties.get("projectName") as String;
		
		'''
		<?xml version="1.0" encoding="UTF-8"?>
			<project name="�projectName�" default="do-deploy" basedir=".">
			�createInitTaskTarget(properties)�
			�createLocalSetup(properties)�
			�compileTarget(properties)�
			�createDoDeployTarget(properties)�
		</project>
		'''.toString
	}
	
	def createLocalSetup(Map<String,Object> properties) {
		val externalLibs = properties.get("orig.externalLibs") as Collection<File>;
		val projectSrcDirs = properties.get("orig.projectSourceDirs") as Collection<SetupDirectory>;
		var projectRefs = properties.get("orig.projectRefSourceDirs") as Collection<SetupDirectory>;
		'''
		<target name="setup-staging-area">
			<delete dir="externalLibs" />
			<delete dir="project" />
			<delete dir="projectRefs" />
			
			<mkdir dir="externalLibs" />
			
			�FOR File l : externalLibs�
			<copyfile dest="externalLibs/�l.name�" src="�l.absolutePath�"/>
			�ENDFOR�
			
			<mkdir dir="project" />
			�FOR SetupDirectory d : projectSrcDirs�
			<copy todir="project">
				<fileset dir="�d.originalPath.absolutePath�">
					<include name="�d.relativePath.name�/**" />
				</fileset>
			</copy>
			�ENDFOR�
			
			<mkdir dir="projectRefs" />
			�FOR SetupDirectory d : projectRefs�
			<copy todir="projectRefs">
				<fileset dir="�d.originalPath.absolutePath�">
					<include name="�d.relativePath.path�/**" />
				</fileset>
			</copy>
			�ENDFOR�
		</target>
		'''
	}
	
	def createInitTaskTarget(Map<String,Object> properties) {
		val sdkPath = properties.get("jfxSdk") as String;
		'''
		<target name="init-fx-tasks">
			<property name="javafx.tools.ant.jar" value="�sdkPath�/tools/ant-javafx.jar"/>
			
			<taskdef name="fxdeploy"
				classname="com.sun.javafx.tools.ant.DeployFXTask"
				classpath="${javafx.tools.ant.jar}"/>
			<taskdef name="fxjar"
				classname="com.sun.javafx.tools.ant.FXJar"
				classpath="${javafx.tools.ant.jar}"/>
			<taskdef name="fxsignjar"
				classname="com.sun.javafx.tools.ant.FXSignJarTask"
				classpath="${javafx.tools.ant.jar}"/>
		</target>
		'''
	}
	
	def compileTarget(Map<String,Object> properties) {
		val projectRefs = properties.get("projectRefSourceDirs") as Collection<String>;
		val externalLibs = properties.get("externalLibs") as Collection<String>;
		val projectSourceDirs = properties.get("projectSourceDirs") as Collection<String>;
		val sdkPath = properties.get("jfxSdk") as String;
		
		'''
		<target name='do-compile'>
			<delete dir="build" />
			<mkdir dir="build/src" />
			<mkdir dir="build/libs" />
			<mkdir dir="build/classes" />
		
			<!-- Copy project-libs references -->
			<copy todir="build/libs">
				<fileset dir="externalLibs">
					�FOR String s : externalLibs�
					<include name="�s�"/>
					�ENDFOR�
				</fileset>
			</copy>
		
			<!-- Copy project references -->
			�FOR String s : projectRefs�
			<copy todir="build/src">
				<fileset dir="projectRefs/�s�">
					<include name="**/*"/>
				</fileset>
			</copy>
			�ENDFOR�
		
			<!-- Copy project sources itself -->
			�FOR String s : projectSourceDirs�
			<copy todir="build/src">
				<fileset dir="project/�s�">
					<include name="**/*"/>
				</fileset>
			</copy>
			�ENDFOR�
		
			<javac srcdir="build/src" destdir="build/classes">
				<classpath>
					<fileset dir="build/libs">
						<include name="*"/>
					</fileset>
					<filelist>
						<file name="�sdkPath�\rt\lib\jfxrt.jar"/>
					</filelist>
				</classpath>
			</javac>
			
			<copy todir="build/classes">
			�FOR String s : projectSourceDirs�
				<fileset dir="project/�s�">
					<exclude name="**/*.java"/>
				</fileset>
			�ENDFOR�
			</copy>

		</target>		
		'''	
	}
	
	def createDoDeployTarget(Map<String,Object> properties) {
		val projectName = properties.get("projectName") as String;
		val sdkPath = properties.get("jfxSdk") as String;
		val mainClass = properties.get("applicationClass") as String;
		val appletWidth = properties.get("appletWith") as String;
		val appletHeight = properties.get("appletHeight") as String;
		val externalLibs = properties.get("externalLibs") as Collection<String>;
		val appVendor = properties.get("appVendor") as String;
		val appTitle = properties.get("appTitle") as String;
		val appVersion = properties.get("appVersion") as String;
		
		var keyStore = properties.get("keyStore") as String;
		var keyStoreAlias = properties.get("keyStoreAlias") as String;
		var keyStorePass = properties.get("keyStorePass") as String;
		
		'''
		<target name="do-deploy" depends="setup-staging-area, do-compile, init-fx-tasks">
			<delete file="dist"/>
			<delete file="deploy" />
			
			<mkdir dir="dist" />
			<mkdir dir="dist/libs" />
			
			<copy todir="dist/libs">
				<fileset dir="externalLibs">
					<include name="*" />
				</fileset>
			</copy>
			
			<fxjar destfile="dist/�projectName�.jar">
				<application mainclass="�mainClass�"/>
				<fileset dir="build/classes"/>
				<resources>
					<fileset dir="dist">
						<include name="libs/*"/>
					</fileset>
				</resources>
				<manifest>
					<attribute name="Implementation-Vendor" value="�appVendor�"/>
					<attribute name="Implementation-Title" value="�appTitle�"/>
					<attribute name="Implementation-Version" value="�appVersion�"/>
				</manifest>
			</fxjar>
			
			�IF keyStore != null�
			<fxsignjar keystore="�keyStore�" alias="�keyStoreAlias�" �IF keyStorePass != null�storepass="�keyStorePass�" �ENDIF�destDir="dist">
				<fileset file="dist/�projectName�.jar"/>
			</fxsignjar>
			�ENDIF�
		
			�IF appletWidth != null && appletHeight != null�
			<mkdir dir="deploy" />
			<!-- Need to use ${basedir} because somehow the ant task is calculating the directory differently -->
			<fxdeploy width="�appletWidth�" height="�appletHeight�" outdir="${basedir}/deploy" embedJNLP="true" outfile="�projectName�">
				<info title="�projectName�" vendor="�appVendor�"/>
				<application name="�projectName�" mainclass="�mainClass�"/>
				<resources>
					<fileset dir="dist">
						<include name="**/*"/>
					</fileset>
				</resources>
			</fxdeploy>
			�ENDIF�
		</target>
		'''
	}
}