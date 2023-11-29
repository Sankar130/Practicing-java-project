package com.kn.binarysearch;

import java.util.Scanner;

public class BinarySearchDemo {
	
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter an index size: ");
			int[] arr=new int[sc.nextInt()];
			
			for(int i=0;i<arr.length;i++) {
				System.out.println("Enter an index data: ");
				arr[i]=sc.nextInt();
			}
				int key =sc.nextInt();
				for(int j=0;j<arr.length;j++) {
					System.out.print("Enter an key Value: ");
					arr[j]=sc.nextInt();
				}
				for(int i=0;i<arr.length;i++) {
					for(int j=0;j<arr.length;j++) {
						
					}
				
				
			
				int bi =new BinarySearch().binarySearch(arr, key);
				
				
				if(bi>=0) {
					System.out.println("Found");
			}else {
				System.out.println("Not Found");
			}
			}
		

		
sc.close();		
}
	
}
