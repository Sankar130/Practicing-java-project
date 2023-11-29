package com.kn.excpetion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter you age =");
			int age = sc.nextInt();
			System.out.println("Your Age =" + age);
			System.out.println("******************");
			System.out.print("Enter numerator =");
			int n = sc.nextInt();
			System.out.print("Enter denomenator = ");
			int d = sc.nextInt();
			double div = n / d;
			System.out.println("Division = " + div);
			// int[] arr = new int[-5];
			int[] arr = new int[5];
			System.out.println(arr[5]);
		} catch (InputMismatchException e) {
			System.out.println("--->Invalid input given, age must be in numeric value...!");

		} catch (ArithmeticException e) {
			System.out.println("--->Denominator must not be Zero.");
		} catch (NegativeArraySizeException e) {
			System.out.println("--->Array size must be positive value...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("--------------THE END-------------");
		sc.close();
	}

}
