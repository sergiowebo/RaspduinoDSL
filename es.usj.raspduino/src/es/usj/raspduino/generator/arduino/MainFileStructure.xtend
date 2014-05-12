package es.usj.raspduino.generator.arduino

import es.usj.raspduino.raspduinoDSL.Model
import es.usj.raspduino.generator.Util
import es.usj.raspduino.raspduinoDSL.Sensor
import es.usj.raspduino.raspduinoDSL.Actuator
import org.eclipse.emf.common.util.EList
import es.usj.raspduino.raspduinoDSL.AbstractDevice
import es.usj.raspduino.raspduinoDSL.SensorListener
import es.usj.raspduino.raspduinoDSL.Timer
import es.usj.raspduino.raspduinoDSL.Alarm

class MainFileStructure {
	
	def generateMainCode(Model model, Util util){
		var String code = ""; // String donde iremos generando el codigo
		var boolean firstOccurrence = true; // Para que no se repitan los include en el codigo principal
		var Sensor sensor;
		var Actuator actuator;
		var Timer timer;
		
		// Declaramos los INCLUDES del codigo
		firstOccurrence = true
		for(AbstractDevice dev:model.devices){
			if(firstOccurrence && dev.eClass.name.equals("Sensor")){
				 code=code+"#include \"Sensor.h\" \n"
				 firstOccurrence=false
			}
		}
		
		// Si hay actuadores generamos las librerias de actuadores
		firstOccurrence = true
		for(AbstractDevice dev:model.devices)
			if(firstOccurrence && dev.eClass.name.equals("Actuator")){
				 code=code+"#include \"Actuator.h\" \n"
				 firstOccurrence=false
			}
		
		// Si hay handler los generamos como 
		if (model.eventHandlers.size > 0){
			code=code+"#include \"EventHandler.h\" \n"
		}
		
		// Si hay timers o alarms generamos las librerias
		firstOccurrence = true
		for(Timer dev:model.timers)
			firstOccurrence = false
				code=code+"#include \"Time.h\" \n"
				code=code+"#include \"TimeAlarms.h\" \n"
				
		if (firstOccurrence)
			for(Alarm dev:model.alarms)
				firstOccurrence = false
				code=code+"#include \"Time.h\" \n"
				code=code+"#include \"TimeAlarms.h\" \n"
		
		// Declaramos las variables que se utilizaran
		code = code + "\n"
		for(AbstractDevice dev:model.devices){
			if(dev.eClass.name.equals("Sensor")){
				sensor = dev as Sensor;
				code = code + "Sensor " + sensor.name + "(" + calcPinNumber(sensor.pin)				
			}else if(dev.eClass.name.equals("Actuator")){
				actuator = dev as Actuator;
				code=code+"Actuator " + actuator.name + "(" + calcPinNumber(actuator.pin) + ");\n"				
			}
		}
		 
		// Inicio SETUP
		code = code + "\n"
		code = code + "void setup(){\n"
		code = code + "	Serial.begin(9600);\n"
		
		// Añadimos los timers programados
		for(Timer dev:model.timers)
			timer = dev as Timer;
			code = code + "	" + "Alarm.timerOnce(" + timer.timerSecs + ", " + timer.eventHandler + ")";
		
		
		// Fin del SETUP
		code = code + "}\n\n"
		  
		// INICIO del LOOP()
		 code = code + "void loop(){\n"
		 
		 // Declaramos todos las condiciones que se han definido como Poll
		 var EList<SensorListener> p = model.sensorListeners
		 for (SensorListener sens: p){
		 	code = code + "	if(" + sens.sensor.name + ".readValue()";
			// Esta puesto con un IF por si añadimos otros comportamientos como: CHANGE, RISING, FALLING
			if(sens.type.equals("BETWEEN")){
				code=code + "<= " + sens.h + " && " + sens.sensor.name + ">= " + sens.l + "){\n" 
				}
			// Introducimos la accion a realizar dentro del IF
			code = code + "		" + sens.eventHandler.name + "();\n"					
			// Cerramos el IF
			code = code + "	}\n"
		 }
		 
		 // Queremos que cada 4 segundos se compruebe todo
		 // Si utilizamos la libreria de alarmas esto debemos de cambiarlo
		 code = code + "	delay(400);\n"
		 
		 // FIN del LOOP
		 code = code + "}\n"
				
		// Generamos el archivo
		util.genFile(model.name,"h",code)
	}
	
	
	// Si se inserta un pin que empieza con 'A' es un pin analogico, su pin real sera el numero +14
	def String calcPinNumber(String pin){
		var String p
		if(pin.charAt(0).toString.equals('A')){
			p=pin.replace('A','');
			return  ""+(Integer::parseInt(p)+14)
		}
		return pin
	}
}