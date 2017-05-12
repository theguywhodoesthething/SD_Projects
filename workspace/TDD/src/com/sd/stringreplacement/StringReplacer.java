package com.sd.stringreplacement;

public interface StringReplacer {
	
	String replaceString(String input, String toReplace, String replaceStr) throws BadInputException;
	String replaceChar(String input, Character match, Character c) throws BadInputException;
	
	

}
