package com.kn.excpetion;

public class UnderAgeException extends Exception {
	String s;

	public UnderAgeException(String s) {
		super(s);
		
	}

	public UnderAgeException() {
		super();
	}
	

}
