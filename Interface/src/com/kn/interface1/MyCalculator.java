package com.kn.interface1;

public class MyCalculator implements Calculator2 {
int a=10,b=20;
	@Override
	public void add() {
		System.out.println("Addition = "+ (a+b));
	}

	@Override
	public void sub() {
		System.out.println("Subtraction = "+ (a-b));		
	}

	@Override
	public void multiply() {
		System.out.println("Multiplication = "+ (a*b));		
	}

	@Override
	public void divide() {
		System.out.println("Division = "+ (a/b));		
	}
	

}
