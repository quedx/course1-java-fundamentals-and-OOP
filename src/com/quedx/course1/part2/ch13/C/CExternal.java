package com.quedx.course1.part2.ch13.C;

import com.quedx.course1.part2.ch13.A.AParent;

public class CExternal {

	public void checkAccess() {
		
		AParent ap = new AParent();
		System.out.println("pre pub_i : " + ap.pub_i);
		System.out.println("pre prot_i : " + ap.prot_i);
		System.out.println("pre def_i : " + ap.def_i);
		System.out.println("pre pri_i : " + ap.pri_i);
	}
	
	public static void main(String[] args) {
		CExternal obj = new CExternal();
		obj.checkAccess();
	}
}
