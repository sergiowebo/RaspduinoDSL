package es.usj.raspduino.validation;

import es.usj.raspduino.raspduinoDSL.AbstractDevice;
import es.usj.raspduino.raspduinoDSL.Actuator;
import es.usj.raspduino.raspduinoDSL.Model;
import es.usj.raspduino.raspduinoDSL.RaspduinoDSLPackage;
import es.usj.raspduino.raspduinoDSL.Sensor;
import es.usj.raspduino.validation.AbstractRaspduinoDSLValidator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class RaspduinoDSLValidator extends AbstractRaspduinoDSLValidator {
  public final static String INVALID_NAME = "invalidName";
  
  /**
   * Comprueba que los sensores y actuadores en Arduino:
   * 		 Entre 0 y 15 para pines digitales
   * 		 Entre A0 y A5 pines analogicos
   * 
   * Comprueba que los sensores y actuadores en Rapsberry Pi estan entre
   * 		 2 3 4 17 22 10 9 11 14 15 18 23 24 25 8 7
   */
  @Check
  public void checkArduinoSensorPinNumber(final Model model) {
    Sensor sensor = null;
    Actuator actuator = null;
    String _hardware = model.getHardware();
    boolean _equals = _hardware.equals("Arduino UNO");
    if (_equals) {
      EList<AbstractDevice> _devices = model.getDevices();
      for (final AbstractDevice dev : _devices) {
        EClass _eClass = dev.eClass();
        String _name = _eClass.getName();
        boolean _equals_1 = _name.equals("Sensor");
        if (_equals_1) {
          sensor = ((Sensor) dev);
          try {
            boolean _or = false;
            String _pin = sensor.getPin();
            int _parseInt = Integer.parseInt(_pin);
            boolean _greaterThan = (_parseInt > 14);
            if (_greaterThan) {
              _or = true;
            } else {
              String _pin_1 = sensor.getPin();
              int _parseInt_1 = Integer.parseInt(_pin_1);
              boolean _lessThan = (_parseInt_1 < 0);
              _or = _lessThan;
            }
            if (_or) {
              this.error("Pin digital debe de ser entre 0 y 14", dev, RaspduinoDSLPackage.Literals.ABSTRACT_DEVICE__PIN);
            }
          } catch (final Throwable _t) {
            if (_t instanceof NumberFormatException) {
              final NumberFormatException e = (NumberFormatException)_t;
              String _pin_2 = sensor.getPin();
              boolean _startsWith = _pin_2.startsWith("A");
              boolean _not = (!_startsWith);
              if (_not) {
                this.error("El pin debe empezar por A o numerico", dev, RaspduinoDSLPackage.Literals.ABSTRACT_DEVICE__PIN);
              } else {
                try {
                  String _pin_3 = sensor.getPin();
                  String _substring = _pin_3.substring(1);
                  int _parseInt_2 = Integer.parseInt(_substring);
                  boolean _greaterThan_1 = (_parseInt_2 > 5);
                  if (_greaterThan_1) {
                    this.error("Los pines analógicos entre A0 y A5 ", dev, RaspduinoDSLPackage.Literals.ABSTRACT_DEVICE__PIN);
                  }
                } catch (final Throwable _t_1) {
                  if (_t_1 instanceof NumberFormatException) {
                    final NumberFormatException en = (NumberFormatException)_t_1;
                    this.error("Pin incorrecto, prueba A0-A5 o numérico", dev, RaspduinoDSLPackage.Literals.ABSTRACT_DEVICE__PIN);
                  } else {
                    throw Exceptions.sneakyThrow(_t_1);
                  }
                }
              }
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
        } else {
          EClass _eClass_1 = dev.eClass();
          String _name_1 = _eClass_1.getName();
          boolean _equals_2 = _name_1.equals("Actuator");
          if (_equals_2) {
            actuator = ((Actuator) dev);
            try {
              boolean _or_1 = false;
              String _pin_4 = actuator.getPin();
              int _parseInt_3 = Integer.parseInt(_pin_4);
              boolean _greaterThan_2 = (_parseInt_3 > 14);
              if (_greaterThan_2) {
                _or_1 = true;
              } else {
                String _pin_5 = actuator.getPin();
                int _parseInt_4 = Integer.parseInt(_pin_5);
                boolean _lessThan_1 = (_parseInt_4 < 0);
                _or_1 = _lessThan_1;
              }
              if (_or_1) {
                this.error("Pin digital debe de ser entre 0 y 14", dev, RaspduinoDSLPackage.Literals.ABSTRACT_DEVICE__PIN);
              }
            } catch (final Throwable _t_2) {
              if (_t_2 instanceof NumberFormatException) {
                final NumberFormatException e_1 = (NumberFormatException)_t_2;
                String _pin_6 = actuator.getPin();
                boolean _startsWith_1 = _pin_6.startsWith("A");
                boolean _not_1 = (!_startsWith_1);
                if (_not_1) {
                  this.error("El pin debe empezar por A o numerico", dev, RaspduinoDSLPackage.Literals.ABSTRACT_DEVICE__PIN);
                } else {
                  try {
                    String _pin_7 = sensor.getPin();
                    String _substring_1 = _pin_7.substring(1);
                    int _parseInt_5 = Integer.parseInt(_substring_1);
                    boolean _greaterThan_3 = (_parseInt_5 > 5);
                    if (_greaterThan_3) {
                      this.error("Los pines analógicos entre A0 y A5 ", dev, RaspduinoDSLPackage.Literals.ABSTRACT_DEVICE__PIN);
                    }
                  } catch (final Throwable _t_3) {
                    if (_t_3 instanceof NumberFormatException) {
                      final NumberFormatException en_1 = (NumberFormatException)_t_3;
                      this.error("Pin incorrecto, prueba A0-A5 o numérico", dev, RaspduinoDSLPackage.Literals.ABSTRACT_DEVICE__PIN);
                    } else {
                      throw Exceptions.sneakyThrow(_t_3);
                    }
                  }
                }
              } else {
                throw Exceptions.sneakyThrow(_t_2);
              }
            }
          }
        }
      }
    }
  }
  
  @Check
  public void checkRaspberryPiPinNumber(final Model model) {
    Sensor sensor = null;
    Actuator actuator = null;
    String _hardware = model.getHardware();
    boolean _equals = _hardware.equals("Raspberry Pi");
    if (_equals) {
      EList<AbstractDevice> _devices = model.getDevices();
      for (final AbstractDevice dev : _devices) {
        EClass _eClass = dev.eClass();
        String _name = _eClass.getName();
        boolean _equals_1 = _name.equals("Sensor");
        if (_equals_1) {
          sensor = ((Sensor) dev);
          try {
            boolean _and = false;
            boolean _and_1 = false;
            boolean _and_2 = false;
            boolean _and_3 = false;
            boolean _and_4 = false;
            boolean _and_5 = false;
            boolean _and_6 = false;
            boolean _and_7 = false;
            boolean _and_8 = false;
            boolean _and_9 = false;
            boolean _and_10 = false;
            boolean _and_11 = false;
            boolean _and_12 = false;
            boolean _and_13 = false;
            boolean _and_14 = false;
            boolean _and_15 = false;
            String _pin = sensor.getPin();
            int _parseInt = Integer.parseInt(_pin);
            boolean _notEquals = (_parseInt != 2);
            if (!_notEquals) {
              _and_15 = false;
            } else {
              String _pin_1 = sensor.getPin();
              int _parseInt_1 = Integer.parseInt(_pin_1);
              boolean _notEquals_1 = (_parseInt_1 != 3);
              _and_15 = _notEquals_1;
            }
            if (!_and_15) {
              _and_14 = false;
            } else {
              String _pin_2 = sensor.getPin();
              int _parseInt_2 = Integer.parseInt(_pin_2);
              boolean _notEquals_2 = (_parseInt_2 != 4);
              _and_14 = _notEquals_2;
            }
            if (!_and_14) {
              _and_13 = false;
            } else {
              String _pin_3 = sensor.getPin();
              int _parseInt_3 = Integer.parseInt(_pin_3);
              boolean _notEquals_3 = (_parseInt_3 != 17);
              _and_13 = _notEquals_3;
            }
            if (!_and_13) {
              _and_12 = false;
            } else {
              String _pin_4 = sensor.getPin();
              int _parseInt_4 = Integer.parseInt(_pin_4);
              boolean _notEquals_4 = (_parseInt_4 != 27);
              _and_12 = _notEquals_4;
            }
            if (!_and_12) {
              _and_11 = false;
            } else {
              String _pin_5 = sensor.getPin();
              int _parseInt_5 = Integer.parseInt(_pin_5);
              boolean _notEquals_5 = (_parseInt_5 != 22);
              _and_11 = _notEquals_5;
            }
            if (!_and_11) {
              _and_10 = false;
            } else {
              String _pin_6 = sensor.getPin();
              int _parseInt_6 = Integer.parseInt(_pin_6);
              boolean _notEquals_6 = (_parseInt_6 != 10);
              _and_10 = _notEquals_6;
            }
            if (!_and_10) {
              _and_9 = false;
            } else {
              String _pin_7 = sensor.getPin();
              int _parseInt_7 = Integer.parseInt(_pin_7);
              boolean _notEquals_7 = (_parseInt_7 != 9);
              _and_9 = _notEquals_7;
            }
            if (!_and_9) {
              _and_8 = false;
            } else {
              String _pin_8 = sensor.getPin();
              int _parseInt_8 = Integer.parseInt(_pin_8);
              boolean _notEquals_8 = (_parseInt_8 != 11);
              _and_8 = _notEquals_8;
            }
            if (!_and_8) {
              _and_7 = false;
            } else {
              String _pin_9 = sensor.getPin();
              int _parseInt_9 = Integer.parseInt(_pin_9);
              boolean _notEquals_9 = (_parseInt_9 != 14);
              _and_7 = _notEquals_9;
            }
            if (!_and_7) {
              _and_6 = false;
            } else {
              String _pin_10 = sensor.getPin();
              int _parseInt_10 = Integer.parseInt(_pin_10);
              boolean _notEquals_10 = (_parseInt_10 != 15);
              _and_6 = _notEquals_10;
            }
            if (!_and_6) {
              _and_5 = false;
            } else {
              String _pin_11 = sensor.getPin();
              int _parseInt_11 = Integer.parseInt(_pin_11);
              boolean _notEquals_11 = (_parseInt_11 != 18);
              _and_5 = _notEquals_11;
            }
            if (!_and_5) {
              _and_4 = false;
            } else {
              String _pin_12 = sensor.getPin();
              int _parseInt_12 = Integer.parseInt(_pin_12);
              boolean _notEquals_12 = (_parseInt_12 != 23);
              _and_4 = _notEquals_12;
            }
            if (!_and_4) {
              _and_3 = false;
            } else {
              String _pin_13 = sensor.getPin();
              int _parseInt_13 = Integer.parseInt(_pin_13);
              boolean _notEquals_13 = (_parseInt_13 != 24);
              _and_3 = _notEquals_13;
            }
            if (!_and_3) {
              _and_2 = false;
            } else {
              String _pin_14 = sensor.getPin();
              int _parseInt_14 = Integer.parseInt(_pin_14);
              boolean _notEquals_14 = (_parseInt_14 != 25);
              _and_2 = _notEquals_14;
            }
            if (!_and_2) {
              _and_1 = false;
            } else {
              String _pin_15 = sensor.getPin();
              int _parseInt_15 = Integer.parseInt(_pin_15);
              boolean _notEquals_15 = (_parseInt_15 != 8);
              _and_1 = _notEquals_15;
            }
            if (!_and_1) {
              _and = false;
            } else {
              String _pin_16 = sensor.getPin();
              int _parseInt_16 = Integer.parseInt(_pin_16);
              boolean _notEquals_16 = (_parseInt_16 != 7);
              _and = _notEquals_16;
            }
            if (_and) {
              this.error("El valor de pin elegido no es correcto", dev, RaspduinoDSLPackage.Literals.ABSTRACT_DEVICE__PIN);
            }
          } catch (final Throwable _t) {
            if (_t instanceof NumberFormatException) {
              final NumberFormatException e = (NumberFormatException)_t;
              this.error("El valor pin debe ser numerico", dev, RaspduinoDSLPackage.Literals.ABSTRACT_DEVICE__PIN);
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
        } else {
          EClass _eClass_1 = dev.eClass();
          String _name_1 = _eClass_1.getName();
          boolean _equals_2 = _name_1.equals("Actuator");
          if (_equals_2) {
            actuator = ((Actuator) dev);
            try {
              boolean _and_16 = false;
              boolean _and_17 = false;
              boolean _and_18 = false;
              boolean _and_19 = false;
              boolean _and_20 = false;
              boolean _and_21 = false;
              boolean _and_22 = false;
              boolean _and_23 = false;
              boolean _and_24 = false;
              boolean _and_25 = false;
              boolean _and_26 = false;
              boolean _and_27 = false;
              boolean _and_28 = false;
              boolean _and_29 = false;
              boolean _and_30 = false;
              boolean _and_31 = false;
              String _pin_17 = actuator.getPin();
              int _parseInt_17 = Integer.parseInt(_pin_17);
              boolean _notEquals_17 = (_parseInt_17 != 2);
              if (!_notEquals_17) {
                _and_31 = false;
              } else {
                String _pin_18 = actuator.getPin();
                int _parseInt_18 = Integer.parseInt(_pin_18);
                boolean _notEquals_18 = (_parseInt_18 != 3);
                _and_31 = _notEquals_18;
              }
              if (!_and_31) {
                _and_30 = false;
              } else {
                String _pin_19 = actuator.getPin();
                int _parseInt_19 = Integer.parseInt(_pin_19);
                boolean _notEquals_19 = (_parseInt_19 != 4);
                _and_30 = _notEquals_19;
              }
              if (!_and_30) {
                _and_29 = false;
              } else {
                String _pin_20 = actuator.getPin();
                int _parseInt_20 = Integer.parseInt(_pin_20);
                boolean _notEquals_20 = (_parseInt_20 != 17);
                _and_29 = _notEquals_20;
              }
              if (!_and_29) {
                _and_28 = false;
              } else {
                String _pin_21 = actuator.getPin();
                int _parseInt_21 = Integer.parseInt(_pin_21);
                boolean _notEquals_21 = (_parseInt_21 != 27);
                _and_28 = _notEquals_21;
              }
              if (!_and_28) {
                _and_27 = false;
              } else {
                String _pin_22 = actuator.getPin();
                int _parseInt_22 = Integer.parseInt(_pin_22);
                boolean _notEquals_22 = (_parseInt_22 != 22);
                _and_27 = _notEquals_22;
              }
              if (!_and_27) {
                _and_26 = false;
              } else {
                String _pin_23 = actuator.getPin();
                int _parseInt_23 = Integer.parseInt(_pin_23);
                boolean _notEquals_23 = (_parseInt_23 != 10);
                _and_26 = _notEquals_23;
              }
              if (!_and_26) {
                _and_25 = false;
              } else {
                String _pin_24 = actuator.getPin();
                int _parseInt_24 = Integer.parseInt(_pin_24);
                boolean _notEquals_24 = (_parseInt_24 != 9);
                _and_25 = _notEquals_24;
              }
              if (!_and_25) {
                _and_24 = false;
              } else {
                String _pin_25 = actuator.getPin();
                int _parseInt_25 = Integer.parseInt(_pin_25);
                boolean _notEquals_25 = (_parseInt_25 != 11);
                _and_24 = _notEquals_25;
              }
              if (!_and_24) {
                _and_23 = false;
              } else {
                String _pin_26 = actuator.getPin();
                int _parseInt_26 = Integer.parseInt(_pin_26);
                boolean _notEquals_26 = (_parseInt_26 != 14);
                _and_23 = _notEquals_26;
              }
              if (!_and_23) {
                _and_22 = false;
              } else {
                String _pin_27 = actuator.getPin();
                int _parseInt_27 = Integer.parseInt(_pin_27);
                boolean _notEquals_27 = (_parseInt_27 != 15);
                _and_22 = _notEquals_27;
              }
              if (!_and_22) {
                _and_21 = false;
              } else {
                String _pin_28 = actuator.getPin();
                int _parseInt_28 = Integer.parseInt(_pin_28);
                boolean _notEquals_28 = (_parseInt_28 != 18);
                _and_21 = _notEquals_28;
              }
              if (!_and_21) {
                _and_20 = false;
              } else {
                String _pin_29 = actuator.getPin();
                int _parseInt_29 = Integer.parseInt(_pin_29);
                boolean _notEquals_29 = (_parseInt_29 != 23);
                _and_20 = _notEquals_29;
              }
              if (!_and_20) {
                _and_19 = false;
              } else {
                String _pin_30 = actuator.getPin();
                int _parseInt_30 = Integer.parseInt(_pin_30);
                boolean _notEquals_30 = (_parseInt_30 != 24);
                _and_19 = _notEquals_30;
              }
              if (!_and_19) {
                _and_18 = false;
              } else {
                String _pin_31 = actuator.getPin();
                int _parseInt_31 = Integer.parseInt(_pin_31);
                boolean _notEquals_31 = (_parseInt_31 != 25);
                _and_18 = _notEquals_31;
              }
              if (!_and_18) {
                _and_17 = false;
              } else {
                String _pin_32 = actuator.getPin();
                int _parseInt_32 = Integer.parseInt(_pin_32);
                boolean _notEquals_32 = (_parseInt_32 != 8);
                _and_17 = _notEquals_32;
              }
              if (!_and_17) {
                _and_16 = false;
              } else {
                String _pin_33 = actuator.getPin();
                int _parseInt_33 = Integer.parseInt(_pin_33);
                boolean _notEquals_33 = (_parseInt_33 != 7);
                _and_16 = _notEquals_33;
              }
              if (_and_16) {
                this.error("El valor de pin elegido no es correcto", dev, RaspduinoDSLPackage.Literals.ABSTRACT_DEVICE__PIN);
              }
            } catch (final Throwable _t_1) {
              if (_t_1 instanceof NumberFormatException) {
                final NumberFormatException e_1 = (NumberFormatException)_t_1;
                this.error("El valor pin debe ser numerico", dev, RaspduinoDSLPackage.Literals.ABSTRACT_DEVICE__PIN);
              } else {
                throw Exceptions.sneakyThrow(_t_1);
              }
            }
          }
        }
      }
    }
  }
}
