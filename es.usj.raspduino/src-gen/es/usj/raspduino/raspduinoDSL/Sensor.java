/**
 */
package es.usj.raspduino.raspduinoDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.Sensor#isAnalog <em>Analog</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends AbstractDevice
{
  /**
   * Returns the value of the '<em><b>Analog</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Analog</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Analog</em>' attribute.
   * @see #setAnalog(boolean)
   * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getSensor_Analog()
   * @model
   * @generated
   */
  boolean isAnalog();

  /**
   * Sets the value of the '{@link es.usj.raspduino.raspduinoDSL.Sensor#isAnalog <em>Analog</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Analog</em>' attribute.
   * @see #isAnalog()
   * @generated
   */
  void setAnalog(boolean value);

} // Sensor
