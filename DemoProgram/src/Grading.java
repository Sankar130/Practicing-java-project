import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Grade = ");
		int marks=scan.nextInt();
		FindTheGrade f=new FindTheGrade();
		f.grad(marks);
		scan.close();
	}

}
