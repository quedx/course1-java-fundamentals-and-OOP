package com.quedx.course1.part1.ch9;

import com.quedx.course1.part1.common.Util;

/*
 *  SwtichCaseDemo
 */
public class SwitchCaseDemo {

	
	public static void showDaysInMonth(int year, int month) {
		
		Util.showLineSeparator();
		System.out.println("Getting days for : " + year + " : " + month);
		int daysInMonth = -1;
		
		switch (month) {
		case 1:
			System.out.println("1");
		case 3:
		case 5:
			System.out.println("5");
		case 7:
		case 8:
		case 10:
		case 12:
			daysInMonth = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			daysInMonth = 30;
			break;
		case 2:
			if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
				daysInMonth = 29;
			else
				daysInMonth = 28;
			break;
		}
		
		System.out.println("For year/month " + year + "/" + month + " day count is " + daysInMonth);


	}

	public static void main(String[] args) {
		showDaysInMonth(2000, 1);
		showDaysInMonth(2000, 2);
		showDaysInMonth(2001, 2);
		showDaysInMonth(2002, 3);
		showDaysInMonth(2002, 12);

	}

}
