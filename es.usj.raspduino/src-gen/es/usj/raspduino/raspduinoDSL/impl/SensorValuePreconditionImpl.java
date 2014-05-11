/**
 */
package es.usj.raspduino.raspduinoDSL.impl;

import es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage;
import es.usj.raspduino.raspduinoDSL.Sensor;
import es.usj.raspduino.raspduinoDSL.SensorValuePrecondition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor Value Precondition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.impl.SensorValuePreconditionImpl#getSensor <em>Sensor</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.impl.SensorValuePreconditionImpl#getCond <em>Cond</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.impl.SensorValuePreconditionImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SensorValuePreconditionImpl extends MinimalEObjectImpl.Container implements SensorValuePrecondition
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
   * The default value of the '{@link #getCond() <em>Cond</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCond()
   * @generated
   * @ordered
   */
  protected static final String COND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCond() <em>Cond</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCond()
   * @generated
   * @ordered
   */
  protected String cond = COND_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SensorValuePreconditionImpl()
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
    return RaspduinoDSLPackage.Literals.SENSOR_VALUE_PRECONDITION;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RaspduinoDSLPackage.SENSOR_VALUE_PRECONDITION__SENSOR, oldSensor, sensor));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RaspduinoDSLPackage.SENSOR_VALUE_PRECONDITION__SENSOR, oldSensor, sensor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCond()
  {
    return cond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCond(String newCond)
  {
    String oldCond = cond;
    cond = newCond;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RaspduinoDSLPackage.SENSOR_VALUE_PRECONDITION__COND, oldCond, cond));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RaspduinoDSLPackage.SENSOR_VALUE_PRECONDITION__VALUE, oldValue, value));
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
      case RaspduinoDSLPackage.SENSOR_VALUE_PRECONDITION__SENSOR:
        if (resolve) return getSensor();
        return basicGetSensor();
      case RaspduinoDSLPackage.SENSOR_VALUE_PRECONDITION__COND:
        return getCond();
      case RaspduinoDSLPackage.SENSOR_VALUE_PRECONDITION__VALUE:
        return getValue();
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
      case RaspduinoDSLPackage.SENSOR_VALUE_PRECONDITION__SENSOR:
        setSensor((Sensor)newValue);
        return;
      case RaspduinoDSLPackage.SENSOR_VALUE_PRECONDITION__COND:
        setCond((String)newValue);
        return;
      case RaspduinoDSLPackage.SENSOR_VALUE_PRECONDITION__VALUE:
        setValue((String)newValue);
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
      case RaspduinoDSLPackage.SENSOR_VALUE_PRECONDITION__SENSOR:
        setSensor((Sensor)null);
        return;
      case RaspduinoDSLPackage.SENSOR_VALUE_PRECONDITION__COND:
        setCond(COND_EDEFAULT);
        return;
      case RaspduinoDSLPackage.SENSOR_VALUE_PRECONDITION__VALUE:
        setValue(VALUE_EDEFAULT);
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
      case RaspduinoDSLPackage.SENSOR_VALUE_PRECONDITION__SENSOR:
        return sensor != null;
      case RaspduinoDSLPackage.SENSOR_VALUE_PRECONDITION__COND:
        return COND_EDEFAULT == null ? cond != null : !COND_EDEFAULT.equals(cond);
      case RaspduinoDSLPackage.SENSOR_VALUE_PRECONDITION__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
    result.append(" (cond: ");
    result.append(cond);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //SensorValuePreconditionImpl
