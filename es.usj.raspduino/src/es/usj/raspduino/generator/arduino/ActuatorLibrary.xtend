package es.usj.raspduino.generator.arduino

import es.usj.raspduino.raspduinoDSL.Model
import es.usj.raspduino.generator.Util
import es.usj.raspduino.raspduinoDSL.AbstractDevice

class ActuatorLibrary {
	
	def generateCode(Model model, Util util) {
		var boolean firstOcurrence = true;
		
		// Comprobamos si existen declaraciones de Actuadores
		for(AbstractDevice dev:model.devices)
			if(firstOcurrence && dev.eClass.name.equals("Actuator")){	
				generateLedH(util);
				generateLedCpp(util);
				firstOcurrence = false;
			}
		}
	
	def generateLedH(Util util) {
		var String code = "
#ifndef LED_h
#define LED_h

#include \"Arduino.h\"

class LED{
  private:
    byte _pin; // the pin number
    byte _state; // the state of the LED: HIGH=on, LOW=off
  public:
    LED(byte pin); // the constructor
    void on(); // turn the LED on
    void off(); // turn the LED off
    void toggle(); // toggle the LED
    byte state(); // return the current state of the LED
};
#endif		";
		
		// Generamos el archivo
		util.genFile("LED","h",code)
	}	
	
	
		def generateLedCpp(Util util) {
		var String code = "
#include \"LED.h\"

// the constructor
LED::LED(byte pin) {
  _pin = pin; // save the pin number
  pinMode(pin, OUTPUT); // configure pin as output
}

// the public methods
void LED::on() {
  digitalWrite(_pin, HIGH); // turn on LED
  _state = HIGH;
}

void LED::off() {
  digitalWrite(_pin, LOW); // turn off LED
  _state = LOW;
}

void LED::toggle() {
  if(_state) {
    off();
  } else {
    on();
  }
}
  
byte LED::state() {
  return _state;
}
		";
		
		// Generamos el archivo
		util.genFile("LED","cpp",code)
	}	
}