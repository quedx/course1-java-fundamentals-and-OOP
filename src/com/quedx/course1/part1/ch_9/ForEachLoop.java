package com.quedx.course1.part1.ch_9;

import com.quedx.course1.part1.common.Util;

public class ForEachLoop {

	/**
	 * Print days of week
	 */
	public static void printDaysInWeek() {
		Util.showLineSeparator();
		
		String[] daysInWeek = { "sun", "mon", "tue", "wed", "thu", "fri", "sat" };
		
		for(String day : daysInWeek) {
			System.out.println("day : " + day);
			
		}
	}

	public static void main(String[] args) {
		printDaysInWeek();
	}
}