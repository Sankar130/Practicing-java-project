package recurssive;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.print("Enter a number to find it's a Fibonacci = ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
		System.out.print(fibonacci(i)+ " ");
		}
		sc.close();
	}

	public static int fibonacci(int n) {
		
		 if(n==0 || n==1) {
				return n;
			}else {
				return fibonacci(n-1)+fibonacci(n-2);
				
			}
	}

}
