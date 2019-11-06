package com.quedx.course1.part2.ch10.graphics;

import com.quedx.course1.part1.common.Util;

public class PlayingBall {

	String type;
	int radius;
	int xCoordinate;
	int yCoordinate;

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


