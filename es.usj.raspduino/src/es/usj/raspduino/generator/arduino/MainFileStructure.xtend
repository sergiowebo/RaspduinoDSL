package es.usj.raspduino.generator.arduino

import es.usj.raspduino.raspduinoDSL.Model
import es.usj.raspduino.generator.Util
import es.usj.raspduino.raspduinoDSL.Sensor
import es.usj.raspduino.raspduinoDSL.Actuator
import org.eclipse.emf.common.util.EList
import es.usj.raspduino.raspduinoDSL.AbstractDevice
import es.usj.raspduino.raspduinoDSL.SensorListener
import es.usj.raspduino.raspduinoDSL.Timer
import es.usj.raspduino.raspduinoDSL.EventHandler
import es.usj.raspduino.raspduinoDSL.ChangeActuator

class MainFileStructure {
	
	def generateMainCode(Model model, Util util){
		
		/*
		 * Este metodo genera la estrucuta del archivo principal de arduino divido asi:
		 * 	[imports]
		 * 	[declaraciones de variables]
		 * 	[funcion setup()]
		 * 	[funcion loop()]
		 *  [EventHandlers]
		 */
		
		// Variables principales
		var String code = ""; // String donde iremos generando el codigo
		
		// Generacion de los includes del archivo
		var String codeInclude = includes(model);
		
		// Declaracion de variables
		var String codeVarDeclarations = varDeclarations(model);
		
		// Declaracion de la funcion setup()
		var String codeSetupFunction = setupFunction(model);
		
		// Declaracion de la funcion loop()
		var String codeLoopFunction = loopFunction(model);

		// Declaracion de los eventHandlers()
		var String codeEventHandlers = eventHandlers(model);
			
		code = 	codeInclude + codeVarDeclarations + codeSetupFunction + codeLoopFunction + codeEventHandlers;
		// Generamos el archivo	
		util.genFile(model.name,"ino",code);
	}
	

