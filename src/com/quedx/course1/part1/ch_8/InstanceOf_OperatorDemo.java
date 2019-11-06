package com.quedx.course1.part1.ch_8;

public class InstanceOf_OperatorDemo {

	public static void op_instanceof() {

		//
		Object obj1 = new Object();

		if (obj1 instanceof Object) {
			System.out.println("obj1 is instance of Object");
		}
		if (obj1 instanceof String) {
			System.out.println("obj1 is instance of String");
		}

		//
		Object obj2 = new InstanceOf_OperatorDemo();
		if (obj2 instanceof Object) {
			System.out.println("obj2 is instance of Object");
		}
		if (obj2 instanceof InstanceOf_OperatorDemo) {
			System.out.println("obj2 is instance of OtherOperatorDemo");
		}
	}

	public static void main(String[] args) {
		InstanceOf_OperatorDemo.op_instanceof();

	}

}
