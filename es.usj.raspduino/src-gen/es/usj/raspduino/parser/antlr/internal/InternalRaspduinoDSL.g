/*
* generated by Xtext
*/
grammar InternalRaspduinoDSL;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package es.usj.raspduino.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package es.usj.raspduino.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import es.usj.raspduino.services.RaspduinoDSLGrammarAccess;

}

@parser::members {

 	private RaspduinoDSLGrammarAccess grammarAccess;
 	
    public InternalRaspduinoDSLParser(TokenStream input, RaspduinoDSLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Model";	
   	}
   	
   	@Override
   	protected RaspduinoDSLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Sketch:' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getSketchKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getModelRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='Hardware:' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getHardwareKeyword_2());
    }
(
(
(
		lv_hardware_3_1=	'Arduino UNO' 
    {
        newLeafNode(lv_hardware_3_1, grammarAccess.getModelAccess().getHardwareArduinoUNOKeyword_3_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getModelRule());
	        }
       		setWithLastConsumed($current, "hardware", lv_hardware_3_1, null);
	    }

    |		lv_hardware_3_2=	'Raspberry Pi' 
    {
        newLeafNode(lv_hardware_3_2, grammarAccess.getModelAccess().getHardwareRaspberryPiKeyword_3_0_1());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getModelRule());
	        }
       		setWithLastConsumed($current, "hardware", lv_hardware_3_2, null);
	    }

)

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getDevicesAbstractDeviceParserRuleCall_4_0()); 
	    }
		lv_devices_4_0=ruleAbstractDevice		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"devices",
        		lv_devices_4_0, 
        		"AbstractDevice");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getEventHandlersEventHandlerParserRuleCall_5_0()); 
	    }
		lv_eventHandlers_5_0=ruleEventHandler		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"eventHandlers",
        		lv_eventHandlers_5_0, 
        		"EventHandler");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getSensorListenersSensorListenerParserRuleCall_6_0()); 
	    }
		lv_sensorListeners_6_0=ruleSensorListener		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"sensorListeners",
        		lv_sensorListeners_6_0, 
        		"SensorListener");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getTimersTimerParserRuleCall_7_0()); 
	    }
		lv_timers_7_0=ruleTimer		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"timers",
        		lv_timers_7_0, 
        		"Timer");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleAbstractDevice
entryRuleAbstractDevice returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAbstractDeviceRule()); }
	 iv_ruleAbstractDevice=ruleAbstractDevice 
	 { $current=$iv_ruleAbstractDevice.current; } 
	 EOF 
;

// Rule AbstractDevice
ruleAbstractDevice returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAbstractDeviceAccess().getSensorParserRuleCall_0()); 
    }
    this_Sensor_0=ruleSensor
    { 
        $current = $this_Sensor_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAbstractDeviceAccess().getActuatorParserRuleCall_1()); 
    }
    this_Actuator_1=ruleActuator
    { 
        $current = $this_Actuator_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleSensor
entryRuleSensor returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSensorRule()); }
	 iv_ruleSensor=ruleSensor 
	 { $current=$iv_ruleSensor.current; } 
	 EOF 
;

// Rule Sensor
ruleSensor returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Sensor' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSensorRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='pin' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getPinKeyword_2());
    }
