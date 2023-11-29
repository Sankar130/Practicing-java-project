import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		System.out.println("Enter Your Age =");
		int age = r.nextInt();
		if (age >= 18) {
			System.out.print("Your are Eligible for Voting");
		} else {
			System.out.println("Your are Not Eligible for Voting");
		}
		r.close();

	}

}
