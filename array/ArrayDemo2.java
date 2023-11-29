package com.kn.array;

//import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		//Array Declaration
				int []arr;
				
				//Array Creation
				arr=new int [8];
				
				//Array Initialization
				//arr [0]=10;
				//arr [1]=20;
				//arr [2]=30;
				//arr [3]=40;
				//arr [4]=50;
				//arr [5]=60;
				for(int i=0;i<arr.length;i++) {
					arr[i]=10*(i+1);
					System.out.println(arr[i]);
				}
	}
}