(
(
		lv_pin_3_0=RULE_STRING
		{
			newLeafNode(lv_pin_3_0, grammarAccess.getSensorAccess().getPinSTRINGTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSensorRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"pin",
        		lv_pin_3_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRuleActuator
entryRuleActuator returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getActuatorRule()); }
	 iv_ruleActuator=ruleActuator 
	 { $current=$iv_ruleActuator.current; } 
	 EOF 
;

// Rule Actuator
ruleActuator returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Actuator' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getActuatorAccess().getActuatorKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getActuatorAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActuatorRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='pin' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getActuatorAccess().getPinKeyword_2());
    }
(
(
		lv_pin_3_0=RULE_STRING
		{
			newLeafNode(lv_pin_3_0, grammarAccess.getActuatorAccess().getPinSTRINGTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActuatorRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"pin",
        		lv_pin_3_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRuleEventHandler
entryRuleEventHandler returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEventHandlerRule()); }
	 iv_ruleEventHandler=ruleEventHandler 
	 { $current=$iv_ruleEventHandler.current; } 
	 EOF 
;

// Rule EventHandler
ruleEventHandler returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='EventHandler' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getEventHandlerAccess().getEventHandlerKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getEventHandlerAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEventHandlerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getEventHandlerAccess().getChangeActuatorsChangeActuatorParserRuleCall_2_0()); 
	    }
		lv_changeActuators_2_0=ruleChangeActuator		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEventHandlerRule());
	        }
       		add(
       			$current, 
       			"changeActuators",
        		lv_changeActuators_2_0, 
        		"ChangeActuator");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_3=';' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getEventHandlerAccess().getSemicolonKeyword_3());
    }
)
;





// Entry rule entryRuleChangeActuator
entryRuleChangeActuator returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getChangeActuatorRule()); }
	 iv_ruleChangeActuator=ruleChangeActuator 
	 { $current=$iv_ruleChangeActuator.current; } 
	 EOF 
;

// Rule ChangeActuator
ruleChangeActuator returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getChangeActuatorRule());
	        }
        }
	otherlv_0=RULE_ID
	{
		newLeafNode(otherlv_0, grammarAccess.getChangeActuatorAccess().getActuatorActuatorCrossReference_0_0()); 
	}

)
)	otherlv_1=':' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getChangeActuatorAccess().getColonKeyword_1());
    }
(
(
(
		lv_ActuatorState_2_1=	'On' 
    {
        newLeafNode(lv_ActuatorState_2_1, grammarAccess.getChangeActuatorAccess().getActuatorStateOnKeyword_2_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getChangeActuatorRule());
	        }
       		setWithLastConsumed($current, "ActuatorState", lv_ActuatorState_2_1, null);
	    }

    |		lv_ActuatorState_2_2=	'Off' 
    {
        newLeafNode(lv_ActuatorState_2_2, grammarAccess.getChangeActuatorAccess().getActuatorStateOffKeyword_2_0_1());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getChangeActuatorRule());
	        }
       		setWithLastConsumed($current, "ActuatorState", lv_ActuatorState_2_2, null);
	    }

    |		lv_ActuatorState_2_3=	'Toggle' 
    {
        newLeafNode(lv_ActuatorState_2_3, grammarAccess.getChangeActuatorAccess().getActuatorStateToggleKeyword_2_0_2());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getChangeActuatorRule());
	        }
       		setWithLastConsumed($current, "ActuatorState", lv_ActuatorState_2_3, null);
	    }

)

)
))
;





// Entry rule entryRuleSensorListener
entryRuleSensorListener returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSensorListenerRule()); }
	 iv_ruleSensorListener=ruleSensorListener 
	 { $current=$iv_ruleSensorListener.current; } 
	 EOF 
;

// Rule SensorListener
ruleSensorListener returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='SensorListener' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSensorListenerAccess().getSensorListenerKeyword_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getSensorListenerRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getSensorListenerAccess().getSensorSensorCrossReference_1_0()); 
	}

)
)	otherlv_2='if' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getSensorListenerAccess().getIfKeyword_2());
    }
