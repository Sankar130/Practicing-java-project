package com.kn.pattern;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a RowNumber : ");
		int a=input.nextInt();
		System.out.println("Enter a ColumnNumber : ");
		int b=input.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=b;j++) {
				if(j<=i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println( );
		}
		input.close();
		}

}
