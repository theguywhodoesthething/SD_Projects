package project;

public class Decrypt {
	public String decrypting(String input, int userShift[]) {

		String output = "";
		char character;

		for (int i = 0; i < input.length(); i++) {

			character = input.charAt(i);
			character -= userShift[i];
			
			if (character < 97) {
				character = (char) (123 - (97 - character));
			}
			
			output += character;

		}

		return output;
	}
}
