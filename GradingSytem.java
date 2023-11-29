import java.util.Scanner;

public class GradingSytem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Your Grading = ");
		int grad=scan.nextInt();
		UniversityGrading u1=new UniversityGrading();
		u1.grading(grad);
		scan.close();
		
	}
}
