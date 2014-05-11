/**
 */
package es.usj.raspduino.raspduinoDSL.impl;

import es.usj.raspduino.raspduinoDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RaspduinoDSLFactoryImpl extends EFactoryImpl implements RaspduinoDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RaspduinoDSLFactory init()
  {
    try
    {
      RaspduinoDSLFactory theRaspduinoDSLFactory = (RaspduinoDSLFactory)EPackage.Registry.INSTANCE.getEFactory(RaspduinoDSLPackage.eNS_URI);
      if (theRaspduinoDSLFactory != null)
      {
        return theRaspduinoDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RaspduinoDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RaspduinoDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RaspduinoDSLPackage.MODEL: return createModel();
      case RaspduinoDSLPackage.ABSTRACT_DEVICE: return createAbstractDevice();
      case RaspduinoDSLPackage.SENSOR: return createSensor();
      case RaspduinoDSLPackage.ACTUATOR: return createActuator();
      case RaspduinoDSLPackage.EVENT_HANDLER: return createEventHandler();
      case RaspduinoDSLPackage.CHANGE_ACTUATOR: return createChangeActuator();
      case RaspduinoDSLPackage.SENSOR_LISTENER: return createSensorListener();
      case RaspduinoDSLPackage.PRECONDITION: return createPrecondition();
      case RaspduinoDSLPackage.PRECONDITION1: return createPrecondition1();
      case RaspduinoDSLPackage.EMPTY_PRECONDITION: return createEmptyPrecondition();
      case RaspduinoDSLPackage.SENSOR_VALUE_PRECONDITION: return createSensorValuePrecondition();
      case RaspduinoDSLPackage.TIMER: return createTimer();
      case RaspduinoDSLPackage.ALARM: return createAlarm();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractDevice createAbstractDevice()
  {
    AbstractDeviceImpl abstractDevice = new AbstractDeviceImpl();
    return abstractDevice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sensor createSensor()
  {
    SensorImpl sensor = new SensorImpl();
    return sensor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actuator createActuator()
  {
    ActuatorImpl actuator = new ActuatorImpl();
    return actuator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventHandler createEventHandler()
  {
    EventHandlerImpl eventHandler = new EventHandlerImpl();
    return eventHandler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChangeActuator createChangeActuator()
  {
    ChangeActuatorImpl changeActuator = new ChangeActuatorImpl();
    return changeActuator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SensorListener createSensorListener()
  {
    SensorListenerImpl sensorListener = new SensorListenerImpl();
    return sensorListener;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Precondition createPrecondition()
  {
    PreconditionImpl precondition = new PreconditionImpl();
    return precondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Precondition1 createPrecondition1()
  {
    Precondition1Impl precondition1 = new Precondition1Impl();
    return precondition1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmptyPrecondition createEmptyPrecondition()
  {
    EmptyPreconditionImpl emptyPrecondition = new EmptyPreconditionImpl();
    return emptyPrecondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SensorValuePrecondition createSensorValuePrecondition()
  {
    SensorValuePreconditionImpl sensorValuePrecondition = new SensorValuePreconditionImpl();
    return sensorValuePrecondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Timer createTimer()
  {
    TimerImpl timer = new TimerImpl();
    return timer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Alarm createAlarm()
  {
    AlarmImpl alarm = new AlarmImpl();
    return alarm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RaspduinoDSLPackage getRaspduinoDSLPackage()
  {
    return (RaspduinoDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RaspduinoDSLPackage getPackage()
  {
    return RaspduinoDSLPackage.eINSTANCE;
  }

} //RaspduinoDSLFactoryImpl