((
(
		lv_type_3_0=	'ON' 
    {
        newLeafNode(lv_type_3_0, grammarAccess.getSensorListenerAccess().getTypeONKeyword_3_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSensorListenerRule());
	        }
       		setWithLastConsumed($current, "type", lv_type_3_0, "ON");
	    }

)
)
    |(
(
		lv_type_4_0=	'OFF' 
    {
        newLeafNode(lv_type_4_0, grammarAccess.getSensorListenerAccess().getTypeOFFKeyword_3_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSensorListenerRule());
	        }
       		setWithLastConsumed($current, "type", lv_type_4_0, "OFF");
	    }

)
)
    |((
(
		lv_type_5_0=	'BETWEEN' 
    {
        newLeafNode(lv_type_5_0, grammarAccess.getSensorListenerAccess().getTypeBETWEENKeyword_3_2_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSensorListenerRule());
	        }
       		setWithLastConsumed($current, "type", lv_type_5_0, "BETWEEN");
	    }

)
)(
(
		lv_l_6_0=RULE_INT
		{
			newLeafNode(lv_l_6_0, grammarAccess.getSensorListenerAccess().getLINTTerminalRuleCall_3_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSensorListenerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"l",
        		lv_l_6_0, 
        		"INT");
	    }

)
)	otherlv_7='AND' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getSensorListenerAccess().getANDKeyword_3_2_2());
    }
(
(
		lv_h_8_0=RULE_INT
		{
			newLeafNode(lv_h_8_0, grammarAccess.getSensorListenerAccess().getHINTTerminalRuleCall_3_2_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSensorListenerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"h",
        		lv_h_8_0, 
        		"INT");
	    }

)
)))	otherlv_9='call' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getSensorListenerAccess().getCallKeyword_4());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getSensorListenerRule());
	        }
        }
	otherlv_10=RULE_ID
	{
		newLeafNode(otherlv_10, grammarAccess.getSensorListenerAccess().getEventHandlerEventHandlerCrossReference_5_0()); 
	}

)
))
;





// Entry rule entryRuleTimer
entryRuleTimer returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTimerRule()); }
	 iv_ruleTimer=ruleTimer 
	 { $current=$iv_ruleTimer.current; } 
	 EOF 
;

// Rule Timer
ruleTimer returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Timer action' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTimerAccess().getTimerActionKeyword_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getTimerRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getTimerAccess().getEventHandlerEventHandlerCrossReference_1_0()); 
	}

)
)	otherlv_2='repeat' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getTimerAccess().getRepeatKeyword_2());
    }
(((
(
		lv_repeattype_3_0=	'EVERY INTERVAL of' 
    {
        newLeafNode(lv_repeattype_3_0, grammarAccess.getTimerAccess().getRepeattypeEVERYINTERVALOfKeyword_3_0_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTimerRule());
	        }
       		setWithLastConsumed($current, "repeattype", lv_repeattype_3_0, "EVERY INTERVAL of");
	    }

)
)(
(
		lv_secs_4_0=RULE_INT
		{
			newLeafNode(lv_secs_4_0, grammarAccess.getTimerAccess().getSecsINTTerminalRuleCall_3_0_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTimerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"secs",
        		lv_secs_4_0, 
        		"INT");
	    }

)
)	otherlv_5='seconds' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getTimerAccess().getSecondsKeyword_3_0_2());
    }
)
    |((
(
		lv_repeattype_6_0=	'EVERY DAY at' 
    {
        newLeafNode(lv_repeattype_6_0, grammarAccess.getTimerAccess().getRepeattypeEVERYDAYAtKeyword_3_1_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTimerRule());
	        }
       		setWithLastConsumed($current, "repeattype", lv_repeattype_6_0, "EVERY DAY at");
	    }

)
)(
(
		lv_hours_7_0=RULE_INT
		{
			newLeafNode(lv_hours_7_0, grammarAccess.getTimerAccess().getHoursINTTerminalRuleCall_3_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTimerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"hours",
        		lv_hours_7_0, 
        		"INT");
	    }

)
)	otherlv_8=':' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getTimerAccess().getColonKeyword_3_1_2());
    }
