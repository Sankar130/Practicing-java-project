package com.kn.factoral;

import java.util.Scanner;

public class FactoralDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number1 = ");
		int num1=sc.nextInt();
		
		Factoral factoral=new Factoral();
		factoral.findFactoral(num1);
		sc.close();

	}

}
