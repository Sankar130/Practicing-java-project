package com.kn.palidrome;

import java.util.Scanner;

public class PalidromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number = ");
		int a = sc.nextInt();
		palidromValue(a);
		sc.close();

	}

	public static void palidromValue(int a) {
		// TODO Auto-generated method stub
		int digit = 0, sum = 0;
		int temp = a ;

		while (a > 0) {
			digit = a % 10;
			sum = sum * 10 + digit;
			a = a / 10;
}if(temp==sum) {
	System.out.println( sum  + " = " + "This is an Palidrome Number ");
}else {
	System.out.println( sum  + " = " + "This is an Not Palidrome Number ");
}

	}

}
