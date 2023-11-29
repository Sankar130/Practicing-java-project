package com.kn.array;

import java.util.Scanner;

public class ArrayDemo3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the Size of Array = ");
		int size=sc.nextInt();
		int []arr = new int[size];
		//Array initialization
		System.out.println("Enter data for Array Element =");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Data Within Array Value ");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
