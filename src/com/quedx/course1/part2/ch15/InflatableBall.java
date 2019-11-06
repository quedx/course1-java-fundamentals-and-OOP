package com.quedx.course1.part2.ch15;

public class InflatableBall extends PlayingBall {

	private boolean inflatable;

	public InflatableBall(boolean inflatable, String type, int radius) {
		super(type, radius);
		this.inflatable = inflatable;

	}

	public void setInflatable(boolean inflatable) {
		this.inflatable = inflatable;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InflatableBall [inflatable=");
		builder.append(inflatable);
		builder.append("]  --> ");
		builder.append(super.toString());
		return builder.toString();
	}

	public static void main(String[] args) {
		InflatableBall b1 = new InflatableBall(true, "basketball", 9);
		System.out.println("b1 : " + b1);
		InflatableBall b2 = new InflatableBall(false, "football", 8);
		System.out.println("b2 : " + b2);

	}

}
