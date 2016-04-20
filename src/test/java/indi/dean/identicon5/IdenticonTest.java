package indi.dean.identicon5;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import indi.dean.identicon5.Identicon;

public class IdenticonTest {

  @Test
  public void test() {
    try {
      for (int i = 0; i < 100; i++) {
        Identicon.render("rcarlosdasilva@qq.com" + i, 100, "E:\\identicon\\" + i + ".png");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    assertTrue(true);
  }

}
