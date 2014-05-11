/**
 */
package es.usj.raspduino.raspduinoDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Precondition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.Precondition#getPre1 <em>Pre1</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.Precondition#getOp <em>Op</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.Precondition#getPre <em>Pre</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getPrecondition()
 * @model
 * @generated
 */
public interface Precondition extends EObject
{
  /**
   * Returns the value of the '<em><b>Pre1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pre1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pre1</em>' containment reference.
   * @see #setPre1(Precondition1)
   * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getPrecondition_Pre1()
   * @model containment="true"
   * @generated
   */
  Precondition1 getPre1();

  /**
   * Sets the value of the '{@link es.usj.raspduino.raspduinoDSL.Precondition#getPre1 <em>Pre1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pre1</em>' containment reference.
   * @see #getPre1()
   * @generated
   */
  void setPre1(Precondition1 value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getPrecondition_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link es.usj.raspduino.raspduinoDSL.Precondition#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Pre</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pre</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pre</em>' containment reference.
   * @see #setPre(Precondition)
   * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getPrecondition_Pre()
   * @model containment="true"
   * @generated
   */
  Precondition getPre();

  /**
   * Sets the value of the '{@link es.usj.raspduino.raspduinoDSL.Precondition#getPre <em>Pre</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pre</em>' containment reference.
   * @see #getPre()
   * @generated
   */
  void setPre(Precondition value);

} // Precondition
