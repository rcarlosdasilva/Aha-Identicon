package indi.dean.identicon5;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;

import indi.dean.identicon5.IdenticonData.Rgb;

public class IdenticonRenderer {

  private static final Color BG_COLOR = new Color(255, 255, 255);

  private static final int ZERO = 0;
  private static final int DEF_PATCH_SIZE = 40;
  private static final int DEF_PATCH_HALFSIZE = DEF_PATCH_SIZE / 2;
  private static final int DEF_SIZE = DEF_PATCH_SIZE * 3;

  public static final RenderedImage render(IdenticonData data) {
    BufferedImage image = new BufferedImage(DEF_SIZE, DEF_SIZE, BufferedImage.TYPE_INT_RGB);
    Graphics2D g = image.createGraphics();

    g.setBackground(BG_COLOR);
    g.clearRect(0, 0, DEF_SIZE, DEF_SIZE);

    double[] shapeOfCorner = data.getShapeOfCorner();
    Rgb rgbOfCorner = data.getRgbOfCorner();
    draw(g, shapeOfCorner, rgbOfCorner, 0, ZERO, ZERO);
    draw(g, shapeOfCorner, rgbOfCorner, 1, DEF_PATCH_SIZE * 2, ZERO);
    draw(g, shapeOfCorner, rgbOfCorner, 2, DEF_PATCH_SIZE * 2, DEF_PATCH_SIZE * 2);
    draw(g, shapeOfCorner, rgbOfCorner, 3, ZERO, DEF_PATCH_SIZE * 2);

    double[] shapeOfSide = data.getShapeOfSide();
    Rgb rgbOfSide = data.getRgbOfSide();
    draw(g, shapeOfSide, rgbOfSide, 0, DEF_PATCH_SIZE, ZERO);
    draw(g, shapeOfSide, rgbOfSide, 1, DEF_PATCH_SIZE * 2, DEF_PATCH_SIZE);
    draw(g, shapeOfSide, rgbOfSide, 2, DEF_PATCH_SIZE, DEF_PATCH_SIZE * 2);
    draw(g, shapeOfSide, rgbOfSide, 3, ZERO, DEF_PATCH_SIZE);

    double[] shapeOfCenter = data.getShapeOfCenter();
    draw(g, shapeOfCenter, data.getRgbOfCenter(), 0, DEF_PATCH_SIZE, DEF_PATCH_SIZE);

    g.dispose();

    BufferedImage zoomed = new BufferedImage(data.getSize(), data.getSize(), BufferedImage.TYPE_INT_RGB);
    g = zoomed.createGraphics();
    g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
    g.drawImage(image, 0, 0, data.getSize(), data.getSize(), null);
    g.dispose();

    return zoomed;
  }

  private static final void draw(Graphics2D g, double[] shape, Rgb rgb, int turn, double x, double y) {
    AffineTransform saved = g.getTransform();
    g.translate(x, y);
    g.rotate(Math.toRadians(turn * 90), DEF_PATCH_HALFSIZE, DEF_PATCH_HALFSIZE);
    g.setColor(rgb.toColor());
    g.fill(turn2polygon(shape));
    g.setTransform(saved);
  }

  private static final Polygon turn2polygon(double[] shape) {
    Polygon polygon = new Polygon();

    for (int i = 0; i < shape.length;) {
      polygon.addPoint((int) (shape[i++] * DEF_PATCH_SIZE), (int) (shape[i++] * DEF_PATCH_SIZE));
    }

    return polygon;
  }

}
