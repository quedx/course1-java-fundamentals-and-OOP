package com.quedx.course1.part2.ch15;

import com.quedx.course1.part1.common.Util;

public class PlayingBall {

	private static final String make = "Nike";
	private String type;
	private int radius;

	public String getType() {
		return type;
	}

	public int getRadius() {
		return radius;
	}

	/**
	 * Constructor
	 * 
	 * @param type
	 * @param radius
	 */
	public PlayingBall(String type, int radius) {
		super();
		this.type = type;
		this.radius = radius;
	}
	
	
	/**
	 * Calculate volume
	 * 
	 * @return
	 */
	public int volume() {
		return (int) ((4 * 22 * Util.power(this.radius, 3)) / 21);
	}

	/**
	 * Check if this is a basket ball
	 * 
	 * @return true if its basketball
	 */
	public boolean isBasketBall() {
		return this.type.equalsIgnoreCase("basketball");
	}

	@Override
	public  String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PlayingBall [type=");
		builder.append(type);
		builder.append(", radius=");
		builder.append(radius);
		builder.append(", make=");
		builder.append(make);
		builder.append("]");
		return builder.toString();
	}
	
	public static String getMake() {
		return PlayingBall.make;
	}
		
	public static void main(String args[]) {
		PlayingBall pb1 = new PlayingBall("football", 8);
		System.out.println("pb1 : " + pb1);
		PlayingBall pb2 = new PlayingBall("cricketball", 2);
		System.out.println("pb2 : " + pb2);
		
		System.out.println("static members : " + PlayingBall.getMake());
		
	}

	
}
