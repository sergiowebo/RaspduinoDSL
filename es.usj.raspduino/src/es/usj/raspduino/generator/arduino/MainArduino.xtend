package es.usj.raspduino.generator.arduino

import es.usj.raspduino.raspduinoDSL.Model
import es.usj.raspduino.generator.Util

class MainArduino {
	def generateMainCode(Model model, Util util){
		new MainFileStructure().generateMainCode(model, util);
		
		//Si existen sensores
		new SensorLibrary().generateCode(model, util);
		//Si existens actuadores
		new ActuatorLibrary().generateCode(model, util);
		//Si existen eventsHandler
		//new EventsHandler().generateCode(s, util);
		// Si existen alarms or timer	
		new TimeAlarmsLibraries().generateCode(model,util);
	}
}