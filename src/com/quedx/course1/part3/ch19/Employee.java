package com.quedx.course1.part3.ch19;

public class Employee {

   private String name;
   private String address;
   private Integer employeeId;

   // Constructor
   public Employee(String name, String address, Integer employeeId) {
      super();
      this.name = name;
      this.address = address;
      this.employeeId = employeeId;
   }

   // Getters
   public String getName() {
      return name;
   }

   public String getAddress() {
      return address;
   }

   public Integer getEmployeeId() {
      return employeeId;
   }

   public void changeAddress(String newAddress) {
      System.out.println("Change of address from : " + this.address + " to " + newAddress);
      this.address = newAddress;
   }

   @Override
   public String toString() {
      StringBuilder builder = new StringBuilder();
      builder.append("Employee [name=");
      builder.append(name);
      builder.append(", address=");
      builder.append(address);
      builder.append(", employeeId=");
      builder.append(employeeId);
      builder.append("]");
      return builder.toString();
   }

}
