/**
 */
package es.usj.raspduino.raspduinoDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.Timer#getEventHandler <em>Event Handler</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.Timer#getRepeattype <em>Repeattype</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.Timer#getSecs <em>Secs</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.Timer#getHours <em>Hours</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.Timer#getMinutes <em>Minutes</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getTimer()
 * @model
 * @generated
 */
public interface Timer extends EObject
{
  /**
   * Returns the value of the '<em><b>Event Handler</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event Handler</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event Handler</em>' reference.
   * @see #setEventHandler(EventHandler)
   * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getTimer_EventHandler()
   * @model
   * @generated
   */
  EventHandler getEventHandler();

  /**
   * Sets the value of the '{@link es.usj.raspduino.raspduinoDSL.Timer#getEventHandler <em>Event Handler</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event Handler</em>' reference.
   * @see #getEventHandler()
   * @generated
   */
  void setEventHandler(EventHandler value);

  /**
   * Returns the value of the '<em><b>Repeattype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repeattype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Repeattype</em>' attribute.
   * @see #setRepeattype(String)
   * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getTimer_Repeattype()
   * @model
   * @generated
   */
  String getRepeattype();

  /**
   * Sets the value of the '{@link es.usj.raspduino.raspduinoDSL.Timer#getRepeattype <em>Repeattype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Repeattype</em>' attribute.
   * @see #getRepeattype()
   * @generated
   */
  void setRepeattype(String value);

  /**
   * Returns the value of the '<em><b>Secs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Secs</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Secs</em>' attribute.
   * @see #setSecs(int)
   * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getTimer_Secs()
   * @model
   * @generated
   */
  int getSecs();

  /**
   * Sets the value of the '{@link es.usj.raspduino.raspduinoDSL.Timer#getSecs <em>Secs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Secs</em>' attribute.
   * @see #getSecs()
   * @generated
   */
  void setSecs(int value);

  /**
   * Returns the value of the '<em><b>Hours</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hours</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hours</em>' attribute.
   * @see #setHours(int)
   * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getTimer_Hours()
   * @model
   * @generated
   */
  int getHours();

  /**
   * Sets the value of the '{@link es.usj.raspduino.raspduinoDSL.Timer#getHours <em>Hours</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hours</em>' attribute.
   * @see #getHours()
   * @generated
   */
  void setHours(int value);

  /**
   * Returns the value of the '<em><b>Minutes</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Minutes</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Minutes</em>' attribute.
   * @see #setMinutes(int)
   * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getTimer_Minutes()
   * @model
   * @generated
   */
  int getMinutes();

  /**
   * Sets the value of the '{@link es.usj.raspduino.raspduinoDSL.Timer#getMinutes <em>Minutes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Minutes</em>' attribute.
   * @see #getMinutes()
   * @generated
   */
  void setMinutes(int value);

} // Timer
