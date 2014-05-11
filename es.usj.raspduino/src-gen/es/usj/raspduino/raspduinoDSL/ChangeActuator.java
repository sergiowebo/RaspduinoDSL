/**
 */
package es.usj.raspduino.raspduinoDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.ChangeActuator#getActuator <em>Actuator</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.ChangeActuator#getActuatorState <em>Actuator State</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getChangeActuator()
 * @model
 * @generated
 */
public interface ChangeActuator extends EObject
{
  /**
   * Returns the value of the '<em><b>Actuator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actuator</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actuator</em>' reference.
   * @see #setActuator(Actuator)
   * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getChangeActuator_Actuator()
   * @model
   * @generated
   */
  Actuator getActuator();

  /**
   * Sets the value of the '{@link es.usj.raspduino.raspduinoDSL.ChangeActuator#getActuator <em>Actuator</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actuator</em>' reference.
   * @see #getActuator()
   * @generated
   */
  void setActuator(Actuator value);

  /**
   * Returns the value of the '<em><b>Actuator State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actuator State</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actuator State</em>' attribute.
   * @see #setActuatorState(String)
   * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getChangeActuator_ActuatorState()
   * @model
   * @generated
   */
  String getActuatorState();

  /**
   * Sets the value of the '{@link es.usj.raspduino.raspduinoDSL.ChangeActuator#getActuatorState <em>Actuator State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actuator State</em>' attribute.
   * @see #getActuatorState()
   * @generated
   */
  void setActuatorState(String value);

} // ChangeActuator
