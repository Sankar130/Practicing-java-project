package com.kn.excpetion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceotindEmo1 {

	public static void main(String[] args) {
		System.out.println("=========START=======");
		shop();
		System.out.println("=========END========");
	}

	private static void shop() {
		System.out.println("======>Shopping Started..");
		try {
			pay();
			System.out.println("Thank you for Shopping with us...!");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void pay() throws Exception {
		System.out.println("=====Payment Started...!!");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the Payable amount = ");
			double amount = sc.nextDouble();
			System.out.println("====>" + amount + " has paid Successfully..");
			System.out.println("=====Payment Ended...!!");
		} catch (Exception e) {
			System.out.println("Invalid Payment Amount?");
			
			throw new InputMismatchException();
		}
		sc.close();
	}
}
