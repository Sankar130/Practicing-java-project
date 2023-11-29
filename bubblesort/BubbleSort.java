package com.kn.bubblesort;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a size of an Array: ");
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter  Element: ");
			arr[i] = sc.nextInt();

		}
		for (int i = 0; i < arr.length-1; i++) {
			boolean isSwapped = false;
			for (int j = 0; j < arr.length - 1-i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					isSwapped = true;
				}
				
			}if (isSwapped == false) {
				break;
			}
		}
		sc.close();
	}

}
