/**
 */
package es.usj.raspduino.raspduinoDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage
 * @generated
 */
public interface RaspduinoDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RaspduinoDSLFactory eINSTANCE = es.usj.raspduino.raspduinoDSL.impl.RaspduinoDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Abstract Device</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Device</em>'.
   * @generated
   */
  AbstractDevice createAbstractDevice();

  /**
   * Returns a new object of class '<em>Sensor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sensor</em>'.
   * @generated
   */
  Sensor createSensor();

  /**
   * Returns a new object of class '<em>Actuator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actuator</em>'.
   * @generated
   */
  Actuator createActuator();

  /**
   * Returns a new object of class '<em>Event Handler</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event Handler</em>'.
   * @generated
   */
  EventHandler createEventHandler();

  /**
   * Returns a new object of class '<em>Change Actuator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Change Actuator</em>'.
   * @generated
   */
  ChangeActuator createChangeActuator();

  /**
   * Returns a new object of class '<em>Sensor Listener</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sensor Listener</em>'.
   * @generated
   */
  SensorListener createSensorListener();

  /**
   * Returns a new object of class '<em>Timer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Timer</em>'.
   * @generated
   */
  Timer createTimer();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RaspduinoDSLPackage getRaspduinoDSLPackage();

} //RaspduinoDSLFactory
