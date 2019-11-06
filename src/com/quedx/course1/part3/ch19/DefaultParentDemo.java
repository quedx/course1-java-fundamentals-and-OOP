package com.quedx.course1.part3.ch19;

public class DefaultParentDemo {

   public static void main(String[] args) {

      Person p1 = new Person("John", "100 Main St");

      if (p1 instanceof Object) {
         System.out.println("p1 is instance of Object");
      } else {
         System.out.println("p1 is not an instance of Object");
      }
      
      if (p1 instanceof Person) {
         System.out.println("p1 is instance of Person");
      } else {
         System.out.println("p1 is not an instance of Person");
      }

   }

}
