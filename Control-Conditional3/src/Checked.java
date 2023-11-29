import java.util.Scanner;

public class Checked {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your character = ");
		char vowels = scan.next().charAt(0);
		if (vowels == 'a' || vowels == 'e' || vowels == 'i' || vowels == 'o' || vowels == 'u') {
			System.out.print(" The given character = ");
		}
		// else {
		// System.out.println("Your are Not Eligible for Voting");

		scan.close();
	}
}
