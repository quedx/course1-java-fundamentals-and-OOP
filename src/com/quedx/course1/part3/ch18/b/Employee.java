package com.quedx.course1.part3.ch18.b;

public class Employee {

   // All data members private
   private Integer id;
   private String firstName;
   private Integer deptId;
   private double salary;

   
   // Constructor
   public Employee(Integer id, String name) {
      super();
      this.id = id;
      this.firstName = name;
   }
   
   // Setter
   public void setDeptId(Integer deptId) {
      this.deptId = deptId;
   }

   public void setSalary(Client client, double salary) {
      if (client.isAllowed())
         this.salary = salary;

   }
   
   // Getter methods
   public Integer getId() {
      return id;
   }

   public String getName() {
      return firstName;
   }

   public Integer getDeptId() {
      return deptId;
   }

   // Controlled access 
   public double getSalary(Client client) {
      if (client.isAllowed()) {
         return salary;
      } else {
         return -1;
      }

   }

   @Override
   public String toString() {
      StringBuilder builder = new StringBuilder();
      builder.append("Employee [id=");
      builder.append(id);
      builder.append(", name=");
      builder.append(firstName);
      builder.append(", deptId=");
      builder.append(deptId);
      builder.append(", salary=");
      builder.append(salary);
      builder.append("]");
      return builder.toString();
   }

}