(
(
		lv_minutes_9_0=RULE_INT
		{
			newLeafNode(lv_minutes_9_0, grammarAccess.getTimerAccess().getMinutesINTTerminalRuleCall_3_1_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTimerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"minutes",
        		lv_minutes_9_0, 
        		"INT");
	    }

)
))
    |((
(
		lv_repeattype_10_0=	'EVERY MONDAY at' 
    {
        newLeafNode(lv_repeattype_10_0, grammarAccess.getTimerAccess().getRepeattypeEVERYMONDAYAtKeyword_3_2_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTimerRule());
	        }
       		setWithLastConsumed($current, "repeattype", lv_repeattype_10_0, "EVERY MONDAY at");
	    }

)
)(
(
		lv_hours_11_0=RULE_INT
		{
			newLeafNode(lv_hours_11_0, grammarAccess.getTimerAccess().getHoursINTTerminalRuleCall_3_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTimerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"hours",
        		lv_hours_11_0, 
        		"INT");
	    }

)
)	otherlv_12=':' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getTimerAccess().getColonKeyword_3_2_2());
    }
(
(
		lv_minutes_13_0=RULE_INT
		{
			newLeafNode(lv_minutes_13_0, grammarAccess.getTimerAccess().getMinutesINTTerminalRuleCall_3_2_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTimerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"minutes",
        		lv_minutes_13_0, 
        		"INT");
	    }

)
))
    |((
(
		lv_repeattype_14_0=	'EVERY TUESDAY at' 
    {
        newLeafNode(lv_repeattype_14_0, grammarAccess.getTimerAccess().getRepeattypeEVERYTUESDAYAtKeyword_3_3_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTimerRule());
	        }
       		setWithLastConsumed($current, "repeattype", lv_repeattype_14_0, "EVERY TUESDAY at");
	    }

)
)(
(
		lv_hours_15_0=RULE_INT
		{
			newLeafNode(lv_hours_15_0, grammarAccess.getTimerAccess().getHoursINTTerminalRuleCall_3_3_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTimerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"hours",
        		lv_hours_15_0, 
        		"INT");
	    }

)
)	otherlv_16=':' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getTimerAccess().getColonKeyword_3_3_2());
    }
(
(
		lv_minutes_17_0=RULE_INT
		{
			newLeafNode(lv_minutes_17_0, grammarAccess.getTimerAccess().getMinutesINTTerminalRuleCall_3_3_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTimerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"minutes",
        		lv_minutes_17_0, 
        		"INT");
	    }

)
))
    |((
(
		lv_repeattype_18_0=	'EVERY WEDNESDAY at' 
    {
        newLeafNode(lv_repeattype_18_0, grammarAccess.getTimerAccess().getRepeattypeEVERYWEDNESDAYAtKeyword_3_4_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTimerRule());
	        }
       		setWithLastConsumed($current, "repeattype", lv_repeattype_18_0, "EVERY WEDNESDAY at");
	    }

)
)(
(
		lv_hours_19_0=RULE_INT
		{
			newLeafNode(lv_hours_19_0, grammarAccess.getTimerAccess().getHoursINTTerminalRuleCall_3_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTimerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"hours",
        		lv_hours_19_0, 
        		"INT");
	    }

)
)	otherlv_20=':' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getTimerAccess().getColonKeyword_3_4_2());
    }
(
(
		lv_minutes_21_0=RULE_INT
		{
			newLeafNode(lv_minutes_21_0, grammarAccess.getTimerAccess().getMinutesINTTerminalRuleCall_3_4_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTimerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"minutes",
        		lv_minutes_21_0, 
        		"INT");
	    }

)
))
    |((
(
		lv_repeattype_22_0=	'EVERY THURSDAY at' 
    {
        newLeafNode(lv_repeattype_22_0, grammarAccess.getTimerAccess().getRepeattypeEVERYTHURSDAYAtKeyword_3_5_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTimerRule());
	        }
       		setWithLastConsumed($current, "repeattype", lv_repeattype_22_0, "EVERY THURSDAY at");
	    }

)
)(
(
		lv_hours_23_0=RULE_INT
		{
			newLeafNode(lv_hours_23_0, grammarAccess.getTimerAccess().getHoursINTTerminalRuleCall_3_5_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTimerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"hours",
        		lv_hours_23_0, 
        		"INT");
	    }

)
)	otherlv_24=':' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getTimerAccess().getColonKeyword_3_5_2());
    }
