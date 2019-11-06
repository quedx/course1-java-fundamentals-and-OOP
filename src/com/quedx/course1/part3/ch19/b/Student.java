package com.quedx.course1.part3.ch19.b;

public class Student extends Person {

   String college;
   Integer currentGrade;
   
   // Constructors
   public Student(String name, String address, String college, Integer currentGrade) {
      super(name, address);
      this.college = college;
      this.currentGrade = currentGrade;
   }

   public String getCollege() {
      return college;
   }

   public Integer getCurrentGrade() {
      return currentGrade;
   }

   @Override
   public String toString() {
      StringBuilder builder = new StringBuilder();
      builder.append("Student [college=");
      builder.append(college);
      builder.append(", currentGrade=");
      builder.append(currentGrade);
      builder.append(", name=");
      builder.append(name);
      builder.append(", address=");
      builder.append(address);
      builder.append("]");
      return builder.toString();
   }
   
   

}
