package solutions;

public class Floor {
	public static void main(String[] args) {
		java.util.Scanner keyboard = new java.util.Scanner(System.in);

		System.out.print("Please enter a floating point number: ");
		double num = keyboard.nextDouble();
		keyboard.close();

		int ceiling = (int)(num + 1);
		System.out.println("The celing of " + num + " is " + ceiling);
	}
}
