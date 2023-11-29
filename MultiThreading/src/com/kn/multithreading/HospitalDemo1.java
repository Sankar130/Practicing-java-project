package com.kn.multithreading;

public class HospitalDemo1 {

	public static void main(String[] args) {
		HospitalDemo h = new HospitalDemo();
		
		Tom tom = new Tom(h);
		Jerry jerry = new Jerry(h);
		
		Thread t1 = new Thread(tom);
		Thread t2 = new Thread(jerry);
		
		t1.start();
		t2.start();
		
	}

}
