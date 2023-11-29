package com.kn.multithreading;

public class PrintNumber extends Thread {

	@Override
	public void run() {
		System.out.println("Started Printing Number... ");

		for (int i = 1; i <= 5; i++) {
			System.out.println("Number = " + i);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
			System.out.println("Completed Printing Number..");
		}
	}

}
