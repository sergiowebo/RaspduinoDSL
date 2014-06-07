/**
 */
package es.usj.raspduino.raspduinoDSL.util;

import es.usj.raspduino.raspduinoDSL.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage
 * @generated
 */
public class RaspduinoDSLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RaspduinoDSLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RaspduinoDSLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = RaspduinoDSLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case RaspduinoDSLPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RaspduinoDSLPackage.ABSTRACT_DEVICE:
      {
        AbstractDevice abstractDevice = (AbstractDevice)theEObject;
        T result = caseAbstractDevice(abstractDevice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RaspduinoDSLPackage.SENSOR:
      {
        Sensor sensor = (Sensor)theEObject;
        T result = caseSensor(sensor);
        if (result == null) result = caseAbstractDevice(sensor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RaspduinoDSLPackage.ACTUATOR:
      {
        Actuator actuator = (Actuator)theEObject;
        T result = caseActuator(actuator);
        if (result == null) result = caseAbstractDevice(actuator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RaspduinoDSLPackage.EVENT_HANDLER:
      {
        EventHandler eventHandler = (EventHandler)theEObject;
        T result = caseEventHandler(eventHandler);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RaspduinoDSLPackage.CHANGE_ACTUATOR:
      {
        ChangeActuator changeActuator = (ChangeActuator)theEObject;
        T result = caseChangeActuator(changeActuator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RaspduinoDSLPackage.SENSOR_LISTENER:
      {
        SensorListener sensorListener = (SensorListener)theEObject;
        T result = caseSensorListener(sensorListener);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RaspduinoDSLPackage.TIMER:
      {
        Timer timer = (Timer)theEObject;
        T result = caseTimer(timer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Device</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Device</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractDevice(AbstractDevice object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSensor(Sensor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actuator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actuator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActuator(Actuator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Handler</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Handler</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventHandler(EventHandler object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Change Actuator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Change Actuator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChangeActuator(ChangeActuator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sensor Listener</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sensor Listener</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSensorListener(SensorListener object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Timer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Timer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimer(Timer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //RaspduinoDSLSwitch
