package indi.dean.identicon5;

import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Identicon {

  private static final String IDENTICON_IMAGE_FORMAT = "PNG";

  public static final void render(String mark, int size, String path) throws IOException {
    ImageIO.write(render(mark, size), IDENTICON_IMAGE_FORMAT, new File(path));
  }

  public static final RenderedImage render(String mark, int size) {
    return IdenticonRenderer.render(new IdenticonData(size, MD5.get(mark)));
  }

}
