package com.kn.multithreading;

public class Hospital {

	public static void main(String[] args) {
		Treatment treatment = new Treatment();
		Thread tom = new Thread(treatment);
		Thread jerry = new Thread(treatment);
		Thread scooby = new Thread(treatment);

		tom.setName("Tom");
		jerry.setName("Jerry");
		scooby.setName("Scooby");

		tom.start();
		jerry.start();
		scooby.start();
	}

}
