package com.quedx.course1.part3.ch20;

import com.quedx.course1.part1.common.Util;

public class EmployeeDemo2 {

   public static void main(String[] args) {

      Util.showLineSeparator();
      Person obj1 = new Person("Tom", "100 Chuck Ln");
      System.out.println("obj1 : " + obj1);
      obj1.changeAddress("111 Chuck Ln");
      
      Util.showLineSeparator();
      obj1 = new Employee("John", "200 Main St", 101, 6);
      System.out.println("obj1 : " + obj1);
      obj1.changeAddress("222 Main St");
      

   }

}