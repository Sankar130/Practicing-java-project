package com.kn.excpetion;

public class InsufficientFundsException extends Exception {

	String s;
	

	public InsufficientFundsException() {
		super();
	}


	public InsufficientFundsException(String s) {
		super(s);
		
	}
}
