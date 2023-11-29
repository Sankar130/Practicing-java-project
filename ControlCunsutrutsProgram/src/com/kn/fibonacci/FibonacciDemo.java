package com.kn.fibonacci;

public class FibonacciDemo {
	public void findFibonacci(int range) {
		// TODO Auto-generated method stub
		int first = 0, second = 1, next = 0;
		System.out.print(first + " " + second);
		for (int i = 3; i <= range; i++) {
			next = first + second;
			first = second;
			second = next;
			System.out.print(" " + next);
		}
	}
}