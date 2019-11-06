package com.quedx.course1.part2.ch16;

import com.quedx.course1.part1.common.Util;

public class VarArgDemo {

	public static void printInt(int... intArr) {
		Util.showLineSeparator();
		for (int i : intArr) {
			System.out.println(i);
		}
	}

	public static void printInt(String message, int... intArr) {
		Util.showLineSeparator();
		System.out.println(message);
		for (int i : intArr) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		VarArgDemo.printInt(1, 10);
		VarArgDemo.printInt("Custom message1:", 101, 2);
		VarArgDemo.printInt("Custom message2:", 99, 4, 16);
	}

}