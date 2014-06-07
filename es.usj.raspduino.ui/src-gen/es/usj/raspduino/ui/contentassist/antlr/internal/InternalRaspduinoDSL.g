/*
* generated by Xtext
*/
grammar InternalRaspduinoDSL;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package es.usj.raspduino.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package es.usj.raspduino.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import es.usj.raspduino.services.RaspduinoDSLGrammarAccess;

}

@parser::members {
 
 	private RaspduinoDSLGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(RaspduinoDSLGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleModel
entryRuleModel 
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModelAccess().getGroup()); }
(rule__Model__Group__0)
{ after(grammarAccess.getModelAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAbstractDevice
entryRuleAbstractDevice 
:
{ before(grammarAccess.getAbstractDeviceRule()); }
	 ruleAbstractDevice
{ after(grammarAccess.getAbstractDeviceRule()); } 
	 EOF 
;

// Rule AbstractDevice
ruleAbstractDevice
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAbstractDeviceAccess().getAlternatives()); }
(rule__AbstractDevice__Alternatives)
{ after(grammarAccess.getAbstractDeviceAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleSensor
entryRuleSensor 
:
{ before(grammarAccess.getSensorRule()); }
	 ruleSensor
{ after(grammarAccess.getSensorRule()); } 
	 EOF 
;

// Rule Sensor
ruleSensor
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSensorAccess().getGroup()); }
(rule__Sensor__Group__0)
{ after(grammarAccess.getSensorAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleActuator
entryRuleActuator 
:
{ before(grammarAccess.getActuatorRule()); }
	 ruleActuator
{ after(grammarAccess.getActuatorRule()); } 
	 EOF 
;

// Rule Actuator
ruleActuator
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getActuatorAccess().getGroup()); }
(rule__Actuator__Group__0)
{ after(grammarAccess.getActuatorAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEventHandler
entryRuleEventHandler 
:
{ before(grammarAccess.getEventHandlerRule()); }
	 ruleEventHandler
{ after(grammarAccess.getEventHandlerRule()); } 
	 EOF 
;

// Rule EventHandler
ruleEventHandler
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEventHandlerAccess().getGroup()); }
(rule__EventHandler__Group__0)
{ after(grammarAccess.getEventHandlerAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleChangeActuator
entryRuleChangeActuator 
:
{ before(grammarAccess.getChangeActuatorRule()); }
	 ruleChangeActuator
{ after(grammarAccess.getChangeActuatorRule()); } 
	 EOF 
;

// Rule ChangeActuator
ruleChangeActuator
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getChangeActuatorAccess().getGroup()); }
(rule__ChangeActuator__Group__0)
{ after(grammarAccess.getChangeActuatorAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleSensorListener
entryRuleSensorListener 
:
{ before(grammarAccess.getSensorListenerRule()); }
	 ruleSensorListener
{ after(grammarAccess.getSensorListenerRule()); } 
	 EOF 
;

// Rule SensorListener
ruleSensorListener
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSensorListenerAccess().getGroup()); }
(rule__SensorListener__Group__0)
{ after(grammarAccess.getSensorListenerAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleTimer
entryRuleTimer 
:
{ before(grammarAccess.getTimerRule()); }
	 ruleTimer
{ after(grammarAccess.getTimerRule()); } 
	 EOF 
;

// Rule Timer
ruleTimer
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTimerAccess().getGroup()); }
(rule__Timer__Group__0)
{ after(grammarAccess.getTimerAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__Model__HardwareAlternatives_3_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getHardwareArduinoUNOKeyword_3_0_0()); }

	'Arduino UNO' 

