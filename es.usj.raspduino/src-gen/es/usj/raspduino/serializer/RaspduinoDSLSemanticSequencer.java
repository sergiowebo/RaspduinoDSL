package es.usj.raspduino.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import es.usj.raspduino.raspduinoDSL.Actuator;
import es.usj.raspduino.raspduinoDSL.ChangeActuator;
import es.usj.raspduino.raspduinoDSL.EventHandler;
import es.usj.raspduino.raspduinoDSL.Model;
import es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage;
import es.usj.raspduino.raspduinoDSL.Sensor;
import es.usj.raspduino.raspduinoDSL.SensorListener;
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
			case RaspduinoDSLPackage.CHANGE_ACTUATOR:
				if(context == grammarAccess.getChangeActuatorRule()) {
					sequence_ChangeActuator(context, (ChangeActuator) semanticObject); 
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
	 *     (actuator=[Actuator|ID] (ActuatorState='On' | ActuatorState='Off' | ActuatorState='Toggle'))
	 */
	protected void sequence_ChangeActuator(EObject context, ChangeActuator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     )
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sensor=[Sensor|ID] (type='ON' | type='OFF' | (type='BETWEEN' l=INT h=INT)) eventHandler=[EventHandler|ID])
	 */
	protected void sequence_SensorListener(EObject context, SensorListener semanticObject) {
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
	 *     (
	 *         eventHandler=[EventHandler|ID] 
	 *         (
	 *             (repeattype='EVERY INTERVAL of' secs=INT) | 
	 *             (repeattype='EVERY DAY at' hours=INT minutes=INT) | 
	 *             (repeattype='EVERY MONDAY at' hours=INT minutes=INT) | 
	 *             (repeattype='EVERY TUESDAY at' hours=INT minutes=INT) | 
	 *             (repeattype='EVERY WEDNESDAY at' hours=INT minutes=INT) | 
	 *             (repeattype='EVERY THURSDAY at' hours=INT minutes=INT) | 
	 *             (repeattype='EVERY FRIDAY at' hours=INT minutes=INT) | 
	 *             (repeattype='EVERY SATURDAY at' hours=INT minutes=INT) | 
	 *             (repeattype='EVERY SUNDAY at' hours=INT minutes=INT)
	 *         )
	 *     )
	 */
	protected void sequence_Timer(EObject context, Timer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
