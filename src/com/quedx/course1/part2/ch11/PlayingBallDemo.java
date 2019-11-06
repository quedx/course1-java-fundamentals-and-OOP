package com.quedx.course1.part2.ch11;

import com.quedx.course1.part1.common.Util;

public class PlayingBallDemo {

	public static void main(String[] args) {
		Util.showLineSeparator();

		PlayingBall pb= new PlayingBall();		
		System.out.println("ball : radius : " + pb.radius);
		System.out.println("ball : type : " + pb.type);
		System.out.println("ball : volume : " + pb.volume());

		Util.showLineSeparator();
		PlayingBall pb2 = new PlayingBall();
		pb2.radius = 8;
		pb2.type = "football";
		
		System.out.println("ball : radius : " + pb2.radius);
		System.out.println("ball : type : " + pb2.type);
		System.out.println("make of PlayingBall is : " + PlayingBall.make);
		System.out.println("ball : volume : " + pb2.volume());
		
		
		PlayingBall pb3 = new PlayingBall();
		pb3.radius = 1;
		pb3.type = "xball";
		
		
		PlayingBall pb4 = new PlayingBall();
		pb4.radius = 10;
		pb4.type = "yball";
		
		Util.showLineSeparator();
		System.out.println("pb and pb3 : "  + pb.findLargest(pb3).type);
		System.out.println("pb2 and pb3 : "  + pb2.findLargest(pb3).type);
		Util.showLineSeparator();
		
		PlayingBall[] array1 = { pb2, pb3, pb4};
		System.out.println("pb and all others : "  + pb.findLargest(array1).type);
		
		
		
	}
}