package com.quedx.course1.part1.ch9;

import com.quedx.course1.part1.common.Util;

public class DoWhileDemo {

	/**
	 * Print numbers between start and end
	 * 
	 * @param start
	 * @param end
	 */
	public static void printNumbers(int start, int end) {
		Util.showLineSeparator();
		System.out.println("  start : " + start);
		System.out.println("    end : " + end);
		int i = start;
		if (end < start) {
			return;
		}
		
		do {
			System.out.println("i = " + i);
			++i;
		} while (i <= end);
	}
	
	

	public static void main(String[] args) {
		
		printNumbers(5, 9);
		
		printNumbers(1, 0);
		
	}
}
