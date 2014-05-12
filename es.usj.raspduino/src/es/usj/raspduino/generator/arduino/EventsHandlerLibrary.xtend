package es.usj.raspduino.generator.arduino

import es.usj.raspduino.raspduinoDSL.Model
import es.usj.raspduino.generator.Util
import org.eclipse.emf.common.util.EList
import es.usj.raspduino.raspduinoDSL.EventHandler
import es.usj.raspduino.raspduinoDSL.ChangeActuator

class EventsHandlerLibrary {
	def generateCode(Model model, Util util) {
		/*
		 * TODO: Habia pensado en hacerlo como classes,
		 * pero cada EventHandler deberia implementar su codigo
		 * en Java es como AbstractClass ¿en Arduino existe?
		 * 
		 * Asi que de momento lo hago como un header file y me olvido
		 */
		 var String code = "";
		 var EList<EventHandler> handlers = model.eventHandlers;
		 
		 for (EventHandler h: handlers){
		 	// Iniciamos la declaracion del procedimiento
		 	code = code + "void " + h.name + "(){\n";

			// Recorremos la lista de accion y las declaramos
			var EList <ChangeActuator> ca = h.changeActuators;
			for (ChangeActuator c: ca)
				code = code + "	" + c.actuator.name + "." + c.actuatorState + "();\n";
			
			// finalizamos el procedimiento
		 	code = code + "}\n\n";
		 }
		 
		 // Generamos el archivo
		util.genFile("EventsHandler","h",code)
	}
	
}