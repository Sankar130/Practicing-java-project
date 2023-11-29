package com.kn.arrayreverse;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		//Take an input from user
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter the size of Array:");
		
		//Array Declaration & Creation
		int[] arr = new int[scan.nextInt()];
		
		//Array Initialization
		for(int i=0;i<arr.length;i++) {
			
			System.out.print("Element "+(i+1)+": ");
			arr[i]=scan.nextInt();
			
		}
		
		//Print a statement to traversing the value
		int count=1;
		System.out.println("Element of the reverse direction:");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println("Element "+(count++)+": "+arr[i]);
			//System.out.println("Element "+(j)+": "+arr[i]);
		}
		//Release the resource
		scan.close();
	}

}
