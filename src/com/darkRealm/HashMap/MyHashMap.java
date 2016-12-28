package com.darkRealm.HashMap;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * Created by Jayam on 11/15/2016.
 */
public class MyHashMap {

  public static void doSortByValues(HashMap<String,Integer> map){
    StringValueComparator svMap = new StringValueComparator(map);
    TreeMap <String,Integer> sortedMapByValues = new TreeMap<>(svMap);
    System.out.println(sortedMapByValues);
  }
}