(
(
		lv_minutes_25_0=RULE_INT
		{
			newLeafNode(lv_minutes_25_0, grammarAccess.getTimerAccess().getMinutesINTTerminalRuleCall_3_5_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTimerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"minutes",
        		lv_minutes_25_0, 
        		"INT");
	    }

)
))
    |((
(
		lv_repeattype_26_0=	'EVERY FRIDAY at' 
    {
        newLeafNode(lv_repeattype_26_0, grammarAccess.getTimerAccess().getRepeattypeEVERYFRIDAYAtKeyword_3_6_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTimerRule());
	        }
       		setWithLastConsumed($current, "repeattype", lv_repeattype_26_0, "EVERY FRIDAY at");
	    }

)
)(
(
		lv_hours_27_0=RULE_INT
		{
			newLeafNode(lv_hours_27_0, grammarAccess.getTimerAccess().getHoursINTTerminalRuleCall_3_6_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTimerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"hours",
        		lv_hours_27_0, 
        		"INT");
	    }

)
)	otherlv_28=':' 
    {
    	newLeafNode(otherlv_28, grammarAccess.getTimerAccess().getColonKeyword_3_6_2());
    }
(
(
		lv_minutes_29_0=RULE_INT
		{
			newLeafNode(lv_minutes_29_0, grammarAccess.getTimerAccess().getMinutesINTTerminalRuleCall_3_6_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTimerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"minutes",
        		lv_minutes_29_0, 
        		"INT");
	    }

)
))
    |((
(
		lv_repeattype_30_0=	'EVERY SATURDAY at' 
    {
        newLeafNode(lv_repeattype_30_0, grammarAccess.getTimerAccess().getRepeattypeEVERYSATURDAYAtKeyword_3_7_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTimerRule());
	        }
       		setWithLastConsumed($current, "repeattype", lv_repeattype_30_0, "EVERY SATURDAY at");
	    }

)
)(
(
		lv_hours_31_0=RULE_INT
		{
			newLeafNode(lv_hours_31_0, grammarAccess.getTimerAccess().getHoursINTTerminalRuleCall_3_7_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTimerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"hours",
        		lv_hours_31_0, 
        		"INT");
	    }

)
)	otherlv_32=':' 
    {
    	newLeafNode(otherlv_32, grammarAccess.getTimerAccess().getColonKeyword_3_7_2());
    }
(
(
		lv_minutes_33_0=RULE_INT
		{
			newLeafNode(lv_minutes_33_0, grammarAccess.getTimerAccess().getMinutesINTTerminalRuleCall_3_7_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTimerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"minutes",
        		lv_minutes_33_0, 
        		"INT");
	    }

)
))
    |((
(
		lv_repeattype_34_0=	'EVERY SUNDAY at' 
    {
        newLeafNode(lv_repeattype_34_0, grammarAccess.getTimerAccess().getRepeattypeEVERYSUNDAYAtKeyword_3_8_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTimerRule());
	        }
       		setWithLastConsumed($current, "repeattype", lv_repeattype_34_0, "EVERY SUNDAY at");
	    }

)
)(
(
		lv_hours_35_0=RULE_INT
		{
			newLeafNode(lv_hours_35_0, grammarAccess.getTimerAccess().getHoursINTTerminalRuleCall_3_8_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTimerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"hours",
        		lv_hours_35_0, 
        		"INT");
	    }

)
)	otherlv_36=':' 
    {
    	newLeafNode(otherlv_36, grammarAccess.getTimerAccess().getColonKeyword_3_8_2());
    }
(
(
		lv_minutes_37_0=RULE_INT
		{
			newLeafNode(lv_minutes_37_0, grammarAccess.getTimerAccess().getMinutesINTTerminalRuleCall_3_8_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTimerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"minutes",
        		lv_minutes_37_0, 
        		"INT");
	    }

)
))))
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


