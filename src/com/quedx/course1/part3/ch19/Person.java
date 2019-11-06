package com.quedx.course1.part3.ch19;

public class Person {

   private String name;
   private String address;

   // Constructor
   public Person(String name, String address) {
      super();
      this.name = name;
      this.address = address;
   }
   
   // Getter
   public String getName() {
      return name;
   }

   public String getAddress() {
      return address;
   }

   // Setter
   public void changeAddress(String newAddress) {
      System.out.println("Change of address from : " + this.address + " to " + newAddress);
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
