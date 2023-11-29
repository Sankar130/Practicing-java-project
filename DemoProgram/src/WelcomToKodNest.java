import java.util.Scanner;

public class WelcomToKodNest {
	public static void main(String[] args) {
		//print 
		System.out.println("Welcome to KodNest!!");
		//input scan the endUser
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter you Mark =");
		//scan the input to given the endUser
		int score=scan.nextInt();
		//call class to object
		WelcomClass sc=new WelcomClass();
		//calling the method
		sc.TechCulb(score);
		//close the scan
		scan.close();
		
	}
	

}
