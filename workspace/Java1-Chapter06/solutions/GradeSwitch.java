package solutions;

public class GradeSwitch {
	public static void main(String[] args) {
		java.util.Scanner keyboard = new java.util.Scanner(System.in);

		System.out.print("Please enter a numeric grade: ");
		int numGrade =  keyboard.nextInt();
		keyboard.close();

		if (numGrade > 100) {
			numGrade = 100;
		}
		
		String grade = "";
		switch(numGrade) {
		case 90: case 91: case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99: case 100:
			grade = "A";
			break;
		case 80: case 81: case 82: case 83: case 84: case 85: case 86: case 87: case 88: case 89:
			grade = "B";
			break;
		case 70: case 71: case 72: case 73: case 74: case 75: case 76: case 77: case 78: case 79:
			grade = "C";
			break;
		case 60: case 61: case 62: case 63: case 64: case 65: case 66: case 67: case 68: case 69:
			grade = "D";
			break;
		default: 
			grade = "F";
		}
		System.out.println(numGrade + " is graded as: " + grade);
	}
}