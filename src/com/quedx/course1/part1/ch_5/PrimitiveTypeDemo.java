package com.quedx.course1.part1.ch_5;

/*
 * Shows the primitive types
 */
public class PrimitiveTypeDemo {
	
	public static void checkPrimitiveDataTypes() {
		boolean boolValue = true;
		char charValue = 'A';
		char charValue2 = 67;

		byte byteValue = 10;
		short shortValue = 11;
		int intValue = 12;
		long longValue = 13l;
		
		float floatValue = 100.12f;
		double doubleValue = 300.567d;

		System.out.println("boolValue : " + boolValue);

		System.out.println("charValue : " + charValue);
		System.out.println("charValue2 : " + charValue2);

		System.out.println("byteValue : " + byteValue);

		System.out.println("shortValue : " + shortValue);
		System.out.println("intValue : " + intValue);
		System.out.println("longValue : " + longValue);
		System.out.println("floatValue : " + floatValue);
		System.out.println("doubleValue : " + doubleValue);

	}

	public static void main(String[] args) {

		PrimitiveTypeDemo.checkPrimitiveDataTypes();

	}

}
