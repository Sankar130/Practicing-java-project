package com.kn.excpetion;

import java.util.Scanner;

public class BankApplicarion {

	public static void main(String[] args) {
		System.out.println("Connection has been established with Bank.");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pin ");
		try {
			int pin = sc.nextInt();
			if(pin == 9999){
				System.out.println("Contioue to withdraw funds");
			}else {
				System.out.println("Incorrect pin");
			}
		}catch(Exception e) {
			System.out.println("Exception Handled Successfully...!");
		}finally {
			System.out.println("====> Close the connection With Bank.");
		}
		sc.close();
	}

}
