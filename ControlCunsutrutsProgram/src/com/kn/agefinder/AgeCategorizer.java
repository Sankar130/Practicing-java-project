package com.kn.agefinder;

import java.util.Scanner;

public class AgeCategorizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age: ");
		int num=sc.nextInt();
		checkAgeCategorizer(num);
		sc.close();

	}

	public static void checkAgeCategorizer(int num) {
		// TODO Auto-generated method stub
		if(num>=0 && num<=12) {
			System.out.println("Child " + num);
		}else if(num>=13 && num<=19) {
			System.out.println("Teen " + num);
		}else if(num>=20 && num<=59) {
			System.out.println("Adult " + num);
		}else if(num>=60 && num<=100) {
			System.out.println("Senior"+ num);
		}else {
			System.out.println("Your  an Most Senior Person in the World!!!");
		}
	}

}
