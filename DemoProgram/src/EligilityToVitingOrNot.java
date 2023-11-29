import java.util.Scanner;

public class EligilityToVitingOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Age = ");
		int age=scan.nextInt();
		VotingCheck a1=new VotingCheck();
		a1.age(age);
		scan.close();
		
	}

}
