import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Numder = ");
		int num=scan.nextInt();
		if(num>0) {
			System.out.println("The Given is Valued = "+ num + "is numder");
			scan.close();
		}
			
	}

}
