import java.util.Scanner;

public class UppercaseOrLowerCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Charater is = ");
		char alphabet = scan.next().charAt(0);
		checkUppercaseOrLowerCase(alphabet);
		scan.close();

	}

	public static void checkUppercaseOrLowerCase(char alphabet) {
		if (alphabet >= 65 && alphabet <= 90) {
			System.out.println("The given Charater is " + (int) (alphabet) + " is an UpperCase");
		} else {
			System.out.println("The given Charater is " + (int) (alphabet) + " is an Not UpperCase");
		}
		if (alphabet >= 97 && alphabet <= 122) {
			System.out.println("The given Charater is " + (int) (alphabet) + " is an LowerCase");
		} else {
			System.out.println("The given Charater is " + (int) (alphabet) + " is an Not LowerCase");
		}
		if (alphabet >= 48  && alphabet <= 57) {
			System.out.println("The given Charater is " + (int) (alphabet) + " is an SpecialCharater");
		} else {
			System.out.println("The given Charater is " + (int) (alphabet) + " is an Not SpecialCharater");
		}

	}

}
