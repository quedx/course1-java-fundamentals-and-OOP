package com.quedx.course1.part1.ch_8;

import com.quedx.course1.part1.common.Util;

public class AssignmentOperatorDemo {

	public static void assignementOp(int num) {

		int result = num;
		Util.showLineSeparator();
		System.out.println("expression: result = num ");
		System.out.println("  num = " + num);
		System.out.println("  result = " + result);
		
		result += num;
		Util.showLineSeparator();
		System.out.println("expression: result += num ");
		System.out.println("  num = " + num);
		System.out.println("  result = " + result);
		
	}

	public static void main(String[] args) {
		AssignmentOperatorDemo.assignementOp(10);
	}

}
