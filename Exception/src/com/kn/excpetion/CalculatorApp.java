package com.kn.excpetion;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("Calculator Applicaion Started. ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numerator = ");
		int a = sc.nextInt();
		System.out.println("Enter Donominator = ");
		int b =  sc.nextInt();
		
		double divide = 0.0;
		
		try {
			divide  = a/b;   //ArithmeticExceptin
		}catch(Exception e) {
			System.out.println("Exception Handled Successfully...!");
			
		}
		System.out.println("Division = "+ divide);
		System.out.println("Calculator Application Terminated Successfully..!");
		sc.close();
	}

}
