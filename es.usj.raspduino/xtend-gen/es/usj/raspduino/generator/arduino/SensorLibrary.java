package es.usj.raspduino.generator.arduino;

import es.usj.raspduino.generator.Util;
import es.usj.raspduino.raspduinoDSL.AbstractDevice;
import es.usj.raspduino.raspduinoDSL.Model;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class SensorLibrary {
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
        boolean _equals = _name.equals("Sensor");
        _and = _equals;
      }
      if (_and) {
        this.generateSensorH(util);
        this.generateSensorCpp(util);
        firstOcurrence = false;
      }
    }
  }
  
  public void generateSensorCpp(final Util util) {
    String code = "\r\n#include \"SENSOR.h\"\r\n \r\nbyte _pin = 0;\r\nboolean _analog = false;\r\n\r\n// Constructor\r\nSENSOR::SENSOR(byte pin, boolean analog){\r\n\t_pin = pin;\r\n\t_analog = analog;\r\n}\r\n\r\n// Returns sensor\'s value depending on the _analog attribute\r\nint SENSOR::readValue(){\r\n\treturn (_analog?analogRead(_pin):digitalRead(_pin));\r\n}\r\n";
    util.genFile("SENSOR", "cpp", code);
  }
  
  public void generateSensorH(final Util util) {
    String code = "\r\n#ifndef SENSOR_h\r\n#define SENSOR_h\r\n#include \"Arduino.h\"\r\n\r\nclass SENSOR{\r\n  private: \r\n    byte _pin;  // Pin number\r\n    boolean _analog;  // Analog or Digital Sensor\r\n  public:\r\n    SENSOR(byte pin, boolean analog);  // Constructor\r\n    int readValue();  // Retreive the sensor value\r\n    \r\n};\r\n#endif\r\n";
    util.genFile("SENSOR", "h", code);
  }
}
