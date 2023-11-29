package com.kn.leapYear;

public class FindLeapYear {

	public void findLeapYears(int year) {
		// TODO Auto-generated method stub
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("Leap Year!!");
				} else {
					System.out.println("Not Leap Year!!");
				}
			} else {
				System.out.println("Leap Year!!");
			}
			} else {
				System.out.println("NotLeap Year!!");
			}
				
			

		}
	}

