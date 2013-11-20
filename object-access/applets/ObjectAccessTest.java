package applets;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectAccessTest extends Applet {
  private AccessObject obj = new AccessObject();

  @Override
  public void paint(Graphics g) {
    g.drawString("Object Access Test", 10, 20);
  }

  public void canAccess() {}

  // Primitive returns
  public boolean booleanMethod() { return obj.booleanMethod(); }
  public char charMethod() { return obj.charMethod(); }
  public byte byteMethod() { return obj.byteMethod(); }
  public short shortMethod() { return obj.shortMethod(); }
  public int intMethod() { return obj.intMethod(); }
  public long longMethod() { return obj.longMethod(); }
  public float floatMethod() { return obj.floatMethod(); }
  public double doubleMethod() { return obj.doubleMethod(); }
  public String stringMethod() { return obj.stringMethod(); }

  // Object return
  public AccessObject objectMethod() { return new AccessObject(1); }

  // Collections
  public AccessObject[] objectArrayMethod() { return new AccessObject[] { new AccessObject(2), new AccessObject(3), new AccessObject(4) }; }
  public ArrayList<AccessObject> arrayListMethod() {
    ArrayList<AccessObject> list = new ArrayList<AccessObject>();
    for (int i = 5; i < 9; i++) {
      list.add(new AccessObject(i));
    }
    return list;
  }
}

class AccessObject {
  private int seed;
  private char[] chars = {'A','B','C','D','E','F'};

  public AccessObject() {
    this(0);
  }
  public AccessObject(int seed) {
    this.seed = seed;
  }

  public void canAccess() {}

  // Primitive returns
  public boolean booleanMethod() { return (seed % 2 == 0 ? false : true); }
  public char charMethod() { return chars[seed % chars.length]; }
  public byte byteMethod() { return (byte) (42 + seed); }
  public short shortMethod() { return (short) (32767 - seed); }
  public int intMethod() { return 0xBEA7B07 + seed; }
  public long longMethod() { return 0xDEADBEEFC0L + seed; }
  public float floatMethod() { return 7.12345f + seed; }
  public double doubleMethod() { return 98.76543321 + seed; }
  public String stringMethod() { return "Congrats! " + Integer.toString(seed); }
}