package applets;

import java.util.ArrayList;

public class AccessObject {
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