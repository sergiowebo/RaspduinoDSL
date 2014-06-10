package es.usj.raspduino.generator.raspberrypi;

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
    String codeEventHandlers = this.eventHandlers(model);
    String codeTimers = this.timers(model);
    String codeWhileFunction = this.whileFunction(model);
    code = ((((codeInclude + codeVarDeclarations) + codeEventHandlers) + codeTimers) + codeWhileFunction);
    String _name = model.getName();
    util.genFile(_name, "py", code);
  }
  
  public String includes(final Model model) {
    String code = "";
    boolean firstOccurrence = true;
    code = (code + "import RPi.GPIO as GPIO\n");
    code = (code + "import time\n");
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
        code = (code + "from Led import Led \n");
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
        code = (code + "from Sensor import Sensor \n");
        firstOccurrence = false;
      }
    }
    EList<Timer> _timers = model.getTimers();
    boolean _isEmpty = _timers.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      code = (code + "import schedule \n");
    }
    return code;
  }
  
  public String varDeclarations(final Model model) {
    String code = "";
    Sensor sensor = null;
    Actuator actuator = null;
    code = (code + "GPIO.setmode(GPIO.BCM) \n");
    code = (code + "\n");
    EList<AbstractDevice> _devices = model.getDevices();
    for (final AbstractDevice dev : _devices) {
      EClass _eClass = dev.eClass();
      String _name = _eClass.getName();
      boolean _equals = _name.equals("Sensor");
      if (_equals) {
        sensor = ((Sensor) dev);
        String _name_1 = sensor.getName();
        String _plus = (code + _name_1);
        String _plus_1 = (_plus + " = ");
        String _plus_2 = (_plus_1 + "Sensor(");
        String _pin = sensor.getPin();
        String _plus_3 = (_plus_2 + _pin);
        String _plus_4 = (_plus_3 + ")\n");
        code = _plus_4;
      } else {
        EClass _eClass_1 = dev.eClass();
        String _name_2 = _eClass_1.getName();
        boolean _equals_1 = _name_2.equals("Actuator");
        if (_equals_1) {
          actuator = ((Actuator) dev);
          String _name_3 = actuator.getName();
          String _plus_5 = (code + _name_3);
          String _plus_6 = (_plus_5 + " = ");
          String _plus_7 = (_plus_6 + "Led(");
          String _pin_1 = actuator.getPin();
          String _plus_8 = (_plus_7 + _pin_1);
          String _plus_9 = (_plus_8 + ")\n");
          code = _plus_9;
        }
      }
    }
    return code;
  }
  
  public String eventHandlers(final Model model) {
    String code = "";
    EList<EventHandler> eh = model.getEventHandlers();
    for (final EventHandler eventh : eh) {
      {
        code = (code + "\n");
        String _name = eventh.getName();
        String _plus = ((code + "def ") + _name);
        String _plus_1 = (_plus + "():\n");
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
              code = (code + ".on()\n");
            } else {
              String _actuatorState_1 = changeAct.getActuatorState();
              boolean _equals_1 = _actuatorState_1.equals("Off");
              if (_equals_1) {
                code = (code + ".off()\n");
              } else {
                String _actuatorState_2 = changeAct.getActuatorState();
                boolean _equals_2 = _actuatorState_2.equals("Toggle");
                if (_equals_2) {
                  code = (code + ".toggle()\n");
                }
              }
            }
          }
        }
        code = (code + "\n");
      }
    }
    return code;
  }
  
  public String timers(final Model model) {
    String code = "";
    Timer timer = null;
    EList<Timer> _timers = model.getTimers();
    for (final Timer dev : _timers) {
      EClass _eClass = dev.eClass();
      String _name = _eClass.getName();
      boolean _equals = _name.equals("Timer");
      if (_equals) {
        timer = ((Timer) dev);
        String _repeattype = timer.getRepeattype();
        boolean _equals_1 = _repeattype.equals("EVERY INTERVAL of");
        if (_equals_1) {
          int _secs = timer.getSecs();
          String _plus = ((code + "schedule.every(") + Integer.valueOf(_secs));
          String _plus_1 = (_plus + ").seconds.do(");
          EventHandler _eventHandler = timer.getEventHandler();
          String _name_1 = _eventHandler.getName();
          String _plus_2 = (_plus_1 + _name_1);
          String _plus_3 = (_plus_2 + ")\n");
          code = _plus_3;
        } else {
          String _repeattype_1 = timer.getRepeattype();
          boolean _equals_2 = _repeattype_1.equals("EVERY DAY at");
          if (_equals_2) {
            int _hours = timer.getHours();
            String _plus_4 = (((code + "\t") + "schedule.every().day.at(\"") + Integer.valueOf(_hours));
            String _plus_5 = (_plus_4 + ":");
            int _minutes = timer.getMinutes();
            String _plus_6 = (_plus_5 + Integer.valueOf(_minutes));
            String _plus_7 = (_plus_6 + "\").do( ");
            EventHandler _eventHandler_1 = timer.getEventHandler();
            String _name_2 = _eventHandler_1.getName();
            String _plus_8 = (_plus_7 + _name_2);
            String _plus_9 = (_plus_8 + ")\n");
            code = _plus_9;
          } else {
            String _repeattype_2 = timer.getRepeattype();
            boolean _equals_3 = _repeattype_2.equals("EVERY MONDAY at");
            if (_equals_3) {
              int _hours_1 = timer.getHours();
              String _plus_10 = (((code + "\t") + "schedule.every().monday.at(\"") + Integer.valueOf(_hours_1));
              String _plus_11 = (_plus_10 + ":");
              int _minutes_1 = timer.getMinutes();
              String _plus_12 = (_plus_11 + Integer.valueOf(_minutes_1));
              String _plus_13 = (_plus_12 + "\").do( ");
              EventHandler _eventHandler_2 = timer.getEventHandler();
              String _name_3 = _eventHandler_2.getName();
              String _plus_14 = (_plus_13 + _name_3);
              String _plus_15 = (_plus_14 + ")\n");
              code = _plus_15;
            } else {
              String _repeattype_3 = timer.getRepeattype();
              boolean _equals_4 = _repeattype_3.equals("EVERY TUESDAY at");
              if (_equals_4) {
                int _hours_2 = timer.getHours();
                String _plus_16 = (((code + "\t") + "schedule.every().tuesday.at(\"") + Integer.valueOf(_hours_2));
                String _plus_17 = (_plus_16 + ":");
                int _minutes_2 = timer.getMinutes();
                String _plus_18 = (_plus_17 + Integer.valueOf(_minutes_2));
                String _plus_19 = (_plus_18 + "\").do( ");
                EventHandler _eventHandler_3 = timer.getEventHandler();
                String _name_4 = _eventHandler_3.getName();
                String _plus_20 = (_plus_19 + _name_4);
                String _plus_21 = (_plus_20 + ")\n");
                code = _plus_21;
              } else {
                String _repeattype_4 = timer.getRepeattype();
                boolean _equals_5 = _repeattype_4.equals("EVERY WEDNESDAY at");
                if (_equals_5) {
                  int _hours_3 = timer.getHours();
                  String _plus_22 = (((code + "\t") + "schedule.every().wednesday.at(\"") + Integer.valueOf(_hours_3));
                  String _plus_23 = (_plus_22 + ":");
                  int _minutes_3 = timer.getMinutes();
                  String _plus_24 = (_plus_23 + Integer.valueOf(_minutes_3));
                  String _plus_25 = (_plus_24 + "\").do( ");
                  EventHandler _eventHandler_4 = timer.getEventHandler();
                  String _name_5 = _eventHandler_4.getName();
                  String _plus_26 = (_plus_25 + _name_5);
                  String _plus_27 = (_plus_26 + ")\n");
                  code = _plus_27;
                } else {
                  String _repeattype_5 = timer.getRepeattype();
                  boolean _equals_6 = _repeattype_5.equals("EVERY THURSDAY at");
                  if (_equals_6) {
                    int _hours_4 = timer.getHours();
                    String _plus_28 = (((code + "\t") + "schedule.every().thursday.at(\"") + Integer.valueOf(_hours_4));
                    String _plus_29 = (_plus_28 + ":");
                    int _minutes_4 = timer.getMinutes();
                    String _plus_30 = (_plus_29 + Integer.valueOf(_minutes_4));
                    String _plus_31 = (_plus_30 + "\").do( ");
                    EventHandler _eventHandler_5 = timer.getEventHandler();
                    String _name_6 = _eventHandler_5.getName();
                    String _plus_32 = (_plus_31 + _name_6);
                    String _plus_33 = (_plus_32 + ")\n");
                    code = _plus_33;
                  } else {
                    String _repeattype_6 = timer.getRepeattype();
                    boolean _equals_7 = _repeattype_6.equals("EVERY FRIDAY at");
                    if (_equals_7) {
                      int _hours_5 = timer.getHours();
                      String _plus_34 = (((code + "\t") + "schedule.every().friday.at(\"") + Integer.valueOf(_hours_5));
                      String _plus_35 = (_plus_34 + ":");
                      int _minutes_5 = timer.getMinutes();
                      String _plus_36 = (_plus_35 + Integer.valueOf(_minutes_5));
                      String _plus_37 = (_plus_36 + "\").do( ");
                      EventHandler _eventHandler_6 = timer.getEventHandler();
                      String _name_7 = _eventHandler_6.getName();
                      String _plus_38 = (_plus_37 + _name_7);
                      String _plus_39 = (_plus_38 + ")\n");
                      code = _plus_39;
                    } else {
                      String _repeattype_7 = timer.getRepeattype();
                      boolean _equals_8 = _repeattype_7.equals("EVERY SATURDAY at");
                      if (_equals_8) {
                        int _hours_6 = timer.getHours();
                        String _plus_40 = (((code + "\t") + "schedule.every().saturday.at(\"") + Integer.valueOf(_hours_6));
                        String _plus_41 = (_plus_40 + ":");
                        int _minutes_6 = timer.getMinutes();
                        String _plus_42 = (_plus_41 + Integer.valueOf(_minutes_6));
                        String _plus_43 = (_plus_42 + "\").do( ");
                        EventHandler _eventHandler_7 = timer.getEventHandler();
                        String _name_8 = _eventHandler_7.getName();
                        String _plus_44 = (_plus_43 + _name_8);
                        String _plus_45 = (_plus_44 + ")\n");
                        code = _plus_45;
                      } else {
                        String _repeattype_8 = timer.getRepeattype();
                        boolean _equals_9 = _repeattype_8.equals("EVERY SUNDAY at");
                        if (_equals_9) {
                          int _hours_7 = timer.getHours();
                          String _plus_46 = (((code + "\t") + "schedule.every().sunday.at(\"") + Integer.valueOf(_hours_7));
                          String _plus_47 = (_plus_46 + ":");
                          int _minutes_7 = timer.getMinutes();
                          String _plus_48 = (_plus_47 + Integer.valueOf(_minutes_7));
                          String _plus_49 = (_plus_48 + "\").do( ");
                          EventHandler _eventHandler_8 = timer.getEventHandler();
                          String _name_9 = _eventHandler_8.getName();
                          String _plus_50 = (_plus_49 + _name_9);
                          String _plus_51 = (_plus_50 + ")\n");
                          code = _plus_51;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return code;
  }
  
  public String whileFunction(final Model model) {
    String code = "";
    code = (code + "\n");
    code = (code + "try:\n");
    code = (code + "\twhile True:\n");
    EList<Timer> _timers = model.getTimers();
    boolean _isEmpty = _timers.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      code = (code + "\t\tschedule.run_pending()\n");
    }
    EList<SensorListener> p = model.getSensorListeners();
    for (final SensorListener sens : p) {
      {
        code = (code + "\t\tif(");
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
          String _plus_4 = (_plus_3 + " and ");
          Sensor _sensor_1 = sens.getSensor();
          String _name_1 = _sensor_1.getName();
          String _plus_5 = (_plus_4 + _name_1);
          String _plus_6 = (_plus_5 + ".readValue() ");
          String _plus_7 = (_plus_6 + ">= ");
          int _l = sens.getL();
          String _plus_8 = (_plus_7 + Integer.valueOf(_l));
          String _plus_9 = (_plus_8 + "):\n");
          code = _plus_9;
        } else {
          String _type_1 = sens.getType();
          boolean _equals_1 = _type_1.equals("ON");
          if (_equals_1) {
            Sensor _sensor_2 = sens.getSensor();
            String _name_2 = _sensor_2.getName();
            String _plus_10 = (code + _name_2);
            String _plus_11 = (_plus_10 + ".readValue() is False):\n");
            code = _plus_11;
          } else {
            String _type_2 = sens.getType();
            boolean _equals_2 = _type_2.equals("OFF");
            if (_equals_2) {
              Sensor _sensor_3 = sens.getSensor();
              String _name_3 = _sensor_3.getName();
              String _plus_12 = (code + _name_3);
              String _plus_13 = (_plus_12 + ".readValue() is True):\n");
              code = _plus_13;
            }
          }
        }
        EventHandler _eventHandler = sens.getEventHandler();
        String _name_4 = _eventHandler.getName();
        String _plus_14 = ((code + "\t\t\t") + _name_4);
        String _plus_15 = (_plus_14 + "()\n");
        code = _plus_15;
      }
    }
    code = (code + "\t\ttime.sleep(0.1)\n");
    code = (code + "except KeyboardInterrupt: \n");
    code = (code + "\tGPIO.cleanup()");
    return code;
  }
}
