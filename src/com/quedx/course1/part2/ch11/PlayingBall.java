package com.quedx.course1.part2.ch11;

import com.quedx.course1.part1.common.Util;

public class PlayingBall {

	static final String make = "Nike";
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


	/**
	 * Find largest PlayingBall
	 * @param other
	 * @return
	 */
	public PlayingBall findLargest(PlayingBall other) {
		return this.radius > other.radius? this : other;
		
	}
	

	/**
	 * Find largest PlayingBall
	 * @param other
	 * @return
	 */
	public PlayingBall findLargest(PlayingBall[] otherArray) {
		PlayingBall largest = this;
		for(PlayingBall pb: otherArray) {
			largest = largest.findLargest(pb);
		}
		
		return largest;
	}	
}


