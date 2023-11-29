package com.kn.pattern;

import java.util.Scanner;

public class Pattern2 {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the Rownumber: ");
		int a=sc.nextInt();
		System.out.print("Enter the Columnnumber: ");
		int b=sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=b;j++) {
				if(i<=j) {
					System.out.print((char)(70-i));
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		sc.close();
		
	}

}


