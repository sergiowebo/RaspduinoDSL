/**
 */
package es.usj.raspduino.raspduinoDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.AbstractDevice#getName <em>Name</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.AbstractDevice#getPin <em>Pin</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getAbstractDevice()
 * @model
 * @generated
 */
public interface AbstractDevice extends EObject
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
   * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getAbstractDevice_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link es.usj.raspduino.raspduinoDSL.AbstractDevice#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Pin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pin</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pin</em>' attribute.
   * @see #setPin(String)
   * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getAbstractDevice_Pin()
   * @model
   * @generated
   */
  String getPin();

  /**
   * Sets the value of the '{@link es.usj.raspduino.raspduinoDSL.AbstractDevice#getPin <em>Pin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pin</em>' attribute.
   * @see #getPin()
   * @generated
   */
  void setPin(String value);

} // AbstractDevice
