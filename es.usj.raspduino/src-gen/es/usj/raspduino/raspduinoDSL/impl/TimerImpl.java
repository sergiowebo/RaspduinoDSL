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
 *   <li>{@link es.usj.raspduino.raspduinoDSL.impl.TimerImpl#getTimerSecs <em>Timer Secs</em>}</li>
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
   * The default value of the '{@link #getTimerSecs() <em>Timer Secs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimerSecs()
   * @generated
   * @ordered
   */
  protected static final int TIMER_SECS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTimerSecs() <em>Timer Secs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimerSecs()
   * @generated
   * @ordered
   */
  protected int timerSecs = TIMER_SECS_EDEFAULT;

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
  public int getTimerSecs()
  {
    return timerSecs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimerSecs(int newTimerSecs)
  {
    int oldTimerSecs = timerSecs;
    timerSecs = newTimerSecs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RaspduinoDSLPackage.TIMER__TIMER_SECS, oldTimerSecs, timerSecs));
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
      case RaspduinoDSLPackage.TIMER__TIMER_SECS:
        return getTimerSecs();
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
      case RaspduinoDSLPackage.TIMER__TIMER_SECS:
        setTimerSecs((Integer)newValue);
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
      case RaspduinoDSLPackage.TIMER__TIMER_SECS:
        setTimerSecs(TIMER_SECS_EDEFAULT);
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
      case RaspduinoDSLPackage.TIMER__TIMER_SECS:
        return timerSecs != TIMER_SECS_EDEFAULT;
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
    result.append(", timerSecs: ");
    result.append(timerSecs);
    result.append(')');
    return result.toString();
  }

} //TimerImpl