{ after(grammarAccess.getModelAccess().getHardwareArduinoUNOKeyword_3_0_0()); }
)

    |(
{ before(grammarAccess.getModelAccess().getHardwareRaspberryPiKeyword_3_0_1()); }

	'Raspberry Pi' 

{ after(grammarAccess.getModelAccess().getHardwareRaspberryPiKeyword_3_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractDevice__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAbstractDeviceAccess().getSensorParserRuleCall_0()); }
	ruleSensor
{ after(grammarAccess.getAbstractDeviceAccess().getSensorParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getAbstractDeviceAccess().getActuatorParserRuleCall_1()); }
	ruleActuator
{ after(grammarAccess.getAbstractDeviceAccess().getActuatorParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ChangeActuator__ActuatorStateAlternatives_2_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getChangeActuatorAccess().getActuatorStateOnKeyword_2_0_0()); }

	'On' 

{ after(grammarAccess.getChangeActuatorAccess().getActuatorStateOnKeyword_2_0_0()); }
)

    |(
{ before(grammarAccess.getChangeActuatorAccess().getActuatorStateOffKeyword_2_0_1()); }

	'Off' 

{ after(grammarAccess.getChangeActuatorAccess().getActuatorStateOffKeyword_2_0_1()); }
)

    |(
{ before(grammarAccess.getChangeActuatorAccess().getActuatorStateToggleKeyword_2_0_2()); }

	'Toggle' 

{ after(grammarAccess.getChangeActuatorAccess().getActuatorStateToggleKeyword_2_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SensorListener__Alternatives_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSensorListenerAccess().getTypeAssignment_3_0()); }
(rule__SensorListener__TypeAssignment_3_0)
{ after(grammarAccess.getSensorListenerAccess().getTypeAssignment_3_0()); }
)

    |(
{ before(grammarAccess.getSensorListenerAccess().getTypeAssignment_3_1()); }
(rule__SensorListener__TypeAssignment_3_1)
{ after(grammarAccess.getSensorListenerAccess().getTypeAssignment_3_1()); }
)

    |(
{ before(grammarAccess.getSensorListenerAccess().getGroup_3_2()); }
(rule__SensorListener__Group_3_2__0)
{ after(grammarAccess.getSensorListenerAccess().getGroup_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Timer__RepeattypeAlternatives_3_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTimerAccess().getRepeattypeONCEKeyword_3_0_0()); }

	'ONCE' 

{ after(grammarAccess.getTimerAccess().getRepeattypeONCEKeyword_3_0_0()); }
)

    |(
{ before(grammarAccess.getTimerAccess().getRepeattypeEVERYKeyword_3_0_1()); }

	'EVERY' 

{ after(grammarAccess.getTimerAccess().getRepeattypeEVERYKeyword_3_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Model__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__0__Impl
	rule__Model__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getSketchKeyword_0()); }

	'Sketch:' 

{ after(grammarAccess.getModelAccess().getSketchKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__1__Impl
	rule__Model__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getNameAssignment_1()); }
(rule__Model__NameAssignment_1)
{ after(grammarAccess.getModelAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__2__Impl
	rule__Model__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getHardwareKeyword_2()); }

	'Hardware:' 

{ after(grammarAccess.getModelAccess().getHardwareKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__3__Impl
	rule__Model__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getHardwareAssignment_3()); }
(rule__Model__HardwareAssignment_3)
{ after(grammarAccess.getModelAccess().getHardwareAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__4__Impl
	rule__Model__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getDevicesAssignment_4()); }
(rule__Model__DevicesAssignment_4)*
{ after(grammarAccess.getModelAccess().getDevicesAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__5__Impl
	rule__Model__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getEventHandlersAssignment_5()); }
(rule__Model__EventHandlersAssignment_5)*
{ after(grammarAccess.getModelAccess().getEventHandlersAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__6__Impl
	rule__Model__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getSensorListenersAssignment_6()); }
(rule__Model__SensorListenersAssignment_6)*
{ after(grammarAccess.getModelAccess().getSensorListenersAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getTimersAssignment_7()); }
(rule__Model__TimersAssignment_7)*
{ after(grammarAccess.getModelAccess().getTimersAssignment_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__Sensor__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Sensor__Group__0__Impl
	rule__Sensor__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Sensor__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSensorAccess().getSensorKeyword_0()); }

	'Sensor' 

{ after(grammarAccess.getSensorAccess().getSensorKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Sensor__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Sensor__Group__1__Impl
	rule__Sensor__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Sensor__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSensorAccess().getNameAssignment_1()); }
(rule__Sensor__NameAssignment_1)
{ after(grammarAccess.getSensorAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Sensor__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Sensor__Group__2__Impl
	rule__Sensor__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Sensor__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSensorAccess().getPinKeyword_2()); }

	'pin' 

{ after(grammarAccess.getSensorAccess().getPinKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Sensor__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Sensor__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Sensor__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSensorAccess().getPinAssignment_3()); }
(rule__Sensor__PinAssignment_3)
{ after(grammarAccess.getSensorAccess().getPinAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Actuator__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Actuator__Group__0__Impl
	rule__Actuator__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Actuator__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getActuatorAccess().getActuatorKeyword_0()); }

	'Actuator' 

{ after(grammarAccess.getActuatorAccess().getActuatorKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Actuator__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Actuator__Group__1__Impl
	rule__Actuator__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Actuator__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getActuatorAccess().getNameAssignment_1()); }
(rule__Actuator__NameAssignment_1)
{ after(grammarAccess.getActuatorAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Actuator__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Actuator__Group__2__Impl
	rule__Actuator__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Actuator__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getActuatorAccess().getPinKeyword_2()); }

	'pin' 

{ after(grammarAccess.getActuatorAccess().getPinKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Actuator__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Actuator__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Actuator__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getActuatorAccess().getPinAssignment_3()); }
(rule__Actuator__PinAssignment_3)
{ after(grammarAccess.getActuatorAccess().getPinAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__EventHandler__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EventHandler__Group__0__Impl
	rule__EventHandler__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EventHandler__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEventHandlerAccess().getEventHandlerKeyword_0()); }

	'EventHandler' 

{ after(grammarAccess.getEventHandlerAccess().getEventHandlerKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EventHandler__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EventHandler__Group__1__Impl
	rule__EventHandler__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EventHandler__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEventHandlerAccess().getNameAssignment_1()); }
(rule__EventHandler__NameAssignment_1)
{ after(grammarAccess.getEventHandlerAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EventHandler__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EventHandler__Group__2__Impl
	rule__EventHandler__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EventHandler__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEventHandlerAccess().getChangeActuatorsAssignment_2()); }
(rule__EventHandler__ChangeActuatorsAssignment_2)*
{ after(grammarAccess.getEventHandlerAccess().getChangeActuatorsAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EventHandler__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EventHandler__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EventHandler__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEventHandlerAccess().getSemicolonKeyword_3()); }

	';' 

{ after(grammarAccess.getEventHandlerAccess().getSemicolonKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__ChangeActuator__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ChangeActuator__Group__0__Impl
	rule__ChangeActuator__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangeActuator__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getChangeActuatorAccess().getActuatorAssignment_0()); }
(rule__ChangeActuator__ActuatorAssignment_0)
{ after(grammarAccess.getChangeActuatorAccess().getActuatorAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ChangeActuator__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ChangeActuator__Group__1__Impl
	rule__ChangeActuator__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangeActuator__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getChangeActuatorAccess().getColonKeyword_1()); }

	':' 

{ after(grammarAccess.getChangeActuatorAccess().getColonKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ChangeActuator__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ChangeActuator__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangeActuator__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getChangeActuatorAccess().getActuatorStateAssignment_2()); }
(rule__ChangeActuator__ActuatorStateAssignment_2)
{ after(grammarAccess.getChangeActuatorAccess().getActuatorStateAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__SensorListener__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SensorListener__Group__0__Impl
	rule__SensorListener__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SensorListener__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSensorListenerAccess().getSensorListenerKeyword_0()); }

	'SensorListener' 

{ after(grammarAccess.getSensorListenerAccess().getSensorListenerKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SensorListener__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SensorListener__Group__1__Impl
	rule__SensorListener__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SensorListener__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSensorListenerAccess().getSensorAssignment_1()); }
(rule__SensorListener__SensorAssignment_1)
{ after(grammarAccess.getSensorListenerAccess().getSensorAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SensorListener__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SensorListener__Group__2__Impl
	rule__SensorListener__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SensorListener__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSensorListenerAccess().getIfKeyword_2()); }

	'if' 

{ after(grammarAccess.getSensorListenerAccess().getIfKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SensorListener__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SensorListener__Group__3__Impl
	rule__SensorListener__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SensorListener__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSensorListenerAccess().getAlternatives_3()); }
(rule__SensorListener__Alternatives_3)
{ after(grammarAccess.getSensorListenerAccess().getAlternatives_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SensorListener__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SensorListener__Group__4__Impl
	rule__SensorListener__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SensorListener__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSensorListenerAccess().getCallKeyword_4()); }

	'call' 

{ after(grammarAccess.getSensorListenerAccess().getCallKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SensorListener__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SensorListener__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SensorListener__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSensorListenerAccess().getEventHandlerAssignment_5()); }
(rule__SensorListener__EventHandlerAssignment_5)
{ after(grammarAccess.getSensorListenerAccess().getEventHandlerAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__SensorListener__Group_3_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SensorListener__Group_3_2__0__Impl
	rule__SensorListener__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SensorListener__Group_3_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSensorListenerAccess().getTypeAssignment_3_2_0()); }
(rule__SensorListener__TypeAssignment_3_2_0)
{ after(grammarAccess.getSensorListenerAccess().getTypeAssignment_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SensorListener__Group_3_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SensorListener__Group_3_2__1__Impl
	rule__SensorListener__Group_3_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SensorListener__Group_3_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSensorListenerAccess().getLAssignment_3_2_1()); }
(rule__SensorListener__LAssignment_3_2_1)
{ after(grammarAccess.getSensorListenerAccess().getLAssignment_3_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SensorListener__Group_3_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SensorListener__Group_3_2__2__Impl
	rule__SensorListener__Group_3_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SensorListener__Group_3_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSensorListenerAccess().getANDKeyword_3_2_2()); }

	'AND' 

{ after(grammarAccess.getSensorListenerAccess().getANDKeyword_3_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SensorListener__Group_3_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SensorListener__Group_3_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SensorListener__Group_3_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSensorListenerAccess().getHAssignment_3_2_3()); }
(rule__SensorListener__HAssignment_3_2_3)
{ after(grammarAccess.getSensorListenerAccess().getHAssignment_3_2_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Timer__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Timer__Group__0__Impl
	rule__Timer__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timer__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTimerAccess().getTimerActionKeyword_0()); }

	'Timer action' 

{ after(grammarAccess.getTimerAccess().getTimerActionKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Timer__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Timer__Group__1__Impl
	rule__Timer__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Timer__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTimerAccess().getEventHandlerAssignment_1()); }
(rule__Timer__EventHandlerAssignment_1)
{ after(grammarAccess.getTimerAccess().getEventHandlerAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Timer__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Timer__Group__2__Impl
	rule__Timer__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Timer__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTimerAccess().getRepeatKeyword_2()); }

	'repeat' 

{ after(grammarAccess.getTimerAccess().getRepeatKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Timer__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Timer__Group__3__Impl
	rule__Timer__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Timer__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTimerAccess().getRepeattypeAssignment_3()); }
(rule__Timer__RepeattypeAssignment_3)
{ after(grammarAccess.getTimerAccess().getRepeattypeAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Timer__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Timer__Group__4__Impl
	rule__Timer__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Timer__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTimerAccess().getSecondsKeyword_4()); }

	'seconds:' 

{ after(grammarAccess.getTimerAccess().getSecondsKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Timer__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Timer__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timer__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTimerAccess().getTimerSecsAssignment_5()); }
(rule__Timer__TimerSecsAssignment_5)
{ after(grammarAccess.getTimerAccess().getTimerSecsAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}















rule__Model__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Model__HardwareAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getHardwareAlternatives_3_0()); }
(rule__Model__HardwareAlternatives_3_0)
{ after(grammarAccess.getModelAccess().getHardwareAlternatives_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Model__DevicesAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getDevicesAbstractDeviceParserRuleCall_4_0()); }
	ruleAbstractDevice{ after(grammarAccess.getModelAccess().getDevicesAbstractDeviceParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Model__EventHandlersAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getEventHandlersEventHandlerParserRuleCall_5_0()); }
	ruleEventHandler{ after(grammarAccess.getModelAccess().getEventHandlersEventHandlerParserRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Model__SensorListenersAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getSensorListenersSensorListenerParserRuleCall_6_0()); }
	ruleSensorListener{ after(grammarAccess.getModelAccess().getSensorListenersSensorListenerParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Model__TimersAssignment_7
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getTimersTimerParserRuleCall_7_0()); }
	ruleTimer{ after(grammarAccess.getModelAccess().getTimersTimerParserRuleCall_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Sensor__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Sensor__PinAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSensorAccess().getPinSTRINGTerminalRuleCall_3_0()); }
	RULE_STRING{ after(grammarAccess.getSensorAccess().getPinSTRINGTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Actuator__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getActuatorAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getActuatorAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Actuator__PinAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getActuatorAccess().getPinSTRINGTerminalRuleCall_3_0()); }
	RULE_STRING{ after(grammarAccess.getActuatorAccess().getPinSTRINGTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EventHandler__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEventHandlerAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getEventHandlerAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EventHandler__ChangeActuatorsAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEventHandlerAccess().getChangeActuatorsChangeActuatorParserRuleCall_2_0()); }
	ruleChangeActuator{ after(grammarAccess.getEventHandlerAccess().getChangeActuatorsChangeActuatorParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ChangeActuator__ActuatorAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getChangeActuatorAccess().getActuatorActuatorCrossReference_0_0()); }
