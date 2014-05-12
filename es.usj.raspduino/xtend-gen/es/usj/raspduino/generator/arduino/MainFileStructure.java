package es.usj.raspduino.generator.arduino;

import es.usj.raspduino.generator.Util;
import es.usj.raspduino.raspduinoDSL.AbstractDevice;
import es.usj.raspduino.raspduinoDSL.Actuator;
import es.usj.raspduino.raspduinoDSL.Alarm;
import es.usj.raspduino.raspduinoDSL.EventHandler;
import es.usj.raspduino.raspduinoDSL.Model;
import es.usj.raspduino.raspduinoDSL.Sensor;
import es.usj.raspduino.raspduinoDSL.SensorListener;
import es.usj.raspduino.raspduinoDSL.Timer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class MainFileStructure {
  public void generateMainCode(final Model model, final Util util) {
    String code = "";
    boolean firstOccurrence = true;
    Sensor sensor = null;
    Actuator actuator = null;
    Timer timer = null;
    firstOccurrence = true;
    EList<AbstractDevice> _devices = model.getDevices();
    for (final AbstractDevice dev : _devices) {
      boolean _and = false;
      if (!firstOccurrence) {
        _and = false;
      } else {
        EClass _eClass = dev.eClass();
        String _name = _eClass.getName();
        boolean _equals = _name.equals("Sensor");
        _and = _equals;
      }
      if (_and) {
        code = (code + "#include \"Sensor.h\" \n");
        firstOccurrence = false;
      }
    }
    firstOccurrence = true;
    EList<AbstractDevice> _devices_1 = model.getDevices();
    for (final AbstractDevice dev_1 : _devices_1) {
      boolean _and_1 = false;
      if (!firstOccurrence) {
        _and_1 = false;
      } else {
        EClass _eClass_1 = dev_1.eClass();
        String _name_1 = _eClass_1.getName();
        boolean _equals_1 = _name_1.equals("Actuator");
        _and_1 = _equals_1;
      }
      if (_and_1) {
        code = (code + "#include \"Actuator.h\" \n");
        firstOccurrence = false;
      }
    }
    EList<EventHandler> _eventHandlers = model.getEventHandlers();
    int _size = _eventHandlers.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      code = (code + "#include \"EventHandler.h\" \n");
    }
    firstOccurrence = true;
    EList<Timer> _timers = model.getTimers();
    for (final Timer dev_2 : _timers) {
      firstOccurrence = false;
    }
    code = (code + "#include \"Time.h\" \n");
    code = (code + "#include \"TimeAlarms.h\" \n");
    if (firstOccurrence) {
      EList<Alarm> _alarms = model.getAlarms();
      for (final Alarm dev_3 : _alarms) {
        firstOccurrence = false;
      }
    }
    code = (code + "#include \"Time.h\" \n");
    code = (code + "#include \"TimeAlarms.h\" \n");
    code = (code + "\n");
    EList<AbstractDevice> _devices_2 = model.getDevices();
    for (final AbstractDevice dev_4 : _devices_2) {
      EClass _eClass_2 = dev_4.eClass();
      String _name_2 = _eClass_2.getName();
      boolean _equals_2 = _name_2.equals("Sensor");
      if (_equals_2) {
        sensor = ((Sensor) dev_4);
        String _name_3 = sensor.getName();
        String _plus = ((code + "Sensor ") + _name_3);
        String _plus_1 = (_plus + "(");
        String _pin = sensor.getPin();
        String _calcPinNumber = this.calcPinNumber(_pin);
        String _plus_2 = (_plus_1 + _calcPinNumber);
        code = _plus_2;
      } else {
        EClass _eClass_3 = dev_4.eClass();
        String _name_4 = _eClass_3.getName();
        boolean _equals_3 = _name_4.equals("Actuator");
        if (_equals_3) {
          actuator = ((Actuator) dev_4);
          String _name_5 = actuator.getName();
          String _plus_3 = ((code + "Actuator ") + _name_5);
          String _plus_4 = (_plus_3 + "(");
          String _pin_1 = actuator.getPin();
          String _calcPinNumber_1 = this.calcPinNumber(_pin_1);
          String _plus_5 = (_plus_4 + _calcPinNumber_1);
          String _plus_6 = (_plus_5 + ");\n");
          code = _plus_6;
        }
      }
    }
    code = (code + "\n");
    code = (code + "void setup(){\n");
    code = (code + "\tSerial.begin(9600);\n");
    EList<Timer> _timers_1 = model.getTimers();
    for (final Timer dev_5 : _timers_1) {
      timer = ((Timer) dev_5);
    }
    int _timerSecs = timer.getTimerSecs();
    String _plus_7 = (((code + "\t") + "Alarm.timerOnce(") + Integer.valueOf(_timerSecs));
    String _plus_8 = (_plus_7 + ", ");
    EventHandler _eventHandler = timer.getEventHandler();
    String _plus_9 = (_plus_8 + _eventHandler);
    String _plus_10 = (_plus_9 + ")");
    code = _plus_10;
    code = (code + "}\n\n");
    code = (code + "void loop(){\n");
    EList<SensorListener> p = model.getSensorListeners();
    for (final SensorListener sens : p) {
      {
        Sensor _sensor = sens.getSensor();
        String _name_6 = _sensor.getName();
        String _plus_11 = ((code + "\tif(") + _name_6);
        String _plus_12 = (_plus_11 + ".readValue()");
        code = _plus_12;
        String _type = sens.getType();
        boolean _equals_4 = _type.equals("BETWEEN");
        if (_equals_4) {
          int _h = sens.getH();
          String _plus_13 = ((code + "<= ") + Integer.valueOf(_h));
          String _plus_14 = (_plus_13 + " && ");
          Sensor _sensor_1 = sens.getSensor();
          String _name_7 = _sensor_1.getName();
          String _plus_15 = (_plus_14 + _name_7);
          String _plus_16 = (_plus_15 + ">= ");
          int _l = sens.getL();
          String _plus_17 = (_plus_16 + Integer.valueOf(_l));
          String _plus_18 = (_plus_17 + "){\n");
          code = _plus_18;
        }
        EventHandler _eventHandler_1 = sens.getEventHandler();
        String _name_8 = _eventHandler_1.getName();
        String _plus_19 = ((code + "\t\t") + _name_8);
        String _plus_20 = (_plus_19 + "();\n");
        code = _plus_20;
        code = (code + "\t}\n");
      }
    }
    code = (code + "\tdelay(400);\n");
    code = (code + "}\n");
    String _name_6 = model.getName();
    util.genFile(_name_6, "h", code);
  }
  
  public String calcPinNumber(final String pin) {
    String p = null;
    char _charAt = pin.charAt(0);
    String _string = Character.valueOf(_charAt).toString();
    boolean _equals = _string.equals("A");
    if (_equals) {
      String _replace = pin.replace("A", "");
      p = _replace;
      int _parseInt = Integer.parseInt(p);
      int _plus = (_parseInt + 14);
      return ("" + Integer.valueOf(_plus));
    }
    return pin;
  }
}
