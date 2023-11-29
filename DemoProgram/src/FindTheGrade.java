
public class FindTheGrade {
	public void grad(int marks) {
		if (marks > 90) {
			System.out.println(" \"A Grade!!\" ");
		} else if (60 < marks && marks <= 75) {
			System.out.println("\" C Grade!!\" ");
		} else if (45 < marks && marks <= 60) {
			System.out.println(" \"D Grade!!\" ");
		} else if (35 < marks && marks <= 45) {
			System.out.println(" \"E Grade!!\" ");
		}else{
			System.out.println(" Try Next Semester ");
		}
	}

}
