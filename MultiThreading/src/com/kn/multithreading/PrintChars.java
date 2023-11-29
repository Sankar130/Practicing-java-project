package com.kn.multithreading;

public class PrintChars extends Thread {

	@Override
	public void run() {
		System.out.println("Started Printing Character... ");

		for (int i = 65; i <= 69; i++) {
			System.out.println("Char = " + i);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
			System.out.println("Completed Printing Character..");
		}
	}

}
