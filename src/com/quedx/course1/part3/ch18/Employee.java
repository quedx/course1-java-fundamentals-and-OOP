package com.quedx.course1.part3.ch18;

public class Employee {

   public Integer id;
   public String name;
   public Integer deptId;
   public double salary;

   @Override
   public String toString() {
      StringBuilder builder = new StringBuilder();
      builder.append("Employee [id=");
      builder.append(id);
      builder.append(", name=");
      builder.append(name);
      builder.append(", deptId=");
      builder.append(deptId);
      builder.append(", salary=");
      builder.append(salary);
      builder.append("]");
      return builder.toString();
   }

}
