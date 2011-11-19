/*
 * generated by Xtext
 */
package at.bestsolution.efxclipse.tooling.fxgraph.ui.contentassist;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.IBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.internal.corext.dom.TypeRules;
import org.eclipse.jdt.internal.corext.util.JavaModelUtil;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.jdt.IJavaElementFinder;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Model;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ResourceValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.StaticValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.ui.internal.FXGraphActivator;
import at.bestsolution.efxclipse.tooling.fxgraph.ui.util.RelativeFileLocator;

import com.google.inject.Inject;

/**
 * see
 * http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on
 * how to customize content assistant
 */
public class FXGraphProposalProvider extends AbstractFXGraphProposalProvider {
	private Map<String, TypeData> typeCache = new HashMap<String, TypeData>();
	
	private static final String FIELD_KEY = FXGraphProposalProvider.class.getName() + ".FIELD";
	private static final String EVENT_KEY = FXGraphProposalProvider.class.getName() + ".EVENT";
	private static final String LIST_KEY = FXGraphProposalProvider.class.getName() + ".LIST";
	private static final String MAP_KEY = FXGraphProposalProvider.class.getName() + ".MAP";
	
	private static final String METHOD_PRIVATE_KEY = FXGraphProposalProvider.class.getName() + ".METHOD_PRIVATE";
	private static final String METHOD_DEFAULT_KEY = FXGraphProposalProvider.class.getName() + ".METHOD_DEFAULT";
	private static final String METHOD_PROTECTED_KEY = FXGraphProposalProvider.class.getName() + ".METHOD_PROTECTED";
	private static final String METHOD_PUBLIC_KEY = FXGraphProposalProvider.class.getName() + ".METHOD_PUBLIC";
	private static final String STAT_METHOD_PUBLIC_KEY = FXGraphProposalProvider.class.getName() + ".STAT_METHOD_PUBLIC_KEY";
	
	private static final String EXTERNALIZED_STRING_KEY = FXGraphProposalProvider.class.getName() + ".EXTERNALIZED_STRING_KEY";
	
	@Inject
	private IJavaElementFinder javaElementFinder;
	
	static {
		JFaceResources.getImageRegistry().put(FIELD_KEY, FXGraphActivator.imageDescriptorFromPlugin("at.bestsolution.efxclipse.tooling.fxgraph.ui", "/icons/field_public_obj.gif"));
		JFaceResources.getImageRegistry().put(EVENT_KEY, FXGraphActivator.imageDescriptorFromPlugin("at.bestsolution.efxclipse.tooling.fxgraph.ui", "/icons/correction_change.gif"));
		JFaceResources.getImageRegistry().put(LIST_KEY, FXGraphActivator.imageDescriptorFromPlugin("at.bestsolution.efxclipse.tooling.fxgraph.ui", "/icons/class_hi.gif"));
		JFaceResources.getImageRegistry().put(MAP_KEY, FXGraphActivator.imageDescriptorFromPlugin("at.bestsolution.efxclipse.tooling.fxgraph.ui", "/icons/types.gif"));
		
		JFaceResources.getImageRegistry().put(METHOD_PRIVATE_KEY, FXGraphActivator.imageDescriptorFromPlugin("at.bestsolution.efxclipse.tooling.fxgraph.ui", "/icons/methpri_obj.gif"));
		JFaceResources.getImageRegistry().put(METHOD_DEFAULT_KEY, FXGraphActivator.imageDescriptorFromPlugin("at.bestsolution.efxclipse.tooling.fxgraph.ui", "/icons/methdef_obj.gif"));
		JFaceResources.getImageRegistry().put(METHOD_PROTECTED_KEY, FXGraphActivator.imageDescriptorFromPlugin("at.bestsolution.efxclipse.tooling.fxgraph.ui", "/icons/methpro_obj.gif"));
		JFaceResources.getImageRegistry().put(METHOD_PUBLIC_KEY, FXGraphActivator.imageDescriptorFromPlugin("at.bestsolution.efxclipse.tooling.fxgraph.ui", "/icons/methpub_obj.gif"));
		
		JFaceResources.getImageRegistry().put(STAT_METHOD_PUBLIC_KEY, FXGraphActivator.imageDescriptorFromPlugin("at.bestsolution.efxclipse.tooling.fxgraph.ui", "/icons/statmethpub_obj.gif"));
		
		JFaceResources.getImageRegistry().put(EXTERNALIZED_STRING_KEY, FXGraphActivator.imageDescriptorFromPlugin("at.bestsolution.efxclipse.tooling.fxgraph.ui", "/icons/internalize.gif"));
	}

