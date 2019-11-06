package com.quedx.course1.part1.ch_8;

import com.quedx.course1.part1.common.Util;

/*
 * Bitwise Operator Demo
 */
public class BitwiseOperatorDemo {

	public static void op_complement(int operand) {
		int result = ~operand;
		Util.show("~" + operand + " = ", result);
	}

	public static void op_AND(int operand1, int operand2) {
		int result = operand1 & operand2;
		Util.show(operand1 + " & " + operand2 + " = ", result);
	}

	public static void op_OR(int operand1, int operand2) {
		int result = operand1 | operand2;
		Util.show(operand1 + " | " + operand2 + " = ", result);
	}

	public static void op_XOR(int operand1, int operand2) {
		int result = operand1 ^ operand2;
		Util.show(operand1 + " ^ " + operand2 + " = ", result);
	}

	public static void op_rightShift(int operand, int shiftBy) {
		int result = operand >> shiftBy;
		Util.show(operand + " >> " + shiftBy + " = ", result);
	}

	public static void op_unsignedRightShift(int operand, int shiftBy) {
		int result = operand >>> shiftBy;
		Util.show(operand + " >>> " + shiftBy + " = ", result);
	}

	public static void op_leftShift(int operand, int shiftBy) {
		int result = operand << shiftBy;
		Util.show(operand + " << " + shiftBy + " = ", result);
	}

	public static void main(String[] args) {
		BitwiseOperatorDemo.op_complement(3);
		BitwiseOperatorDemo.op_AND(5, 3);
		BitwiseOperatorDemo.op_OR(5, 3);
		BitwiseOperatorDemo.op_XOR(5, 3);
		BitwiseOperatorDemo.op_rightShift(5, 1);
		BitwiseOperatorDemo.op_unsignedRightShift(-5, 1);
		BitwiseOperatorDemo.op_leftShift(5, 1);

	}

}
