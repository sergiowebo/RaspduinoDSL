/**
 */
package es.usj.raspduino.raspduinoDSL.impl;

import es.usj.raspduino.raspduinoDSL.EventHandler;
import es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage;
import es.usj.raspduino.raspduinoDSL.Timer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.impl.TimerImpl#getEventHandler <em>Event Handler</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.impl.TimerImpl#getRepeattype <em>Repeattype</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.impl.TimerImpl#getSecs <em>Secs</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.impl.TimerImpl#getHours <em>Hours</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.impl.TimerImpl#getMinutes <em>Minutes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimerImpl extends MinimalEObjectImpl.Container implements Timer
{
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
   * The default value of the '{@link #getRepeattype() <em>Repeattype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepeattype()
   * @generated
   * @ordered
   */
  protected static final String REPEATTYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRepeattype() <em>Repeattype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepeattype()
   * @generated
   * @ordered
   */
  protected String repeattype = REPEATTYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getSecs() <em>Secs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecs()
   * @generated
   * @ordered
   */
  protected static final int SECS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSecs() <em>Secs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecs()
   * @generated
   * @ordered
   */
  protected int secs = SECS_EDEFAULT;

  /**
   * The default value of the '{@link #getHours() <em>Hours</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHours()
   * @generated
   * @ordered
   */
  protected static final int HOURS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHours() <em>Hours</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHours()
   * @generated
   * @ordered
   */
  protected int hours = HOURS_EDEFAULT;

  /**
   * The default value of the '{@link #getMinutes() <em>Minutes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinutes()
   * @generated
   * @ordered
   */
  protected static final int MINUTES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMinutes() <em>Minutes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinutes()
   * @generated
   * @ordered
   */
  protected int minutes = MINUTES_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TimerImpl()
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
    return RaspduinoDSLPackage.Literals.TIMER;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RaspduinoDSLPackage.TIMER__EVENT_HANDLER, oldEventHandler, eventHandler));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RaspduinoDSLPackage.TIMER__EVENT_HANDLER, oldEventHandler, eventHandler));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRepeattype()
  {
    return repeattype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRepeattype(String newRepeattype)
  {
    String oldRepeattype = repeattype;
    repeattype = newRepeattype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RaspduinoDSLPackage.TIMER__REPEATTYPE, oldRepeattype, repeattype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSecs()
  {
    return secs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecs(int newSecs)
  {
    int oldSecs = secs;
    secs = newSecs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RaspduinoDSLPackage.TIMER__SECS, oldSecs, secs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHours()
  {
    return hours;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHours(int newHours)
  {
    int oldHours = hours;
    hours = newHours;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RaspduinoDSLPackage.TIMER__HOURS, oldHours, hours));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMinutes()
  {
    return minutes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinutes(int newMinutes)
  {
    int oldMinutes = minutes;
    minutes = newMinutes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RaspduinoDSLPackage.TIMER__MINUTES, oldMinutes, minutes));
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
      case RaspduinoDSLPackage.TIMER__EVENT_HANDLER:
        if (resolve) return getEventHandler();
        return basicGetEventHandler();
      case RaspduinoDSLPackage.TIMER__REPEATTYPE:
        return getRepeattype();
      case RaspduinoDSLPackage.TIMER__SECS:
        return getSecs();
      case RaspduinoDSLPackage.TIMER__HOURS:
        return getHours();
      case RaspduinoDSLPackage.TIMER__MINUTES:
        return getMinutes();
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
      case RaspduinoDSLPackage.TIMER__EVENT_HANDLER:
        setEventHandler((EventHandler)newValue);
        return;
      case RaspduinoDSLPackage.TIMER__REPEATTYPE:
        setRepeattype((String)newValue);
        return;
      case RaspduinoDSLPackage.TIMER__SECS:
        setSecs((Integer)newValue);
        return;
      case RaspduinoDSLPackage.TIMER__HOURS:
        setHours((Integer)newValue);
        return;
      case RaspduinoDSLPackage.TIMER__MINUTES:
        setMinutes((Integer)newValue);
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
      case RaspduinoDSLPackage.TIMER__EVENT_HANDLER:
        setEventHandler((EventHandler)null);
        return;
      case RaspduinoDSLPackage.TIMER__REPEATTYPE:
        setRepeattype(REPEATTYPE_EDEFAULT);
        return;
      case RaspduinoDSLPackage.TIMER__SECS:
        setSecs(SECS_EDEFAULT);
        return;
      case RaspduinoDSLPackage.TIMER__HOURS:
        setHours(HOURS_EDEFAULT);
        return;
      case RaspduinoDSLPackage.TIMER__MINUTES:
        setMinutes(MINUTES_EDEFAULT);
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
      case RaspduinoDSLPackage.TIMER__EVENT_HANDLER:
        return eventHandler != null;
      case RaspduinoDSLPackage.TIMER__REPEATTYPE:
        return REPEATTYPE_EDEFAULT == null ? repeattype != null : !REPEATTYPE_EDEFAULT.equals(repeattype);
      case RaspduinoDSLPackage.TIMER__SECS:
        return secs != SECS_EDEFAULT;
      case RaspduinoDSLPackage.TIMER__HOURS:
        return hours != HOURS_EDEFAULT;
      case RaspduinoDSLPackage.TIMER__MINUTES:
        return minutes != MINUTES_EDEFAULT;
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
    result.append(" (repeattype: ");
    result.append(repeattype);
    result.append(", secs: ");
    result.append(secs);
    result.append(", hours: ");
    result.append(hours);
    result.append(", minutes: ");
    result.append(minutes);
    result.append(')');
    return result.toString();
  }

} //TimerImpl
