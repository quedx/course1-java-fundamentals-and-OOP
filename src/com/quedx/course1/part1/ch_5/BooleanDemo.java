package com.quedx.course1.part1.ch_5;


public class BooleanDemo {
	
	public static void main(String[] args) {

		boolean javaIsEasy = true;
		System.out.println(" java is Easy : " + javaIsEasy);
		
		// Compilation error : operator precedence
		//System.out.println(" 10 > 9 : " + 10 > 9);

		// Correct way
		System.out.println(" 10 > 9 : " + (10 > 9));

	}

}
