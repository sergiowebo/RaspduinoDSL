/**
 */
package es.usj.raspduino.raspduinoDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Value Precondition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.SensorValuePrecondition#getSensor <em>Sensor</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.SensorValuePrecondition#getCond <em>Cond</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.SensorValuePrecondition#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getSensorValuePrecondition()
 * @model
 * @generated
 */
public interface SensorValuePrecondition extends EObject
{
  /**
   * Returns the value of the '<em><b>Sensor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sensor</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sensor</em>' reference.
   * @see #setSensor(Sensor)
   * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getSensorValuePrecondition_Sensor()
   * @model
   * @generated
   */
  Sensor getSensor();

  /**
   * Sets the value of the '{@link es.usj.raspduino.raspduinoDSL.SensorValuePrecondition#getSensor <em>Sensor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sensor</em>' reference.
   * @see #getSensor()
   * @generated
   */
  void setSensor(Sensor value);

  /**
   * Returns the value of the '<em><b>Cond</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' attribute.
   * @see #setCond(String)
   * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getSensorValuePrecondition_Cond()
   * @model
   * @generated
   */
  String getCond();

  /**
   * Sets the value of the '{@link es.usj.raspduino.raspduinoDSL.SensorValuePrecondition#getCond <em>Cond</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' attribute.
   * @see #getCond()
   * @generated
   */
  void setCond(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getSensorValuePrecondition_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link es.usj.raspduino.raspduinoDSL.SensorValuePrecondition#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // SensorValuePrecondition
