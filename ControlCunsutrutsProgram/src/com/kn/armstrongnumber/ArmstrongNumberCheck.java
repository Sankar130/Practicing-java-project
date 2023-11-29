package com.kn.armstrongnumber;

import java.util.Scanner;

public class ArmstrongNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
		
		armstrongmethod(num);
		sc.close();
		}

	private static void armstrongmethod(int num) {
		// TODO Auto-generated method stub
		int digit=0,sum=0;
		int temp=num;
		while(num>0) {
			digit=num%10;
			digit=digit*digit*digit;
			sum+=digit;
			num/=10;
		}if(temp==sum) {
			System.out.println(sum + "Is an Armstrong Number!!");
		}else {
			System.out.println(sum + "Is an Not Armstrong Number!!");
		}
		
	}

}
