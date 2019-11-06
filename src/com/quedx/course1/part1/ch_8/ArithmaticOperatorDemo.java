package com.quedx.course1.part1.ch_8;

import com.quedx.course1.part1.common.Util;

public class ArithmaticOperatorDemo {

	public static void addInt(int num1, int num2) {

		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}

	public static void divideInt(int num1, int num2) {

		int result = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + result);
	}

	public static void divideDouble(double num1, double num2) {

		double result = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + result);
	}

	

	public static void divideDoubleWithRound(double num1, double num2) {

		double result = Util.roundTo2Decimals(num1 / num2);

		System.out.println(num1 + " / " + num2 + " = " + result);
	}

	public static void modulousInt(int num1, int num2) {

		double result = num1 % num2;
		System.out.println(num1 + " % " + num2 + " = " + result);
	}

	
	public static void modulousDouble(double num1, double num2) {

		double result = num1 % num2;
		System.out.println(num1 + " % " + num2 + " = " + result);
	}
	
	public static void preIncrementInt(int num) {

		int result = ++num;
		System.out.println("pre increment " + result);
	}
	
	public static void postIncrementInt(int num) {

		int result = num++;
		System.out.println("post increment " + result);
	}
	
	public static void preDecrementInt(int num) {

		int result = --num;
		System.out.println("pre decrement " + result);
	}
	
	public static void postDecrementInt(int num) {

		int result = num--;
		System.out.println("post decrement " + result);
	}
	
	// Main method
	public static void main(String[] args) {
		ArithmaticOperatorDemo.addInt(10, 2);
		
		ArithmaticOperatorDemo.divideInt(10, 2);
		ArithmaticOperatorDemo.divideInt(10, 3);
		
		ArithmaticOperatorDemo.divideDouble(10d, 3d);
		ArithmaticOperatorDemo.divideDoubleWithRound(10d, 3d);

		ArithmaticOperatorDemo.modulousInt(10, 2);
		ArithmaticOperatorDemo.modulousInt(10, 3);
		ArithmaticOperatorDemo.modulousDouble(10.1, 3);
		
		
		ArithmaticOperatorDemo.preIncrementInt(10);
		ArithmaticOperatorDemo.postIncrementInt(10);

		ArithmaticOperatorDemo.preDecrementInt(10);
		ArithmaticOperatorDemo.postDecrementInt(10);

	}

}
