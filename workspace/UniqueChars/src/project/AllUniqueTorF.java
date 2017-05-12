package project;

public class AllUniqueTorF {
	public boolean BigO(String userStringIn) {
		
		for (int i = 0; i < userStringIn.length(); i++) {
			
			char eachChar = userStringIn.charAt(i);
			// char x;
			
			for (int j = i+1; j < userStringIn.length(); j++) {
				
				// x = userStringIn.charAt(j);
				
				if (eachChar == userStringIn.charAt(j)){
					return false;
				}
			}
		}
		
		return true;
	}
	
	public boolean notBigO(String userStringIn){
		
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
