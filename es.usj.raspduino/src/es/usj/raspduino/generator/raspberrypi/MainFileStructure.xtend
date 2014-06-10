package es.usj.raspduino.generator.raspberrypi

import es.usj.raspduino.raspduinoDSL.Model
import es.usj.raspduino.generator.Util
import es.usj.raspduino.raspduinoDSL.AbstractDevice
import es.usj.raspduino.raspduinoDSL.Sensor
import es.usj.raspduino.raspduinoDSL.Actuator
import es.usj.raspduino.raspduinoDSL.Timer
import org.eclipse.emf.common.util.EList
import es.usj.raspduino.raspduinoDSL.EventHandler
import es.usj.raspduino.raspduinoDSL.ChangeActuator
import es.usj.raspduino.raspduinoDSL.SensorListener

class MainFileStructure {
	def generateMainCode(Model model, Util util){
		/*
		 * Este metodo genera la estrucuta del archivo principal de arduino divido asi:
		 * 	[includes]
		 * 	[declaraciones de variables]
		 *  [EventHandlers]
		 *  [Inicializacion de timers]
		 * 	[bucle while]
		 */
		
		// String donde iremos generando el codigo
		var String code = "";
		
		// Generacion de los includes del archivo
		var String codeInclude = includes(model);
		
		// Declaracion de variables
		var String codeVarDeclarations = varDeclarations(model);
		
		// Declaracion de los eventHandlers()
		var String codeEventHandlers = eventHandlers(model);
		
		// Declaracion de los timers()
		var String codeTimers = timers(model);
		
		// Declaracion de la funcion loop()
		var String codeWhileFunction = whileFunction(model);
			
		code = 	codeInclude + codeVarDeclarations + codeEventHandlers + codeTimers + codeWhileFunction;
		
		// Generamos el archivo
		util.genFile(model.name,"py",code)
	}
	
	def includes(Model model) {
		var String code = "";
		var boolean firstOccurrence = true; // Para que no se repitan los include
		
		// Libreria que controla el puerto GPIO y el tiempo
		code = code + "import RPi.GPIO as GPIO\n";
		code = code + "import time\n";
		
		// Si hay sensores
		firstOccurrence = true;
		for(AbstractDevice dev:model.devices){
			if(firstOccurrence && dev.eClass.name.equals("Sensor")){
				 code =  code + "from Led import Led \n";
				 firstOccurrence = false;
			}
		}
		
		// Si hay actuadores
		firstOccurrence = true;
		for(AbstractDevice dev:model.devices)
			if(firstOccurrence && dev.eClass.name.equals("Actuator")){
				 code = code + "from Sensor import Sensor \n";
				 firstOccurrence = false;
			}
		
		// Si hay timers generamos las librerias que los controlaran
		if(!model.timers.empty){
				code = code + "import schedule \n";
		}
		
		return code;
	}
	
	def varDeclarations(Model model) {
		var String code = "";
		
		var Sensor sensor;
		var Actuator actuator;
		
		// Estblecemos el modo de uso de los puertos GPIO
		code = code + "GPIO.setmode(GPIO.BCM) \n";
		
		// Dejamos una linea en blanco para separar de los includes
		code = code + "\n";
		for(AbstractDevice dev:model.devices){
			if(dev.eClass.name.equals("Sensor")){
				sensor = dev as Sensor;
				code = code + sensor.name + " = " + "Sensor(" + sensor.pin + ")\n";
			}else if(dev.eClass.name.equals("Actuator")){
				actuator = dev as Actuator;
				code = code + actuator.name + " = " + "Led(" + actuator.pin + ")\n";	
			}
		}
		
		return code;
	}
	
	def eventHandlers(Model model) {
		var String code = "";
		
		// Declaramos todos las condiciones que se han definido como SensorListeners, un IF por cada una
		var EList<EventHandler> eh = model.eventHandlers;
		for (EventHandler eventh: eh){
			// Dejamos una linea en blaco para separar de la seccion anterior
			code = code + "\n";
		
			//Inicio de la funcion
			code = code + "def " + eventh.name + "():\n";
			for(ChangeActuator changeAct:eventh.changeActuators){
				// Instanciamos el actuador que se quiere cambiar
				var actuator = changeAct.actuator;				
				// Acciones de la funcion
				code = code + "	" + actuator.name;
				if (changeAct.actuatorState.equals("On")){
					code = code + ".on()\n";
				} else if (changeAct.actuatorState.equals("Off")){
					code = code + ".off()\n";
				} else if(changeAct.actuatorState.equals("Toggle")){
					code = code + ".toggle()\n";
				}
			}	
			
			// Fin de la funcion
			code = code + "\n";
		}
		
		return code;
	}


