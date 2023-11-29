package com.kn.array;

import java.util.Scanner;

public class ThreeDimensionalArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][][] arr = new int[2][2][1];
		// Array initialization
		System.out.println("Enter data for Array Element =");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		System.out.println("Data Within Array Value ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println(arr[i][j][k]);
				}

			}
		}
		sc.close();

	}
}
