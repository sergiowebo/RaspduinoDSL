/**
 */
package es.usj.raspduino.raspduinoDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Listener</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.SensorListener#getSensor <em>Sensor</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.SensorListener#getType <em>Type</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.SensorListener#getL <em>L</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.SensorListener#getH <em>H</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.SensorListener#getEventHandler <em>Event Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getSensorListener()
 * @model
 * @generated
 */
public interface SensorListener extends EObject
{
  /**
   * Returns the value of the '<em><b>Sensor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sensor</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sensor</em>' reference.
   * @see #setSensor(Sensor)
   * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getSensorListener_Sensor()
   * @model
   * @generated
   */
  Sensor getSensor();

  /**
   * Sets the value of the '{@link es.usj.raspduino.raspduinoDSL.SensorListener#getSensor <em>Sensor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sensor</em>' reference.
   * @see #getSensor()
   * @generated
   */
  void setSensor(Sensor value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getSensorListener_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link es.usj.raspduino.raspduinoDSL.SensorListener#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>L</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>L</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>L</em>' attribute.
   * @see #setL(int)
   * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getSensorListener_L()
   * @model
   * @generated
   */
  int getL();

  /**
   * Sets the value of the '{@link es.usj.raspduino.raspduinoDSL.SensorListener#getL <em>L</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>L</em>' attribute.
   * @see #getL()
   * @generated
   */
  void setL(int value);

  /**
   * Returns the value of the '<em><b>H</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>H</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>H</em>' attribute.
   * @see #setH(int)
   * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getSensorListener_H()
   * @model
   * @generated
   */
  int getH();

  /**
   * Sets the value of the '{@link es.usj.raspduino.raspduinoDSL.SensorListener#getH <em>H</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>H</em>' attribute.
   * @see #getH()
   * @generated
   */
  void setH(int value);

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
   * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getSensorListener_EventHandler()
   * @model
   * @generated
   */
  EventHandler getEventHandler();

  /**
   * Sets the value of the '{@link es.usj.raspduino.raspduinoDSL.SensorListener#getEventHandler <em>Event Handler</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event Handler</em>' reference.
   * @see #getEventHandler()
   * @generated
   */
  void setEventHandler(EventHandler value);

} // SensorListener
