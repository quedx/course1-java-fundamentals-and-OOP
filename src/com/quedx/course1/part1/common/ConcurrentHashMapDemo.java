package com.quedx.course1.part1.common;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConcurrentHashMapDemo {
   final static int MAX_ELEMENTS = 10;

   public static void testException(Map<Integer, String> map) {

      Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
      while (itr.hasNext()) {

         Map.Entry<Integer, String> element = itr.next();

         System.out.println(element.getKey() + " ==> " + element.getValue());
      }

   }

   public static void main(String[] args) {
      HashMap<Integer, String> hm = new HashMap<Integer, String>();
      for (int i=0; i< MAX_ELEMENTS; ++i) {
         hm.put(i, "v" + String.valueOf(i));
      }
      
      ConcurrentHashMapDemo.testException(hm);
   }

}
