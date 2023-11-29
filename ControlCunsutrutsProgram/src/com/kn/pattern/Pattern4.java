package com.kn.pattern;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		//Take a input  form the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a RowNumber : ");
		int a=input.nextInt();
		System.out.println("Enter a columnNumber : ");
		int b = input.nextInt();
		//Create a object for using Nested ForLoop 
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=b;j++) {
				if(i<=j) {
				System.out.print((6-i));
			}else {
				System.out.print(" ");
			}
			
		}System.out.println( );
		
		
	}
		//Release the resource
		input.close();

}
}