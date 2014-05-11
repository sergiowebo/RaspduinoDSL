/**
 */
package es.usj.raspduino.raspduinoDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.EventHandler#getName <em>Name</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.EventHandler#getChangeActuators <em>Change Actuators</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getEventHandler()
 * @model
 * @generated
 */
public interface EventHandler extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getEventHandler_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link es.usj.raspduino.raspduinoDSL.EventHandler#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Change Actuators</b></em>' containment reference list.
   * The list contents are of type {@link es.usj.raspduino.raspduinoDSL.ChangeActuator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Change Actuators</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Change Actuators</em>' containment reference list.
   * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getEventHandler_ChangeActuators()
   * @model containment="true"
   * @generated
   */
  EList<ChangeActuator> getChangeActuators();

} // EventHandler
