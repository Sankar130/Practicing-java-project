package com.kn.addthetwoarray;

import java.util.Scanner;

public class AdditionalTwoValueArrayDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=scan.nextInt();
		int[] arr=new int[size];
		int[] brr=new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the Element Array "+(i+1)+"= ");
			arr[i]=scan.nextInt();
		}
		for(int j=0;j<brr.length;j++) {
			System.out.println("Enter the Element Array "+(j+1)+"= ");
			brr[j]=scan.nextInt();
		}
	
		AdditionalTwoValueArray inputArrayElement=new AdditionalTwoValueArray();
		int[] crr = inputArrayElement.isAdditionalTwoValueArray(arr,brr);
		System.out.println("[");
		for(int i=0;i<crr.length;i++) {
			if(i==0) {
				System.out.print(crr[i]);
			}
		
		}System.out.println("]");
			
		scan.close();
	}

	

	

}
