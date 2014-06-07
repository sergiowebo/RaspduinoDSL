package es.usj.raspduino.generator.arduino;

import es.usj.raspduino.generator.Util;
import es.usj.raspduino.generator.arduino.ActuatorLibrary;
import es.usj.raspduino.generator.arduino.MainFileStructure;
import es.usj.raspduino.generator.arduino.SensorLibrary;
import es.usj.raspduino.generator.arduino.TimeAlarmsLibraries;
import es.usj.raspduino.raspduinoDSL.AbstractDevice;
import es.usj.raspduino.raspduinoDSL.Model;
import es.usj.raspduino.raspduinoDSL.Timer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class MainArduino {
  public void generateMainCode(final Model model, final Util util) {
    MainFileStructure _mainFileStructure = new MainFileStructure();
    _mainFileStructure.generateMainCode(model, util);
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
        SensorLibrary _sensorLibrary = new SensorLibrary();
        _sensorLibrary.generateCode(model, util);
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
        boolean _equals_1 = _name_1.equals("Sensor");
        _and_1 = _equals_1;
      }
      if (_and_1) {
        ActuatorLibrary _actuatorLibrary = new ActuatorLibrary();
        _actuatorLibrary.generateCode(model, util);
        firstOccurrence = false;
      }
    }
    EList<Timer> _timers = model.getTimers();
    boolean _isEmpty = _timers.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      TimeAlarmsLibraries _timeAlarmsLibraries = new TimeAlarmsLibraries();
      _timeAlarmsLibraries.generateCode(model, util);
    }
  }
}
