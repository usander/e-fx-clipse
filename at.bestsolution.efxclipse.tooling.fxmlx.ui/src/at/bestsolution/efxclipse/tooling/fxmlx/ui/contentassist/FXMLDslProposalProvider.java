/*
* generated by Xtext
*/
package at.bestsolution.efxclipse.tooling.fxmlx.ui.contentassist;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider;
import org.eclipse.xtext.common.types.xtext.ui.ITypesProposalProvider;
import org.eclipse.xtext.common.types.xtext.ui.TypeMatchFilters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import at.bestsolution.efxclipse.tooling.fxgraph.ui.util.JDTHelper;
import at.bestsolution.efxclipse.tooling.fxgraph.ui.util.JDTHelper.Property;
import at.bestsolution.efxclipse.tooling.fxgraph.ui.util.JDTHelper.TypeData;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ContainerElementDefinition;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.EmptyElementDefinition;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXML;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ProcessingInstruction;

import com.google.inject.Inject;
/**
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on how to customize content assistant
 */
@SuppressWarnings("restriction")
public class FXMLDslProposalProvider extends AbstractFXMLDslProposalProvider {
	
	private JDTHelper helper;

	@Inject
	private ITypesProposalProvider typeProposalProviders;
	
	@Inject 
	private IJvmTypeProvider.Factory jdtTypeProvider;
	
	@Inject
	private IJavaProjectProvider projectProvider;
	
	public FXMLDslProposalProvider() {
		this.helper = new JDTHelper();
	}
	
	private static IJavaProject getJavaProject(EObject model) {
		// TODO Should we cache that?
		URI uri = model.eResource().getURI();
		IProject project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(uri.segment(1));
		return JavaCore.create(project);
	}
	
	@Override
	public void completeAttributePropertyDefinition_Name(EObject model,
			Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		
		if( isClassDefinition(model) ) {
			String name = null;
			
			if( model instanceof ContainerElementDefinition ) {
				ContainerElementDefinition e = (ContainerElementDefinition) model;
				name = e.getName();
			} else if( model instanceof EmptyElementDefinition ) {
				EmptyElementDefinition e = (EmptyElementDefinition) model;
				name = e.getName();
			}
			
			IJavaProject jProject = getJavaProject(model);
			IType type = toJavaClass(name, (FXML) model.eResource().getContents().get(0), jProject);
			
			if (type != null) {
				TypeData typeData = helper.getTypeData(jProject, type);
				if( typeData != null ) {
					for( Property p : typeData.properties ) {
						if( p instanceof at.bestsolution.efxclipse.tooling.fxgraph.ui.util.JDTHelper.SingleValueProperty ) {
							ICompletionProposal cp = createCompletionProposal(p.name+"=\"\"", p.getDescription(), p.getIcon(), context);
							if(cp instanceof ConfigurableCompletionProposal ) {
								ConfigurableCompletionProposal ccp = (ConfigurableCompletionProposal) cp;
								ccp.setCursorPosition(ccp.getCursorPosition()-1);
							}
							acceptor.accept(cp);
						}
					}
				}
			}
		}
	}
	
	@Override
	public void completeContainerElementDefinition_Children(EObject model,
			Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
//		System.err.println("Children proposal Model:" + model);
		if( isClassDefinition(model) ) {
			if( !"<".equals(context.getPrefix()) ) {
				return;
			}
			IJavaProject jProject = getJavaProject(model);
			IType type = resolveType(model, jProject);
			
			if (type != null) {
				TypeData typeData = helper.getTypeData(jProject, type);
				if( typeData != null ) {
					for( Property p : typeData.properties ) {
						acceptor.accept(createCompletionProposal("<" + p.name + "></"+p.name+">", p.getDescription(), p.getIcon(), getPriorityHelper().getDefaultPriority()+1, context.getPrefix(), context));
					}
				}
			}
		}
	}
	
