package solutions;

public class Ceiling {
	public static void main(String[] args) {
		java.util.Scanner keyboard = new java.util.Scanner(System.in);

		System.out.print("Please enter a floating point number: ");
		double num = keyboard.nextDouble();
		keyboard.close();

		int floor = (int)num;
		System.out.println("The floor of " + num + " is " + floor);
	}
}
