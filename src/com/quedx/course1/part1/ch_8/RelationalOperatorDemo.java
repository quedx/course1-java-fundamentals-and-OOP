package com.quedx.course1.part1.ch_8;

import com.quedx.course1.part1.common.Util;

public class RelationalOperatorDemo {

	public static void op_GT(int operand1, int operand2) {
		boolean result = operand1 > operand2;
		Util.show(operand1 + " > " + operand2 + " = ", result);
	}
	
	public static void op_GE(int operand1, int operand2) {
		boolean result = operand1 >= operand2;
		Util.show(operand1 + " >= " + operand2 + " = ", result);
	}
	
	public static void op_LT(int operand1, int operand2) {
		boolean result = operand1 < operand2;
		Util.show(operand1 + " < " + operand2 + " = ", result);
	}
	
	public static void op_LE(int operand1, int operand2) {
		boolean result = operand1 <= operand2;
		Util.show(operand1 + " <= " + operand2 + " = ", result);
	}

	public static void op_EQ(int operand1, int operand2) {
		boolean result = operand1 == operand2;
		Util.show(operand1 + " == " + operand2 + " = ", result);
	}
	
	public static void op_NE(int operand1, int operand2) {
		boolean result = operand1 != operand2;
		Util.show(operand1 + " != " + operand2 + " = ", result);
	}
	

	public static void main(String[] args) {
		RelationalOperatorDemo.op_GT(5, 3);
		RelationalOperatorDemo.op_GE(5, 3);
		RelationalOperatorDemo.op_LT(5, 3);
		RelationalOperatorDemo.op_LE(5, 3);
		RelationalOperatorDemo.op_EQ(5, 3);
		RelationalOperatorDemo.op_NE(5, 3);
		
	}

}
