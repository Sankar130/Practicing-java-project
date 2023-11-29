import java.util.Scanner;

public class VowlesOrConsonants {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Take the Input form EndUser
		System.out.println("Enter the Charater is = ");
		char ch =scan.next().charAt(0);
		// Call the Method for Check the Conditional
		checkVowlesOrConsonants(ch);
		//Close the scan
		scan.close();
	}

	private static void checkVowlesOrConsonants(char ch) {
		// Check the Input is Vowels Enter the If Body
		if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'||ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U') {
			System.out.println("The character is Vowles !!");
		}else {
			// Check the Input is Not Vowels Enter the If Body
			System.out.println("The character is  Not a Vowles !!");
			
		}
	}

}
