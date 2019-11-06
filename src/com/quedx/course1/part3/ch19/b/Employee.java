package com.quedx.course1.part3.ch19.b;

public class Employee extends Person {

   public static final String officeAddress = "200 Herndon Drive";
   public static Integer MAX_ALLOWED_COMMUTE = 10;

   Integer employeeId;

   public Employee(String name, String address, Integer employeeId) {
      super(name, address);
      this.employeeId = employeeId;
   }

   public void changeAddress(String newAddress) {
      if (distanceBetween(newAddress, officeAddress) <= MAX_ALLOWED_COMMUTE) {
         System.out.println("Change of address approved!");
         super.changeAddress(newAddress);
      } else {
         System.out.println("Change of address not approved! Please consider nearby address");

      }
   }

   // Mocked method to compute distance
   private Integer distanceBetween(String newAddress, String officeaddress2) {
      return 9;
   }

   @Override
   public String toString() {
      StringBuilder builder = new StringBuilder();
      builder.append("Employee [employeeId=");
      builder.append(employeeId);
      builder.append(", name=");
      builder.append(name);
      builder.append(", address=");
      builder.append(address);
      builder.append("]");
      return builder.toString();
   }

}
