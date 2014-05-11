package es.usj.raspduino.generator.raspberrypi
import es.usj.raspduino.raspduinoDSL.Model
import es.usj.raspduino.generator.Util
import es.usj.raspduino.generator.raspberrypi.MainFileStructure

class MainRaspberrypi {
	def generateMainCode(Model model, Util util){
		new MainFileStructure().generateMainCode(model, util);
		//new Sensor()
		//new Actuator().generateCode(s, util);
		//new EventsHandler().generateCode(s, util);	
		
	}
}