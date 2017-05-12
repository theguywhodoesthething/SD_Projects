package project;

public class Encrypt {
	public String encrypting(String input, int[] userShift) {
		
		String output = "";
		char character;
		
		for (int i = 0; i < input.length(); i++) {
			
			character = input.charAt(i);
			character += userShift[i];
			
			if (character > 122) {
				character = (char) (96 + (character - 122));
			}
			
			output += character;
		}
		return output;
	}
}