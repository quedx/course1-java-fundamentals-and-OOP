package com.quedx.course1.part2.ch16;

import com.quedx.course1.part1.common.Util;

public class VarArgAmbiguousDemo {

	/**
	 * process var arg
	 * @param intArr
	 */
	public static void process(int... intArr) {
		Util.showLineSeparator();
		System.out.println("process(var arg) called");
		for (int i : intArr) {
			System.out.println(i);
		}
	}

	public static void process() {
		System.out.println("process()");
		
	}


	public static void main(String[] args) {

		VarArgAmbiguousDemo.process();

	}

}