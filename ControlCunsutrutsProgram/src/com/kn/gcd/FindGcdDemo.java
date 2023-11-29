package com.kn.gcd;

import java.util.Scanner;


public class FindGcdDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a Number1 = ");
		int num1=sc.nextInt();
		System.out.print("Enter a Number2 = ");
		int num2=sc.nextInt();
		
		Findgcd factoral=new Findgcd();
		factoral.findGcdValue(num1,num2);
		sc.close();
	}

}
