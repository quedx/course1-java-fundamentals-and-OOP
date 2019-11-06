package com.quedx.course1.part1.ch9;

import com.quedx.course1.part1.common.Util;

public class WhileLoopDemo {

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
		while (i <= end) {
			System.out.println("i = " + i);
			++i;
		}
	}

	public static void main(String[] args) {
		printNumbers(4, 10);
		printNumbers(1, 0);
		
	}
}
