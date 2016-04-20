package indi.dean.identicon5;

import static org.junit.Assert.*;

import org.junit.Test;

import indi.dean.identicon5.MD5;

public class MD5Test {

  @Test
  public void test() {
    assertEquals(MD5.get("1"), "c4ca4238a0b923820dcc509a6f75849b");
    assertEquals(MD5.get("1", false), "C4CA4238A0B923820DCC509A6F75849B");
  }

}
