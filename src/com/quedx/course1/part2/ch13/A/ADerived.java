package com.quedx.course1.part2.ch13.A;

public class ADerived extends AParent {


	public void checkAccess() {
		System.out.println("pre pub_i : " + super.pub_i);
		System.out.println("pre prot_i : " + super.prot_i);
		System.out.println("pre def_i : " + super.def_i);
		System.out.println("pre pri_i : " + super.pri_i);
		
		this.pub_i = 110;
		this.prot_i = 120;
		this.def_i = 130;
		this.pri_i = 140;
		
		System.out.println("post pub_i : " + super.pub_i);
		System.out.println("post prot_i : " + super.prot_i);
		System.out.println("post def_i : " + super.def_i);
		System.out.println("post pri_i : " + super.pri_i);
		
	}
	
	public static void main(String[] args) {
		ADerived obj = new ADerived();
		obj.checkAccess();
	}
}
