package com.quedx.course1.part1.ch9;

import com.quedx.course1.part1.common.Util;

public class ForLoopDemo {

	/**
	 * Print numbers between specified range
	 * 
	 * @param start
	 * @param end
	 */
	public static void printNumbers(int start, int end) {
		Util.showLineSeparator();
		for (int i = start; i <= end; ++i) {
			System.out.println(" i = " + i);
		}
	}


	/**
	 * Print numbers between specified range
	 * 
	 * @param start
	 * @param end
	 */
	public static void printNumbersWithLimit(int start, int end, int limit) {
		Util.showLineSeparator();
		int printed = 0;
		for (int i = start; i <= end; ++i) {
			
			System.out.println(" i = " + i);
			printed++;
			
			if (printed == limit) {
				break;
			}
		}
	}


	
	/**
	 * Print numbers between specified range
	 * 
	 * @param start
	 * @param end
	 */
	public static void printNumbersSkipDivBy(int start, int end, int divBy) {
		Util.showLineSeparator();
		for (int i = start; i <= end; ++i) {
			
			if (i% divBy == 0) {
				continue;
			}
			System.out.println(" i = " + i);
			
			
		}
	}
	
	/**
	 * Print numbers between specified range
	 * 
	 * @param start
	 * @param end
	 */
	public static void printNumbers2(int start, int end) {
		Util.showLineSeparator();
		int i = start;
		for (; i <= end; ) {
			System.out.println(" i = " + i);
			++i;
		}
	}

	


	
	// main
	public static void main(String[] args) {
		
		//printNumbers2(1, 5);
		//printNumbersSkipDivBy(1, 10, 3);
		printNumbersWithLimit(4, 10, 5);
		
	}
}