import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Numder = ");
		int even=scan.nextInt();
		if(even% 2!= 0) {
			System.out.println("The Given is Numder = "+ even + "is an Even");
			scan.close();
		}
	}

}
