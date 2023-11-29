import java.util.Scanner;

public class VotingEligbilityCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Take the Input form EndUser
		System.out.println("Enter Your Age = ");
		int age = scan.nextInt();
		// Call the Method for Check the Conditional
		checkEligbilityOrNot(age);
		//Close the scan
		scan.close();
	}

	public static void checkEligbilityOrNot(int age) {
		// Check the Input is Eligibility for Voting Enter the If Body
		if (age >= 18) {
			// print the Statement
			System.out.println("Your Eligibility for Voting ! ");
		} else {
			//Check the Input is Not Eligibility for Voting Enter the Else Body
			System.out.println("Your Not Eligibility for Voting  ");

		}

	}

}
