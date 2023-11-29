package com.kn.stringmethods;

import java.util.Scanner;

public class StringMethodDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a posion size = ");
		String s1="Banglore";
		int s2=sc.nextInt();
		char c=s1.charAt(s2);
		System.out.println("Character at "+s2+" index = "+c);
		sc.close();
		
		
	}

}
