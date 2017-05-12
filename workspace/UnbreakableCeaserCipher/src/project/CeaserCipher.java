package project;

import java.util.Scanner;

public class CeaserCipher {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String userString, encryOrDecrypt, userOutput = null, userEmpty = "";
		// int userShift;
		System.out.println("Would you like to encrypt or decrypt a word (E/D)? ");
		encryOrDecrypt = kb.next();
		// System.out.println("What is your shift amount? ");
		// userShift = kb.nextInt();

		if (encryOrDecrypt.toUpperCase().equals("E")) {
			userEmpty = kb.nextLine();
			System.out.println("What message would you like to encrypt? ");
			userString = kb.nextLine();

			Key newKey = new Key();
			int[] j = newKey.key(userString.length());
			for (int i = 0; i < j.length; i++) {
				System.out.println(j[i]);

			}
			Encrypt newEncryption = new Encrypt();
			userOutput = newEncryption.encrypting(userString, j);
		} else if (encryOrDecrypt.toUpperCase().equals("D")) {
			userEmpty = kb.nextLine();
			System.out.println("What message would you like to decrypt? ");
			userString = kb.nextLine();
			int j[] = new int[userString.length()];
			System.out.println("enter your Key: ");
			for (int i = 0; i < userString.length(); i++) {

				j[i] = kb.nextInt();
			}
			// System.out.println(userString);
			Decrypt newDecryption = new Decrypt();
			userOutput = newDecryption.decrypting(userString, j);
		}
		System.out.println("Your message is " + userOutput);
		kb.close();
	}
}