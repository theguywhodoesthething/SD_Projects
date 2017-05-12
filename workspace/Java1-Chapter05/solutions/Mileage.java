package solutions;

public class Mileage {
	public static void main(String[] args) {
		java.util.Scanner keyboard = new java.util.Scanner(System.in);

		System.out.print("Please enter the number of miles driven: ");
		int milesDriven = keyboard.nextInt();
		System.out.print("Please enter the number of gallons consumed: ");
		float fuelConsumed = keyboard.nextFloat();
		keyboard.close();
		
		float fuelMileage = milesDriven / fuelConsumed;

		System.out.println("You drove " + milesDriven + " miles and consumed "
				+ fuelConsumed + " gallons of fuel.");
		System.out.println("You got " + (int)(fuelMileage + .5) + " miles per gallon.");
	}
}
