package com.quedx.course1.part1.common;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CCHExceptionDemo {

   final static int MAX_ELEMENTS = 10;

   public static void testException(Map<Integer, String> map) {

      Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
      while (itr.hasNext()) {

         Map.Entry<Integer, String> element = itr.next();

         System.out.println(element.getKey() + " ==> " + element.getValue());
         map.put(1000, "1010");
         //map.remove(element.getKey());
      }

   }

   public static void testException2(Map<Integer, String> map) {

      Iterator<Integer> itr = map.keySet().iterator();
      while (itr.hasNext()) {

         Integer element = itr.next();

         System.out.println("key : " + element);
         
         map.remove(element);

      }

   }

   public static void main(String[] args) {
      HashMap<Integer, String> hm = new HashMap<Integer, String>();
      for (int i = 0; i < MAX_ELEMENTS; ++i) {
         hm.put(i, "v" + String.valueOf(i));
      }

      //CCHExceptionDemo.testException(hm);
      
      System.out.println("------------");
      
      Map<Integer, String> hm2 = new ConcurrentHashMap<Integer, String>();
      for (int i = 0; i < MAX_ELEMENTS; ++i) {
         hm2.put(i, "v" + String.valueOf(i));
      }
      
      System.out.println("size of hm2 : " + hm2.size());
      CCHExceptionDemo.testException(hm2);
      
   }

}
