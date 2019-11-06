package com.quedx.course1.part1.ch_8;

import com.quedx.course1.part1.common.Util;

public class BooleanOperatorDemo {

	public static void op_NOT(boolean operand1) {
		boolean result = !operand1;
		Util.show("! " + operand1 + " = ", result);
	}

	public static void op_OR(boolean operand1, boolean operand2) {
		boolean result = operand1 | operand2;
		Util.show(operand1 + " | " + operand2 + " = ", result);
	}

	public static void op_AND(boolean operand1, boolean operand2) {
		boolean result = operand1 & operand2;
		Util.show(operand1 + " & " + operand2 + " = ", result);
	}

	public static void op_XOR(boolean operand1, boolean operand2) {
		boolean result = operand1 ^ operand2;
		Util.show(operand1 + " ^ " + operand2 + " = ", result);
	}

	public static void main(String[] args) {
		Util.showLineSeparator();
		BooleanOperatorDemo.op_NOT(true);
		BooleanOperatorDemo.op_NOT(false);

		Util.showLineSeparator();
		BooleanOperatorDemo.op_OR(false, false);
		BooleanOperatorDemo.op_OR(false, true);
		BooleanOperatorDemo.op_OR(true, false);
		BooleanOperatorDemo.op_OR(true, true);
		
		Util.showLineSeparator();
		BooleanOperatorDemo.op_AND(false, false);
		BooleanOperatorDemo.op_AND(false, true);
		BooleanOperatorDemo.op_AND(true, false);
		BooleanOperatorDemo.op_AND(true, true);
		
		Util.showLineSeparator();
		BooleanOperatorDemo.op_XOR(false, false);
		BooleanOperatorDemo.op_XOR(false, true);
		BooleanOperatorDemo.op_XOR(true, false);
		BooleanOperatorDemo.op_XOR(true, true);
		

	}
}
