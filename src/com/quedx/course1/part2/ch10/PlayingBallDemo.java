package com.quedx.course1.part2.ch10;

public class PlayingBallDemo {

	public static void main(String[] args) {

		PlayingBall b1 = new PlayingBall();
		b1.radius = 10;
		b1.type = "football";

		System.out.println("ball : radius : " + b1.radius);
		System.out.println("ball : type : " + b1.type);


		PlayingBall b2 = new PlayingBall();
		b2.radius = 10;
		b2.type = "football";

		System.out.println("ball : radius : " + b2.radius);
		System.out.println("ball : type : " + b2.type);
		
		
		System.out.println("make of PlayingBall is : " + PlayingBall.make);

	}
}