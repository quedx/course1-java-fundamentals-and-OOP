package com.quedx.course1.part1.ch_8;

public class TernaryOperator {

	public static void findMax(int num1, int num2) {

		int result ; 
		
		result = num1 > num2? num1 : num2;
		
		System.out.println("max of (" + num1 + ", " + num2 + ") is " + result);
	}

	public static void main(String[] args) {
		TernaryOperator.findMax(10, 20);
		TernaryOperator.findMax(5, -1);
	}

}
