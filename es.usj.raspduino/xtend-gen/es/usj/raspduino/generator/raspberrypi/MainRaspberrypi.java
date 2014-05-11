package es.usj.raspduino.generator.raspberrypi;

import es.usj.raspduino.generator.Util;
import es.usj.raspduino.generator.raspberrypi.MainFileStructure;
import es.usj.raspduino.raspduinoDSL.Model;

@SuppressWarnings("all")
public class MainRaspberrypi {
  public void generateMainCode(final Model model, final Util util) {
    MainFileStructure _mainFileStructure = new MainFileStructure();
    _mainFileStructure.generateMainCode(model, util);
  }
}
