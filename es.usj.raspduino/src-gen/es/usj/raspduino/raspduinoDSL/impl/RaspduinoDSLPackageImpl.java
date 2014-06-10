/**
 */
package es.usj.raspduino.raspduinoDSL.impl;

import es.usj.raspduino.raspduinoDSL.AbstractDevice;
import es.usj.raspduino.raspduinoDSL.Actuator;
import es.usj.raspduino.raspduinoDSL.ChangeActuator;
import es.usj.raspduino.raspduinoDSL.EventHandler;
import es.usj.raspduino.raspduinoDSL.Model;
import es.usj.raspduino.raspduinoDSL.RaspduinoDSLFactory;
import es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage;
import es.usj.raspduino.raspduinoDSL.Sensor;
import es.usj.raspduino.raspduinoDSL.SensorListener;
import es.usj.raspduino.raspduinoDSL.Timer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RaspduinoDSLPackageImpl extends EPackageImpl implements RaspduinoDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractDeviceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sensorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actuatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventHandlerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass changeActuatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sensorListenerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timerEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private RaspduinoDSLPackageImpl()
  {
    super(eNS_URI, RaspduinoDSLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link RaspduinoDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static RaspduinoDSLPackage init()
  {
    if (isInited) return (RaspduinoDSLPackage)EPackage.Registry.INSTANCE.getEPackage(RaspduinoDSLPackage.eNS_URI);

    // Obtain or create and register package
    RaspduinoDSLPackageImpl theRaspduinoDSLPackage = (RaspduinoDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RaspduinoDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RaspduinoDSLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theRaspduinoDSLPackage.createPackageContents();

    // Initialize created meta-data
    theRaspduinoDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theRaspduinoDSLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(RaspduinoDSLPackage.eNS_URI, theRaspduinoDSLPackage);
    return theRaspduinoDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModel_Name()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModel_Hardware()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Devices()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_EventHandlers()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_SensorListeners()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Timers()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractDevice()
  {
    return abstractDeviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractDevice_Name()
  {
    return (EAttribute)abstractDeviceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractDevice_Pin()
  {
    return (EAttribute)abstractDeviceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSensor()
  {
    return sensorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActuator()
  {
    return actuatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEventHandler()
  {
    return eventHandlerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEventHandler_Name()
  {
    return (EAttribute)eventHandlerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEventHandler_ChangeActuators()
  {
    return (EReference)eventHandlerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChangeActuator()
  {
    return changeActuatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChangeActuator_Actuator()
  {
    return (EReference)changeActuatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChangeActuator_ActuatorState()
  {
    return (EAttribute)changeActuatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSensorListener()
  {
    return sensorListenerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSensorListener_Sensor()
  {
    return (EReference)sensorListenerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSensorListener_Type()
  {
    return (EAttribute)sensorListenerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSensorListener_L()
  {
    return (EAttribute)sensorListenerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSensorListener_H()
  {
    return (EAttribute)sensorListenerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSensorListener_EventHandler()
  {
    return (EReference)sensorListenerEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimer()
  {
    return timerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTimer_EventHandler()
  {
    return (EReference)timerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimer_Repeattype()
  {
    return (EAttribute)timerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimer_Secs()
  {
    return (EAttribute)timerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimer_Hours()
  {
    return (EAttribute)timerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimer_Minutes()
  {
    return (EAttribute)timerEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RaspduinoDSLFactory getRaspduinoDSLFactory()
  {
    return (RaspduinoDSLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEAttribute(modelEClass, MODEL__NAME);
    createEAttribute(modelEClass, MODEL__HARDWARE);
    createEReference(modelEClass, MODEL__DEVICES);
    createEReference(modelEClass, MODEL__EVENT_HANDLERS);
    createEReference(modelEClass, MODEL__SENSOR_LISTENERS);
    createEReference(modelEClass, MODEL__TIMERS);

    abstractDeviceEClass = createEClass(ABSTRACT_DEVICE);
    createEAttribute(abstractDeviceEClass, ABSTRACT_DEVICE__NAME);
    createEAttribute(abstractDeviceEClass, ABSTRACT_DEVICE__PIN);

    sensorEClass = createEClass(SENSOR);

    actuatorEClass = createEClass(ACTUATOR);

    eventHandlerEClass = createEClass(EVENT_HANDLER);
    createEAttribute(eventHandlerEClass, EVENT_HANDLER__NAME);
    createEReference(eventHandlerEClass, EVENT_HANDLER__CHANGE_ACTUATORS);

    changeActuatorEClass = createEClass(CHANGE_ACTUATOR);
    createEReference(changeActuatorEClass, CHANGE_ACTUATOR__ACTUATOR);
    createEAttribute(changeActuatorEClass, CHANGE_ACTUATOR__ACTUATOR_STATE);

    sensorListenerEClass = createEClass(SENSOR_LISTENER);
    createEReference(sensorListenerEClass, SENSOR_LISTENER__SENSOR);
    createEAttribute(sensorListenerEClass, SENSOR_LISTENER__TYPE);
    createEAttribute(sensorListenerEClass, SENSOR_LISTENER__L);
    createEAttribute(sensorListenerEClass, SENSOR_LISTENER__H);
    createEReference(sensorListenerEClass, SENSOR_LISTENER__EVENT_HANDLER);

    timerEClass = createEClass(TIMER);
    createEReference(timerEClass, TIMER__EVENT_HANDLER);
    createEAttribute(timerEClass, TIMER__REPEATTYPE);
    createEAttribute(timerEClass, TIMER__SECS);
    createEAttribute(timerEClass, TIMER__HOURS);
    createEAttribute(timerEClass, TIMER__MINUTES);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    sensorEClass.getESuperTypes().add(this.getAbstractDevice());
    actuatorEClass.getESuperTypes().add(this.getAbstractDevice());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModel_Hardware(), ecorePackage.getEString(), "hardware", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Devices(), this.getAbstractDevice(), null, "devices", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_EventHandlers(), this.getEventHandler(), null, "eventHandlers", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_SensorListeners(), this.getSensorListener(), null, "sensorListeners", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Timers(), this.getTimer(), null, "timers", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractDeviceEClass, AbstractDevice.class, "AbstractDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractDevice_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractDevice_Pin(), ecorePackage.getEString(), "pin", null, 0, 1, AbstractDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(actuatorEClass, Actuator.class, "Actuator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(eventHandlerEClass, EventHandler.class, "EventHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEventHandler_Name(), ecorePackage.getEString(), "name", null, 0, 1, EventHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEventHandler_ChangeActuators(), this.getChangeActuator(), null, "changeActuators", null, 0, -1, EventHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(changeActuatorEClass, ChangeActuator.class, "ChangeActuator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getChangeActuator_Actuator(), this.getActuator(), null, "actuator", null, 0, 1, ChangeActuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getChangeActuator_ActuatorState(), ecorePackage.getEString(), "ActuatorState", null, 0, 1, ChangeActuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sensorListenerEClass, SensorListener.class, "SensorListener", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSensorListener_Sensor(), this.getSensor(), null, "sensor", null, 0, 1, SensorListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSensorListener_Type(), ecorePackage.getEString(), "type", null, 0, 1, SensorListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSensorListener_L(), ecorePackage.getEInt(), "l", null, 0, 1, SensorListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSensorListener_H(), ecorePackage.getEInt(), "h", null, 0, 1, SensorListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSensorListener_EventHandler(), this.getEventHandler(), null, "eventHandler", null, 0, 1, SensorListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(timerEClass, Timer.class, "Timer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTimer_EventHandler(), this.getEventHandler(), null, "eventHandler", null, 0, 1, Timer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimer_Repeattype(), ecorePackage.getEString(), "repeattype", null, 0, 1, Timer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimer_Secs(), ecorePackage.getEInt(), "secs", null, 0, 1, Timer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimer_Hours(), ecorePackage.getEInt(), "hours", null, 0, 1, Timer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimer_Minutes(), ecorePackage.getEInt(), "minutes", null, 0, 1, Timer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //RaspduinoDSLPackageImpl
