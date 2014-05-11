/**
 */
package es.usj.raspduino.raspduinoDSL.impl;

import es.usj.raspduino.raspduinoDSL.Alarm;
import es.usj.raspduino.raspduinoDSL.EventHandler;
import es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alarm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.impl.AlarmImpl#getEventHandler <em>Event Handler</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.impl.AlarmImpl#getRepeattype <em>Repeattype</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.impl.AlarmImpl#getTimerHours <em>Timer Hours</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.impl.AlarmImpl#getTimerMinutes <em>Timer Minutes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlarmImpl extends MinimalEObjectImpl.Container implements Alarm
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
   * The default value of the '{@link #getTimerHours() <em>Timer Hours</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimerHours()
   * @generated
   * @ordered
   */
  protected static final int TIMER_HOURS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTimerHours() <em>Timer Hours</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimerHours()
   * @generated
   * @ordered
   */
  protected int timerHours = TIMER_HOURS_EDEFAULT;

  /**
   * The default value of the '{@link #getTimerMinutes() <em>Timer Minutes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimerMinutes()
   * @generated
   * @ordered
   */
  protected static final int TIMER_MINUTES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTimerMinutes() <em>Timer Minutes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimerMinutes()
   * @generated
   * @ordered
   */
  protected int timerMinutes = TIMER_MINUTES_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AlarmImpl()
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
    return RaspduinoDSLPackage.Literals.ALARM;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RaspduinoDSLPackage.ALARM__EVENT_HANDLER, oldEventHandler, eventHandler));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RaspduinoDSLPackage.ALARM__EVENT_HANDLER, oldEventHandler, eventHandler));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RaspduinoDSLPackage.ALARM__REPEATTYPE, oldRepeattype, repeattype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTimerHours()
  {
    return timerHours;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimerHours(int newTimerHours)
  {
    int oldTimerHours = timerHours;
    timerHours = newTimerHours;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RaspduinoDSLPackage.ALARM__TIMER_HOURS, oldTimerHours, timerHours));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTimerMinutes()
  {
    return timerMinutes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimerMinutes(int newTimerMinutes)
  {
    int oldTimerMinutes = timerMinutes;
    timerMinutes = newTimerMinutes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RaspduinoDSLPackage.ALARM__TIMER_MINUTES, oldTimerMinutes, timerMinutes));
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
      case RaspduinoDSLPackage.ALARM__EVENT_HANDLER:
        if (resolve) return getEventHandler();
        return basicGetEventHandler();
      case RaspduinoDSLPackage.ALARM__REPEATTYPE:
        return getRepeattype();
      case RaspduinoDSLPackage.ALARM__TIMER_HOURS:
        return getTimerHours();
      case RaspduinoDSLPackage.ALARM__TIMER_MINUTES:
        return getTimerMinutes();
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
      case RaspduinoDSLPackage.ALARM__EVENT_HANDLER:
        setEventHandler((EventHandler)newValue);
        return;
      case RaspduinoDSLPackage.ALARM__REPEATTYPE:
        setRepeattype((String)newValue);
        return;
      case RaspduinoDSLPackage.ALARM__TIMER_HOURS:
        setTimerHours((Integer)newValue);
        return;
      case RaspduinoDSLPackage.ALARM__TIMER_MINUTES:
        setTimerMinutes((Integer)newValue);
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
      case RaspduinoDSLPackage.ALARM__EVENT_HANDLER:
        setEventHandler((EventHandler)null);
        return;
      case RaspduinoDSLPackage.ALARM__REPEATTYPE:
        setRepeattype(REPEATTYPE_EDEFAULT);
        return;
      case RaspduinoDSLPackage.ALARM__TIMER_HOURS:
        setTimerHours(TIMER_HOURS_EDEFAULT);
        return;
      case RaspduinoDSLPackage.ALARM__TIMER_MINUTES:
        setTimerMinutes(TIMER_MINUTES_EDEFAULT);
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
      case RaspduinoDSLPackage.ALARM__EVENT_HANDLER:
        return eventHandler != null;
      case RaspduinoDSLPackage.ALARM__REPEATTYPE:
        return REPEATTYPE_EDEFAULT == null ? repeattype != null : !REPEATTYPE_EDEFAULT.equals(repeattype);
      case RaspduinoDSLPackage.ALARM__TIMER_HOURS:
        return timerHours != TIMER_HOURS_EDEFAULT;
      case RaspduinoDSLPackage.ALARM__TIMER_MINUTES:
        return timerMinutes != TIMER_MINUTES_EDEFAULT;
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
    result.append(", timerHours: ");
    result.append(timerHours);
    result.append(", timerMinutes: ");
    result.append(timerMinutes);
    result.append(')');
    return result.toString();
  }

} //AlarmImpl
