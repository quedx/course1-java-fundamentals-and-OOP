package com.quedx.course1.part3.ch20;

import com.quedx.course1.part1.common.Util;

public class EmployeeDemo {

   public static void main(String[] args) {

      Util.showLineSeparator();
      Employee obj1 = new Employee("Tom", "100 Chuck Ln", 201, 5);
      System.out.println("obj1 : " + obj1);
      obj1.promote();
      
      Util.showLineSeparator();
      obj1 = new Employee("John", "100 Main St", 101, 6);
      System.out.println("obj1 : " + obj1);
      obj1.promote(8);
      

   }

}