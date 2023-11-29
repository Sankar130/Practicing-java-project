import java.util.Scanner;

public class RainbowColor {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		Colors c=new Colors ();
		System.out.println("Enter the Color = ");
		char color =Scan.next().charAt(0);
		c.givenColor(color);
		Scan.close();
		
		
		
	}

}