(
{ before(grammarAccess.getChangeActuatorAccess().getActuatorActuatorIDTerminalRuleCall_0_0_1()); }
	RULE_ID{ after(grammarAccess.getChangeActuatorAccess().getActuatorActuatorIDTerminalRuleCall_0_0_1()); }
)
{ after(grammarAccess.getChangeActuatorAccess().getActuatorActuatorCrossReference_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ChangeActuator__ActuatorStateAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getChangeActuatorAccess().getActuatorStateAlternatives_2_0()); }
(rule__ChangeActuator__ActuatorStateAlternatives_2_0)
{ after(grammarAccess.getChangeActuatorAccess().getActuatorStateAlternatives_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SensorListener__SensorAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSensorListenerAccess().getSensorSensorCrossReference_1_0()); }
(
{ before(grammarAccess.getSensorListenerAccess().getSensorSensorIDTerminalRuleCall_1_0_1()); }
	RULE_ID{ after(grammarAccess.getSensorListenerAccess().getSensorSensorIDTerminalRuleCall_1_0_1()); }
)
{ after(grammarAccess.getSensorListenerAccess().getSensorSensorCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SensorListener__TypeAssignment_3_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSensorListenerAccess().getTypeONKeyword_3_0_0()); }
(
{ before(grammarAccess.getSensorListenerAccess().getTypeONKeyword_3_0_0()); }

	'ON' 

{ after(grammarAccess.getSensorListenerAccess().getTypeONKeyword_3_0_0()); }
)

