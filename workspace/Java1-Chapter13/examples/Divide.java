package examples;

import java.util.Scanner;

public class Divide {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter an int: ");
		int num1 = keyboard.nextInt();
		System.out.print("Please enter another int: ");
		int num2 = keyboard.nextInt();
		keyboard.close();
		
		int result = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + result);
	}
}
