package com.quedx.course1.part1.ch_7;

/*
 * Array Dim example
 */
public class ArrayDimDemo {
	
	// Demo for 1 dim array
	public static void oneDimArray() {

		int[] studentsInClass;
		studentsInClass = new int[5];
		studentsInClass[0] = 10;
		studentsInClass[1] = 11;
		studentsInClass[2] = 12;
		studentsInClass[3] = 10;
		studentsInClass[4] = 14;

		for (int students : studentsInClass) {
			System.out.println("students : " + students);
		}
	}

	// Demo for 2 dim array
	public static void twoDimArray() {
		int[][] studentAges;
		studentAges = new int[5][];

		studentAges[0] = new int[4];
		studentAges[1] = new int[5];
		studentAges[2] = new int[6];
		studentAges[3] = new int[3];
		studentAges[4] = new int[5];

		for (int[] studentAge : studentAges) {

			System.out.println("---------------");
			for (int i = 0; i < studentAge.length; ++i) {
				studentAge[i] = (int) (getRandomBetween(10, 15));
			}

			for (int age : studentAge) {
				System.out.println("age : " + age);
			}
		}

	}
	
	// Returns random number between min and max
	public static int getRandomBetween(int min, int max) {
		int diff = max - min;
		return (int) (Math.random() * diff) + min;
	}


	public static void main(String[] args) {
		ArrayDimDemo.oneDimArray();
		ArrayDimDemo.twoDimArray();
	}

}
