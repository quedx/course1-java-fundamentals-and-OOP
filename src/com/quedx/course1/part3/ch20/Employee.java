package com.quedx.course1.part3.ch20;

public class Employee extends Person {

   public static final String officeAddress = "200 Herndon Drive";
   public static Integer MAX_ALLOWED_COMMUTE = 10;

   Integer employeeId;
   Integer level;

   public Employee(String name, String address, Integer employeeId) {
      super(name, address);
      this.employeeId = employeeId;
      this.level = 1;
   }

   public Employee(String name, String address, Integer employeeId, Integer level) {
      super(name, address);
      this.employeeId = employeeId;
      this.level = level;
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

   public void promote(int toLevel) {
      if (toLevel > this.level) {
         System.out.println("Congratulation, you got promoted to level : " + toLevel);
         this.level = toLevel;
      } else {
         System.out.println("You remain at level : " + toLevel);
      }
   }

   public void promote() {
      this.promote(this.level + 1);
   }

   @Override
   public String toString() {
      StringBuilder builder = new StringBuilder();
      builder.append("Employee [employeeId=");
      builder.append(employeeId);
      builder.append(", level=");
      builder.append(level);
      builder.append(", name=");
      builder.append(name);
      builder.append(", address=");
      builder.append(address);
      builder.append("]");
      return builder.toString();
   }



}
