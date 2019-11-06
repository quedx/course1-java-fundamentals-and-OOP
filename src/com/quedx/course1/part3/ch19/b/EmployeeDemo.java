package com.quedx.course1.part3.ch19.b;

import com.quedx.course1.part1.common.Util;

public class EmployeeDemo {

   public static void main(String[] args) {

      Util.showLineSeparator();

      Person obj1 = new Person("Tom", "100 Chuck Ln");
      System.out.println("obj1 : " + obj1);

      obj1.changeAddress("2005 Super Circle");
      System.out.println("obj1 " + obj1);

      Util.showLineSeparator();
      obj1 = new Employee("John", "100 Main St", 101);
      System.out.println("obj1 : " + obj1);

      obj1.changeAddress("20 Hillside ave");
      System.out.println("obj1 " + obj1);

   }

}