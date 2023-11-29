package com.kn.array;

import java.util.Scanner;

public class MultipleArrayDemo {

	public static void main(String[] args) {
		// Take the input for Array in User
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of Array = ");
		//Array Declaration & Creation
		int[] irr = new int[scan.nextInt()];
		
		//Array Initialization
		for (int i = 0; i < irr.length; i++) {
			System.out.print("Enter String data for Element " + (i + 1) + " = ");
			irr[i] = scan.nextInt();

		}
		
		
		//Array Traversing to Print it's Element
		for (int i =irr.length-1;1>=0; i--) {
			System.out.println((i + 1) + " Element = " + irr[i]);

		}
		//for(int i:irr) {
			//System.out.println("Reverse the Multiplication = "+ (i*2));
		//}
		//Release the Resources
		
	}

}
