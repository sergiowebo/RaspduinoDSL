/**
 */
package es.usj.raspduino.raspduinoDSL.impl;

import es.usj.raspduino.raspduinoDSL.AbstractDevice;
import es.usj.raspduino.raspduinoDSL.Alarm;
import es.usj.raspduino.raspduinoDSL.EventHandler;
import es.usj.raspduino.raspduinoDSL.Model;
import es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage;
import es.usj.raspduino.raspduinoDSL.SensorListener;
import es.usj.raspduino.raspduinoDSL.Timer;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.impl.ModelImpl#getHardware <em>Hardware</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.impl.ModelImpl#getDevices <em>Devices</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.impl.ModelImpl#getEventHandlers <em>Event Handlers</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.impl.ModelImpl#getSensorListeners <em>Sensor Listeners</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.impl.ModelImpl#getTimers <em>Timers</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.impl.ModelImpl#getAlarms <em>Alarms</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.impl.ModelImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getHardware() <em>Hardware</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHardware()
   * @generated
   * @ordered
   */
  protected static final String HARDWARE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHardware() <em>Hardware</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHardware()
   * @generated
   * @ordered
   */
  protected String hardware = HARDWARE_EDEFAULT;

  /**
   * The cached value of the '{@link #getDevices() <em>Devices</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDevices()
   * @generated
   * @ordered
   */
  protected EList<AbstractDevice> devices;

  /**
   * The cached value of the '{@link #getEventHandlers() <em>Event Handlers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventHandlers()
   * @generated
   * @ordered
   */
  protected EList<EventHandler> eventHandlers;

  /**
   * The cached value of the '{@link #getSensorListeners() <em>Sensor Listeners</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSensorListeners()
   * @generated
   * @ordered
   */
  protected EList<SensorListener> sensorListeners;

  /**
   * The cached value of the '{@link #getTimers() <em>Timers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimers()
   * @generated
   * @ordered
   */
  protected EList<Timer> timers;

  /**
   * The cached value of the '{@link #getAlarms() <em>Alarms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlarms()
   * @generated
   * @ordered
   */
  protected EList<Alarm> alarms;

  /**
   * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriority()
   * @generated
   * @ordered
   */
  protected static final String PRIORITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriority()
   * @generated
   * @ordered
   */
  protected String priority = PRIORITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RaspduinoDSLPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RaspduinoDSLPackage.MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHardware()
  {
    return hardware;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHardware(String newHardware)
  {
    String oldHardware = hardware;
    hardware = newHardware;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RaspduinoDSLPackage.MODEL__HARDWARE, oldHardware, hardware));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractDevice> getDevices()
  {
    if (devices == null)
    {
      devices = new EObjectContainmentEList<AbstractDevice>(AbstractDevice.class, this, RaspduinoDSLPackage.MODEL__DEVICES);
    }
    return devices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EventHandler> getEventHandlers()
  {
    if (eventHandlers == null)
    {
      eventHandlers = new EObjectContainmentEList<EventHandler>(EventHandler.class, this, RaspduinoDSLPackage.MODEL__EVENT_HANDLERS);
    }
    return eventHandlers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SensorListener> getSensorListeners()
  {
    if (sensorListeners == null)
    {
      sensorListeners = new EObjectContainmentEList<SensorListener>(SensorListener.class, this, RaspduinoDSLPackage.MODEL__SENSOR_LISTENERS);
    }
    return sensorListeners;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Timer> getTimers()
  {
    if (timers == null)
    {
      timers = new EObjectContainmentEList<Timer>(Timer.class, this, RaspduinoDSLPackage.MODEL__TIMERS);
    }
    return timers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Alarm> getAlarms()
  {
    if (alarms == null)
    {
      alarms = new EObjectContainmentEList<Alarm>(Alarm.class, this, RaspduinoDSLPackage.MODEL__ALARMS);
    }
    return alarms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPriority()
  {
    return priority;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPriority(String newPriority)
  {
    String oldPriority = priority;
    priority = newPriority;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RaspduinoDSLPackage.MODEL__PRIORITY, oldPriority, priority));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RaspduinoDSLPackage.MODEL__DEVICES:
        return ((InternalEList<?>)getDevices()).basicRemove(otherEnd, msgs);
      case RaspduinoDSLPackage.MODEL__EVENT_HANDLERS:
        return ((InternalEList<?>)getEventHandlers()).basicRemove(otherEnd, msgs);
      case RaspduinoDSLPackage.MODEL__SENSOR_LISTENERS:
        return ((InternalEList<?>)getSensorListeners()).basicRemove(otherEnd, msgs);
      case RaspduinoDSLPackage.MODEL__TIMERS:
        return ((InternalEList<?>)getTimers()).basicRemove(otherEnd, msgs);
      case RaspduinoDSLPackage.MODEL__ALARMS:
        return ((InternalEList<?>)getAlarms()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RaspduinoDSLPackage.MODEL__NAME:
        return getName();
      case RaspduinoDSLPackage.MODEL__HARDWARE:
        return getHardware();
      case RaspduinoDSLPackage.MODEL__DEVICES:
        return getDevices();
      case RaspduinoDSLPackage.MODEL__EVENT_HANDLERS:
        return getEventHandlers();
      case RaspduinoDSLPackage.MODEL__SENSOR_LISTENERS:
        return getSensorListeners();
      case RaspduinoDSLPackage.MODEL__TIMERS:
        return getTimers();
      case RaspduinoDSLPackage.MODEL__ALARMS:
        return getAlarms();
      case RaspduinoDSLPackage.MODEL__PRIORITY:
        return getPriority();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RaspduinoDSLPackage.MODEL__NAME:
        setName((String)newValue);
        return;
      case RaspduinoDSLPackage.MODEL__HARDWARE:
        setHardware((String)newValue);
        return;
      case RaspduinoDSLPackage.MODEL__DEVICES:
        getDevices().clear();
        getDevices().addAll((Collection<? extends AbstractDevice>)newValue);
        return;
      case RaspduinoDSLPackage.MODEL__EVENT_HANDLERS:
        getEventHandlers().clear();
        getEventHandlers().addAll((Collection<? extends EventHandler>)newValue);
        return;
      case RaspduinoDSLPackage.MODEL__SENSOR_LISTENERS:
        getSensorListeners().clear();
        getSensorListeners().addAll((Collection<? extends SensorListener>)newValue);
        return;
      case RaspduinoDSLPackage.MODEL__TIMERS:
        getTimers().clear();
        getTimers().addAll((Collection<? extends Timer>)newValue);
        return;
      case RaspduinoDSLPackage.MODEL__ALARMS:
        getAlarms().clear();
        getAlarms().addAll((Collection<? extends Alarm>)newValue);
        return;
      case RaspduinoDSLPackage.MODEL__PRIORITY:
        setPriority((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RaspduinoDSLPackage.MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RaspduinoDSLPackage.MODEL__HARDWARE:
        setHardware(HARDWARE_EDEFAULT);
        return;
      case RaspduinoDSLPackage.MODEL__DEVICES:
        getDevices().clear();
        return;
      case RaspduinoDSLPackage.MODEL__EVENT_HANDLERS:
        getEventHandlers().clear();
        return;
      case RaspduinoDSLPackage.MODEL__SENSOR_LISTENERS:
        getSensorListeners().clear();
        return;
      case RaspduinoDSLPackage.MODEL__TIMERS:
        getTimers().clear();
        return;
      case RaspduinoDSLPackage.MODEL__ALARMS:
        getAlarms().clear();
        return;
      case RaspduinoDSLPackage.MODEL__PRIORITY:
        setPriority(PRIORITY_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RaspduinoDSLPackage.MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RaspduinoDSLPackage.MODEL__HARDWARE:
        return HARDWARE_EDEFAULT == null ? hardware != null : !HARDWARE_EDEFAULT.equals(hardware);
      case RaspduinoDSLPackage.MODEL__DEVICES:
        return devices != null && !devices.isEmpty();
      case RaspduinoDSLPackage.MODEL__EVENT_HANDLERS:
        return eventHandlers != null && !eventHandlers.isEmpty();
      case RaspduinoDSLPackage.MODEL__SENSOR_LISTENERS:
        return sensorListeners != null && !sensorListeners.isEmpty();
      case RaspduinoDSLPackage.MODEL__TIMERS:
        return timers != null && !timers.isEmpty();
      case RaspduinoDSLPackage.MODEL__ALARMS:
        return alarms != null && !alarms.isEmpty();
      case RaspduinoDSLPackage.MODEL__PRIORITY:
        return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", hardware: ");
    result.append(hardware);
    result.append(", priority: ");
    result.append(priority);
    result.append(')');
    return result.toString();
  }

} //ModelImpl
