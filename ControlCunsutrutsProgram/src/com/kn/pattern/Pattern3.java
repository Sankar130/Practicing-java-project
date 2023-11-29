package com.kn.pattern;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Rownumder : ");
		int num1=sc.nextInt();
		System.out.println("Enter a Columnnumber : ");
		int num2=sc.nextInt();
		for(int i=1;i<=num1;i++) {
			for(int j=1;j<=num2;j++){
				if(i<=j) {
				System.out.print((char)(70-j));
			}else {
				System.out.print(" ");
			}
			
		}System.out.println();
		

	}
		sc.close();
}
}