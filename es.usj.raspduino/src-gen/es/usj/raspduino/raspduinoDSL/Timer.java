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
 *   <li>{@link es.usj.raspduino.raspduinoDSL.Timer#getTimerSecs <em>Timer Secs</em>}</li>
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
   * Returns the value of the '<em><b>Timer Secs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Timer Secs</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Timer Secs</em>' attribute.
   * @see #setTimerSecs(int)
   * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getTimer_TimerSecs()
   * @model
   * @generated
   */
  int getTimerSecs();

  /**
   * Sets the value of the '{@link es.usj.raspduino.raspduinoDSL.Timer#getTimerSecs <em>Timer Secs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Timer Secs</em>' attribute.
   * @see #getTimerSecs()
   * @generated
   */
  void setTimerSecs(int value);

} // Timer
