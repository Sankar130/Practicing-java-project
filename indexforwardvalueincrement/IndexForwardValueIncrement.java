package com.kn.indexforwardvalueincrement;

import java.util.Scanner;

public class IndexForwardValueIncrement {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		//Take an input from user
		System.out.print("Enter a size of the Array:");
		//Array Declaration & Initialization
		int[] arr =new int[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter "+(i+1)+"element: ");
			arr[i]=sc.nextInt();
		}
		//create in IndexForwardValueIncrement
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
		
		//Traversing & Print
		System.out.println("The Array Data ");
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				System.out.print(arr[i]);
			}else
			System.out.print(", "+arr[i]);
		
		}
		System.out.println("]");
		
		//release the Resource
		sc.close();
	}

}
