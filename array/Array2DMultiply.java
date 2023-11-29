package com.kn.array;

import java.util.Scanner;

public class Array2DMultiply {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a size of an Array1: ");
		int[][] a = new int[scan.nextInt()][scan.nextInt()];
		System.out.println("Enter a Data of an Array1: ");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		System.out.println("Enter a Size of an Array2: ");
		int[][] b = new int[scan.nextInt()][scan.nextInt()];
		System.out.println("Enter a Data of an Array2: ");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				b[i][j] = scan.nextInt();
			}
		}
		int[][] c = new int[a.length][b.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				c[i][j] = 0;
				for (int k = 0; k < c.length; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}

			}
		}
		System.out.println("Multiply Answer ");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				System.out.print(c[i][j] + " ");
			}
System.out.println();
		}
		scan.close();
	}

}