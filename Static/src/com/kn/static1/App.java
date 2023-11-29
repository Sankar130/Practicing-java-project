package com.kn.static1;

public class App {
	// static Variables
	static int x, y;

	// static Block
	static {
		System.out.println("====>Static Block.<====");
		x = 10;
		y = 20;
	}

	// Static method
	public static void m1() {
		System.out.println("====>Static method().<====");
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
	}

	// Instance Variable
	int a, b;

	// Instance Block
	{
		System.out.println("====>Instance Block.<====");
		a = 11;
		b = 22;
		x = 100;
		y = 200;

	}

	// Instance method
	public void m2() {
		System.out.println("====>Instance Method ().<====");
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		System.out.println("X = " + x);
		System.out.println("y = " + y);
	}

	// Constructor
	public App() {
		System.out.println("====>Constructor of App.<====");
	}

}
