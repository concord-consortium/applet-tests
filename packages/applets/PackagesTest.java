package applets;

import java.applet.Applet;
import java.awt.Graphics;

public class PackagesTest extends Applet {
  @Override
  public void paint(Graphics g) {
    g.drawString("Packages Test Applet", 10, 10);
  }

  public static int staticInteger = 3;
  public static int staticMethod(){
    return 4;
  }
}
