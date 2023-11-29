package com.kn.multithreading;

public class ThreadDemo {
	public static void main(String[] args) {

		PrintNumber num = new PrintNumber();
		num.start();
		PrintChars chars = new PrintChars();
		chars.start();
	}

}
