package applets;

import java.applet.Applet;
import java.awt.Graphics;

public class DetectionApplet extends Applet {
  @Override
  public void paint(Graphics g) {
    g.clearRect(0, 0, getWidth(), getHeight());
    g.drawString("Loading...", 10, 10);
  }

  public boolean areYouLoaded() {
    return true;
  }
}
