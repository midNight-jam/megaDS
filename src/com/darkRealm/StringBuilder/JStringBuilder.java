package com.darkRealm.StringBuilder;

import java.util.Arrays;

/**
 * Created by Jayam on 10/2/2016.
 */
public class JStringBuilder implements IStringBuilder {
  private char[] content;
  private int size;

  public JStringBuilder() {
    content = new char[]{};
    size = 0;
  }


  @Override
  public void append(String src) {
    if (size == 0) {
      content = new char[size + src.length()];
//      System.arraycopy(src, 0, content, 0, src.length());
      Arrays.copyOf(content, src.length());
      for (int i = 0; i < src.length(); i++) {
        content[i] = src.charAt(i);
      }
      size += src.length();
      return;
    }

    content = Arrays.copyOf(content, content.length + src.length());
    for (int i = 0; i < src.length(); i++) {
      content[i + size ] = src.charAt(i);
    }
    size += src.length();
  }

  @Override
  public String toString() {
    return content.toString();
  }
}