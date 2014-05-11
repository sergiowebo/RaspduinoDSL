package es.usj.raspduino.generator.raspberrypi;

import es.usj.raspduino.generator.Util;
import es.usj.raspduino.raspduinoDSL.Model;

@SuppressWarnings("all")
public class MainFileStructure {
  public void generateMainCode(final Model model, final Util util) {
    String code = "";
    String _name = model.getName();
    util.genFile(_name, "py", code);
  }
}
