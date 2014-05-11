/**
 */
package es.usj.raspduino.raspduinoDSL.util;

import es.usj.raspduino.raspduinoDSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage
 * @generated
 */
public class RaspduinoDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RaspduinoDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RaspduinoDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = RaspduinoDSLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RaspduinoDSLSwitch<Adapter> modelSwitch =
    new RaspduinoDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseAbstractDevice(AbstractDevice object)
      {
        return createAbstractDeviceAdapter();
      }
      @Override
      public Adapter caseSensor(Sensor object)
      {
        return createSensorAdapter();
      }
      @Override
      public Adapter caseActuator(Actuator object)
      {
        return createActuatorAdapter();
      }
      @Override
      public Adapter caseEventHandler(EventHandler object)
      {
        return createEventHandlerAdapter();
      }
      @Override
      public Adapter caseChangeActuator(ChangeActuator object)
      {
        return createChangeActuatorAdapter();
      }
      @Override
      public Adapter caseSensorListener(SensorListener object)
      {
        return createSensorListenerAdapter();
      }
      @Override
      public Adapter casePrecondition(Precondition object)
      {
        return createPreconditionAdapter();
      }
      @Override
      public Adapter casePrecondition1(Precondition1 object)
      {
        return createPrecondition1Adapter();
      }
      @Override
      public Adapter caseEmptyPrecondition(EmptyPrecondition object)
      {
        return createEmptyPreconditionAdapter();
      }
      @Override
      public Adapter caseSensorValuePrecondition(SensorValuePrecondition object)
      {
        return createSensorValuePreconditionAdapter();
      }
      @Override
      public Adapter caseTimer(Timer object)
      {
        return createTimerAdapter();
      }
      @Override
      public Adapter caseAlarm(Alarm object)
      {
        return createAlarmAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link es.usj.raspduino.raspduinoDSL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.usj.raspduino.raspduinoDSL.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.usj.raspduino.raspduinoDSL.AbstractDevice <em>Abstract Device</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.usj.raspduino.raspduinoDSL.AbstractDevice
   * @generated
   */
  public Adapter createAbstractDeviceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.usj.raspduino.raspduinoDSL.Sensor <em>Sensor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.usj.raspduino.raspduinoDSL.Sensor
   * @generated
   */
  public Adapter createSensorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.usj.raspduino.raspduinoDSL.Actuator <em>Actuator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.usj.raspduino.raspduinoDSL.Actuator
   * @generated
   */
  public Adapter createActuatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.usj.raspduino.raspduinoDSL.EventHandler <em>Event Handler</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.usj.raspduino.raspduinoDSL.EventHandler
   * @generated
   */
  public Adapter createEventHandlerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.usj.raspduino.raspduinoDSL.ChangeActuator <em>Change Actuator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.usj.raspduino.raspduinoDSL.ChangeActuator
   * @generated
   */
  public Adapter createChangeActuatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.usj.raspduino.raspduinoDSL.SensorListener <em>Sensor Listener</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.usj.raspduino.raspduinoDSL.SensorListener
   * @generated
   */
  public Adapter createSensorListenerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.usj.raspduino.raspduinoDSL.Precondition <em>Precondition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.usj.raspduino.raspduinoDSL.Precondition
   * @generated
   */
  public Adapter createPreconditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.usj.raspduino.raspduinoDSL.Precondition1 <em>Precondition1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.usj.raspduino.raspduinoDSL.Precondition1
   * @generated
   */
  public Adapter createPrecondition1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.usj.raspduino.raspduinoDSL.EmptyPrecondition <em>Empty Precondition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.usj.raspduino.raspduinoDSL.EmptyPrecondition
   * @generated
   */
  public Adapter createEmptyPreconditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.usj.raspduino.raspduinoDSL.SensorValuePrecondition <em>Sensor Value Precondition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.usj.raspduino.raspduinoDSL.SensorValuePrecondition
   * @generated
   */
  public Adapter createSensorValuePreconditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.usj.raspduino.raspduinoDSL.Timer <em>Timer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.usj.raspduino.raspduinoDSL.Timer
   * @generated
   */
  public Adapter createTimerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.usj.raspduino.raspduinoDSL.Alarm <em>Alarm</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.usj.raspduino.raspduinoDSL.Alarm
   * @generated
   */
  public Adapter createAlarmAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //RaspduinoDSLAdapterFactory
