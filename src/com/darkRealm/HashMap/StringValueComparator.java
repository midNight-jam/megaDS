package com.darkRealm.HashMap;

import java.util.Comparator;
import java.util.HashMap;

/**
 * Created by Jayam on 11/15/2016.
 */
public class StringValueComparator implements Comparator<String> {
  HashMap<String, Integer> map = new HashMap<>();

  public StringValueComparator(HashMap<String, Integer> mapp) {
    this.map.putAll(mapp);
  }

  @Override
  public int compare(String s1, String s2) {
    return map.get(s1) >= map.get(s2) ? -1 : 1;
  }
}
