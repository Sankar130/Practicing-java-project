package com.kn.excpetion;

import java.util.Scanner;


public class BankApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to SANA Bank.");
		System.out.println("Enter the Amount be Withdrawal =");
		double amount = sc.nextDouble();
		try {
			withdrawal(amount);
		} catch (InsufficientFundsException e) {
			e.printStackTrace();

		}
		sc.close();

	}

	public static void withdrawal(double amount) throws InsufficientFundsException   {
		int balance = 10000;
		if(amount <= balance) {
			System.out.println("Successfully Withdrawal of "+amount);
			System.out.println("Available Balance : "+(balance-amount));
		}else {
			throw new InsufficientFundsException ("Balance is to Low");
		}
	}
	

}
