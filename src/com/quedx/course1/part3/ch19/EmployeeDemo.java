package com.quedx.course1.part3.ch19;

import com.quedx.course1.part1.common.Util;

public class EmployeeDemo {
	
	public static void main(String[] args) {
	   Util.showLineSeparator();
		Employee e1 = new Employee("John", "100 Main St", 101);
		System.out.println("e1 : " + e1);
		
		Util.showLineSeparator();
      e1.changeAddress("20 Hillside ave");
      System.out.println("e1 : " + e1);
	}

}
