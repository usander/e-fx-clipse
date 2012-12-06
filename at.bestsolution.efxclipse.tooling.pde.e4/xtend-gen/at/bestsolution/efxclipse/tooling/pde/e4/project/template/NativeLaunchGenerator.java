package at.bestsolution.efxclipse.tooling.pde.e4.project.template;

import at.bestsolution.efxclipse.tooling.pde.e4.project.template.NativeLaunchData;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class NativeLaunchGenerator {
  public CharSequence generate(final NativeLaunchData data) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<project name=\"native-build\" default=\"do-deploy\" basedir=\".\"  xmlns:fx=\"javafx:com.sun.javafx.tools.ant\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<property name=\"eclipse-app-dir\" value=\"");
    String _tychoOutDir = data.getTychoOutDir();
    _builder.append(_tychoOutDir, "	");
    _builder.append("\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<target name=\"init-fx-tasks\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<path id=\"fxant\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<filelist>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<file name=\"${java.home}\\..\\lib\\ant-javafx.jar\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<file name=\"${java.home}\\lib\\jfxrt.jar\"/>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</filelist>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</path>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<taskdef resource=\"com/sun/javafx/tools/ant/antlib.xml\"      ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("uri=\"javafx:com.sun.javafx.tools.ant\"");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("classpathref=\"fxant\"/>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<taskdef name=\"configIni\" classpath=\"at.bestsolution.efxclipse.tooling.build-0.0.1.jar\" classname=\"at.bestsolution.efxclipse.tooling.build.ConfigFixTask\" />");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</target>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<target name=\"config-fix\" depends=\"init-fx-tasks\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<configIni rootfolder=\"${eclipse-app-dir}\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</target>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<target name=\"do-deploy\" depends=\"config-fix, init-fx-tasks\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<fx:resources id=\"appRes\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<fx:fileset dir=\".\" includes=\"fx-osgi-launch.jar\"/>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<fx:fileset dir=\"${eclipse-app-dir}\" includes=\"**/*\"/>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</fx:resources>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<fx:application id=\"fxApplication\"");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t");
    _builder.append("name=\"");
    String _productName = data.getProductName();
    _builder.append(_productName, "								");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t\t\t\t\t");
    _builder.append("mainClass=\"org.eclipse.equinox.launcher.Main\"");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t");
    _builder.append("toolkit=\"swing\"");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("/>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<fx:deploy");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("embedJNLP=\"false\"");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("extension=\"false\"");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("includeDT=\"false\"");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("offlineAllowed=\"true\"");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("outdir=\"${basedir}/deploy\"");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("outfile=\"fix-ide\" ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("nativeBundles=\"all\"");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("updatemode=\"background\"");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append(">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<fx:info title=\"");
    String _productName_1 = data.getProductName();
    _builder.append(_productName_1, "			");
    _builder.append("\" vendor=\"");
    String _vendorName = data.getVendorName();
    _builder.append(_vendorName, "			");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("<fx:application refid=\"fxApplication\"/>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<fx:resources refid=\"appRes\"/>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</fx:deploy>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</target>");
    _builder.newLine();
    _builder.append("</project>");
    return _builder;
  }
}