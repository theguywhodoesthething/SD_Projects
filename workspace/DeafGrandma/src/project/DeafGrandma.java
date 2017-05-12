package project;

import java.util.Scanner;

public class DeafGrandma {

	static boolean stay = true;

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		String input;

		do {
			System.out.println("What would you like to say to Grandma?");
			input = kb.nextLine();

			System.out.println(canGrandmaHearMe(input));

		} while (stay);

		kb.close();
	}

	public static String canGrandmaHearMe(String input) {

		int var = (int) (Math.random() * 6);
		String response = null;

		if (input.equals(input.toUpperCase())) {
			
			if (input.matches("(.*)GOODBYE(.*)")) {
				stay = false;
				return "SMELL YOU LATER.";
			}
		
			switch (var) {
			case 0:
				response = "NO, NOT SINCE THE WAR!";
				break;
			case 1:
				response = "THE LAST THING I WANT TO DO IS HURT YOU. BUT ITS STILL ON THE LIST.";
				break;
			case 2:
				response = "IF I AGREED WITH YOU THEN WE'D BOTH BE WRONG.";
				break;
			case 3:
				response = "IF YOU THINK NOBODY CARES IF YOU'RE ALIVE TRY MISSING A COUPLE PAYMENTS.";
				break;
			case 4:
				response = "TO STEAL IDEAS FROM ONE PERSON IS PLAGIARISM. TO STEAL FROM MANY IS RESEARCH.";
				break;
			default:
				response = "NEVER, UNDER ANY CIRCUMSTANCES, TAKE A LAXATIVE AND A SLEEPING PILL ON THE SAME NIGHT.";
			}
		}
		else {
			return "HUH? SPEAK UP BILLY!";
		}
		System.out.println(var);
		return response;
	}
}
