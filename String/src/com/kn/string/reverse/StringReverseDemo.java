package com.kn.string.reverse;

import java.util.Scanner;

public class StringReverseDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String = ");
		String inputString =new String(sc.nextLine());
		System.out.println("Reverseed String ="+ StringReverse.reverseString(inputString));
		sc.close();
		
	}

}
