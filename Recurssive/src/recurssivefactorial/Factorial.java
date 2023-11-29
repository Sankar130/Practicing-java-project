package recurssivefactorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.print("Enter a number to find it's a Factorial = ");
		Scanner sc = new Scanner(System.in);
		long n= sc.nextLong();
		 System.out.print("Factorial of "+n+" = "+factorial(n));
		 sc.close();
	}

	public static long factorial(long n) {
		if(n == 1) {
			return 1;
		}else {
			return n* factorial(n-1);
		}
		
	}

}
