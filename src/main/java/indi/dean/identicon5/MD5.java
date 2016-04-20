package indi.dean.identicon5;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {

  private static final String ALGORITHM = "MD5";
  private static final String DEFAULT_CHARSET = "UTF-8";

  private static final char[] DIGITS_LOWER = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd',
      'e', 'f' };
  private static final char[] DIGITS_UPPER = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D',
      'E', 'F' };

  private static MessageDigest md = null;

  static {
    try {
      md = MessageDigest.getInstance(ALGORITHM);
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    }
  }

  /**
   * 默认小写
   * @param original
   * @return
   */
  public static String get(final String original) {
    return get(original, true);
  }

  /**
   * 指定大小写
   * @param original
   * @param toLower
   * @return
   */
  public static String get(final String original, final boolean toLower) {
    if (original == null)
      return null;

    Charset charset = Charset.forName(DEFAULT_CHARSET);
    byte[] bytes = original.getBytes(charset);

    return new String(encodeHex(md.digest(bytes), toLower ? DIGITS_LOWER : DIGITS_UPPER));
  }

  private static char[] encodeHex(final byte[] data, final char[] toDigits) {
    final int l = data.length;
    final char[] out = new char[l << 1];

    for (int i = 0, j = 0; i < l; i++) {
      out[j++] = toDigits[(0xF0 & data[i]) >>> 4];
      out[j++] = toDigits[0x0F & data[i]];
    }
    return out;
  }

}