	@Override
	public void completeEmptyElementDefinition_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
	}
	
	@Override
	public void completeContainerElementDefinition_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		System.err.println("Container name:" + model);
		if(isAttributeDefinition(model)) {
//			if( model instanceof ContainerElementDefinition ) {
//				if( ((ContainerElementDefinition) model).getEndname() != null ) {
//					return;
//				}
//			}
//			
			if( isClassDefinition(model.eContainer()) ) {
				IJavaProject jProject = getJavaProject(model.eContainer());
				IType type = resolveType(model.eContainer(), jProject);
				String propname = getName(model);
				
				IType methodType = null;
				
				if (type != null) {
					try {
						TypeData typeData = helper.getTypeData(jProject, type);
						if( typeData != null ) {
							for( Property jdtProp : typeData.properties ) {
								if( jdtProp.name.equals(propname) ) {
									methodType = jProject.findType(Signature.toString(jdtProp.method.getReturnType()));
								}
							}
						}
						
						if( methodType != null ) {
							JvmType superType = jdtTypeProvider.createTypeProvider(model.eResource().getResourceSet()).findTypeByName(methodType.getFullyQualifiedName());
							if( superType != null ) {
								IValueConverter<String> c = new IValueConverter<String>() {

									public String toValue(String string, INode node) throws ValueConverterException {
										return string.substring(0,string.indexOf('>'));
									}

									public String toString(String value) throws ValueConverterException {
										return "" + value + "></"+value+">";
									}
									
								};
								typeProposalProviders.createSubTypeProposals(superType, this, context, TypesPackage.Literals.JVM_PARAMETERIZED_TYPE_REFERENCE__TYPE, TypeMatchFilters.all(), c, acceptor);		
							}
						}
					} catch(JavaModelException e ) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
	
//	private void createJDTProproposals(JvmType superType) {
//		if (superType == null || superType.eIsProxy())
//			return;
//		if (superType.eResource() == null || superType.eResource().getResourceSet() == null)
//			return;
//		IJavaProject project = projectProvider.getJavaProject(superType.eResource().getResourceSet());
//		if (project == null)
//			return;
//		
//		String fqn = superType.getIdentifier();
//		// java.lang.Object - no need to create hierarchy scope
//		if (Object.class.getName().equals(fqn)) {
//			createTypeProposals(project, this, context, typeReference, filter, valueConverter, acceptor);
//			return;
//		} 
//		
//		final Collection<String> superTypes = superTypeCollector.collectSuperTypeNames(superType);
//		try {
//			IType type = project.findType(fqn);
//			if (type != null) {
//				IJavaSearchScope hierarchyScope = SearchEngine.createHierarchyScope(type);
//				IJavaSearchScope projectScope = SearchEngine.createJavaSearchScope(new IJavaElement[] { project });
//				IJavaSearchScope scope = new IntersectingJavaSearchScope(projectScope, hierarchyScope);
//				searchAndCreateProposals(scope, this, context, typeReference, TypeMatchFilters.and(filter, new ITypesProposalProvider.Filter() {
//					public boolean accept(int modifiers, char[] packageName, char[] simpleTypeName,
//							char[][] enclosingTypeNames, String path) {
//						StringBuilder fqName = new StringBuilder(packageName.length + simpleTypeName.length + 1);
//						if (packageName.length != 0) {
//							fqName.append(packageName);
//							fqName.append('.');
//						}
//						for(char[] enclosingType: enclosingTypeNames) {
//							fqName.append(enclosingType);
//							fqName.append('$');
//						}
//						fqName.append(simpleTypeName);
//						String fqNameAsString = fqName.toString();
//						return !superTypes.contains(fqNameAsString);
//					}
//					
//					public int getSearchFor() {
//						return filter.getSearchFor();
//					}
//					
//				}), valueConverter, acceptor);
//			}
//		} catch(JavaModelException ex) {
//			// ignore
//		}
//	}
	
	private static String getName(EObject model) {
		String name = null;
		if( model instanceof ContainerElementDefinition ) {
			ContainerElementDefinition e = (ContainerElementDefinition) model;
			name = e.getName();
		} else if( model instanceof EmptyElementDefinition ) {
			EmptyElementDefinition e = (EmptyElementDefinition) model;
			name = e.getName();
		}
		
		return name;
	}
	
	private static IType resolveType(EObject model, IJavaProject jProject) {
		String name = null;
		if( model instanceof ContainerElementDefinition ) {
			ContainerElementDefinition e = (ContainerElementDefinition) model;
			name = e.getName();
		} else if( model instanceof EmptyElementDefinition ) {
			EmptyElementDefinition e = (EmptyElementDefinition) model;
			name = e.getName();
		}
		
		if( name != null ) {
			return toJavaClass(name, (FXML) model.eResource().getContents().get(0), jProject);
		}
		
		return null;
	}
	
	private static boolean isAttributeDefinition(EObject model) {
		String namespace = null;
		String name = null;
		
		if( model instanceof ContainerElementDefinition ) {
			ContainerElementDefinition e = (ContainerElementDefinition) model;
			name = e.getName();
			namespace = e.getNamespace();
		} else if( model instanceof EmptyElementDefinition ) {
			EmptyElementDefinition e = (EmptyElementDefinition) model;
			name = e.getName();
			namespace = e.getNamespace();
		}
		
		return namespace == null && name != null && Character.isLowerCase(name.charAt(0));
	}
	
	private static boolean isClassDefinition(EObject model) {
		String namespace = null;
		String name = null;
		
		if( model instanceof ContainerElementDefinition ) {
			ContainerElementDefinition e = (ContainerElementDefinition) model;
			name = e.getName();
			namespace = e.getNamespace();
		} else if( model instanceof EmptyElementDefinition ) {
			EmptyElementDefinition e = (EmptyElementDefinition) model;
			name = e.getName();
			namespace = e.getNamespace();
		}
		
		return namespace == null && name != null && Character.isUpperCase(name.charAt(0)) && ! name.contains(".");
	}
	
	private static IType toJavaClass(String name, FXML fxml,
			IJavaProject jProject) {
		IType type = null;

		for (String imp : getImports(fxml)) {
			if (imp.endsWith("*")) {
				try {
					IType t = jProject.findType(imp.substring(0,
							imp.length() - 1) + name);
					if (t != null) {
						return t;
					}
				} catch (JavaModelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				if (imp.endsWith(name)) {
					try {
						IType t = jProject.findType(imp);
						if (t != null) {
							return t;
						}
					} catch (JavaModelException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

		return type;
	}

	private static List<String> getImports(FXML fxml) {
		List<String> imports = new ArrayList<String>();

		for( ProcessingInstruction p : fxml.getProcessingInstructions() ) {
			if( p.getType().equals("import") ) {
				imports.add(p.getImportedNamespace());
			}
		}
		
		return imports;
	}
}
