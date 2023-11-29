package com.kn.excpetion;

import java.util.Scanner;

public class DrivingLicense {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to SANA DrivingLicenes..");
		System.err.print("Enter your Age =");
		int age = scan.nextInt();
		try {
		ageChecker(age);
		}catch( overageException c) {
			c.printStackTrace();
			
		}catch(UnderAgeException u) {
			u.printStackTrace();
		}
		scan.close();
		
	}

	public static void ageChecker(int age) throws UnderAgeException, overageException    {
		if(age>=18 && age<=65) {
			System.err.println("-------***Successfully Applied Licenes***-------");
		}else if(age<18) {
			throw new UnderAgeException("Wait Until you Become 18YEAR and com Back Again.");
		}else if(age>55) {
			throw new overageException("You are too Late to Start , Just Sit Back and Relax..! ");
		}
			
	}

}
