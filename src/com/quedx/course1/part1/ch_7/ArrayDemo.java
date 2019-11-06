package com.quedx.course1.part1.ch_7;

public class ArrayDemo {
	
	// Method to demo static allocation
	public static void staticAllocation() {
		int[] studentAges = { 10, 12, 15 };
		
		showArray("studentAges", studentAges);
	}
	
	// Method to demo dynamic allocation
	public static void dynamicAllocation() {
		int[] studentAges;
		
		// Allocate memory
		studentAges = new int[5];
		
		// Initialize
		studentAges[0] = 13;
		studentAges[1] = 10;
		studentAges[2] = 15;
		studentAges[3] = 11;
		
		
		showArray("studentAges", studentAges);
	}
	
	// Method to demo accessing element beyong capacity
	public static void accessingBeyondCapacity() {
		int[] studentAges = { 10, 12, 15 };
		
		System.out.println("element at index 3 : " + studentAges[3]);
	}
	

	
	// Method for printing array
	public static void showArray(String varname, int[] array1) {
		
		System.out.println("---- Elements of " + varname + " -----");
		
		// Length gives the number of elements in the array
		System.out.println(varname + " contains " + array1.length + " elements");
		int i = 0;
		for(int elem: array1) {
			System.out.println("  [" + i++ + "] = " + elem);
		}
	}
	
	public static void main(String[] args) {
		ArrayDemo.staticAllocation();
		ArrayDemo.dynamicAllocation();
		ArrayDemo.accessingBeyondCapacity();
		
	}

}
