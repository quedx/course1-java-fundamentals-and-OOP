package com.quedx.course1.part2.ch10;

import com.quedx.course1.part1.common.Util;

public class PlayingBall {

	public static String make = "Nike";
	String type;
	int radius;

	/**
	 * Calculate volume
	 * @return
	 */
	public int volume() {
		return (int) ((4 * 22 * Util.power(this.radius, 3)) / 21);
	}

	/**
	 * Check if this is a basket ball
	 * @return true if its basketball
	 */
	public boolean isBasketBall() {
		return this.type.equalsIgnoreCase("basketball");
	}


}


