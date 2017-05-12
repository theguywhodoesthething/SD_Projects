package project;

public class NotBigO {
	public boolean unique(String userStringIn){
		
		int[] theString = new int[128];
		char theChar;
		
		for (int i = 0; i < userStringIn.length(); i++) {
			
			theChar = userStringIn.charAt(i);
			
			if(theString[(int)theChar] == 1) {
				return false;
			}
			else {
				theString[(int)theChar]++;
			}
		}
		return true;
	}
}
