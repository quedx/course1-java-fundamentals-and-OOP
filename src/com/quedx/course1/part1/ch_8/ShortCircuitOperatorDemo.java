package com.quedx.course1.part1.ch_8;

import com.quedx.course1.part1.common.Util;

public class ShortCircuitOperatorDemo {

	public static boolean isTodayHoliday() {
		System.out.println("isTodayHoliday() invoked");
		return true;
	}
	
	// boolean OR 
	public static void op_OR_boolean() {
		
		Util.showLineSeparator();
		System.out.println("case 1 boolean OR ");
		if ((4 > 1) |  ShortCircuitOperatorDemo.isTodayHoliday() ) {
			System.out.println("I'll wake up late");
		}

		Util.showLineSeparator();
		System.out.println("case 2 boolean OR ");
		if ((1 > 4) |  ShortCircuitOperatorDemo.isTodayHoliday() ) {
			System.out.println("I'll wake up late");
		}
	}
	
	
	
	// boolean AND 
	public static void op_AND_boolean() {
		
		Util.showLineSeparator();
		System.out.println("case 3 : boolean AND ");
		if ((4 > 1) &  ShortCircuitOperatorDemo.isTodayHoliday() ) {
			System.out.println("I'll wake up late");
		}

		Util.showLineSeparator();
		System.out.println("case 4 : boolean AND ");
		if ((1 > 4) &  ShortCircuitOperatorDemo.isTodayHoliday() ) {
			System.out.println("I'll wake up late");
		}
	}
	
	// short circuit OR
	public static void op_OR() {
		
		Util.showLineSeparator();
		System.out.println("case 1 sc ");
		if ((4 > 1) ||  ShortCircuitOperatorDemo.isTodayHoliday() ) {
			System.out.println("I'll wake up late");
		}

		Util.showLineSeparator();
		System.out.println("case 2 sc ");
		if ((1 > 4) ||  ShortCircuitOperatorDemo.isTodayHoliday() ) {
			System.out.println("I'll wake up late");
		}
	}
	
	
	
	// short circuit AND 
	public static void op_AND() {
		
		Util.showLineSeparator();
		System.out.println("case 3 sc ");
		if ((4 > 1) &&  ShortCircuitOperatorDemo.isTodayHoliday() ) {
			System.out.println("I'll wake up late");
		}

		Util.showLineSeparator();
		System.out.println("case 4 sc ");
		if ((1 > 4) &&  ShortCircuitOperatorDemo.isTodayHoliday() ) {
			System.out.println("I'll wake up late");
		}
	}
	
	

	// Main
	public static void main(String[] args) {
		
		//ShortCircuitOperatorDemo.op_OR_boolean();
		//ShortCircuitOperatorDemo.op_AND_boolean();
		
		ShortCircuitOperatorDemo.op_OR();
		ShortCircuitOperatorDemo.op_AND();
		
	}
}
