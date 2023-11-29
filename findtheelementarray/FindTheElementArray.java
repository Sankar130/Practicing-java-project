package com.kn.findtheelementarray;

import java.util.Scanner;

public class FindTheElementArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array:");
		int[] arr = new int[sc.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the " + (i + 1) + " Element of Array:");
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter a Element to be Found:");
		int num = sc.nextInt();

		boolean t1 = isFindTheElementArray(arr, num);
		if (t1) {
			System.out.println(num + " is found !!");
		} else {
			System.out.println(num + " is Not found !!");
		}
		sc.close();


	}

	public static boolean isFindTheElementArray(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return true;
			}

		}
		return false;

	}
	
}
