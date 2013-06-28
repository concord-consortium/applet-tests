package applets;

import java.applet.Applet;
import java.awt.Graphics;

public class PackagesTest extends Applet {
	private static final long serialVersionUID = 1L;

    @Override
	public void paint(Graphics g) {
		g.drawString("Packages Test Applet", 10, (getHeight()/2)+7);
	}

	public static int staticInteger = 3;
	public static int staticMethod(){
		return 4;
	}
}
