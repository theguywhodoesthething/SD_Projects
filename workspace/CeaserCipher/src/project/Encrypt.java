package project;

public class Encrypt {

	public String encrypting(String input, int userShift) {
		
		String output = "";
		char character;
		
		for(int i = 0; i < input.length(); i++) {
		
			character = input.charAt(i);
			character += userShift;
			output += character;
		
		}
		
		return output;
	}

}
