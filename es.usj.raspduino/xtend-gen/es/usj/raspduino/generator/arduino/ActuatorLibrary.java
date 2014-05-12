package es.usj.raspduino.generator.arduino;

import es.usj.raspduino.generator.Util;
import es.usj.raspduino.raspduinoDSL.AbstractDevice;
import es.usj.raspduino.raspduinoDSL.Model;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ActuatorLibrary {
  public void generateCode(final Model model, final Util util) {
    boolean firstOcurrence = true;
    EList<AbstractDevice> _devices = model.getDevices();
    for (final AbstractDevice dev : _devices) {
      boolean _and = false;
      if (!firstOcurrence) {
        _and = false;
      } else {
        EClass _eClass = dev.eClass();
        String _name = _eClass.getName();
        boolean _equals = _name.equals("Actuator");
        _and = _equals;
      }
      if (_and) {
        this.generateLedH(util);
        this.generateLedCpp(util);
        firstOcurrence = false;
      }
    }
  }
  
  public void generateLedH(final Util util) {
    String code = "\r\n#ifndef LED_h\r\n#define LED_h\r\n\r\n#include \"Arduino.h\"\r\n\r\nclass LED{\r\n  private:\r\n    byte _pin; // the pin number\r\n    byte _state; // the state of the LED: HIGH=on, LOW=off\r\n  public:\r\n    LED(byte pin); // the constructor\r\n    void on(); // turn the LED on\r\n    void off(); // turn the LED off\r\n    void toggle(); // toggle the LED\r\n    byte state(); // return the current state of the LED\r\n};\r\n#endif\t\t";
    util.genFile("LED", "h", code);
  }
  
  public void generateLedCpp(final Util util) {
    String code = "\r\n#include \"LED.h\"\r\n\r\n// the constructor\r\nLED::LED(byte pin) {\r\n  _pin = pin; // save the pin number\r\n  pinMode(pin, OUTPUT); // configure pin as output\r\n}\r\n\r\n// the public methods\r\nvoid LED::on() {\r\n  digitalWrite(_pin, HIGH); // turn on LED\r\n  _state = HIGH;\r\n}\r\n\r\nvoid LED::off() {\r\n  digitalWrite(_pin, LOW); // turn off LED\r\n  _state = LOW;\r\n}\r\n\r\nvoid LED::toggle() {\r\n  if(_state) {\r\n    off();\r\n  } else {\r\n    on();\r\n  }\r\n}\r\n  \r\nbyte LED::state() {\r\n  return _state;\r\n}\r\n\t\t";
    util.genFile("LED", "cpp", code);
  }
}
