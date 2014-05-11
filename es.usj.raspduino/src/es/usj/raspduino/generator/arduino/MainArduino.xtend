package es.usj.raspduino.generator.arduino

import es.usj.raspduino.raspduinoDSL.Model
import es.usj.raspduino.generator.Util

class MainArduino {
	def generateMainCode(Model model, Util util){
		new MainFileStructure().generateMainCode(model, util);
		//new Sensor()
		//new Actuator().generateCode(s, util);
		//new EventsHandler().generateCode(s, util);	
		
	}
}