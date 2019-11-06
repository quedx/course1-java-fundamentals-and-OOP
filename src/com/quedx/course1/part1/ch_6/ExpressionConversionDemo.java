package com.quedx.course1.part1.ch_6;

/*
 * Expression Rule Demo
 */
public class ExpressionConversionDemo {

	
	// Method to print value
	public static <T> void show(String message, T t) {
		System.out.println(message + " : " + t);
	}
	
	public static void byteExpresion() {
		
		byte byteVal = 10;
		int intVal = 10;
		
		// Byte expression
		byteVal = (byte) (byteVal * 2);  // Expr evaluated to int...
		intVal = byteVal * 2;   // Expr evaluated to int
		
		ExpressionConversionDemo.show("byteVal" , byteVal);
		ExpressionConversionDemo.show("intVal" , intVal);
	}
	

	public static void intExpresion() {
		
		int intVal = 10;
		long longVal = 10;;
		
		// Int expression
		intVal = intVal * 2;   // Expr converted to int
		intVal = (int) (intVal * 2l);  // Expr converted to int
		
		ExpressionConversionDemo.show("intVal" , intVal);
		ExpressionConversionDemo.show("longVal" , longVal);

	}
	

	public static void longExpresion() {
		
		byte byteVal = 10;
		int intVal = 10;
		long longVal = 10;;

		// Implicit cast
		longVal = byteVal * 2;  // expr is evaluated to int, then implicit cast
		longVal = intVal * 2;   // expr is evaluated to int, then implicit cast
		longVal = longVal * 2;  // expr is evaluated to long
		
		ExpressionConversionDemo.show("intVal" , intVal);
		ExpressionConversionDemo.show("longVal" , longVal);

	}
	
	
	// Main
	public static void main(String[] args) {
		ExpressionConversionDemo.byteExpresion();
		ExpressionConversionDemo.intExpresion();
		ExpressionConversionDemo.longExpresion();
		
	}


}
