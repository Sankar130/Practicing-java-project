package com.kn.maximumorequal;

import java.util.Scanner;

public class MaximumOrEqual {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number: " );
		int a=sc.nextInt();
		System.out.println("Enter the Second Number: " );
		int b=sc.nextInt();
		System.out.println("Enter the Third Number: " );
		int c=sc.nextInt();
		findMaximumOrEqual(a,b,c);
		sc.close();
	}

	public static void findMaximumOrEqual(int a, int b, int c) {
		if(a==b &&b==c) {
			System.out.println("All Number are Equal!! ");
		}else {
			int maxNumber=Math.max (Math.max(a, b),c);
			System.out.println("The Largest Numder is:" +maxNumber);
		}
	}

}
