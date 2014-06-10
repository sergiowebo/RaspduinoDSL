package es.usj.raspduino.validation

import org.eclipse.xtext.validation.Check
import es.usj.raspduino.raspduinoDSL.Sensor
import es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage
import es.usj.raspduino.raspduinoDSL.Model
import es.usj.raspduino.raspduinoDSL.AbstractDevice
import es.usj.raspduino.raspduinoDSL.Actuator

class RaspduinoDSLValidator extends AbstractRaspduinoDSLValidator {

  public static val INVALID_NAME = 'invalidName'

	/*
	 * Comprueba que los sensores y actuadores en Arduino:
	 * 		 Entre 0 y 15 para pines digitales
	 * 		 Entre A0 y A5 pines analogicos
	 * 
	 * Comprueba que los sensores y actuadores en Rapsberry Pi estan entre
	 * 		 2 3 4 17 22 10 9 11 14 15 18 23 24 25 8 7
	 */
	@Check
	def checkArduinoSensorPinNumber(Model model) {
		
		var Sensor sensor;
		var Actuator actuator;

		if(model.hardware.equals("Arduino UNO")){
			for(AbstractDevice dev:model.devices)
				if(dev.eClass.name.equals("Sensor")){
					sensor = dev as Sensor;
					try {
						// Si es un numero mayor que 14 o menor que 0
						if(Integer::parseInt(sensor.pin) > 14 || Integer::parseInt(sensor.pin) < 0)
							error("Pin digital debe de ser entre 0 y 14", RaspduinoDSLPackage.Literals.ABSTRACT_DEVICE__PIN)
					} catch (NumberFormatException e) {
						// Si entra en la excepcion no es un numero	
						// Miramos si empieza por para saber que es Analogico
						if(!sensor.pin.startsWith("A")){
							error("El pin debe empezar por A o numerico", RaspduinoDSLPackage.Literals.ABSTRACT_DEVICE__PIN)
						}
					}
				} else if(dev.eClass.name.equals("Actuator")){
					actuator = dev as Actuator;
					try {
						// Si es un numero mayor que 14 o menor que 0
						if(Integer::parseInt(actuator.pin) > 14 || Integer::parseInt(actuator.pin) < 0)
							error("Pin digital debe de ser entre 0 y 14", RaspduinoDSLPackage.Literals.ABSTRACT_DEVICE__PIN)
					} catch (NumberFormatException e) {
						// Si entra en la excepcion no es un numero	
						// Miramos si empieza por para saber que es Analogico
						if(!actuator.pin.startsWith("A")){
							error("El pin debe empezar por A o numerico", RaspduinoDSLPackage.Literals.ABSTRACT_DEVICE__PIN)
						}
					}
				}
			//fin del for
		} else if(model.hardware.equals("Raspberry Pi")){
			for(AbstractDevice dev:model.devices)
				if(dev.eClass.name.equals("Sensor")){
					sensor = dev as Sensor;
					try {
						// Si es un numero no esta en la lista no es valido
						if(Integer::parseInt(sensor.pin) != 2 && Integer::parseInt(sensor.pin) != 3 &&
							Integer::parseInt(sensor.pin) != 4 && Integer::parseInt(sensor.pin) != 17 &&
							Integer::parseInt(sensor.pin) != 27 && Integer::parseInt(sensor.pin) != 22 &&
							Integer::parseInt(sensor.pin) != 10 && Integer::parseInt(sensor.pin) != 9 &&
							Integer::parseInt(sensor.pin) != 11 && Integer::parseInt(sensor.pin) != 14 &&
							Integer::parseInt(sensor.pin) != 15 && Integer::parseInt(sensor.pin) != 18 &&
							Integer::parseInt(sensor.pin) != 23 && Integer::parseInt(sensor.pin) != 24 &&
							Integer::parseInt(sensor.pin) != 25 && Integer::parseInt(sensor.pin) != 8 &&
							Integer::parseInt(sensor.pin) != 7)
								error("El valor de pin elegido no es correcto", RaspduinoDSLPackage.Literals.ABSTRACT_DEVICE__PIN)
					} catch (NumberFormatException e) {
						// Solo se admiten valores numericos
						error("El valor pin debe ser numerico", RaspduinoDSLPackage.Literals.ABSTRACT_DEVICE__PIN)
					}
				} else if(dev.eClass.name.equals("Actuator")){
					actuator = dev as Actuator;
					try {
						if(Integer::parseInt(sensor.pin) != 2 && Integer::parseInt(sensor.pin) != 3 &&
							Integer::parseInt(sensor.pin) != 4 && Integer::parseInt(sensor.pin) != 17 &&
							Integer::parseInt(sensor.pin) != 27 && Integer::parseInt(sensor.pin) != 22 &&
							Integer::parseInt(sensor.pin) != 10 && Integer::parseInt(sensor.pin) != 9 &&
							Integer::parseInt(sensor.pin) != 11 && Integer::parseInt(sensor.pin) != 14 &&
							Integer::parseInt(sensor.pin) != 15 && Integer::parseInt(sensor.pin) != 18 &&
							Integer::parseInt(sensor.pin) != 23 && Integer::parseInt(sensor.pin) != 24 &&
							Integer::parseInt(sensor.pin) != 25 && Integer::parseInt(sensor.pin) != 8 &&
							Integer::parseInt(sensor.pin) != 7)
								error("El valor de pin elegido no es correcto", RaspduinoDSLPackage.Literals.ABSTRACT_DEVICE__PIN)
					} catch (NumberFormatException e) {
						// Solo se admiten valores numericos
						error("El valor pin debe ser numerico", RaspduinoDSLPackage.Literals.ABSTRACT_DEVICE__PIN)
					}
				}
			//fin del for
		}
	}
	
		
			
}
