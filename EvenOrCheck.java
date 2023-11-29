import java.util.Scanner;

public class EvenOrCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Take the Input form EndUser
		System.out.println("Enter rthe Number = ");
		int num = scan.nextInt();
		checkNumberEvenOrNot(num);
		scan.close();
	}

	private static void checkNumberEvenOrNot(int num) {
		if (num % 2 == 0) {
			System.out.println("This is Even Number ! ");
		} else {
			System.out.println("This is Odd Number ");
		}
	}
}
