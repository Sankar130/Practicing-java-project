package com.kn.fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range: ");
		int range = sc.nextInt();
		FibonacciDemo f = new FibonacciDemo();
		f.findFibonacci(range);
		sc.close();

	}

}
