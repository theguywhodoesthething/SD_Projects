package solutions;

public class BMI4 {
	public static void main(String[] args) {
		java.util.Scanner keyboard = new java.util.Scanner(System.in);

		System.out.print("Please enter a height in feet: ");
		int heightFeet = keyboard.nextInt();
		System.out.print("Please enter the remaining height in inches: ");
		int heightInches = keyboard.nextInt();
		System.out.print("Please enter a weight in pounds: ");
		int weight = keyboard.nextInt();
		keyboard.close();
		
		float bmi = (weight * 703)
				/ ((heightFeet * 12 + heightInches) * (heightFeet * 12 + heightInches));

		System.out.print("A person " + heightFeet + "'" + heightInches
				+ "\" tall who weighs " + weight
				+ " pounds has a body mass index of " + bmi + " which is ");
		
		if (bmi < 18.5) {
			System.out.println("Underweight.");
		}
		else if (bmi <= 24.9) {
			System.out.println("Normal.");
		}
		else if (bmi <= 29.9) {
			System.out.println("Overweight.");
		}
		else {
			System.out.println("Obese.");
		}		
	}
}