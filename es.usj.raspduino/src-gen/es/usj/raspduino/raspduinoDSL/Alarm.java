/**
 */
package es.usj.raspduino.raspduinoDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alarm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.Alarm#getEventHandler <em>Event Handler</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.Alarm#getRepeattype <em>Repeattype</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.Alarm#getTimerHours <em>Timer Hours</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.Alarm#getTimerMinutes <em>Timer Minutes</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getAlarm()
 * @model
 * @generated
 */
public interface Alarm extends EObject
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
   * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getAlarm_EventHandler()
   * @model
   * @generated
   */
  EventHandler getEventHandler();

  /**
   * Sets the value of the '{@link es.usj.raspduino.raspduinoDSL.Alarm#getEventHandler <em>Event Handler</em>}' reference.
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
   * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getAlarm_Repeattype()
   * @model
   * @generated
   */
  String getRepeattype();

  /**
   * Sets the value of the '{@link es.usj.raspduino.raspduinoDSL.Alarm#getRepeattype <em>Repeattype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Repeattype</em>' attribute.
   * @see #getRepeattype()
   * @generated
   */
  void setRepeattype(String value);

  /**
   * Returns the value of the '<em><b>Timer Hours</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Timer Hours</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Timer Hours</em>' attribute.
   * @see #setTimerHours(int)
   * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getAlarm_TimerHours()
   * @model
   * @generated
   */
  int getTimerHours();

  /**
   * Sets the value of the '{@link es.usj.raspduino.raspduinoDSL.Alarm#getTimerHours <em>Timer Hours</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Timer Hours</em>' attribute.
   * @see #getTimerHours()
   * @generated
   */
  void setTimerHours(int value);

  /**
   * Returns the value of the '<em><b>Timer Minutes</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Timer Minutes</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Timer Minutes</em>' attribute.
   * @see #setTimerMinutes(int)
   * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getAlarm_TimerMinutes()
   * @model
   * @generated
   */
  int getTimerMinutes();

  /**
   * Sets the value of the '{@link es.usj.raspduino.raspduinoDSL.Alarm#getTimerMinutes <em>Timer Minutes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Timer Minutes</em>' attribute.
   * @see #getTimerMinutes()
   * @generated
   */
  void setTimerMinutes(int value);

} // Alarm
