package com.kn.twodifferentarraymergeintosingleoutput;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDifferentArrayMerageIntoSingleOutput {

	public static void main(String[] args) {
		//Take an input from User
		Scanner sc =new Scanner(System.in);
		//Array Declaration & Creation
		System.out.println("Enter 1 Array");
		int[] arr= new int[sc.nextInt()];
		System.out.println("Enter 2 Array");
		int[] brr=new int [sc.nextInt()];
		//Array Initialization
		for (int i=0;i<arr.length;i++) {
			System.out.println("Enter "+(i+1)+"element=");
			arr[i]=sc.nextInt();
			}
		for(int i=0;i<brr.length;i++) {
			System.out.println("Enter "+(i+1)+"element=");
			brr[i]=sc.nextInt();
		}
		//Connecting to Input Merge into Single Array
		int[] crr=new int [(arr.length) + (brr.length)];
		for(int i=0;i<crr.length;i++) {
			if(i>=0 && i<arr.length) {
				crr[i]=arr[i];
			}
		else
		{
			crr[i]=brr[i-arr.length];
		}
		}
		
		//Print the Value
		System.out.println("The Array Data ");
	
			System.out.print(Arrays.toString(crr));
		
		
		//Release the resource
		sc.close();
	}

}