	static class TypeData {
		SortedSet<Property> properties = new TreeSet<Property>();
	}

	static abstract class Property implements Comparable<Property> {
		final String name;
		final String owner;
		final IMethod method;

		public Property(IMethod method, String name, String owner) {
			this.method = method;
			this.name = name;
			this.owner = owner;
		}
		
		public abstract StyledString getDescription();
		
		public abstract Image getIcon();
		
		public abstract List<Proposal> getProposals();
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Property other = (Property) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

		@Override
		public int compareTo(Property arg0) {
			return name.compareTo(arg0.name);
		}
	}
	
	static class Proposal {
		final String value;
		final StyledString description;
		final Image icon;
		
		public Proposal(String value) {
			this(value, null, null);
		}
		
		public Proposal(String value, StyledString description, Image icon) {
			this.value = value;
			this.description = description;
			this.icon = icon;
		}
	}

	static abstract class SingleValueProperty extends Property {
		private String returnType;
		
		public SingleValueProperty(IMethod method, String name, String owner, String returnType) {
			super(method, name, owner);
			this.returnType = returnType;
		}

		public Image getIcon() {
			return JFaceResources.getImage(FIELD_KEY);
		}
		
		public StyledString getDescription() {
			StyledString description = new StyledString(name + " : " + returnType);
			description.append(" - " + owner, StyledString.QUALIFIER_STYLER);
			return description;
		}
	}

	static abstract class PrimitivValueProperty extends SingleValueProperty {

		public PrimitivValueProperty(IMethod method, String name, String owner, String returnType) {
			super(method, name, owner,returnType);
		}

	}

	static class FloatingValueProperty extends PrimitivValueProperty {
		private static final List<Proposal> PROPOSALS = new ArrayList<Proposal>();
		
		static {
			PROPOSALS.add(new Proposal("1.0"));	
		}
		
		public FloatingValueProperty(IMethod method, String name, String owner, String returnType) {
			super(method, name, owner,returnType);
		}

		@Override
		public List<Proposal> getProposals() {
			return PROPOSALS;
		}
	}

	static class IntegerValueProperty extends PrimitivValueProperty {
		private static final List<Proposal> PROPOSALS = new ArrayList<Proposal>();
		
		static {
			PROPOSALS.add(new Proposal("1"));	
		}
		
		public IntegerValueProperty(IMethod method, String name, String owner, String returnType) {
			super(method, name, owner,returnType);
		}

		@Override
		public List<Proposal> getProposals() {
			return PROPOSALS;
		}
	}

	static class BooleanValueProperty extends PrimitivValueProperty {
		private static final List<Proposal> PROPOSALS = new ArrayList<Proposal>();
		
		static {
			PROPOSALS.add(new Proposal("true"));
			PROPOSALS.add(new Proposal("false"));
		}
		
		public BooleanValueProperty(IMethod method, String name, String owner, String returnType) {
			super(method, name, owner,returnType);
		}

		@Override
		public List<Proposal> getProposals() {
			return PROPOSALS;
		}
	}

	static class StringValueProperty extends PrimitivValueProperty {
		private static final List<Proposal> PROPOSALS = new ArrayList<Proposal>();
		
		static {
			PROPOSALS.add(new Proposal("\"value\""));
		}
		
		public StringValueProperty(IMethod method, String name, String owner, String returnType) {
			super(method, name, owner,returnType);
		}

		@Override
		public List<Proposal> getProposals() {
			return PROPOSALS;
		}
	}

	static class ElementValueProperty extends SingleValueProperty {

		public ElementValueProperty(IMethod method, String name, String owner, String returnType) {
			super(method, name, owner,returnType);
		}

		@Override
		public List<Proposal> getProposals() {
			return Collections.emptyList();
		}
	}
	
	static class EventValueProperty extends Property {
		final String eventType;
		
		public EventValueProperty(IMethod method, String name, String owner, String eventType) {
			super(method, name, owner);
			this.eventType = eventType;
		}
		
		@Override
		public StyledString getDescription() {
			StyledString description = new StyledString(name + "("+eventType.substring(eventType.lastIndexOf('.')+1)+")");
			description.append(" - " + owner, StyledString.QUALIFIER_STYLER);
			return description;
		}
		
