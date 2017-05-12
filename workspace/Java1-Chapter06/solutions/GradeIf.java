package solutions;

public class GradeIf {
	public static void main(String[] args) {
		java.util.Scanner keyboard = new java.util.Scanner(System.in);

		System.out.print("Please enter a numeric grade: ");
		int numGrade =  keyboard.nextInt();
		keyboard.close();

		String grade = "";
		if (numGrade >=90) {
			grade = "A";
		}
		else if (numGrade >=80 && numGrade <90) {
			grade = "B";
		}
		else if (numGrade >=70 && numGrade <80) {
			grade = "C";
		}
		else if (numGrade >=60 && numGrade <70) {
			grade = "D";
		}
		else {
			grade = "F";
		}

		System.out.println(numGrade + " is graded as: " + grade);
	}
}