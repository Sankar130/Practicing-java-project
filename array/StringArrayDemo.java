package com.kn.array;

import java.util.Scanner;

public class StringArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of the String Array = ");

		// Array Declaration & Creation
		float[] frr = new float[sc.nextInt()];

		// Array Initialization
		for (int i = 0; i < frr.length; i++) {
			System.out.print("Enter String data for Element " + (i + 1) + " = ");
			frr[i] = sc.nextFloat();

		}
		// Array Traversing to Print it's Element
		//for (int i = 0; i < frr.length; i++) { // forward Traversing
		for (int i =frr.length-1;1>=0; i--) {
			System.out.println((i + 1) + " Element = " + frr[i]);

		}
		
		/*
		 * int count=1; for(Float f:frr){ System.out.println(count++ +" elemtent = " + f
		 * ); }
		 */
		// Release the resource
		
	

}
}

