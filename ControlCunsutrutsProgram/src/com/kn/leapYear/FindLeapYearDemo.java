package com.kn.leapYear;

import java.util.Scanner;


public class FindLeapYearDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Year = ");
		int year=sc.nextInt();
		
		FindLeapYear factoral=new FindLeapYear();
		factoral.findLeapYears(year);
		sc.close();


	}

}
