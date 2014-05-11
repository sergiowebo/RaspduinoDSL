package es.usj.raspduino.generator.arduino

import es.usj.raspduino.raspduinoDSL.Model
import es.usj.raspduino.generator.Util

class MainFileStructure {
	def generateMainCode(Model model, Util util){
		// String donde iremos generando el codigo
		var String code = "";
		
		// Generamos el archivo
		util.genFile(model.name,"h",code)
	}
}