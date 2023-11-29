import java.util.Scanner;

public class WeekDayDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		DayCheck d=new DayCheck();
		System.out.println("Enter the Integer = ");
		int day=scan.nextInt();
		d.findday(day);
		scan.close();
	}

}
