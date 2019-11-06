package com.quedx.course1.part2.ch14;

public class Outer2 {

	private int outerCount = 101;

	public void outerMethod() {
		System.out.println("outerMethod()");
		System.out.println("outerCount : " + outerCount);
		//System.out.println("outerCount : " + innerCount);
	}

	// Inner class
	public static class Inner {
		int innerCount = 202;

		public void innerMethod() {
			System.out.println("innerMethod()");
			//System.out.println("outerCount : " + outerCount);
			System.out.println("innerCount : " + innerCount);
		}
	}
	
	
	public static void main(String[] args) {
		Outer2 outer = new Outer2();
		outer.outerMethod();
		
		Outer2.Inner inner = new Outer2.Inner();
		inner.innerMethod();
	}
}
