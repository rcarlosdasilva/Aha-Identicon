package indi.dean.identicon5;

import java.awt.Color;

public class IdenticonData {

  private int size;
  private String hash;

  public IdenticonData(int size, String hash) {
    this.size = size;
    this.hash = hash;
  }

  public int getSize() {
    return this.size;
  }

  /*
   * 角的图案
   */
  public double[] getShapeOfCorner() {
    return IdenticonShape.get(IdenticonShape.CORNER, Integer.valueOf(hash.substring(0, 2), 16));
  }

  /*
   * 边的图案
   */
  public double[] getShapeOfSide() {
    return IdenticonShape.get(IdenticonShape.SIDE, Integer.valueOf(hash.substring(3, 5), 16));
  }

  /*
   * 中心的图案
   */
  public double[] getShapeOfCenter() {
    return IdenticonShape.get(IdenticonShape.CENTER, Integer.valueOf(hash.substring(6, 8), 16));
  }

  /**
   * 角的颜色
   */
  public Rgb getRgbOfCorner() {
    int colorCornerR = Integer.valueOf(hash.substring(10, 12), 16);
    int colorCornerG = Integer.valueOf(hash.substring(12, 14), 16);
    int colorCornerB = Integer.valueOf(hash.substring(14, 16), 16);
    return new Rgb(colorCornerR, colorCornerG, colorCornerB);
  }

  /**
   * 边的颜色
   */
  public Rgb getRgbOfSide() {
    int colorSideR = Integer.valueOf(hash.substring(18, 20), 16);
    int colorSideG = Integer.valueOf(hash.substring(20, 22), 16);
    int colorSideB = Integer.valueOf(hash.substring(22, 24), 16);
    return new Rgb(colorSideR, colorSideG, colorSideB);
  }

  /**
   * 中心的颜色
   */
  public Rgb getRgbOfCenter() {
    int colorCenterR = Integer.valueOf(hash.substring(26, 28), 16);
    int colorCenterG = Integer.valueOf(hash.substring(28, 30), 16);
    int colorCenterB = Integer.valueOf(hash.substring(30, 32), 16);
    return new Rgb(colorCenterR, colorCenterG, colorCenterB);
  }

  class Rgb {
    private int valueR;
    private int valueG;
    private int valueB;

    public Rgb(int valueR, int valueG, int valueB) {
      this.valueR = valueR;
      this.valueG = valueG;
      this.valueB = valueB;
    }

    public Color toColor() {
      return new Color(valueR, valueG, valueB);
    }

    public int getR() {
      return valueR;
    }

    public int getG() {
      return valueG;
    }

    public int getB() {
      return valueB;
    }

  }

}