{ after(grammarAccess.getSensorListenerAccess().getTypeONKeyword_3_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SensorListener__TypeAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSensorListenerAccess().getTypeOFFKeyword_3_1_0()); }
(
{ before(grammarAccess.getSensorListenerAccess().getTypeOFFKeyword_3_1_0()); }

	'OFF' 

{ after(grammarAccess.getSensorListenerAccess().getTypeOFFKeyword_3_1_0()); }
)

{ after(grammarAccess.getSensorListenerAccess().getTypeOFFKeyword_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SensorListener__TypeAssignment_3_2_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSensorListenerAccess().getTypeBETWEENKeyword_3_2_0_0()); }
(
{ before(grammarAccess.getSensorListenerAccess().getTypeBETWEENKeyword_3_2_0_0()); }

	'BETWEEN' 

{ after(grammarAccess.getSensorListenerAccess().getTypeBETWEENKeyword_3_2_0_0()); }
)

{ after(grammarAccess.getSensorListenerAccess().getTypeBETWEENKeyword_3_2_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SensorListener__LAssignment_3_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSensorListenerAccess().getLINTTerminalRuleCall_3_2_1_0()); }
	RULE_INT{ after(grammarAccess.getSensorListenerAccess().getLINTTerminalRuleCall_3_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SensorListener__HAssignment_3_2_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSensorListenerAccess().getHINTTerminalRuleCall_3_2_3_0()); }
	RULE_INT{ after(grammarAccess.getSensorListenerAccess().getHINTTerminalRuleCall_3_2_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SensorListener__EventHandlerAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSensorListenerAccess().getEventHandlerEventHandlerCrossReference_5_0()); }
