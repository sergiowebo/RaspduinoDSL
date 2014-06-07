package es.usj.raspduino.generator.arduino;

import es.usj.raspduino.generator.Util;
import es.usj.raspduino.raspduinoDSL.AbstractDevice;
import es.usj.raspduino.raspduinoDSL.Actuator;
import es.usj.raspduino.raspduinoDSL.ChangeActuator;
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
    String codeInclude = this.includes(model);
    String codeVarDeclarations = this.varDeclarations(model);
    String codeSetupFunction = this.setupFunction(model);
    String codeLoopFunction = this.loopFunction(model);
    String codeEventHandlers = this.eventHandlers(model);
    code = ((((codeInclude + codeVarDeclarations) + codeSetupFunction) + codeLoopFunction) + codeEventHandlers);
    String _name = model.getName();
    util.genFile(_name, "h", code);
  }
  
  public String includes(final Model model) {
    String code = "";
    boolean firstOccurrence = true;
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
    boolean _isEmpty = _eventHandlers.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      code = (code + "#include \"EventHandler.h\" \n");
    }
    EList<Timer> _timers = model.getTimers();
    boolean _isEmpty_1 = _timers.isEmpty();
    boolean _not_1 = (!_isEmpty_1);
    if (_not_1) {
      code = (code + "#include \"Time.h\" \n");
      code = (code + "#include \"TimeAlarms.h\" \n");
    }
    return code;
  }
  
  public String varDeclarations(final Model model) {
    String code = "";
    Sensor sensor = null;
    Actuator actuator = null;
    code = (code + "\n");
    EList<AbstractDevice> _devices = model.getDevices();
    for (final AbstractDevice dev : _devices) {
      EClass _eClass = dev.eClass();
      String _name = _eClass.getName();
      boolean _equals = _name.equals("Sensor");
      if (_equals) {
        sensor = ((Sensor) dev);
        String _name_1 = sensor.getName();
        String _plus = ((code + "Sensor ") + _name_1);
        String _plus_1 = (_plus + "(");
        String _pin = sensor.getPin();
        String _calcPinNumber = this.calcPinNumber(_pin);
        String _plus_2 = (_plus_1 + _calcPinNumber);
        String _plus_3 = (_plus_2 + ");\n");
        code = _plus_3;
      } else {
        EClass _eClass_1 = dev.eClass();
        String _name_2 = _eClass_1.getName();
        boolean _equals_1 = _name_2.equals("Actuator");
        if (_equals_1) {
          actuator = ((Actuator) dev);
          String _name_3 = actuator.getName();
          String _plus_4 = ((code + "Actuator ") + _name_3);
          String _plus_5 = (_plus_4 + "(");
          String _pin_1 = actuator.getPin();
          String _calcPinNumber_1 = this.calcPinNumber(_pin_1);
          String _plus_6 = (_plus_5 + _calcPinNumber_1);
          String _plus_7 = (_plus_6 + ");\n");
          code = _plus_7;
        }
      }
    }
    return code;
  }
  
  public String setupFunction(final Model model) {
    String code = "";
    Timer timer = null;
    code = (code + "\n");
    code = (code + "void setup(){\n");
    EList<Timer> _timers = model.getTimers();
    for (final Timer dev : _timers) {
      EClass _eClass = dev.eClass();
      String _name = _eClass.getName();
      boolean _equals = _name.equals("Timer");
      if (_equals) {
        timer = ((Timer) dev);
        String _repeattype = timer.getRepeattype();
        boolean _equals_1 = _repeattype.equals("EVERY");
        if (_equals_1) {
          int _timerSecs = timer.getTimerSecs();
          String _plus = (((code + "\t") + "Alarm.timerRepeat(") + Integer.valueOf(_timerSecs));
          String _plus_1 = (_plus + ", ");
          EventHandler _eventHandler = timer.getEventHandler();
          String _name_1 = _eventHandler.getName();
          String _plus_2 = (_plus_1 + _name_1);
          String _plus_3 = (_plus_2 + ");\n");
          code = _plus_3;
        } else {
          String _repeattype_1 = timer.getRepeattype();
          boolean _equals_2 = _repeattype_1.equals("ONCE");
          if (_equals_2) {
            int _timerSecs_1 = timer.getTimerSecs();
            String _plus_4 = (((code + "\t") + "Alarm.timerOnce(") + Integer.valueOf(_timerSecs_1));
            String _plus_5 = (_plus_4 + ", ");
            EventHandler _eventHandler_1 = timer.getEventHandler();
            String _name_2 = _eventHandler_1.getName();
            String _plus_6 = (_plus_5 + _name_2);
            String _plus_7 = (_plus_6 + ");\n");
            code = _plus_7;
          }
        }
      }
    }
    code = (code + "}\n");
    return code;
  }
  
  public String loopFunction(final Model model) {
    String code = "";
    code = (code + "\n");
    code = (code + "void loop(){\n");
    EList<SensorListener> p = model.getSensorListeners();
    for (final SensorListener sens : p) {
      {
        code = (code + "\tif(");
        String _type = sens.getType();
        boolean _equals = _type.equals("BETWEEN");
        if (_equals) {
          Sensor _sensor = sens.getSensor();
          String _name = _sensor.getName();
          String _plus = (code + _name);
          String _plus_1 = (_plus + ".readValue() ");
          String _plus_2 = (_plus_1 + "<= ");
          int _h = sens.getH();
          String _plus_3 = (_plus_2 + Integer.valueOf(_h));
          String _plus_4 = (_plus_3 + " && ");
          Sensor _sensor_1 = sens.getSensor();
          String _name_1 = _sensor_1.getName();
          String _plus_5 = (_plus_4 + _name_1);
          String _plus_6 = (_plus_5 + ".readValue() ");
          String _plus_7 = (_plus_6 + ">= ");
          int _l = sens.getL();
          String _plus_8 = (_plus_7 + Integer.valueOf(_l));
          String _plus_9 = (_plus_8 + "){\n");
          code = _plus_9;
        } else {
          String _type_1 = sens.getType();
          boolean _equals_1 = _type_1.equals("ON");
          if (_equals_1) {
            Sensor _sensor_2 = sens.getSensor();
            String _name_2 = _sensor_2.getName();
            String _plus_10 = (code + _name_2);
            String _plus_11 = (_plus_10 + ".readValue()){\n");
            code = _plus_11;
          } else {
            String _type_2 = sens.getType();
            boolean _equals_2 = _type_2.equals("OFF");
            if (_equals_2) {
              Sensor _sensor_3 = sens.getSensor();
              String _name_3 = _sensor_3.getName();
              String _plus_12 = ((code + "!") + _name_3);
              String _plus_13 = (_plus_12 + ".readValue()){\n");
              code = _plus_13;
            }
          }
        }
        EventHandler _eventHandler = sens.getEventHandler();
        String _name_4 = _eventHandler.getName();
        String _plus_14 = ((code + "\t\t") + _name_4);
        String _plus_15 = (_plus_14 + "();\n");
        code = _plus_15;
        code = (code + "\t}\n");
      }
    }
    EList<Timer> _timers = model.getTimers();
    boolean _isEmpty = _timers.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      code = (code + "\tAlarm.delay(400);\n");
    } else {
      code = (code + "\tdelay(400);\n");
    }
    code = (code + "}\n");
    return code;
  }
  
  public String eventHandlers(final Model model) {
    String code = "";
    EList<EventHandler> eh = model.getEventHandlers();
    for (final EventHandler eventh : eh) {
      {
        code = (code + "\n");
        String _name = eventh.getName();
        String _plus = ((code + "void ") + _name);
        String _plus_1 = (_plus + "(){\n");
        code = _plus_1;
        EList<ChangeActuator> _changeActuators = eventh.getChangeActuators();
        for (final ChangeActuator changeAct : _changeActuators) {
          {
            Actuator actuator = changeAct.getActuator();
            String _name_1 = actuator.getName();
            String _plus_2 = ((code + "\t") + _name_1);
            code = _plus_2;
            String _actuatorState = changeAct.getActuatorState();
            boolean _equals = _actuatorState.equals("On");
            if (_equals) {
              code = (code + ".On();\n");
            } else {
              String _actuatorState_1 = changeAct.getActuatorState();
              boolean _equals_1 = _actuatorState_1.equals("Off");
              if (_equals_1) {
                code = (code + ".Off();\n");
              } else {
                String _actuatorState_2 = changeAct.getActuatorState();
                boolean _equals_2 = _actuatorState_2.equals("Toggle");
                if (_equals_2) {
                  code = (code + ".Toggle();\n");
                }
              }
            }
          }
        }
        code = (code + "}\n");
      }
    }
    return code;
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
