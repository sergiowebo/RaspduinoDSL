/**
 */
package es.usj.raspduino.raspduinoDSL.impl;

import es.usj.raspduino.raspduinoDSL.ChangeActuator;
import es.usj.raspduino.raspduinoDSL.EventHandler;
import es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage;

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
 * An implementation of the model object '<em><b>Event Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.impl.EventHandlerImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.impl.EventHandlerImpl#getChangeActuators <em>Change Actuators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventHandlerImpl extends MinimalEObjectImpl.Container implements EventHandler
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
   * The cached value of the '{@link #getChangeActuators() <em>Change Actuators</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChangeActuators()
   * @generated
   * @ordered
   */
  protected EList<ChangeActuator> changeActuators;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventHandlerImpl()
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
    return RaspduinoDSLPackage.Literals.EVENT_HANDLER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RaspduinoDSLPackage.EVENT_HANDLER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ChangeActuator> getChangeActuators()
  {
    if (changeActuators == null)
    {
      changeActuators = new EObjectContainmentEList<ChangeActuator>(ChangeActuator.class, this, RaspduinoDSLPackage.EVENT_HANDLER__CHANGE_ACTUATORS);
    }
    return changeActuators;
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
      case RaspduinoDSLPackage.EVENT_HANDLER__CHANGE_ACTUATORS:
        return ((InternalEList<?>)getChangeActuators()).basicRemove(otherEnd, msgs);
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
      case RaspduinoDSLPackage.EVENT_HANDLER__NAME:
        return getName();
      case RaspduinoDSLPackage.EVENT_HANDLER__CHANGE_ACTUATORS:
        return getChangeActuators();
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
      case RaspduinoDSLPackage.EVENT_HANDLER__NAME:
        setName((String)newValue);
        return;
      case RaspduinoDSLPackage.EVENT_HANDLER__CHANGE_ACTUATORS:
        getChangeActuators().clear();
        getChangeActuators().addAll((Collection<? extends ChangeActuator>)newValue);
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
      case RaspduinoDSLPackage.EVENT_HANDLER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RaspduinoDSLPackage.EVENT_HANDLER__CHANGE_ACTUATORS:
        getChangeActuators().clear();
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
      case RaspduinoDSLPackage.EVENT_HANDLER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RaspduinoDSLPackage.EVENT_HANDLER__CHANGE_ACTUATORS:
        return changeActuators != null && !changeActuators.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //EventHandlerImpl
