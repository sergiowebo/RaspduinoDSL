package es.usj.raspduino.generator.arduino;

import es.usj.raspduino.generator.Util;
import es.usj.raspduino.generator.arduino.ActuatorLibrary;
import es.usj.raspduino.generator.arduino.MainFileStructure;
import es.usj.raspduino.generator.arduino.SensorLibrary;
import es.usj.raspduino.generator.arduino.TimeAlarmsLibraries;
import es.usj.raspduino.raspduinoDSL.Model;

@SuppressWarnings("all")
public class MainArduino {
  public boolean generateMainCode(final Model model, final Util util) {
    boolean _xblockexpression = false;
    {
      MainFileStructure _mainFileStructure = new MainFileStructure();
      _mainFileStructure.generateMainCode(model, util);
      SensorLibrary _sensorLibrary = new SensorLibrary();
      _sensorLibrary.generateCode(model, util);
      ActuatorLibrary _actuatorLibrary = new ActuatorLibrary();
      _actuatorLibrary.generateCode(model, util);
      TimeAlarmsLibraries _timeAlarmsLibraries = new TimeAlarmsLibraries();
      _xblockexpression = _timeAlarmsLibraries.generateCode(model, util);
    }
    return _xblockexpression;
  }
}
