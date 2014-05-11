package es.usj.raspduino.generator.arduino;

import es.usj.raspduino.generator.Util;
import es.usj.raspduino.generator.arduino.MainFileStructure;
import es.usj.raspduino.raspduinoDSL.Model;

@SuppressWarnings("all")
public class MainArduino {
  public void generateMainCode(final Model model, final Util util) {
    MainFileStructure _mainFileStructure = new MainFileStructure();
    _mainFileStructure.generateMainCode(model, util);
  }
}