(
{ before(grammarAccess.getSensorListenerAccess().getEventHandlerEventHandlerIDTerminalRuleCall_5_0_1()); }
	RULE_ID{ after(grammarAccess.getSensorListenerAccess().getEventHandlerEventHandlerIDTerminalRuleCall_5_0_1()); }
)
{ after(grammarAccess.getSensorListenerAccess().getEventHandlerEventHandlerCrossReference_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Timer__EventHandlerAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTimerAccess().getEventHandlerEventHandlerCrossReference_1_0()); }
(
{ before(grammarAccess.getTimerAccess().getEventHandlerEventHandlerIDTerminalRuleCall_1_0_1()); }
	RULE_ID{ after(grammarAccess.getTimerAccess().getEventHandlerEventHandlerIDTerminalRuleCall_1_0_1()); }
)
{ after(grammarAccess.getTimerAccess().getEventHandlerEventHandlerCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Timer__RepeattypeAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTimerAccess().getRepeattypeAlternatives_3_0()); }
(rule__Timer__RepeattypeAlternatives_3_0)
{ after(grammarAccess.getTimerAccess().getRepeattypeAlternatives_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Timer__TimerSecsAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTimerAccess().getTimerSecsINTTerminalRuleCall_5_0()); }
	RULE_INT{ after(grammarAccess.getTimerAccess().getTimerSecsINTTerminalRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


