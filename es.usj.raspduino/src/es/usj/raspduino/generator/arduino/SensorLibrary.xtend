package es.usj.raspduino.generator.arduino

import es.usj.raspduino.raspduinoDSL.Model
import es.usj.raspduino.generator.Util
import es.usj.raspduino.raspduinoDSL.AbstractDevice

class SensorLibrary {
	def generateCode(Model model, Util util) {
		var boolean firstOcurrence = true;
		
		// Comprobamos si existen declaraciones de Actuadores
		for(AbstractDevice dev:model.devices)
			if(firstOcurrence && dev.eClass.name.equals("Sensor")){	
				generateSensorH(util);
				generateSensorCpp(util);
				firstOcurrence = false;
			}
		}
	
	def generateSensorCpp(Util util) {
		var String code = "
#include \"SENSOR.h\"
 
byte _pin = 0;
boolean _analog = false;

// Constructor
SENSOR::SENSOR(byte pin, boolean analog){
	_pin = pin;
	_analog = analog;
}

// Returns sensor's value depending on the _analog attribute
int SENSOR::readValue(){
	return (_analog?analogRead(_pin):digitalRead(_pin));
}
";
		
		// Generamos el archivo
		util.genFile("SENSOR","cpp",code)
	}
	
	def generateSensorH(Util util) {
		var String code = "
#ifndef SENSOR_h
#define SENSOR_h
#include \"Arduino.h\"

class SENSOR{
  private: 
    byte _pin;  // Pin number
    boolean _analog;  // Analog or Digital Sensor
  public:
    SENSOR(byte pin, boolean analog);  // Constructor
    int readValue();  // Retreive the sensor value
    
};
#endif
";
		
		// Generamos el archivo
		util.genFile("SENSOR","h",code)
	}
	
}