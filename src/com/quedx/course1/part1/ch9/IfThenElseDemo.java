package com.quedx.course1.part1.ch9;

import com.quedx.course1.part1.common.Util;

/*
 * 
 */
public class IfThenElseDemo {

	/**
	 * Check capacity
	 * 
	 * @param studentCount
	 */
	public static void checkCapacity(int studentCount) {

		Util.showLineSeparator();

		System.out.println("Registration received for " + studentCount + " students");

		System.out.println("Checking capacity ...");

		if (studentCount <= 30) {
			System.out.println("Under capacity...we can take a few more");
		} else if (studentCount > 30 && studentCount <= 40) {
			System.out.println("We have optimal students");
		} else {
			System.out.println("Over capacity... Please enroll in session");
		}

	}

	// main
	public static void main(String[] args) {

		checkCapacity(25);
		checkCapacity(35);
		checkCapacity(45);
	}

}
