/**
 */
package es.usj.raspduino.raspduinoDSL.impl;

import es.usj.raspduino.raspduinoDSL.EventHandler;
import es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage;
import es.usj.raspduino.raspduinoDSL.Sensor;
import es.usj.raspduino.raspduinoDSL.SensorListener;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor Listener</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.impl.SensorListenerImpl#getSensor <em>Sensor</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.impl.SensorListenerImpl#getType <em>Type</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.impl.SensorListenerImpl#getL <em>L</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.impl.SensorListenerImpl#getH <em>H</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.impl.SensorListenerImpl#getEventHandler <em>Event Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SensorListenerImpl extends MinimalEObjectImpl.Container implements SensorListener
{
  /**
   * The cached value of the '{@link #getSensor() <em>Sensor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSensor()
   * @generated
   * @ordered
   */
  protected Sensor sensor;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getL() <em>L</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL()
   * @generated
   * @ordered
   */
  protected static final int L_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getL() <em>L</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL()
   * @generated
   * @ordered
   */
  protected int l = L_EDEFAULT;

  /**
   * The default value of the '{@link #getH() <em>H</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getH()
   * @generated
   * @ordered
   */
  protected static final int H_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getH() <em>H</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getH()
   * @generated
   * @ordered
   */
  protected int h = H_EDEFAULT;

  /**
   * The cached value of the '{@link #getEventHandler() <em>Event Handler</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventHandler()
   * @generated
   * @ordered
   */
  protected EventHandler eventHandler;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SensorListenerImpl()
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
    return RaspduinoDSLPackage.Literals.SENSOR_LISTENER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sensor getSensor()
  {
    if (sensor != null && sensor.eIsProxy())
    {
      InternalEObject oldSensor = (InternalEObject)sensor;
      sensor = (Sensor)eResolveProxy(oldSensor);
      if (sensor != oldSensor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RaspduinoDSLPackage.SENSOR_LISTENER__SENSOR, oldSensor, sensor));
      }
    }
    return sensor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sensor basicGetSensor()
  {
    return sensor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSensor(Sensor newSensor)
  {
    Sensor oldSensor = sensor;
    sensor = newSensor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RaspduinoDSLPackage.SENSOR_LISTENER__SENSOR, oldSensor, sensor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RaspduinoDSLPackage.SENSOR_LISTENER__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getL()
  {
    return l;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setL(int newL)
  {
    int oldL = l;
    l = newL;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RaspduinoDSLPackage.SENSOR_LISTENER__L, oldL, l));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getH()
  {
    return h;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setH(int newH)
  {
    int oldH = h;
    h = newH;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RaspduinoDSLPackage.SENSOR_LISTENER__H, oldH, h));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventHandler getEventHandler()
  {
    if (eventHandler != null && eventHandler.eIsProxy())
    {
      InternalEObject oldEventHandler = (InternalEObject)eventHandler;
      eventHandler = (EventHandler)eResolveProxy(oldEventHandler);
      if (eventHandler != oldEventHandler)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RaspduinoDSLPackage.SENSOR_LISTENER__EVENT_HANDLER, oldEventHandler, eventHandler));
      }
    }
    return eventHandler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventHandler basicGetEventHandler()
  {
    return eventHandler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEventHandler(EventHandler newEventHandler)
  {
    EventHandler oldEventHandler = eventHandler;
    eventHandler = newEventHandler;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RaspduinoDSLPackage.SENSOR_LISTENER__EVENT_HANDLER, oldEventHandler, eventHandler));
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
      case RaspduinoDSLPackage.SENSOR_LISTENER__SENSOR:
        if (resolve) return getSensor();
        return basicGetSensor();
      case RaspduinoDSLPackage.SENSOR_LISTENER__TYPE:
        return getType();
      case RaspduinoDSLPackage.SENSOR_LISTENER__L:
        return getL();
      case RaspduinoDSLPackage.SENSOR_LISTENER__H:
        return getH();
      case RaspduinoDSLPackage.SENSOR_LISTENER__EVENT_HANDLER:
        if (resolve) return getEventHandler();
        return basicGetEventHandler();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RaspduinoDSLPackage.SENSOR_LISTENER__SENSOR:
        setSensor((Sensor)newValue);
        return;
      case RaspduinoDSLPackage.SENSOR_LISTENER__TYPE:
        setType((String)newValue);
        return;
      case RaspduinoDSLPackage.SENSOR_LISTENER__L:
        setL((Integer)newValue);
        return;
      case RaspduinoDSLPackage.SENSOR_LISTENER__H:
        setH((Integer)newValue);
        return;
      case RaspduinoDSLPackage.SENSOR_LISTENER__EVENT_HANDLER:
        setEventHandler((EventHandler)newValue);
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
      case RaspduinoDSLPackage.SENSOR_LISTENER__SENSOR:
        setSensor((Sensor)null);
        return;
      case RaspduinoDSLPackage.SENSOR_LISTENER__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case RaspduinoDSLPackage.SENSOR_LISTENER__L:
        setL(L_EDEFAULT);
        return;
      case RaspduinoDSLPackage.SENSOR_LISTENER__H:
        setH(H_EDEFAULT);
        return;
      case RaspduinoDSLPackage.SENSOR_LISTENER__EVENT_HANDLER:
        setEventHandler((EventHandler)null);
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
      case RaspduinoDSLPackage.SENSOR_LISTENER__SENSOR:
        return sensor != null;
      case RaspduinoDSLPackage.SENSOR_LISTENER__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case RaspduinoDSLPackage.SENSOR_LISTENER__L:
        return l != L_EDEFAULT;
      case RaspduinoDSLPackage.SENSOR_LISTENER__H:
        return h != H_EDEFAULT;
      case RaspduinoDSLPackage.SENSOR_LISTENER__EVENT_HANDLER:
        return eventHandler != null;
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
    result.append(" (type: ");
    result.append(type);
    result.append(", l: ");
    result.append(l);
    result.append(", h: ");
    result.append(h);
    result.append(')');
    return result.toString();
  }

} //SensorListenerImpl