		@Override
		public Image getIcon() {
			return JFaceResources.getImage(EVENT_KEY);
		}
		
		@Override
		public List<Proposal> getProposals() {
			return Collections.emptyList();
		}
	}

	static abstract class MultiValueProperty extends Property {

		public MultiValueProperty(IMethod method, String name, String owner) {
			super(method, name, owner);
		}
	}
	
	static class ListValueProperty extends MultiValueProperty {
		String elementType;
		
		public ListValueProperty(IMethod method, String name, String owner, String elementType) {
			super(method, name, owner);
			this.elementType = elementType;
		}

		@Override
		public StyledString getDescription() {
			StyledString description = new StyledString(name + " : [" + elementType + "]");
			description.append(" - " + owner, StyledString.QUALIFIER_STYLER);
			return description;
		}

		@Override
		public Image getIcon() {
			return JFaceResources.getImage(LIST_KEY);
		}
		
		@Override
		public List<Proposal> getProposals() {
			return Collections.singletonList(new Proposal("[]"));
		}
	}
	
	static class MapValueProperty extends MultiValueProperty {

		public MapValueProperty(IMethod method, String name, String owner) {
			super(method, name, owner);
		}

		@Override
		public StyledString getDescription() {
			StyledString description = new StyledString(name + " : {}");
			description.append(" - " + owner, StyledString.QUALIFIER_STYLER);
			return description;
		}

		@Override
		public Image getIcon() {
			return JFaceResources.getImage(MAP_KEY);
		}
		
		@Override
		public List<Proposal> getProposals() {
			return Collections.singletonList(new Proposal("{}"));
		}
	}
	
