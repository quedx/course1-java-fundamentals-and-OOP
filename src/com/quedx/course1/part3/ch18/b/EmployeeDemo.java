package com.quedx.course1.part3.ch18.b;

public class EmployeeDemo {

   public static void main(String[] args) {
      
      Client client = new Client();
      Employee e1 = new Employee(10, "John");
      e1.setDeptId(101);
      e1.setSalary(client, 100000);

      System.out.println("e1 : " + e1);
   }

}
