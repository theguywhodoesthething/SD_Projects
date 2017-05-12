package solutions;

public class BMI {
	public static void main(String[] args) {
		java.util.Scanner keyboard = new java.util.Scanner(System.in);

		System.out.print("Please enter a height in inches: ");
		int height = keyboard.nextInt();
		System.out.print("Please enter a weight in pounds: ");
		int weight = keyboard.nextInt();
		keyboard.close();

		float bmi = (weight * 703) / (height * height);

		System.out.println("A person " + height + " inches tall who weighs "
				+ weight + " pounds has a body mass index of " + bmi + ".");
	}
}