	// Se encarga de escribir los inlcudes en el archivo principal	
	def String includes(Model model){
		var String code = "";
		var boolean firstOccurrence = true; // Para que no se repitan los include
		
		// Si hay sensores
		firstOccurrence = true;
		for(AbstractDevice dev:model.devices){
			if(firstOccurrence && dev.eClass.name.equals("Sensor")){
				 code =  code + "#include \"Sensor.h\" \n";
				 firstOccurrence = false;
			}
		}
		
		// Si hay actuadores
		firstOccurrence = true;
		for(AbstractDevice dev:model.devices)
			if(firstOccurrence && dev.eClass.name.equals("Actuator")){
				 code = code + "#include \"Led.h\" \n";
				 firstOccurrence = false;
			}
		
		// Si hay timers generamos las librerias que los controlaran
		if(!model.timers.empty){
				code = code + "#include \"Time.h\" \n";
				code = code + "#include \"TimeAlarms.h\" \n";
		}
		
		return code
	}
	
	
	// Se encarga de escribir los inlcudes en el archivo principal	
	def String varDeclarations(Model model){
		var String code = "";
		var Sensor sensor;
		var Actuator actuator;

		// Dejamos una linea en blanco para separar de los includes
		code = code + "\n";
		for(AbstractDevice dev:model.devices){
			if(dev.eClass.name.equals("Sensor")){
				sensor = dev as Sensor;
				code = code + "SENSOR " + sensor.name + "(" + calcPinNumber(sensor.pin);		
				if (sensor.pin.startsWith('A')){
					code = code + ", true";
				} else {
					code = code + ", false";
				}
				code = code + ");\n";
			}else if(dev.eClass.name.equals("Actuator")){
				actuator = dev as Actuator;
				code = code + "LED " + actuator.name + "(" + calcPinNumber(actuator.pin) + ");\n";		
			}
		}
		
		return code;
	}
	
	
	// Se encarga de escribir la funcion setup()	
	def String setupFunction(Model model){
		var String code = "";
		var Timer timer;
		
		// Dejamos una linea en blaco para separar de la seccion anterior
		code = code + "\n";
		// [INICIO SETUP]
		code = code + "void setup(){\n";
		
		// Añadimos los timers programados
		for(Timer dev:model.timers)
			if(dev.eClass.name.equals("Timer")){
				timer = dev as Timer;
				if(timer.repeattype.equals("EVERY INTERVAL of")){
					code = code + "	" + "Alarm.timerRepeat(" + timer.secs + ", " + timer.eventHandler.name + ");\n";
				} else if (timer.repeattype.equals("EVERY DAY at")){
					code = code + "	" + "Alarm.alarmRepeat(" + timer.hours + ", "
															 + timer.minutes + ", "
															 + "0" + ", "
															 + timer.eventHandler.name + ");\n";	
				} else if (timer.repeattype.equals("EVERY MONDAY at")){
					code = code + "	" + "Alarm.alarmRepeat(" + "dowMonday" + ", "
															 + timer.hours + ", "
										 					 + timer.minutes + ", "
															 + "0" + ", "
															 + timer.eventHandler.name + ");\n";	
				} else if (timer.repeattype.equals("EVERY TUESDAY at")){
					code = code + "	" + "Alarm.alarmRepeat(" + "dowTuesday" + ", "
															 + timer.hours + ", "
										 					 + timer.minutes + ", "
															 + "0" + ", "
															 + timer.eventHandler.name + ");\n";
				} else if (timer.repeattype.equals("EVERY WEDNESDAY at")){
					code = code + "	" + "Alarm.alarmRepeat(" + "dowWednesday" + ", "
															 + timer.hours + ", "
										 					 + timer.minutes + ", "
															 + "0" + ", "
															 + timer.eventHandler.name + ");\n";
				} else if (timer.repeattype.equals("EVERY THURSDAY at")){
					code = code + "	" + "Alarm.alarmRepeat(" + "dowThursday" + ", "
															 + timer.hours + ", "
										 					 + timer.minutes + ", "
															 + "0" + ", "
															 + timer.eventHandler.name + ");\n";
				} else if (timer.repeattype.equals("EVERY FRIDAY at")){
					code = code + "	" + "Alarm.alarmRepeat(" + "dowFriday" + ", "
															 + timer.hours + ", "
										 					 + timer.minutes + ", "
															 + "0" + ", "
															 + timer.eventHandler.name + ");\n";
				} else if (timer.repeattype.equals("EVERY SATURDAY at")){
					code = code + "	" + "Alarm.alarmRepeat(" + "dowSaturday" + ", "
															 + timer.hours + ", "
										 					 + timer.minutes + ", "
															 + "0" + ", "
															 + timer.eventHandler.name + ");\n";
				} else if (timer.repeattype.equals("EVERY SUNDAY at")){
					code = code + "	" + "Alarm.alarmRepeat(" + "dowSunday" + ", "
															 + timer.hours + ", "
										 					 + timer.minutes + ", "
															 + "0" + ", "
															 + timer.eventHandler.name + ");\n";
				}
			}
		
		// [FIN SETUP]
		code = code + "}\n";
		
		return code;
	}
	
	
	// Se encarga de escribir la funcion loop()	
	def String loopFunction(Model model){
		var String code = "";
		
		// Dejamos una linea en blaco para separar de la seccion anterior
		code = code + "\n";
		
		// [INICIO LOOP]
		code = code + "void loop(){\n";
		 
		// Declaramos todos las condiciones que se han definido como SensorListeners, un IF por cada una
		var EList<SensorListener> p = model.sensorListeners
		for (SensorListener sens: p){
			//Inicio del IF
			code = code + "	if(";
			
			// Condicion del IF
			if(sens.type.equals("BETWEEN")){
				code = code +  sens.sensor.name + ".readValue() " + "<= " + sens.h
							 + " && " + sens.sensor.name + ".readValue() " + ">= " + sens.l + "){\n";
				
			} else if (sens.type.equals("ON")){
				code = code + "!" + sens.sensor.name + ".readValue()){\n";
				
			} else if (sens.type.equals("OFF")){
				code = code +sens.sensor.name + ".readValue()){\n"; 
				
			}
			
			// Accion de realizar en caso de
			code = code + "		" + sens.eventHandler.name + "();\n";	
							
			// Fin del IF
			code = code + "	}\n";
		}
		 
		/*  Queremos que cada 100 milisegundos se compruebe todos los sensores
		 * 		Si no utilizamos timers funcion: delay(400);
		 * 		Si utilizamos timers funcion: Alarm.delay(400);
		 */	
		if(!model.timers.empty){
			code = code + "	Alarm.delay(400);\n";
		} else {
			code = code + "	delay(400);\n";
		}
		 
		// [FIN DEL LOOP]
		code = code + "}\n";
		
		return code;
	}
	
	// Se encarga de escribir la funcion setup()	
	def String eventHandlers(Model model){
		var String code = "";

		// Declaramos todos las condiciones que se han definido como SensorListeners, un IF por cada una
		var EList<EventHandler> eh = model.eventHandlers;
		for (EventHandler eventh: eh){
			// Dejamos una linea en blaco para separar de la seccion anterior
			code = code + "\n";
		
			//Inicio de la funcion
			code = code + "void " + eventh.name + "(){\n";
			for(ChangeActuator changeAct:eventh.changeActuators){
				// Instanciamos el actuador que se quiere cambiar
				var actuator = changeAct.actuator;				
				// Acciones de la funcion
				code = code + "	" + actuator.name;
				if (changeAct.actuatorState.equals("On")){
					code = code + ".on();\n";
				} else if (changeAct.actuatorState.equals("Off")){
					code = code + ".off();\n";
				} else if(changeAct.actuatorState.equals("Toggle")){
					code = code + ".toggle();\n";
				}
			}	
			
			// Fin de la funcion
			code = code + "}\n";
		}
		
		return code;
	}
	
	// Si se inserta un pin que empieza con 'A' es un pin analogico, su pin real sera el numero +14
	def String calcPinNumber(String pin){
		var String p
		if(pin.charAt(0).toString.equals('A')){
			p=pin.replace('A','');
			return  ""+(Integer::parseInt(p)+14);
		}
		return pin;
	}
}