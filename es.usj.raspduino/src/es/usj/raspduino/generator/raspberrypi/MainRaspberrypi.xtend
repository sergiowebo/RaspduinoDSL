package es.usj.raspduino.generator.raspberrypi

import es.usj.raspduino.raspduinoDSL.Model
import es.usj.raspduino.generator.Util
import es.usj.raspduino.generator.raspberrypi.MainFileStructure
import es.usj.raspduino.raspduinoDSL.AbstractDevice

class MainRaspberrypi {
	
	def generateMainCode(Model model, Util util){
		/*
		 * Se realiza una llamada por archivo generado, solo en caso de que existan o sea necesario:
		 * 	Sensor - Librerias de sensores
		 *  Actutor - Librerias de actuadores
		 *  Schedule - Librerias de temporizadores
		 *  MainFilStructute - Archivo principal de Raspberry PI
		 */
		
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
			new Schedule().generateCode(model,util);	
		
	}
}