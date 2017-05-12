package project;

import java.util.Scanner;

public class UniqueChars {
	public static void main(String[] args) {
		Scanner kb = new Scanner (System.in);
		
		char goAgain;
		String userString;
		
		do {

			System.out.println("Please input your string: ");
			userString = kb.nextLine();
			
			AllUniqueTorF result = new AllUniqueTorF();
			
			System.out.println("Every character in your string is unique: " + result.notBigO(userString));
			
			System.out.println("Go again? (Y/N): ");
			goAgain = ((kb.next()).toLowerCase()).charAt(0);
			kb.nextLine();
			
		} while (goAgain == 'y');
			
		kb.close();
		
	}
}
