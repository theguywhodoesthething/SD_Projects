package solutions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divide2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int result = 0;
		int num1 = 0;
		int num2 = 0;

		try {
			System.out.print("Please enter an int: ");
			num1 = keyboard.nextInt();
			System.out.print("Please enter another int: ");
			num2 = keyboard.nextInt();
			keyboard.close();
			result = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + result);
		} 
		catch (InputMismatchException e) {
			System.err.println("You must enter an int.");
		} 
		catch (ArithmeticException e) {
			System.err.println("Zero is not allowed for the second number.");
		}
	}
}
