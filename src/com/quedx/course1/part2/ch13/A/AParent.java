package com.quedx.course1.part2.ch13.A;

public class AParent {

	public int pub_i = 10;
	protected int prot_i = 20;
	int def_i = 30;
	private int pri_i = 40;

	public void checkAccessFromParent() {
		System.out.println("pre pub_i : " + this.pub_i);
		System.out.println("pre prot_i : " + this.prot_i);
		System.out.println("pre def_i : " + this.def_i);
		System.out.println("pre pri_i : " + this.pri_i);
		
		this.pub_i = 110;
		this.prot_i = 120;
		this.def_i = 130;
		this.pri_i = 140;
		
		System.out.println("post pub_i : " + this.pub_i);
		System.out.println("post prot_i : " + this.prot_i);
		System.out.println("post def_i : " + this.def_i);
		System.out.println("post pri_i : " + this.pri_i);
		
	}
	
	public static void main(String[] args) {
		AParent obj = new AParent();
		obj.checkAccessFromParent();
	}
}
