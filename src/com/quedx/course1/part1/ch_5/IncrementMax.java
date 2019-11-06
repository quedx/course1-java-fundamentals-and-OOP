package com.quedx.course1.part1.ch_5;

public class IncrementMax {

	
	public static void increment() {
		
		byte value = Byte.MAX_VALUE;
		
		System.out.println("byte value : " + value);
		
		value++;
		
		System.out.println("byte value : " + value);
		
		
	}
	public static void main(String[] args) {
		IncrementMax.increment();
	}

}
