package com.kn.add2indexarray;

import java.util.Scanner;

public class Add2IndexArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// Take an input from User
		System.out.println("Enter 1 Array");
		// Array Declaration & Creation
		int[][] arr = new int[sc.nextInt()][sc.nextInt()];
		// Array Initialization
		System.out.println("Enter a First Array!!");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter 2 Array");
		// Array Declaration & Creation
		int[][] brr = new int[sc.nextInt()][sc.nextInt()];
		// Array Initialization
		System.out.println("Enter a Second Array!!");
		for (int i = 0; i < brr.length; i++) {
			for (int j = 0; j < brr[i].length; j++) {
				System.out.println("Enter " + (j + 1) + "element=");
				brr[j][j] = sc.nextInt();
			}
		}
		// Connecting to Input Merge into Single Array
		int[][] crr = new int[arr.length][brr.length];
		for (int i = 0; i < crr.length; i++) {
			for (int j = 0; j < brr.length; j++) {
				crr[i][j] = arr[i][j] + brr[i][j];
			}

		}

		// Print the Value
		System.out.println("The Array Data ");
		System.out.print("[");
		for (int i = 0; i < crr.length; i++) {
			for (int j = 0; j < crr[i].length; j++) {
				 
					System.out.print(crr[i][j]+ " ");
			}
					System.out.println( );
			}
		
		
		System.out.println("]");

		// System.out.print(Arrays.toString(crr));

		// Release the resource
		sc.close();
	}

}