	def timers(Model model) {
		var String code = "";
		var Timer timer;
				
		// Declaramos los timers
		for(Timer dev:model.timers)
			if(dev.eClass.name.equals("Timer")){
				timer = dev as Timer;
				if(timer.repeattype.equals("EVERY INTERVAL of")){
					code = code + "schedule.every(" + timer.secs + ").seconds.do(" + timer.eventHandler.name + ")\n";
				} else if (timer.repeattype.equals("EVERY DAY at")){
					code = code + "	" + "schedule.every().day.at(\"" + timer.hours + ":"
															 		 + timer.minutes + "\").do( "
															 		 + timer.eventHandler.name + ")\n";	
				} else if (timer.repeattype.equals("EVERY MONDAY at")){
					code = code + "	" + "schedule.every().monday.at(\"" + timer.hours + ":"
															 		 + timer.minutes + "\").do( "
															 		 + timer.eventHandler.name + ")\n";		
				} else if (timer.repeattype.equals("EVERY TUESDAY at")){
					code = code + "	" + "schedule.every().tuesday.at(\"" + timer.hours + ":"
															 		 + timer.minutes + "\").do( "
															 		 + timer.eventHandler.name + ")\n";	
				} else if (timer.repeattype.equals("EVERY WEDNESDAY at")){
					code = code + "	" + "schedule.every().wednesday.at(\"" + timer.hours + ":"
															 		 + timer.minutes + "\").do( "
															 		 + timer.eventHandler.name + ")\n";	
				} else if (timer.repeattype.equals("EVERY THURSDAY at")){
					code = code + "	" + "schedule.every().thursday.at(\"" + timer.hours + ":"
															 		 + timer.minutes + "\").do( "
															 		 + timer.eventHandler.name + ")\n";	
				} else if (timer.repeattype.equals("EVERY FRIDAY at")){
					code = code + "	" + "schedule.every().friday.at(\"" + timer.hours + ":"
															 		 + timer.minutes + "\").do( "
															 		 + timer.eventHandler.name + ")\n";	
				} else if (timer.repeattype.equals("EVERY SATURDAY at")){
					code = code + "	" + "schedule.every().saturday.at(\"" + timer.hours + ":"
															 		 + timer.minutes + "\").do( "
															 		 + timer.eventHandler.name + ")\n";	
				} else if (timer.repeattype.equals("EVERY SUNDAY at")){
					code = code + "	" + "schedule.every().sunday.at(\"" + timer.hours + ":"
															 		 + timer.minutes + "\").do( "
															 		 + timer.eventHandler.name + ")\n";	
				}
			}
		
		return code;
	}	
	
	
	def whileFunction(Model model) {
		var String code = "";
		
				// Dejamos una linea en blaco para separar de la seccion anterior
		code = code + "\n";
		
		// Iniciamos un try and catch para poder parar la ejecucion con crtl + c
		code = code + "try:\n";
		
		// [INICIO LOOP]
		code = code + "	while True:\n";
		
		//Iniciamos los timers si existen
		if(!model.timers.empty)
			code = code + "		schedule.run_pending()\n"
		 
		// Declaramos todos las condiciones que se han definido como SensorListeners, un IF por cada una
		var EList<SensorListener> p = model.sensorListeners
		for (SensorListener sens: p){
			//Inicio del IF
			code = code + "		if(";
			
			// Condicion del IF
			if(sens.type.equals("BETWEEN")){
				code = code +  sens.sensor.name + ".readValue() " + "<= " + sens.h
							 + " and " + sens.sensor.name + ".readValue() " + ">= " + sens.l + "):\n";
				
			} else if (sens.type.equals("ON")){
				code = code + sens.sensor.name + ".readValue() is False):\n";
				
			} else if (sens.type.equals("OFF")){
				code = code + sens.sensor.name + ".readValue() is True):\n"; 
				
			}
			
			// Accion de realizar en caso de
			code = code + "			" + sens.eventHandler.name + "()\n";	
		}
		 
		//  Queremos que cada 100 milisegundos se compruebe todos los sensores
		code = code + "		time.sleep(0.1)\n";
		 
		// [FIN DEL LOOP]
		code = code + "except KeyboardInterrupt: \n"
    	code = code + "	GPIO.cleanup()";
		
		
		return code;
	}
	
}