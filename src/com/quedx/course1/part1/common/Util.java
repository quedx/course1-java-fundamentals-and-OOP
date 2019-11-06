package com.quedx.course1.part1.common;

/*
 * Expression Rule Demo
 */
public class Util {

	
	/**
	 * Prints the message and datatype to console
	 * @param message
	 * @param t
	 */
	public static <T> void show(String message, T t) {
		System.out.println(message + t);
	}
	
	/**
	 * Random number between min and max.
	 * @param min
	 * @param max
	 * @return Random number between min and max.
	 */
	public static int getRandomBetween(int min, int max) {
		int diff = max - min;
		return (int) (Math.random() * diff) + min;
	}

	/**
	 * Prints the array to console
	 * @param varname
	 * @param array1
	 */
	public static void showArray(String varname, int[] array1) {
		
		System.out.println("---- Elements of " + varname + " -----");
		
		// Length gives the number of elements in the array
		System.out.println(varname + " contains " + array1.length + " elements");
		int i = 0;
		for(int elem: array1) {
			System.out.println("  [" + i++ + "] = " + elem);
		}
	}
	
	/**
	 * Round to 2 decimal places
	 * @param value
	 * @return
	 */
	public static double roundTo2Decimals(double value) {
		
		// Math.round will round to long
		long result = Math.round(value * 100);

		// Divide it by 100
		return result / 100d;

	}

	/**
	 * Prints line separator to console
	 */
	public static void showLineSeparator() {
		System.out.println("-----------------------------");
		
	}
	
	/**
	 * Calculates mantissa^exponent
	 * @param mantissa
	 * @param exponent
	 * @return
	 */
	public static double power(int mantissa, int exponent) {
		
		return Math.pow(mantissa, exponent);
	}

}
