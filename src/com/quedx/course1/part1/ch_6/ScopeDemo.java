package com.quedx.course1.part1.ch_6;

/*
 * Scope
 */
public class ScopeDemo {
	
	public int count = 10;	
	public static int totalCount = 20;
	

	// Method to print value
	public static <T> void show(String message, T t) {
		System.out.println(message + " : " + t);
	}
	
	
	public static void scopeTest() {

		// scope for x starts here
		int x = 10;
		show("1 : x", x);
		
		{
			x = x + 5;
			show("2 : x", x);
		}
		show("3 : x", x);

		{
			int y = 100;
			show("4 : y", y);
	
		}
		//show("4 : y", y);
		
		
	}
	
	public static void main(String[] args) {
		
		ScopeDemo obj = new ScopeDemo();
		ScopeDemo.show("count", obj.count);
		ScopeDemo.show("totalCount" , ScopeDemo.totalCount);
		ScopeDemo.scopeTest();

	}

}
