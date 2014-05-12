package es.usj.raspduino.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import es.usj.raspduino.raspduinoDSL.Actuator;
import es.usj.raspduino.raspduinoDSL.Alarm;
import es.usj.raspduino.raspduinoDSL.ChangeActuator;
import es.usj.raspduino.raspduinoDSL.EmptyPrecondition;
import es.usj.raspduino.raspduinoDSL.EventHandler;
import es.usj.raspduino.raspduinoDSL.Model;
import es.usj.raspduino.raspduinoDSL.Precondition;
import es.usj.raspduino.raspduinoDSL.Precondition1;
import es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage;
import es.usj.raspduino.raspduinoDSL.Sensor;
import es.usj.raspduino.raspduinoDSL.SensorListener;
import es.usj.raspduino.raspduinoDSL.SensorValuePrecondition;
import es.usj.raspduino.raspduinoDSL.Timer;
import es.usj.raspduino.services.RaspduinoDSLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class RaspduinoDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RaspduinoDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == RaspduinoDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case RaspduinoDSLPackage.ACTUATOR:
				if(context == grammarAccess.getAbstractDeviceRule() ||
				   context == grammarAccess.getActuatorRule()) {
					sequence_Actuator(context, (Actuator) semanticObject); 
					return; 
				}
				else break;
			case RaspduinoDSLPackage.ALARM:
				if(context == grammarAccess.getAlarmRule()) {
					sequence_Alarm(context, (Alarm) semanticObject); 
					return; 
				}
				else break;
			case RaspduinoDSLPackage.CHANGE_ACTUATOR:
				if(context == grammarAccess.getChangeActuatorRule()) {
					sequence_ChangeActuator(context, (ChangeActuator) semanticObject); 
					return; 
				}
				else break;
			case RaspduinoDSLPackage.EMPTY_PRECONDITION:
				if(context == grammarAccess.getEmptyPreconditionRule()) {
					sequence_EmptyPrecondition(context, (EmptyPrecondition) semanticObject); 
					return; 
				}
				else break;
			case RaspduinoDSLPackage.EVENT_HANDLER:
				if(context == grammarAccess.getEventHandlerRule()) {
					sequence_EventHandler(context, (EventHandler) semanticObject); 
					return; 
				}
				else break;
			case RaspduinoDSLPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case RaspduinoDSLPackage.PRECONDITION:
				if(context == grammarAccess.getPreconditionRule()) {
					sequence_Precondition(context, (Precondition) semanticObject); 
					return; 
				}
				else break;
			case RaspduinoDSLPackage.PRECONDITION1:
				if(context == grammarAccess.getPrecondition1Rule()) {
					sequence_Precondition1(context, (Precondition1) semanticObject); 
					return; 
				}
				else break;
			case RaspduinoDSLPackage.SENSOR:
				if(context == grammarAccess.getAbstractDeviceRule() ||
				   context == grammarAccess.getSensorRule()) {
					sequence_Sensor(context, (Sensor) semanticObject); 
					return; 
				}
				else break;
			case RaspduinoDSLPackage.SENSOR_LISTENER:
				if(context == grammarAccess.getSensorListenerRule()) {
					sequence_SensorListener(context, (SensorListener) semanticObject); 
					return; 
				}
				else break;
			case RaspduinoDSLPackage.SENSOR_VALUE_PRECONDITION:
				if(context == grammarAccess.getSensorValuePreconditionRule()) {
					sequence_SensorValuePrecondition(context, (SensorValuePrecondition) semanticObject); 
					return; 
				}
				else break;
			case RaspduinoDSLPackage.TIMER:
				if(context == grammarAccess.getTimerRule()) {
					sequence_Timer(context, (Timer) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID pin=STRING)
	 */
	protected void sequence_Actuator(EObject context, Actuator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RaspduinoDSLPackage.Literals.ABSTRACT_DEVICE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspduinoDSLPackage.Literals.ABSTRACT_DEVICE__NAME));
			if(transientValues.isValueTransient(semanticObject, RaspduinoDSLPackage.Literals.ABSTRACT_DEVICE__PIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspduinoDSLPackage.Literals.ABSTRACT_DEVICE__PIN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActuatorAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getActuatorAccess().getPinSTRINGTerminalRuleCall_3_0(), semanticObject.getPin());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         eventHandler=[EventHandler|ID] 
	 *         (
	 *             repeattype='EVERY DAY' | 
	 *             repeattype='EVERY MONDAY' | 
	 *             repeattype='EVERY TUESDAY' | 
	 *             repeattype='EVERY WEDNESDAY' | 
	 *             repeattype='EVERY THURSDAY' | 
	 *             repeattype='EVERY FRIDAY' | 
	 *             repeattype='EVERY SATURDAY' | 
	 *             repeattype='EVERY SUNDAY'
	 *         ) 
	 *         timerHours=INT 
	 *         timerMinutes=INT
	 *     )
	 */
	protected void sequence_Alarm(EObject context, Alarm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (actuator=[Actuator|ID] (ActuatorState='On' | ActuatorState='Off'))
	 */
	protected void sequence_ChangeActuator(EObject context, ChangeActuator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_EmptyPrecondition(EObject context, EmptyPrecondition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RaspduinoDSLPackage.Literals.EMPTY_PRECONDITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspduinoDSLPackage.Literals.EMPTY_PRECONDITION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEmptyPreconditionAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID changeActuators+=ChangeActuator*)
	 */
	protected void sequence_EventHandler(EObject context, EventHandler semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (hardware='Arduino UNO' | hardware='Raspberry Pi') 
	 *         devices+=AbstractDevice* 
	 *         eventHandlers+=EventHandler* 
	 *         sensorListeners+=SensorListener* 
	 *         timers+=Timer* 
	 *         alarms+=Alarm* 
	 *         (priority='SENSOR' | priority='SCHEDULED')*
	 *     )
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pre=SensorValuePrecondition | pre=EmptyPrecondition)
	 */
	protected void sequence_Precondition1(EObject context, Precondition1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((pre1=Precondition1 (op='&&' | op='||') pre=Precondition) | pre1=Precondition1)
	 */
	protected void sequence_Precondition(EObject context, Precondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sensor=[Sensor|ID] type='BETWEEN' l=INT h=INT eventHandler=[EventHandler|ID])
	 */
	protected void sequence_SensorListener(EObject context, SensorListener semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RaspduinoDSLPackage.Literals.SENSOR_LISTENER__SENSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspduinoDSLPackage.Literals.SENSOR_LISTENER__SENSOR));
			if(transientValues.isValueTransient(semanticObject, RaspduinoDSLPackage.Literals.SENSOR_LISTENER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspduinoDSLPackage.Literals.SENSOR_LISTENER__TYPE));
			if(transientValues.isValueTransient(semanticObject, RaspduinoDSLPackage.Literals.SENSOR_LISTENER__L) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspduinoDSLPackage.Literals.SENSOR_LISTENER__L));
			if(transientValues.isValueTransient(semanticObject, RaspduinoDSLPackage.Literals.SENSOR_LISTENER__H) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspduinoDSLPackage.Literals.SENSOR_LISTENER__H));
			if(transientValues.isValueTransient(semanticObject, RaspduinoDSLPackage.Literals.SENSOR_LISTENER__EVENT_HANDLER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspduinoDSLPackage.Literals.SENSOR_LISTENER__EVENT_HANDLER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSensorListenerAccess().getSensorSensorIDTerminalRuleCall_1_0_1(), semanticObject.getSensor());
		feeder.accept(grammarAccess.getSensorListenerAccess().getTypeBETWEENKeyword_3_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getSensorListenerAccess().getLINTTerminalRuleCall_3_1_0(), semanticObject.getL());
		feeder.accept(grammarAccess.getSensorListenerAccess().getHINTTerminalRuleCall_3_3_0(), semanticObject.getH());
		feeder.accept(grammarAccess.getSensorListenerAccess().getEventHandlerEventHandlerIDTerminalRuleCall_5_0_1(), semanticObject.getEventHandler());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (sensor=[Sensor|ID] (cond='==' | cond='<=' | cond='>=' | cond='!=') value=PossibleValues)
	 */
	protected void sequence_SensorValuePrecondition(EObject context, SensorValuePrecondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID pin=STRING)
	 */
	protected void sequence_Sensor(EObject context, Sensor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RaspduinoDSLPackage.Literals.ABSTRACT_DEVICE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspduinoDSLPackage.Literals.ABSTRACT_DEVICE__NAME));
			if(transientValues.isValueTransient(semanticObject, RaspduinoDSLPackage.Literals.ABSTRACT_DEVICE__PIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspduinoDSLPackage.Literals.ABSTRACT_DEVICE__PIN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSensorAccess().getPinSTRINGTerminalRuleCall_3_0(), semanticObject.getPin());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (eventHandler=[EventHandler|ID] (repeattype='ONCE' | repeattype='EVERY') timerSecs=INT)
	 */
	protected void sequence_Timer(EObject context, Timer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
