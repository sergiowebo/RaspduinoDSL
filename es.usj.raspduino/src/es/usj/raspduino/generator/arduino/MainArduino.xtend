package es.usj.raspduino.generator.arduino

import es.usj.raspduino.raspduinoDSL.Model
import es.usj.raspduino.generator.Util
import es.usj.raspduino.raspduinoDSL.AbstractDevice

class MainArduino {
	def generateMainCode(Model model, Util util){
		/*
		 * Se realiza una llamada por archivo generado, solo en caso de que existan o sea necesario:
		 * 	Sensor - Librerias de sensores
		 *  Actutor - Librerias de actuadores
		 *  Time - Librerias de temporizadores
		 *  MainFilStructute - Archivo principal de Arduino
		 */
		
		// MainFilStructute - Archivo principal de Arduino
		new MainFileStructure().generateMainCode(model, util);
		
		// 	Sensor - Librerias de sensores
		var boolean firstOccurrence = true; // Para que no se repitan las librerias
		firstOccurrence = true
		for(AbstractDevice dev:model.devices){
			if(firstOccurrence && dev.eClass.name.equals("Sensor")){
				new SensorLibrary().generateCode(model, util);
				firstOccurrence=false
			}
		}
		
		//Actutor - Librerias de actuadores
		firstOccurrence = true
		for(AbstractDevice dev:model.devices){
			if(firstOccurrence && dev.eClass.name.equals("Sensor")){
				new ActuatorLibrary().generateCode(model, util);
				firstOccurrence=false
			}
		}
		
		// Time - Librerias de temporizadores
		if(!model.timers.empty)
			new TimeAlarmsLibraries().generateCode(model,util);
	}
}