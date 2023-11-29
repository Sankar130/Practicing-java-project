import java.util.Scanner;

public class CheckTheAllMethod {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = scan.nextInt();
		PositiveNumberOrNot p = new PositiveNumberOrNot();
		p.positive(num);
		EvenNumderCheck n = new EvenNumderCheck();
		n.even(num);
		MultipleTheNumder m = new MultipleTheNumder();
		m.multiple(num);
		scan.close();
	}

}
