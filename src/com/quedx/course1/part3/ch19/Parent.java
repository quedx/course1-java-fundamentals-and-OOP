package com.quedx.course1.part3.ch19;

public class Parent {
	
   protected int counter = 0;

   // Default constructor
   public Parent() {
      System.out.println("Parent()");
   }
   
   // Another constructor
   public Parent(int counter) {
      System.out.println("Parent(int)");
      this.counter = counter;
   }
   
   
}
