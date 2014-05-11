/**
 */
package es.usj.raspduino.raspduinoDSL.impl;

import es.usj.raspduino.raspduinoDSL.Precondition;
import es.usj.raspduino.raspduinoDSL.Precondition1;
import es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Precondition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.impl.PreconditionImpl#getPre1 <em>Pre1</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.impl.PreconditionImpl#getOp <em>Op</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.impl.PreconditionImpl#getPre <em>Pre</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PreconditionImpl extends MinimalEObjectImpl.Container implements Precondition
{
  /**
   * The cached value of the '{@link #getPre1() <em>Pre1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPre1()
   * @generated
   * @ordered
   */
  protected Precondition1 pre1;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getPre() <em>Pre</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPre()
   * @generated
   * @ordered
   */
  protected Precondition pre;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PreconditionImpl()
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
    return RaspduinoDSLPackage.Literals.PRECONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Precondition1 getPre1()
  {
    return pre1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPre1(Precondition1 newPre1, NotificationChain msgs)
  {
    Precondition1 oldPre1 = pre1;
    pre1 = newPre1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RaspduinoDSLPackage.PRECONDITION__PRE1, oldPre1, newPre1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPre1(Precondition1 newPre1)
  {
    if (newPre1 != pre1)
    {
      NotificationChain msgs = null;
      if (pre1 != null)
        msgs = ((InternalEObject)pre1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RaspduinoDSLPackage.PRECONDITION__PRE1, null, msgs);
      if (newPre1 != null)
        msgs = ((InternalEObject)newPre1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RaspduinoDSLPackage.PRECONDITION__PRE1, null, msgs);
      msgs = basicSetPre1(newPre1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RaspduinoDSLPackage.PRECONDITION__PRE1, newPre1, newPre1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RaspduinoDSLPackage.PRECONDITION__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Precondition getPre()
  {
    return pre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPre(Precondition newPre, NotificationChain msgs)
  {
    Precondition oldPre = pre;
    pre = newPre;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RaspduinoDSLPackage.PRECONDITION__PRE, oldPre, newPre);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPre(Precondition newPre)
  {
    if (newPre != pre)
    {
      NotificationChain msgs = null;
      if (pre != null)
        msgs = ((InternalEObject)pre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RaspduinoDSLPackage.PRECONDITION__PRE, null, msgs);
      if (newPre != null)
        msgs = ((InternalEObject)newPre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RaspduinoDSLPackage.PRECONDITION__PRE, null, msgs);
      msgs = basicSetPre(newPre, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RaspduinoDSLPackage.PRECONDITION__PRE, newPre, newPre));
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
      case RaspduinoDSLPackage.PRECONDITION__PRE1:
        return basicSetPre1(null, msgs);
      case RaspduinoDSLPackage.PRECONDITION__PRE:
        return basicSetPre(null, msgs);
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
      case RaspduinoDSLPackage.PRECONDITION__PRE1:
        return getPre1();
      case RaspduinoDSLPackage.PRECONDITION__OP:
        return getOp();
      case RaspduinoDSLPackage.PRECONDITION__PRE:
        return getPre();
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
      case RaspduinoDSLPackage.PRECONDITION__PRE1:
        setPre1((Precondition1)newValue);
        return;
      case RaspduinoDSLPackage.PRECONDITION__OP:
        setOp((String)newValue);
        return;
      case RaspduinoDSLPackage.PRECONDITION__PRE:
        setPre((Precondition)newValue);
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
      case RaspduinoDSLPackage.PRECONDITION__PRE1:
        setPre1((Precondition1)null);
        return;
      case RaspduinoDSLPackage.PRECONDITION__OP:
        setOp(OP_EDEFAULT);
        return;
      case RaspduinoDSLPackage.PRECONDITION__PRE:
        setPre((Precondition)null);
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
      case RaspduinoDSLPackage.PRECONDITION__PRE1:
        return pre1 != null;
      case RaspduinoDSLPackage.PRECONDITION__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case RaspduinoDSLPackage.PRECONDITION__PRE:
        return pre != null;
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
    result.append(" (op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //PreconditionImpl
