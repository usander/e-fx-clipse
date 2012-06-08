/**
 */
package at.bestsolution.efxclipse.tooling.fxgraph.fXGraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Value Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ResourceValueProperty#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.FXGraphPackage#getResourceValueProperty()
 * @model
 * @generated
 */
public interface ResourceValueProperty extends SingleValueProperty
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(StringValue)
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.FXGraphPackage#getResourceValueProperty_Value()
   * @model containment="true"
   * @generated
   */
  StringValue getValue();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ResourceValueProperty#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(StringValue value);

} // ResourceValueProperty
