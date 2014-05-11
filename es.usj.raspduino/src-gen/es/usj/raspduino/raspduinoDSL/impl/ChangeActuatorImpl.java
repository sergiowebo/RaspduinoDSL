/**
 */
package es.usj.raspduino.raspduinoDSL.impl;

import es.usj.raspduino.raspduinoDSL.Actuator;
import es.usj.raspduino.raspduinoDSL.ChangeActuator;
import es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Actuator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.impl.ChangeActuatorImpl#getActuator <em>Actuator</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.impl.ChangeActuatorImpl#getActuatorState <em>Actuator State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChangeActuatorImpl extends MinimalEObjectImpl.Container implements ChangeActuator
{
  /**
   * The cached value of the '{@link #getActuator() <em>Actuator</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActuator()
   * @generated
   * @ordered
   */
  protected Actuator actuator;

  /**
   * The default value of the '{@link #getActuatorState() <em>Actuator State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActuatorState()
   * @generated
   * @ordered
   */
  protected static final String ACTUATOR_STATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getActuatorState() <em>Actuator State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActuatorState()
   * @generated
   * @ordered
   */
  protected String actuatorState = ACTUATOR_STATE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChangeActuatorImpl()
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
    return RaspduinoDSLPackage.Literals.CHANGE_ACTUATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actuator getActuator()
  {
    if (actuator != null && actuator.eIsProxy())
    {
      InternalEObject oldActuator = (InternalEObject)actuator;
      actuator = (Actuator)eResolveProxy(oldActuator);
      if (actuator != oldActuator)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RaspduinoDSLPackage.CHANGE_ACTUATOR__ACTUATOR, oldActuator, actuator));
      }
    }
    return actuator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actuator basicGetActuator()
  {
    return actuator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActuator(Actuator newActuator)
  {
    Actuator oldActuator = actuator;
    actuator = newActuator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RaspduinoDSLPackage.CHANGE_ACTUATOR__ACTUATOR, oldActuator, actuator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getActuatorState()
  {
    return actuatorState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActuatorState(String newActuatorState)
  {
    String oldActuatorState = actuatorState;
    actuatorState = newActuatorState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RaspduinoDSLPackage.CHANGE_ACTUATOR__ACTUATOR_STATE, oldActuatorState, actuatorState));
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
      case RaspduinoDSLPackage.CHANGE_ACTUATOR__ACTUATOR:
        if (resolve) return getActuator();
        return basicGetActuator();
      case RaspduinoDSLPackage.CHANGE_ACTUATOR__ACTUATOR_STATE:
        return getActuatorState();
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
      case RaspduinoDSLPackage.CHANGE_ACTUATOR__ACTUATOR:
        setActuator((Actuator)newValue);
        return;
      case RaspduinoDSLPackage.CHANGE_ACTUATOR__ACTUATOR_STATE:
        setActuatorState((String)newValue);
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
      case RaspduinoDSLPackage.CHANGE_ACTUATOR__ACTUATOR:
        setActuator((Actuator)null);
        return;
      case RaspduinoDSLPackage.CHANGE_ACTUATOR__ACTUATOR_STATE:
        setActuatorState(ACTUATOR_STATE_EDEFAULT);
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
      case RaspduinoDSLPackage.CHANGE_ACTUATOR__ACTUATOR:
        return actuator != null;
      case RaspduinoDSLPackage.CHANGE_ACTUATOR__ACTUATOR_STATE:
        return ACTUATOR_STATE_EDEFAULT == null ? actuatorState != null : !ACTUATOR_STATE_EDEFAULT.equals(actuatorState);
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
    result.append(" (ActuatorState: ");
    result.append(actuatorState);
    result.append(')');
    return result.toString();
  }

} //ChangeActuatorImpl
