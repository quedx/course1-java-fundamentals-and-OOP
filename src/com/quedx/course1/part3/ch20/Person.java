package com.quedx.course1.part3.ch20;

public class Person {

   protected String name;
   protected String address;

   public Person(String name, String address) {
      this.name = name;
      this.address = address;
   }

   // Getters
   public String getName() {
      return name;
   }

   public String getAddress() {
      return address;
   }

   public void changeAddress(String newAddress) {
      System.out.println("Address changed from " + this.address + " ===> " + newAddress);
      this.address = newAddress;
   }

   @Override
   public String toString() {
      StringBuilder builder = new StringBuilder();
      builder.append("Person [name=");
      builder.append(name);
      builder.append(", address=");
      builder.append(address);
      builder.append("]");
      return builder.toString();
   }
   
   

}
