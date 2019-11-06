package com.quedx.course1.part2.ch14;

public class Outer {

	private int outerCount = 101;

	public void outerMethod() {
		System.out.println("outerMethod()");
		System.out.println("outerCount : " + outerCount);
		//System.out.println("outerCount : " + innerCount);
	}

	// Inner class
	public class Inner {
		int innerCount = 202;

		public void innerMethod() {
			System.out.println("innerMethod()");
			System.out.println("outerCount : " + outerCount);
			System.out.println("innerCount : " + innerCount);
		}
	}
	
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.outerMethod();
		
		Inner inner = outer.new Inner();
		inner.innerMethod();
	}
}