	private TypeData getTypeData(IJavaProject jproject, JvmTypeReference typeRef) {
		TypeData data = typeCache.get(typeRef.getQualifiedName());
		if (data == null) {
			
			try {
				List<IMethod> allMethods = new ArrayList<IMethod>();
				IType jdtType = jproject.findType(typeRef
						.getQualifiedName());
				allMethods.addAll(Arrays.asList(jdtType.getMethods()));

				while (jdtType != null
						&& jdtType.getSuperclassName() != null) {
					jdtType = jproject
							.findType(jdtType.getSuperclassName());
					if (jdtType != null) {
						allMethods.addAll(Arrays.asList(jdtType
								.getMethods()));
					}
				}
				data = createData(allMethods, jproject);
				typeCache.put(typeRef.getQualifiedName(), data);
			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return data;
	}
	
	private IJavaProject getJavaProject(EObject model) {
		//TODO Should we cache that?
		URI uri = model.eResource().getURI();
		IProject project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(uri.segment(1));
		return JavaCore.create(project);
	}
	
	@Override
	public void complete_LocationValueProperty(EObject model,
			RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		// TODO Auto-generated method stub
		super.complete_LocationValueProperty(model, ruleCall, context, acceptor);
	}
	
	@Override
	public void complete_ID(EObject model, RuleCall ruleCall,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.err.println("Completeing id");
		super.complete_ID(model, ruleCall, context, acceptor);
	}
	
	@Override
	public void complete_QualifiedName(EObject model, RuleCall ruleCall,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.err.println("Completeing qualified name");
		super.complete_QualifiedName(model, ruleCall, context, acceptor);
	}
	
	@Override
	public void complete_STRING(EObject model, RuleCall ruleCall,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.err.println("Complete string " + model);
		if( model instanceof ResourceValueProperty ) {
			Model m = (Model) model.eResource().getContents().get(0);
			String resourceBundle = m.getComponentDef().getPreviewResourceBundle();
			Properties p = null;
			
			if( resourceBundle != null ) {
				File f = RelativeFileLocator.locateFile(model.eResource().getURI(), resourceBundle);
				System.err.println(f);
				if( f != null ) {
					FileInputStream fi = null;
					try {
						fi = new FileInputStream(f);
						p = new Properties();
						p.load(fi);
						//TODO Should we build the variants and load them?
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} finally {
						if( fi != null ) {
							try {
								fi.close();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				}
			}
			
			if(p != null) {
				for( String k : p.stringPropertyNames() ) {
					StyledString s = new StyledString(k);
					s.append(" - " + p.getProperty(k), StyledString.DECORATIONS_STYLER);
					acceptor.accept(createCompletionProposal("\""+k+"\"", s, JFaceResources.getImage(EXTERNALIZED_STRING_KEY), context));
				}
			}
		}
	}
	
	@Override
	public void complete_BindValueProperty(EObject model, RuleCall ruleCall,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// TODO Auto-generated method stub
		super.complete_BindValueProperty(model, ruleCall, context, acceptor);
	}
	
	@Override
	public void completeControllerHandledValueProperty_Methodname(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		Model m = (Model) model.eResource().getContents().get(0);
		if( m != null ) {
			ComponentDefinition def = m.getComponentDef();
			if( def != null ) {
				if( def.getController() != null ) {
					if( model.eContainer() instanceof at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property ) {
						at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property p = (at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property) model.eContainer();
						if( p.eContainer() instanceof Element ) {
							Element element = (Element) p.eContainer();
							IJavaProject jproject = getJavaProject(model);
							TypeData data = getTypeData(jproject, element.getType());
							for( Property prop : data.properties ) {
								if( p.getName().equals(prop.name) ) {
									List<IMethod> methods = findControllerJavaMethods(jproject,def.getController().getType(),prop.method);
									for( IMethod me : methods ) {
										Image img = null;
										try {
											if( Flags.isPublic(me.getFlags()) ) {
												img = JFaceResources.getImage(METHOD_PUBLIC_KEY);
											} else if( Flags.isProtected(me.getFlags()) ) {
												img = JFaceResources.getImage(METHOD_PROTECTED_KEY);
											} else if( Flags.isPackageDefault(me.getFlags()) ) {
												img = JFaceResources.getImage(METHOD_DEFAULT_KEY);
											} else {
												img = JFaceResources.getImage(METHOD_PRIVATE_KEY);
											}
										} catch (JavaModelException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
										acceptor.accept(createCompletionProposal(me.getElementName(), me.getElementName() + "("+ Signature.getSimpleName(Signature.toString(me.getParameterTypes()[0])) +")", img, context));	
									}
									
								}
							}
						}
					}
				}
			}
		}
		super.completeControllerHandledValueProperty_Methodname(model, assignment, context, acceptor);
	}
	
	private List<IMethod> findControllerJavaMethods(IJavaProject jproject, JvmType type, IMethod bindMethod) {
		IType jdtType = (IType) javaElementFinder.findElementFor(type);
		
		List<IMethod> allMethods = new ArrayList<IMethod>();
		try {
			allMethods.addAll(Arrays.asList(jdtType.getMethods()));
			
			for( IType t : JavaModelUtil.getAllSuperTypes(jdtType, new NullProgressMonitor())) {
				allMethods.addAll(Arrays.asList(t.getMethods()));
			}

			String returnSignature = Signature.toString(bindMethod.getReturnType());
			String eventType = null;
			
			if( returnSignature.startsWith("javafx.event.EventHandler<? super ") || returnSignature.startsWith("javafx.event.EventHandler<") ) {
				if( returnSignature.startsWith("javafx.event.EventHandler<? super ") ) {
					eventType = returnSignature.substring("javafx.event.EventHandler<? super ".length(),returnSignature.length()-1);
				} else {
					eventType = returnSignature.substring("javafx.event.EventHandler<".length(),returnSignature.length()-1);
				}
			}
			
			List<IMethod> rv = new ArrayList<IMethod>();
			for( IMethod m : allMethods ) {
				boolean found = false;
				for( IAnnotation a : m.getAnnotations() ) {
					if( a.getElementName().endsWith("FXML") ) {
						found = true;
					}
				}
				if( found ) {
					String[] types = m.getParameterTypes();
					if( types.length == 1 ) {
						String[][] paramType = ((IType)m.getParent()).resolveType(Signature.toString(types[0]));
						String v = Signature.toQualifiedName(paramType[0]);
						if(v.equals(eventType)) {
							rv.add(m);
						}
					}
				}
			}
			
			return rv;
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Collections.emptyList();
	}
	
	@Override
	public void completeStaticValueProperty_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		StaticValueProperty prop = (StaticValueProperty) model;
		JvmTypeReference typeRef = prop.getType();
		JvmTypeReference parentTypeRef = null;
		
		if( model.eContainer() instanceof Element ) {
			Element e = (Element) model.eContainer();
			parentTypeRef = e.getType();
		}
		
		if( typeRef != null && parentTypeRef != null ) {
			IType jdtType = (IType) javaElementFinder.findElementFor(typeRef.getType());
			IType parentJdtType = (IType) javaElementFinder.findElementFor(parentTypeRef.getType());
			
			ASTParser parser = ASTParser.newParser(AST.JLS3);
			parser.setProject(jdtType.getJavaProject());
			parser.setIgnoreMethodBodies(true);
			
			IBinding[] bindings = parser.createBindings(new IJavaElement[] { parentJdtType }, null);
			ITypeBinding parentTypeBinding = (ITypeBinding) bindings[0];
			
			List<IMethod> allMethods = new ArrayList<IMethod>();
			try {
				allMethods.addAll(Arrays.asList(jdtType.getMethods()));
				
				for( IType t : JavaModelUtil.getAllSuperTypes(jdtType, new NullProgressMonitor())) {
					allMethods.addAll(Arrays.asList(t.getMethods()));
				}
				
				IJavaProject jproject = getJavaProject(model);
				for( IMethod m : allMethods ) {
					if( Flags.isStatic(m.getFlags()) && Flags.isPublic(m.getFlags()) && m.getParameterTypes().length == 2 ) {
						IType t = (IType) m.getParent();
						String signature = Signature.toString(m.getParameterTypes()[0]);
						if( signature.equals("int") || signature.equals("double") ) {
							continue;
						} else {
							
						}
						String p1FQN = Signature.toQualifiedName(t.resolveType(Signature.toString(m.getParameterTypes()[0]))[0]);
						
						IType p1Type = jproject.findType(p1FQN);
						
						parser = ASTParser.newParser(AST.JLS3);
						parser.setProject(jdtType.getJavaProject());
						parser.setIgnoreMethodBodies(true);
						bindings = parser.createBindings(new IJavaElement[] { p1Type }, null);
						
						ITypeBinding p1TypeBinding = (ITypeBinding) bindings[0];
						
						if( TypeRules.canAssign(parentTypeBinding, p1TypeBinding) ) {
							StyledString s = new StyledString(extractAttributename(m.getElementName()) + " : ");
							s.append(Signature.toString(m.getParameterTypes()[1]),StyledString.QUALIFIER_STYLER);
							acceptor.accept(createCompletionProposal(extractAttributename(m.getElementName()), s, JFaceResources.getImage(STAT_METHOD_PUBLIC_KEY), context));
						}
					}
				}
			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
//		super.completeStaticValueProperty_Name(model, assignment, context, acceptor);
	}
	
	@Override
	public void complete_Property(EObject model, RuleCall ruleCall,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (context.getCurrentModel() instanceof Element) {
			Element element = (Element) context.getCurrentModel();
			TypeData data = getTypeData(getJavaProject(model), element.getType());
			if( data != null ) {
				for( Property p : data.properties ) {
					acceptor.accept(createCompletionProposal(p.name + " : ", p.getDescription(), p.getIcon(), context));
				}
			}
		}
		super.complete_Property(model, ruleCall, context, acceptor);
	}
	
	@Override
	public void completeProperty_Name(EObject model, Assignment assignment,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeProperty_Name(model, assignment, context, acceptor);
	}
	
	@Override
	public void completeProperty_Value(EObject model, Assignment assignment,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if( context.getCurrentModel().eContainer() instanceof Element ) {
			at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property propertyElement = (at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property) context.getCurrentModel();
			Element element = (Element) context.getCurrentModel().eContainer();
			TypeData data = getTypeData(getJavaProject(model), element.getType());
			
			if( data != null ) {
				for( Property p : data.properties ) {
					if( p.name.equals(propertyElement.getName()) ) {
						for( Proposal prop : p.getProposals() ) {
							acceptor.accept(createCompletionProposal(prop.value, prop.description, prop.icon, context));
						}
						return;
					}
				}
			}
		}
		super.completeProperty_Value(model, assignment, context, acceptor);
	}
	
	private TypeData createData(List<IMethod> allMethods, IJavaProject jproject)
			throws JavaModelException {
		TypeData d = new TypeData();
		for (IMethod m : allMethods) {
			if( ! Flags.isPublic(m.getFlags()) ) {
				continue;
			}
			
			if( m.getElementName().startsWith("impl_") ) {
				continue;
			}
			
			if (m.getElementName().startsWith("get")) {
				String returnSignature = Signature.toString(m.getReturnType());
				if( returnSignature.startsWith("javafx.event.EventHandler<? super ") || returnSignature.startsWith("javafx.event.EventHandler<") ) {
					String eventType;
					if( returnSignature.startsWith("javafx.event.EventHandler<? super ") ) {
						eventType = returnSignature.substring("javafx.event.EventHandler<? super ".length(),returnSignature.length()-1);
					} else {
						eventType = returnSignature.substring("javafx.event.EventHandler<".length(),returnSignature.length()-1);
					}
					
					EventValueProperty p = new EventValueProperty(m,extractAttributename(m.getElementName()), m.getParent().getElementName(),eventType);
					d.properties.add(p);
					
				} else {
					String propName = extractAttributename(m.getElementName());
					String ownerName = m.getParent().getElementName();
					boolean isReadonly = isReadonlySetter(propName, allMethods);
					
					if( "double".equals(returnSignature) || "float".equals(returnSignature) ) {
						if( ! isReadonly ) {
							FloatingValueProperty p = new FloatingValueProperty(m,propName, ownerName, returnSignature);
							d.properties.add(p);	
						}
					} else if( "int".equals(returnSignature) || "long".equals(returnSignature) || "short".equals(returnSignature) || "byte".equals(returnSignature) || "char".equals(returnSignature) ) {
						if( ! isReadonly ) {
							IntegerValueProperty p = new IntegerValueProperty(m,propName, ownerName, returnSignature);
							d.properties.add(p);	
						}
					} else {
						IType type;
						if( returnSignature.indexOf('<') == -1 ) {
							type = jproject.findType(returnSignature);	
						} else {
							type = jproject.findType(returnSignature.substring(0, returnSignature.indexOf('<')));
						}
						
						if( type == null ) {
							System.err.println("Could not detect type for '"+propName+"': " + returnSignature);
							continue;
						}
						
						boolean isLists = false;
						boolean isMap = false;
						if( "java.util.List".equals(type.getFullyQualifiedName()) ) {
							isLists = true;
						} else {
							for( String i : type.getSuperInterfaceNames() ) {
								if( i.equals("java.util.List") ) {
									isLists = true;
								}
							}	
						}
						
						if( ! isLists ) {
							if( "java.util.Map".equals(type.getFullyQualifiedName()) ) {
								isMap = true;
							} else {
								for( String i : type.getSuperInterfaceNames() ) {
									if( i.equals("java.util.Map") ) {
										isMap = true;
									}
								}	
							}
						}
						
						if( isLists ) {
							String listType;
							if( returnSignature.indexOf('<') != -1 ) {
								listType = returnSignature.substring(returnSignature.indexOf('<')+1,returnSignature.lastIndexOf('>'));	
							} else {
								listType = "?";
							}
							
							if( ! propName.endsWith("Unmodifiable") ) {
								ListValueProperty p = new ListValueProperty(m,propName, ownerName, listType);
								d.properties.add(p);	
							}
						} else if( isMap ) {
							 MapValueProperty p = new MapValueProperty(m,propName,ownerName);
							 d.properties.add(p);
						} else if(type.getFullyQualifiedName().equals("java.lang.String")) {
							if( ! isReadonly ) {
								StringValueProperty p = new StringValueProperty(m,propName,ownerName, returnSignature);
								d.properties.add(p);
							}
						} else {
							if( ! isReadonly ) {
								ElementValueProperty p = new ElementValueProperty(m,propName,ownerName, returnSignature);
								d.properties.add(p);
							}
						}
					}
				}
			} else if (m.getElementName().startsWith("is")
					&& "Z".equals(m.getReturnType())) {
				BooleanValueProperty p = new BooleanValueProperty(m,extractAttributename(m.getElementName()),m.getParent().getElementName(),"boolean");
				d.properties.add(p);
			}
		}
		return d;
	}
	
	private boolean isReadonlySetter(String name, List<IMethod> methods) throws JavaModelException {
		for( IMethod m : methods ) {
			if( ! m.getElementName().startsWith("set") || ! Flags.isPublic(m.getFlags()) ) {
				continue;
			}
			
			if( name.equals(extractAttributename(m.getElementName())) ) {
				return false;
			}
		}
		return true;
	}
	
	public static String extractAttributename(String name) {
		String rv = null;
		if( name.startsWith("get") || name.startsWith("set") ) {
			rv = name.substring(3);
		} else if( name.startsWith("is") ) {
			rv = name.substring(2);
		}
		
		if( rv != null ) {
			rv = rv.substring(0, 1).toLowerCase() + rv.substring(1);
		}
		
		return rv;
	}
}
