package com.quedx.course1.part2.ch13;

public class PlayingBallDemo {

	public static void main(String[] args) {
		
		PlayingBall pb = new PlayingBall("football", 8);		
		System.out.println("pb : " + pb);
		
		PlayingBall pb2 = new PlayingBall("cricketball");		
		System.out.println("pb2 : " + pb2);
	}
}