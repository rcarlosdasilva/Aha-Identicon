package indi.dean.identicon5;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class IdenticonShape {

  public static final int CORNER = 0;
  public static final int SIDE = 1;
  public static final int CENTER = 2;

  private static final double[] RS0 = { 0, 0, 0.25, 1, 0.5, 0, 0.75, 1, 1, 0 };
  private static final double[] RS1 = { 0, 1, 0.25, 0, 0.5, 0.5, 0.75, 0, 1, 1 };
  private static final double[] RS2 = { 0.5, 0.5, 0, 0, 0.5, 0, 1, 0.5, 0.5, 0.5, 1, 1, 0.5, 1, 0, 0.5 };
  private static final double[] RS3 = { 1, 0, 0.5, 0, 0, 0.5, 0.5, 0.5 };
  private static final double[] RS4 = { 0, 1, 0.5, 1, 0, 0, 1, 0.5, 1, 0, 0, 0 };
  private static final double[] RS5 = { 1, 1, 1, 0, 0.5, 0 };
  private static final double[] RS6 = { 0.5, 0, 0, 0.5, 0.5, 0.5, 0, 1, 0.5, 1, 0.5, 0.5, 1, 0.5, 1, 0, 0.5, 0.5 };
  private static final double[] RS7 = { 0.5, 0.5, 1, 0.5, 0.5, 1, 0.5, 0, 1, 0, 0, 1, 0, 0, 0.5, 0, 0, 0.5, 0.5, 0.5 };
  private static final double[] RS8 = { 0.5, 0.5, 0, 0, 1, 0, 1, 1, 0.5, 0.5, 0, 0.5, 0.5, 1 };
  private static final double[] RS9 = { 0, 0, 1, 1, 0, 1 };

  private static final double[] RS10 = { 1, 0.5, 0.5, 0, 0, 0.5, 0, 0, 1, 0, 1, 1, 0.5, 1 };
  private static final double[] RS11 = { 1, 0.5, 0.5, 1, 0, 0.5, 0.5, 0, 1, 0.5, 1, 0, 0, 0, 0, 1, 1, 1 };
  private static final double[] RS12 = { 0, 0, 0, 0.5, 0.25, 0, 0.5, 1, 0.75, 0, 1, 0.5, 1, 0 };
  private static final double[] RS13 = { 0, 1, 0, 0, 0.25, 1, 0.5, 0, 0.75, 1, 1, 0, 1, 1 };
  private static final double[] RS14 = { 0, 1, 0, 0.5, 0.5, 0, 1, 0.5, 1, 1, 0.5, 0.5 };
  private static final double[] RS15 = { 0, 0, 0, 0.5, 0.5, 1, 1, 0.5, 1, 0 };
  private static final double[] RS16 = { 0, 0.5, 0.5, 1, 0.5, 0.5, 1, 0.5, 1, 0, 0.5, 0, 0.5, 0.5 };
  private static final double[] RS17 = { 0.5, 1, 0, 1, 0, 0.5, 0.5, 0.5 };
  private static final double[] RS18 = { 0, 0.25, 0.25, 1, 0.5, 0.5, 0.75, 1, 1, 0.25, 0.5, 0 };
  private static final double[] RS19 = { 0, 0, 0, 1, 1, 0, 1, 1 };

  private static final double[] RS20 = { 0.25, 0.5, 0.5, 0, 0.75, 0.5, 0.25, 0.5, 0, 0, 0, 1, 1, 1, 1, 0, 0.5, 1 };
  private static final double[] RS21 = { 0.5, 1, 0, 1, 0, 0, 0.5, 1, 0.5, 0, 1, 1 };
  private static final double[] RS22 = { 0, 0, 0, 1, 1, 1, 1, 0, 0.5, 1 };
  private static final double[] RS23 = { 0.25, 0, 0, 0.5, 0.5, 1, 0.75, 0.5 };
  private static final double[] RS24 = { 0.5, 0.5, 0.25, 0.25, 0.5, 0, 0.75, 0.25, 0.5, 0.5, 0.25, 0.75, 0.5, 1, 0.75, 0.75 };
  private static final double[] RS25 = { 0, 0, 0.5, 0, 1, 1, 0.25, 1, 0.75, 0.75 };
  private static final double[] RS26 = { 0, 0, 1, 0, 1, 1, 0.75, 0.25 };
  private static final double[] RS27 = { 0, 0, 1, 0.25, 0.25, 0.25, 0.25, 1 };
  private static final double[] RS28 = { 0.5, 0, 0.25, 0.5, 0.5, 1, 0.75, 0.5 };
  private static final double[] RS29 = { 0.5, 0.25, 0, 1, 1, 1 };

  private static final double[] RS30 = { 0, 0, 0, 1, 0.5, 1, 0, 0, 1, 0, 1, 1, 0.5, 0 };
  private static final double[] RS31 = { 0, 0.5, 0.25, 0.25, 0.5, 1, 0.75, 0.25, 1, 0.5 };
  private static final double[] RS32 = { 0.5, 0, 0, 0.5, 1, 0.5, 0.5, 0, 0.25, 1, 0.75, 1 };
  private static final double[] RS33 = { 0, 0, 1, 0, 0.5, 0.25, 0.25, 1, 0.75, 1, 0.5, 0.25 };
  private static final double[] RS34 = { 0.25, 0.25, 0.75, 0.25, 0.75, 0.75, 0.25, 0.75 };
  private static final double[] RS35 = { 0, 0.5, 1, 0.5, 0.5, 0, 0.5, 1 };
  private static final double[] RS36 = { 0.25, 1, 0.75, 1, 0.5, 0.5, 0, 0.5, 0.5, 0, 1, 0.5, 0.5, 0.5 };
  private static final double[] RS37 = { 0.5, 1, 0, 0.5, 0, 1, 1, 1, 0.5, 0.5 };
  private static final double[] RS38 = { 0.5, 1, 0.5, 0.5, 1, 0.5 };
  private static final double[] RS39 = { 0.5, 1, 1, 0.5, 0.5, 0, 0, 0.5 };

  private static final double[] RS40 = { 0.5, 1, 0, 1, 1, 0, 1, 0.5 };
  private static final double[] RS41 = { 0.5, 1, 0, 1, 0.25, 0.75, 0.25, 0.25, 0.75, 0.25, 1, 0, 1, 0.5 };
  private static final double[] RS42 = { 0.25, 0, 0.25, 1, 0, 1, 0, 0.5, 1, 0.5, 1, 1, 0.75, 1, 0.75, 0 };
  private static final double[] RS43 = { 0.5, 1, 0.25, 0.5, 0, 1, 1, 1, 0.75, 0.5 };
  private static final double[] RS44 = { 0.5, 1, 0.25, 0.5, 0, 1, 1, 1, 0.75, 0.5 };

  private static List<double[]> CORNER_SHAPES = new ArrayList<double[]>();

  private static final double[] SS0 = { 0, 0, 0.25, 1, 0.5, 0, 0.75, 1, 1, 0 };
  private static final double[] SS1 = { 0, 1, 0.25, 0, 0.5, 0.5, 0.75, 0, 1, 1 };
  private static final double[] SS2 = { 0.5, 0.5, 0, 0, 0.5, 0, 1, 0.5, 0.5, 0.5, 1, 1, 0.5, 1, 0, 0.5 };
  private static final double[] SS3 = { 1, 0, 0.5, 0, 0, 0.5, 0.5, 0.5 };
  private static final double[] SS4 = { 0, 1, 0.5, 1, 0, 0, 1, 0.5, 1, 0, 0, 0 };
  private static final double[] SS5 = { 1, 1, 1, 0, 0.5, 0 };
  private static final double[] SS6 = { 0.5, 0, 0, 0.5, 0.5, 0.5, 0, 1, 0.5, 1, 0.5, 0.5, 1, 0.5, 1, 0, 0.5, 0.5 };
  private static final double[] SS7 = { 0.5, 0.5, 1, 0.5, 0.5, 1, 0.5, 0, 1, 0, 0, 1, 0, 0, 0.5, 0, 0, 0.5, 0.5, 0.5 };
  private static final double[] SS8 = { 0.5, 0.5, 0, 0, 1, 0, 1, 1, 0.5, 0.5, 0, 0.5, 0.5, 1 };
  private static final double[] SS9 = { 0, 0, 1, 1, 0, 1 };

  private static final double[] SS10 = { 1, 0.5, 0.5, 0, 0, 0.5, 0, 0, 1, 0, 1, 1, 0.5, 1 };
  private static final double[] SS11 = { 1, 0.5, 0.5, 1, 0, 0.5, 0.5, 0, 1, 0.5, 1, 0, 0, 0, 0, 1, 1, 1 };
  private static final double[] SS12 = { 0, 0, 0, 0.5, 0.25, 0, 0.5, 1, 0.75, 0, 1, 0.5, 1, 0 };
  private static final double[] SS13 = { 0, 1, 0, 0, 0.25, 1, 0.5, 0, 0.75, 1, 1, 0, 1, 1 };
  private static final double[] SS14 = { 0, 1, 0, 0.5, 0.5, 0, 1, 0.5, 1, 1, 0.5, 0.5 };
  private static final double[] SS15 = { 0, 0, 0, 0.5, 0.5, 1, 1, 0.5, 1, 0 };
  private static final double[] SS16 = { 0, 0.5, 0.5, 1, 0.5, 0.5, 1, 0.5, 1, 0, 0.5, 0, 0.5, 0.5 };
  private static final double[] SS17 = { 0.5, 1, 0, 1, 0, 0.5, 0.5, 0.5 };
  private static final double[] SS18 = { 0, 0.25, 0.25, 1, 0.5, 0.5, 0.75, 1, 1, 0.25, 0.5, 0 };
  private static final double[] SS19 = { 0, 0, 0, 1, 1, 0, 1, 1 };

  private static final double[] SS20 = { 0.25, 0.5, 0.5, 0, 0.75, 0.5, 0.25, 0.5, 0, 0, 0, 1, 1, 1, 1, 0, 0.5, 1 };
  private static final double[] SS21 = { 0.5, 1, 0, 1, 0, 0, 0.5, 1, 0.5, 0, 1, 1 };
  private static final double[] SS22 = { 0, 0, 0, 1, 1, 1, 1, 0, 0.5, 1 };
  private static final double[] SS23 = { 0.25, 0, 0, 0.5, 0.5, 1, 0.75, 0.5 };
  private static final double[] SS24 = { 0.5, 0.5, 0.25, 0.25, 0.5, 0, 0.75, 0.25, 0.5, 0.5, 0.25, 0.75, 0.5, 1, 0.75, 0.75 };
  private static final double[] SS25 = { 0, 0, 0.5, 0, 1, 1, 0.25, 1, 0.75, 0.75 };
  private static final double[] SS26 = { 0, 0, 1, 0, 1, 1, 0.75, 0.25 };
  private static final double[] SS27 = { 0, 0, 1, 0.25, 0.25, 0.25, 0.25, 1 };
  private static final double[] SS28 = { 0.5, 0, 0.25, 0.5, 0.5, 1, 0.75, 0.5 };
  private static final double[] SS29 = { 0.5, 0.25, 0, 1, 1, 1 };

  private static final double[] SS30 = { 0, 0, 0, 1, 0.5, 1, 0, 0, 1, 0, 1, 1, 0.5, 0 };
  private static final double[] SS31 = { 0, 0.5, 0.25, 0.25, 0.5, 1, 0.75, 0.25, 1, 0.5 };
  private static final double[] SS32 = { 0.5, 0, 0, 0.5, 1, 0.5, 0.5, 0, 0.25, 1, 0.75, 1 };
  private static final double[] SS33 = { 0, 0, 1, 0, 0.5, 0.25, 0.25, 1, 0.75, 1, 0.5, 0.25 };
  private static final double[] SS34 = { 0.25, 0.25, 0.75, 0.25, 0.75, 0.75, 0.25, 0.75 };
  private static final double[] SS35 = { 0, 0.5, 1, 0.5, 0.5, 0, 0.5, 1 };
  private static final double[] SS36 = { 0.25, 1, 0.75, 1, 0.5, 0.5, 0, 0.5, 0.5, 0, 1, 0.5, 0.5, 0.5 };
  private static final double[] SS37 = { 0.5, 1, 0, 0.5, 0, 1, 1, 1, 0.5, 0.5 };
  private static final double[] SS38 = { 0.5, 1, 0.5, 0.5, 1, 0.5 };
  private static final double[] SS39 = { 0.5, 1, 1, 0.5, 0.5, 0, 0, 0.5 };

  private static final double[] SS40 = { 0.5, 1, 0, 1, 1, 0, 1, 0.5 };
  private static final double[] SS41 = { 0.5, 1, 0, 1, 0.25, 0.75, 0.25, 0.25, 0.75, 0.25, 1, 0, 1, 0.5 };
  private static final double[] SS42 = { 0.25, 0, 0.25, 1, 0, 1, 0, 0.5, 1, 0.5, 1, 1, 0.75, 1, 0.75, 0 };
  private static final double[] SS43 = { 0.5, 1, 0.25, 0.5, 0, 1, 1, 1, 0.75, 0.5 };
  private static final double[] SS44 = { 0.5, 1, 0.25, 0.5, 0, 1, 1, 1, 0.75, 0.5 };

  private static List<double[]> SIDE_SHAPES = new ArrayList<double[]>();

  private static final double[] CS0 = { 0.5, 0.25, 1, 0.5, 0.5, 0.75, 0, 0.5 };
  private static final double[] CS1 = { 0.5, 1, 1, 0.5, 0.5, 0, 0, 0.5 };
  private static final double[] CS2 = { 0, 0, 1, 0, 1, 1, 0, 1 };
  private static final double[] CS3 = { 0.5, 0.5, 0.25, 0, 0.75, 0, 0.25, 1, 0.75, 1, 0.5, 0.5, 0, 0.25, 0, 0.75, 1, 0.25, 1, 0.75 };
  private static final double[] CS4 = { 0, 0 };
  private static final double[] CS5 = { 0, 0, 0, 0.25, 1, 0.25, 1, 0, 0.75, 0, 0.75, 1, 1, 1, 1, 0.75, 0, 0.75, 0, 1, 0.25, 1, 0.25, 0 };
  private static final double[] CS6 = { 0.25, 0.5, 0, 0, 0.5, 0.25, 1, 0, 0.75, 0.5, 1, 1, 0.5, 0.75, 0, 1 };
  private static final double[] CS7 = { 0, 0, 0, 1, 1, 0, 1, 1 };
  private static final double[] CS8 = { 0.25, 0.25, 0.75, 0.25, 0.75, 0.75, 0.25, 0.75 };
  private static final double[] CS9 = { 0.5, 0.25, 0.25, 0, 0, 0.25, 0.5, 0.75, 0.25, 1, 0, 0.75, 0.75, 0, 1, 0.25, 0.5, 0.75, 0.75, 1, 1, 0.75 };

  private static List<double[]> CENTER_SHAPES = new ArrayList<double[]>();

  static {
    Field[] fs = IdenticonShape.class.getDeclaredFields();
    try {
      for (Field f : fs) {
        if (f.getName().startsWith("RS")) {
          CORNER_SHAPES.add((double[]) f.get(null));
        } else if (f.getName().startsWith("SS")) {
          SIDE_SHAPES.add((double[]) f.get(null));
        } else if (f.getName().startsWith("CS")) {
          CENTER_SHAPES.add((double[]) f.get(null));
        }
      }
    } catch (Exception e) {

    }
  }

  /**
   * 获取图形描述
   * 
   * @param position
   *          图形位置 IdenticonShape[CORNER,SIDE,CENTER]
   * @param code
   *          图形代码 < 256
   * @return
   */
  public static final double[] get(int position, int code) {
    if (position == CORNER) {
      return CORNER_SHAPES.get(code % CORNER_SHAPES.size());
      // return CORNER_SHAPES.get(CORNER_SHAPES.size() - 1);
    } else if (position == SIDE) {
      return SIDE_SHAPES.get(code % SIDE_SHAPES.size());
    } else if (position == CENTER) {
      return CENTER_SHAPES.get(code % CENTER_SHAPES.size());
    }
    return null;
  }

}
