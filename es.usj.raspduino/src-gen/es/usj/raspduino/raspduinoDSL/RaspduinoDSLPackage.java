/**
 */
package es.usj.raspduino.raspduinoDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLFactory
 * @model kind="package"
 * @generated
 */
public interface RaspduinoDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "raspduinoDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.usj.es/raspduino/RaspduinoDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "raspduinoDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RaspduinoDSLPackage eINSTANCE = es.usj.raspduino.raspduinoDSL.impl.RaspduinoDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link es.usj.raspduino.raspduinoDSL.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.usj.raspduino.raspduinoDSL.impl.ModelImpl
   * @see es.usj.raspduino.raspduinoDSL.impl.RaspduinoDSLPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Hardware</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__HARDWARE = 1;

  /**
   * The feature id for the '<em><b>Devices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DEVICES = 2;

  /**
   * The feature id for the '<em><b>Event Handlers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__EVENT_HANDLERS = 3;

  /**
   * The feature id for the '<em><b>Sensor Listeners</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SENSOR_LISTENERS = 4;

  /**
   * The feature id for the '<em><b>Timers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__TIMERS = 5;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link es.usj.raspduino.raspduinoDSL.impl.AbstractDeviceImpl <em>Abstract Device</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.usj.raspduino.raspduinoDSL.impl.AbstractDeviceImpl
   * @see es.usj.raspduino.raspduinoDSL.impl.RaspduinoDSLPackageImpl#getAbstractDevice()
   * @generated
   */
  int ABSTRACT_DEVICE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DEVICE__NAME = 0;

  /**
   * The feature id for the '<em><b>Pin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DEVICE__PIN = 1;

  /**
   * The number of structural features of the '<em>Abstract Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DEVICE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link es.usj.raspduino.raspduinoDSL.impl.SensorImpl <em>Sensor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.usj.raspduino.raspduinoDSL.impl.SensorImpl
   * @see es.usj.raspduino.raspduinoDSL.impl.RaspduinoDSLPackageImpl#getSensor()
   * @generated
   */
  int SENSOR = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR__NAME = ABSTRACT_DEVICE__NAME;

  /**
   * The feature id for the '<em><b>Pin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR__PIN = ABSTRACT_DEVICE__PIN;

  /**
   * The number of structural features of the '<em>Sensor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR_FEATURE_COUNT = ABSTRACT_DEVICE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link es.usj.raspduino.raspduinoDSL.impl.ActuatorImpl <em>Actuator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.usj.raspduino.raspduinoDSL.impl.ActuatorImpl
   * @see es.usj.raspduino.raspduinoDSL.impl.RaspduinoDSLPackageImpl#getActuator()
   * @generated
   */
  int ACTUATOR = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUATOR__NAME = ABSTRACT_DEVICE__NAME;

  /**
   * The feature id for the '<em><b>Pin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUATOR__PIN = ABSTRACT_DEVICE__PIN;

  /**
   * The number of structural features of the '<em>Actuator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUATOR_FEATURE_COUNT = ABSTRACT_DEVICE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link es.usj.raspduino.raspduinoDSL.impl.EventHandlerImpl <em>Event Handler</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.usj.raspduino.raspduinoDSL.impl.EventHandlerImpl
   * @see es.usj.raspduino.raspduinoDSL.impl.RaspduinoDSLPackageImpl#getEventHandler()
   * @generated
   */
  int EVENT_HANDLER = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_HANDLER__NAME = 0;

  /**
   * The feature id for the '<em><b>Change Actuators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_HANDLER__CHANGE_ACTUATORS = 1;

  /**
   * The number of structural features of the '<em>Event Handler</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_HANDLER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link es.usj.raspduino.raspduinoDSL.impl.ChangeActuatorImpl <em>Change Actuator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.usj.raspduino.raspduinoDSL.impl.ChangeActuatorImpl
   * @see es.usj.raspduino.raspduinoDSL.impl.RaspduinoDSLPackageImpl#getChangeActuator()
   * @generated
   */
  int CHANGE_ACTUATOR = 5;

  /**
   * The feature id for the '<em><b>Actuator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANGE_ACTUATOR__ACTUATOR = 0;

  /**
   * The feature id for the '<em><b>Actuator State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANGE_ACTUATOR__ACTUATOR_STATE = 1;

  /**
   * The number of structural features of the '<em>Change Actuator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANGE_ACTUATOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link es.usj.raspduino.raspduinoDSL.impl.SensorListenerImpl <em>Sensor Listener</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.usj.raspduino.raspduinoDSL.impl.SensorListenerImpl
   * @see es.usj.raspduino.raspduinoDSL.impl.RaspduinoDSLPackageImpl#getSensorListener()
   * @generated
   */
  int SENSOR_LISTENER = 6;

  /**
   * The feature id for the '<em><b>Sensor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR_LISTENER__SENSOR = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR_LISTENER__TYPE = 1;

  /**
   * The feature id for the '<em><b>L</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR_LISTENER__L = 2;

  /**
   * The feature id for the '<em><b>H</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR_LISTENER__H = 3;

  /**
   * The feature id for the '<em><b>Event Handler</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR_LISTENER__EVENT_HANDLER = 4;

  /**
   * The number of structural features of the '<em>Sensor Listener</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR_LISTENER_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link es.usj.raspduino.raspduinoDSL.impl.TimerImpl <em>Timer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.usj.raspduino.raspduinoDSL.impl.TimerImpl
   * @see es.usj.raspduino.raspduinoDSL.impl.RaspduinoDSLPackageImpl#getTimer()
   * @generated
   */
  int TIMER = 7;

  /**
   * The feature id for the '<em><b>Event Handler</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMER__EVENT_HANDLER = 0;

  /**
   * The feature id for the '<em><b>Repeattype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMER__REPEATTYPE = 1;

  /**
   * The feature id for the '<em><b>Timer Secs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMER__TIMER_SECS = 2;

  /**
   * The number of structural features of the '<em>Timer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMER_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link es.usj.raspduino.raspduinoDSL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see es.usj.raspduino.raspduinoDSL.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link es.usj.raspduino.raspduinoDSL.Model#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see es.usj.raspduino.raspduinoDSL.Model#getName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Name();

  /**
   * Returns the meta object for the attribute '{@link es.usj.raspduino.raspduinoDSL.Model#getHardware <em>Hardware</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hardware</em>'.
   * @see es.usj.raspduino.raspduinoDSL.Model#getHardware()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Hardware();

  /**
   * Returns the meta object for the containment reference list '{@link es.usj.raspduino.raspduinoDSL.Model#getDevices <em>Devices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Devices</em>'.
   * @see es.usj.raspduino.raspduinoDSL.Model#getDevices()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Devices();

  /**
   * Returns the meta object for the containment reference list '{@link es.usj.raspduino.raspduinoDSL.Model#getEventHandlers <em>Event Handlers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Event Handlers</em>'.
   * @see es.usj.raspduino.raspduinoDSL.Model#getEventHandlers()
   * @see #getModel()
   * @generated
   */
  EReference getModel_EventHandlers();

  /**
   * Returns the meta object for the containment reference list '{@link es.usj.raspduino.raspduinoDSL.Model#getSensorListeners <em>Sensor Listeners</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sensor Listeners</em>'.
   * @see es.usj.raspduino.raspduinoDSL.Model#getSensorListeners()
   * @see #getModel()
   * @generated
   */
  EReference getModel_SensorListeners();

  /**
   * Returns the meta object for the containment reference list '{@link es.usj.raspduino.raspduinoDSL.Model#getTimers <em>Timers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Timers</em>'.
   * @see es.usj.raspduino.raspduinoDSL.Model#getTimers()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Timers();

  /**
   * Returns the meta object for class '{@link es.usj.raspduino.raspduinoDSL.AbstractDevice <em>Abstract Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Device</em>'.
   * @see es.usj.raspduino.raspduinoDSL.AbstractDevice
   * @generated
   */
  EClass getAbstractDevice();

  /**
   * Returns the meta object for the attribute '{@link es.usj.raspduino.raspduinoDSL.AbstractDevice#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see es.usj.raspduino.raspduinoDSL.AbstractDevice#getName()
   * @see #getAbstractDevice()
   * @generated
   */
  EAttribute getAbstractDevice_Name();

  /**
   * Returns the meta object for the attribute '{@link es.usj.raspduino.raspduinoDSL.AbstractDevice#getPin <em>Pin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pin</em>'.
   * @see es.usj.raspduino.raspduinoDSL.AbstractDevice#getPin()
   * @see #getAbstractDevice()
   * @generated
   */
  EAttribute getAbstractDevice_Pin();

  /**
   * Returns the meta object for class '{@link es.usj.raspduino.raspduinoDSL.Sensor <em>Sensor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sensor</em>'.
   * @see es.usj.raspduino.raspduinoDSL.Sensor
   * @generated
   */
  EClass getSensor();

  /**
   * Returns the meta object for class '{@link es.usj.raspduino.raspduinoDSL.Actuator <em>Actuator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actuator</em>'.
   * @see es.usj.raspduino.raspduinoDSL.Actuator
   * @generated
   */
  EClass getActuator();

  /**
   * Returns the meta object for class '{@link es.usj.raspduino.raspduinoDSL.EventHandler <em>Event Handler</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Handler</em>'.
   * @see es.usj.raspduino.raspduinoDSL.EventHandler
   * @generated
   */
  EClass getEventHandler();

  /**
   * Returns the meta object for the attribute '{@link es.usj.raspduino.raspduinoDSL.EventHandler#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see es.usj.raspduino.raspduinoDSL.EventHandler#getName()
   * @see #getEventHandler()
   * @generated
   */
  EAttribute getEventHandler_Name();

  /**
   * Returns the meta object for the containment reference list '{@link es.usj.raspduino.raspduinoDSL.EventHandler#getChangeActuators <em>Change Actuators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Change Actuators</em>'.
   * @see es.usj.raspduino.raspduinoDSL.EventHandler#getChangeActuators()
   * @see #getEventHandler()
   * @generated
   */
  EReference getEventHandler_ChangeActuators();

  /**
   * Returns the meta object for class '{@link es.usj.raspduino.raspduinoDSL.ChangeActuator <em>Change Actuator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Change Actuator</em>'.
   * @see es.usj.raspduino.raspduinoDSL.ChangeActuator
   * @generated
   */
  EClass getChangeActuator();

  /**
   * Returns the meta object for the reference '{@link es.usj.raspduino.raspduinoDSL.ChangeActuator#getActuator <em>Actuator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Actuator</em>'.
   * @see es.usj.raspduino.raspduinoDSL.ChangeActuator#getActuator()
   * @see #getChangeActuator()
   * @generated
   */
  EReference getChangeActuator_Actuator();

  /**
   * Returns the meta object for the attribute '{@link es.usj.raspduino.raspduinoDSL.ChangeActuator#getActuatorState <em>Actuator State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Actuator State</em>'.
   * @see es.usj.raspduino.raspduinoDSL.ChangeActuator#getActuatorState()
   * @see #getChangeActuator()
   * @generated
   */
  EAttribute getChangeActuator_ActuatorState();

  /**
   * Returns the meta object for class '{@link es.usj.raspduino.raspduinoDSL.SensorListener <em>Sensor Listener</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sensor Listener</em>'.
   * @see es.usj.raspduino.raspduinoDSL.SensorListener
   * @generated
   */
  EClass getSensorListener();

  /**
   * Returns the meta object for the reference '{@link es.usj.raspduino.raspduinoDSL.SensorListener#getSensor <em>Sensor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Sensor</em>'.
   * @see es.usj.raspduino.raspduinoDSL.SensorListener#getSensor()
   * @see #getSensorListener()
   * @generated
   */
  EReference getSensorListener_Sensor();

  /**
   * Returns the meta object for the attribute '{@link es.usj.raspduino.raspduinoDSL.SensorListener#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see es.usj.raspduino.raspduinoDSL.SensorListener#getType()
   * @see #getSensorListener()
   * @generated
   */
  EAttribute getSensorListener_Type();

  /**
   * Returns the meta object for the attribute '{@link es.usj.raspduino.raspduinoDSL.SensorListener#getL <em>L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>L</em>'.
   * @see es.usj.raspduino.raspduinoDSL.SensorListener#getL()
   * @see #getSensorListener()
   * @generated
   */
  EAttribute getSensorListener_L();

  /**
   * Returns the meta object for the attribute '{@link es.usj.raspduino.raspduinoDSL.SensorListener#getH <em>H</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>H</em>'.
   * @see es.usj.raspduino.raspduinoDSL.SensorListener#getH()
   * @see #getSensorListener()
   * @generated
   */
  EAttribute getSensorListener_H();

  /**
   * Returns the meta object for the reference '{@link es.usj.raspduino.raspduinoDSL.SensorListener#getEventHandler <em>Event Handler</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Event Handler</em>'.
   * @see es.usj.raspduino.raspduinoDSL.SensorListener#getEventHandler()
   * @see #getSensorListener()
   * @generated
   */
  EReference getSensorListener_EventHandler();

  /**
   * Returns the meta object for class '{@link es.usj.raspduino.raspduinoDSL.Timer <em>Timer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Timer</em>'.
   * @see es.usj.raspduino.raspduinoDSL.Timer
   * @generated
   */
  EClass getTimer();

  /**
   * Returns the meta object for the reference '{@link es.usj.raspduino.raspduinoDSL.Timer#getEventHandler <em>Event Handler</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Event Handler</em>'.
   * @see es.usj.raspduino.raspduinoDSL.Timer#getEventHandler()
   * @see #getTimer()
   * @generated
   */
  EReference getTimer_EventHandler();

  /**
   * Returns the meta object for the attribute '{@link es.usj.raspduino.raspduinoDSL.Timer#getRepeattype <em>Repeattype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Repeattype</em>'.
   * @see es.usj.raspduino.raspduinoDSL.Timer#getRepeattype()
   * @see #getTimer()
   * @generated
   */
  EAttribute getTimer_Repeattype();

  /**
   * Returns the meta object for the attribute '{@link es.usj.raspduino.raspduinoDSL.Timer#getTimerSecs <em>Timer Secs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Timer Secs</em>'.
   * @see es.usj.raspduino.raspduinoDSL.Timer#getTimerSecs()
   * @see #getTimer()
   * @generated
   */
  EAttribute getTimer_TimerSecs();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RaspduinoDSLFactory getRaspduinoDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link es.usj.raspduino.raspduinoDSL.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.usj.raspduino.raspduinoDSL.impl.ModelImpl
     * @see es.usj.raspduino.raspduinoDSL.impl.RaspduinoDSLPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

    /**
     * The meta object literal for the '<em><b>Hardware</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__HARDWARE = eINSTANCE.getModel_Hardware();

    /**
     * The meta object literal for the '<em><b>Devices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DEVICES = eINSTANCE.getModel_Devices();

    /**
     * The meta object literal for the '<em><b>Event Handlers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__EVENT_HANDLERS = eINSTANCE.getModel_EventHandlers();

    /**
     * The meta object literal for the '<em><b>Sensor Listeners</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__SENSOR_LISTENERS = eINSTANCE.getModel_SensorListeners();

    /**
     * The meta object literal for the '<em><b>Timers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__TIMERS = eINSTANCE.getModel_Timers();

    /**
     * The meta object literal for the '{@link es.usj.raspduino.raspduinoDSL.impl.AbstractDeviceImpl <em>Abstract Device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.usj.raspduino.raspduinoDSL.impl.AbstractDeviceImpl
     * @see es.usj.raspduino.raspduinoDSL.impl.RaspduinoDSLPackageImpl#getAbstractDevice()
     * @generated
     */
    EClass ABSTRACT_DEVICE = eINSTANCE.getAbstractDevice();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_DEVICE__NAME = eINSTANCE.getAbstractDevice_Name();

    /**
     * The meta object literal for the '<em><b>Pin</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_DEVICE__PIN = eINSTANCE.getAbstractDevice_Pin();

    /**
     * The meta object literal for the '{@link es.usj.raspduino.raspduinoDSL.impl.SensorImpl <em>Sensor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.usj.raspduino.raspduinoDSL.impl.SensorImpl
     * @see es.usj.raspduino.raspduinoDSL.impl.RaspduinoDSLPackageImpl#getSensor()
     * @generated
     */
    EClass SENSOR = eINSTANCE.getSensor();

    /**
     * The meta object literal for the '{@link es.usj.raspduino.raspduinoDSL.impl.ActuatorImpl <em>Actuator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.usj.raspduino.raspduinoDSL.impl.ActuatorImpl
     * @see es.usj.raspduino.raspduinoDSL.impl.RaspduinoDSLPackageImpl#getActuator()
     * @generated
     */
    EClass ACTUATOR = eINSTANCE.getActuator();

    /**
     * The meta object literal for the '{@link es.usj.raspduino.raspduinoDSL.impl.EventHandlerImpl <em>Event Handler</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.usj.raspduino.raspduinoDSL.impl.EventHandlerImpl
     * @see es.usj.raspduino.raspduinoDSL.impl.RaspduinoDSLPackageImpl#getEventHandler()
     * @generated
     */
    EClass EVENT_HANDLER = eINSTANCE.getEventHandler();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_HANDLER__NAME = eINSTANCE.getEventHandler_Name();

    /**
     * The meta object literal for the '<em><b>Change Actuators</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_HANDLER__CHANGE_ACTUATORS = eINSTANCE.getEventHandler_ChangeActuators();

    /**
     * The meta object literal for the '{@link es.usj.raspduino.raspduinoDSL.impl.ChangeActuatorImpl <em>Change Actuator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.usj.raspduino.raspduinoDSL.impl.ChangeActuatorImpl
     * @see es.usj.raspduino.raspduinoDSL.impl.RaspduinoDSLPackageImpl#getChangeActuator()
     * @generated
     */
    EClass CHANGE_ACTUATOR = eINSTANCE.getChangeActuator();

    /**
     * The meta object literal for the '<em><b>Actuator</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHANGE_ACTUATOR__ACTUATOR = eINSTANCE.getChangeActuator_Actuator();

    /**
     * The meta object literal for the '<em><b>Actuator State</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHANGE_ACTUATOR__ACTUATOR_STATE = eINSTANCE.getChangeActuator_ActuatorState();

    /**
     * The meta object literal for the '{@link es.usj.raspduino.raspduinoDSL.impl.SensorListenerImpl <em>Sensor Listener</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.usj.raspduino.raspduinoDSL.impl.SensorListenerImpl
     * @see es.usj.raspduino.raspduinoDSL.impl.RaspduinoDSLPackageImpl#getSensorListener()
     * @generated
     */
    EClass SENSOR_LISTENER = eINSTANCE.getSensorListener();

    /**
     * The meta object literal for the '<em><b>Sensor</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SENSOR_LISTENER__SENSOR = eINSTANCE.getSensorListener_Sensor();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SENSOR_LISTENER__TYPE = eINSTANCE.getSensorListener_Type();

    /**
     * The meta object literal for the '<em><b>L</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SENSOR_LISTENER__L = eINSTANCE.getSensorListener_L();

    /**
     * The meta object literal for the '<em><b>H</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SENSOR_LISTENER__H = eINSTANCE.getSensorListener_H();

    /**
     * The meta object literal for the '<em><b>Event Handler</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SENSOR_LISTENER__EVENT_HANDLER = eINSTANCE.getSensorListener_EventHandler();

    /**
     * The meta object literal for the '{@link es.usj.raspduino.raspduinoDSL.impl.TimerImpl <em>Timer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.usj.raspduino.raspduinoDSL.impl.TimerImpl
     * @see es.usj.raspduino.raspduinoDSL.impl.RaspduinoDSLPackageImpl#getTimer()
     * @generated
     */
    EClass TIMER = eINSTANCE.getTimer();

    /**
     * The meta object literal for the '<em><b>Event Handler</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TIMER__EVENT_HANDLER = eINSTANCE.getTimer_EventHandler();

    /**
     * The meta object literal for the '<em><b>Repeattype</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIMER__REPEATTYPE = eINSTANCE.getTimer_Repeattype();

    /**
     * The meta object literal for the '<em><b>Timer Secs</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIMER__TIMER_SECS = eINSTANCE.getTimer_TimerSecs();

  }

} //RaspduinoDSLPackage
