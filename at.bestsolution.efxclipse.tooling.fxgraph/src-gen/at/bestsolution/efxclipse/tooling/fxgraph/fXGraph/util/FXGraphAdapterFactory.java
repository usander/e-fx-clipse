/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.util;

import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.FXGraphPackage
 * @generated
 */
public class FXGraphAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FXGraphPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FXGraphAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = FXGraphPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FXGraphSwitch<Adapter> modelSwitch =
    new FXGraphSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseLanguage(Language object)
      {
        return createLanguageAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseDefine(Define object)
      {
        return createDefineAdapter();
      }
      @Override
      public Adapter caseScript(Script object)
      {
        return createScriptAdapter();
      }
      @Override
      public Adapter caseStaticValueProperty(StaticValueProperty object)
      {
        return createStaticValuePropertyAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter caseValueProperty(ValueProperty object)
      {
        return createValuePropertyAdapter();
      }
      @Override
      public Adapter caseSingleValueProperty(SingleValueProperty object)
      {
        return createSingleValuePropertyAdapter();
      }
      @Override
      public Adapter caseMultiValueProperty(MultiValueProperty object)
      {
        return createMultiValuePropertyAdapter();
      }
      @Override
      public Adapter caseListValueElement(ListValueElement object)
      {
        return createListValueElementAdapter();
      }
      @Override
      public Adapter caseListValueProperty(ListValueProperty object)
      {
        return createListValuePropertyAdapter();
      }
      @Override
      public Adapter caseMapValueProperty(MapValueProperty object)
      {
        return createMapValuePropertyAdapter();
      }
      @Override
      public Adapter caseSimpleValueProperty(SimpleValueProperty object)
      {
        return createSimpleValuePropertyAdapter();
      }
      @Override
      public Adapter caseReferenceValueProperty(ReferenceValueProperty object)
      {
        return createReferenceValuePropertyAdapter();
      }
      @Override
      public Adapter caseIncludeValueProperty(IncludeValueProperty object)
      {
        return createIncludeValuePropertyAdapter();
      }
      @Override
      public Adapter caseCopyValueProperty(CopyValueProperty object)
      {
        return createCopyValuePropertyAdapter();
      }
      @Override
      public Adapter caseControllerHandledValueProperty(ControllerHandledValueProperty object)
      {
        return createControllerHandledValuePropertyAdapter();
      }
      @Override
      public Adapter caseScriptHandlerHandledValueProperty(ScriptHandlerHandledValueProperty object)
      {
        return createScriptHandlerHandledValuePropertyAdapter();
      }
      @Override
      public Adapter caseScriptValueExpression(ScriptValueExpression object)
      {
        return createScriptValueExpressionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Language <em>Language</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Language
   * @generated
   */
  public Adapter createLanguageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Define <em>Define</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Define
   * @generated
   */
  public Adapter createDefineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Script <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Script
   * @generated
   */
  public Adapter createScriptAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.StaticValueProperty <em>Static Value Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.StaticValueProperty
   * @generated
   */
  public Adapter createStaticValuePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ValueProperty <em>Value Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ValueProperty
   * @generated
   */
  public Adapter createValuePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.SingleValueProperty <em>Single Value Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.SingleValueProperty
   * @generated
   */
  public Adapter createSingleValuePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.MultiValueProperty <em>Multi Value Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.MultiValueProperty
   * @generated
   */
  public Adapter createMultiValuePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ListValueElement <em>List Value Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ListValueElement
   * @generated
   */
  public Adapter createListValueElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ListValueProperty <em>List Value Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ListValueProperty
   * @generated
   */
  public Adapter createListValuePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.MapValueProperty <em>Map Value Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.MapValueProperty
   * @generated
   */
  public Adapter createMapValuePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.SimpleValueProperty <em>Simple Value Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.SimpleValueProperty
   * @generated
   */
  public Adapter createSimpleValuePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ReferenceValueProperty <em>Reference Value Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ReferenceValueProperty
   * @generated
   */
  public Adapter createReferenceValuePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.IncludeValueProperty <em>Include Value Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.IncludeValueProperty
   * @generated
   */
  public Adapter createIncludeValuePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.CopyValueProperty <em>Copy Value Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.CopyValueProperty
   * @generated
   */
  public Adapter createCopyValuePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ControllerHandledValueProperty <em>Controller Handled Value Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ControllerHandledValueProperty
   * @generated
   */
  public Adapter createControllerHandledValuePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ScriptHandlerHandledValueProperty <em>Script Handler Handled Value Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ScriptHandlerHandledValueProperty
   * @generated
   */
  public Adapter createScriptHandlerHandledValuePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ScriptValueExpression <em>Script Value Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ScriptValueExpression
   * @generated
   */
  public Adapter createScriptValueExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //FXGraphAdapterFactory