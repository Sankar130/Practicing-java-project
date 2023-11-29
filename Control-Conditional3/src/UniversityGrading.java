
public class UniversityGrading {
	public void grading(int num) {
		if (num < 35) {
			System.out.println("Your is Grade \"F\" !!");
		}
		else if (num > 35 && num <= 60) {
			System.out.println("Your is Grade \"C\" !!");
		}
		else if (num > 60 && num <= 75) {
			System.out.println("Your is Grade \"B\" .");
		}
		else if (num > 75 && num <= 100) {
			System.out.println("Your is Grade \"A\" .");
		} else {
			System.out.println("'Extra Mark for Good HandWritting'");

		}

	}

}
