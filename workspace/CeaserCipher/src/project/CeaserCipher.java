package project;

import java.util.Scanner;

public class CeaserCipher {
	
	public static void main(String[] args) {
				
		Scanner kb = new Scanner(System.in);
		
		String userString, encryOrDecrypt, userOutput = null, userEmpty = "";
		int userShift;
		
		do {
			
			System.out.println("Would you like to encrypt or decrypt a word (E/D)? Or quit with any key.");
			encryOrDecrypt = kb.next();
			
			if (!encryOrDecrypt.toUpperCase().equals("D") && !encryOrDecrypt.toUpperCase().equals("E")) {
				break;
			}
			
			System.out.println("What is your shift amount? ");
			userShift = kb.nextInt();
			
			if (encryOrDecrypt.toUpperCase().equals("E")) {
				userEmpty = kb.nextLine();
				System.out.println("What message would you like to encrypt? ");
				
				userString = kb.nextLine();
				
				//System.out.println(userString);
				
				Encrypt newEncryption = new Encrypt();
				userOutput = newEncryption.encrypting(userString, userShift);
				
			}
			else if (encryOrDecrypt.toUpperCase().equals("D")) {
				userEmpty = kb.nextLine();
				System.out.println("What message would you like to decrypt? ");
				
				userString = kb.nextLine();
				
				//System.out.println(userString);
				
				Decrypt newDecryption = new Decrypt();
				userOutput = newDecryption.decrypting(userString, userShift);
			}
			
			System.out.println("Your message is " + userOutput);

			
		} while (encryOrDecrypt.toUpperCase().equals("E") || encryOrDecrypt.toUpperCase().equals("D"));
	
		
		
		kb.close();
		
	}

}
