package solutions;

public class BMIMeth2 {
	// main method
	public static void main(String[] args) {
		java.util.Scanner keyboard = new java.util.Scanner(System.in);

		System.out.print("Please enter a height in feet: ");
		int heightFeet = keyboard.nextInt();
		System.out.print("Please enter the remaining height in inches: ");
		int heightInches = keyboard.nextInt();
		System.out.print("Please enter a weight in pounds: ");
		int weight = keyboard.nextInt();
		keyboard.close();

		float bmi = computeBMI(heightFeet * 12 + heightInches, weight);

		System.out.print("A person " + heightFeet + "'" + heightInches
				+ "\" tall who weighs " + weight
				+ " pounds has a body mass index of " + bmi + " which is "
				+ getCategory(bmi) + ".");
	}

	// computeBMI method
	public static float computeBMI(int height, float weight) {

		float bodyMassIndex = (weight * 703) / (height * height);

		return bodyMassIndex;
	}

	// getCategory method
	public static String getCategory(float bmi) {
		if (bmi < 18.5) {
			return "Underweight";
		} 
		else if (bmi <= 24.9) {
			return "Normal";
		} 
		else if (bmi <= 29.9) {
			return "Overweight";
		} 
		else {
			return "Obese";
		}
	}

}
