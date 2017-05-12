package projects;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {

		double weight, height, inches, feet, bmi;

		Scanner kb = new Scanner(System.in);

		System.out.print("Please enter your weight in lbs: ");
		weight = kb.nextDouble();
		System.out.print("Please enter your height in ft: ");
		feet = kb.nextDouble();
		System.out.print("Please enter your height in in: ");
		inches = kb.nextDouble();

		height = inches + (feet * 12);
		bmi = ((weight * 703) / (height * height));

		System.out.println("Your BMI is: " + bmi + "\nYou are ");

		if (bmi < 18.5)
			System.out.print("Underweight");
		else if (bmi >= 18.5 && bmi < 25)
			System.out.print("Normal");
		else if (bmi >= 25 && bmi < 30)
			System.out.print("Overweight");
		else if (bmi > 30)
			System.out.print("Obese");

		kb.close();
	}
}
