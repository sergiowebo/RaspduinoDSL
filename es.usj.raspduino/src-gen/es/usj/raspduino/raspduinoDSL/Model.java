/**
 */
package es.usj.raspduino.raspduinoDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.Model#getName <em>Name</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.Model#getHardware <em>Hardware</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.Model#getDevices <em>Devices</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.Model#getEventHandlers <em>Event Handlers</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.Model#getSensorListeners <em>Sensor Listeners</em>}</li>
 *   <li>{@link es.usj.raspduino.raspduinoDSL.Model#getTimers <em>Timers</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link es.usj.raspduino.raspduinoDSL.Model#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Hardware</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hardware</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hardware</em>' attribute.
   * @see #setHardware(String)
   * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getModel_Hardware()
   * @model
   * @generated
   */
  String getHardware();

  /**
   * Sets the value of the '{@link es.usj.raspduino.raspduinoDSL.Model#getHardware <em>Hardware</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hardware</em>' attribute.
   * @see #getHardware()
   * @generated
   */
  void setHardware(String value);

  /**
   * Returns the value of the '<em><b>Devices</b></em>' containment reference list.
   * The list contents are of type {@link es.usj.raspduino.raspduinoDSL.AbstractDevice}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Devices</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Devices</em>' containment reference list.
   * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getModel_Devices()
   * @model containment="true"
   * @generated
   */
  EList<AbstractDevice> getDevices();

  /**
   * Returns the value of the '<em><b>Event Handlers</b></em>' containment reference list.
   * The list contents are of type {@link es.usj.raspduino.raspduinoDSL.EventHandler}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event Handlers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event Handlers</em>' containment reference list.
   * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getModel_EventHandlers()
   * @model containment="true"
   * @generated
   */
  EList<EventHandler> getEventHandlers();

  /**
   * Returns the value of the '<em><b>Sensor Listeners</b></em>' containment reference list.
   * The list contents are of type {@link es.usj.raspduino.raspduinoDSL.SensorListener}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sensor Listeners</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sensor Listeners</em>' containment reference list.
   * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getModel_SensorListeners()
   * @model containment="true"
   * @generated
   */
  EList<SensorListener> getSensorListeners();

  /**
   * Returns the value of the '<em><b>Timers</b></em>' containment reference list.
   * The list contents are of type {@link es.usj.raspduino.raspduinoDSL.Timer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Timers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Timers</em>' containment reference list.
   * @see es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage#getModel_Timers()
   * @model containment="true"
   * @generated
   */
  EList<Timer> getTimers();

} // Model
