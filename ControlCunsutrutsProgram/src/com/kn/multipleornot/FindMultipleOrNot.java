package com.kn.multipleornot;

import java.util.Scanner;

public class FindMultipleOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. take the input from user mark
				Scanner scan = new  Scanner(System.in);
				System.out.println("Enter Your Mark: ");
				int n=scan.nextInt();
				//2.Create an Object form the StudentMarkCheckDemo class
				FindMultipleOrNotDemo avarage=new FindMultipleOrNotDemo();
				//3.Call the studentAverage
				avarage.mulitipleOrNotCheck(n);
				//4.close the scan
				scan.close();
	}

}
