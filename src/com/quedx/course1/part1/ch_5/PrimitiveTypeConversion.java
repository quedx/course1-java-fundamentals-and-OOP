package com.quedx.course1.part1.ch_5;


public class PrimitiveTypeConversion {
	
	public static long calculateSecondsInYear() {
		return 60 * 60 * 24 * 365 ;
	}
	
	
	public static void main(String[] args) {
		
		long secondsInYear = calculateSecondsInYear();
		System.out.println("seconds in year : " + secondsInYear);
		
		
		// Try to store in int
				int secondsInYear_int = (int)secondsInYear;   // Conversion requires explicit cast
				System.out.println("seconds in year (stored in int) : " + secondsInYear_int);

		
				
				// Try to store in short
				short secondsInYear_short = (short)secondsInYear;   // Conversion requires explicit cast.
																	// Note that value is truncated
				System.out.println("seconds in year (stored in short) : " + secondsInYear_short);
	}

}
