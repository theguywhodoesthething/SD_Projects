package com.sd.stringreplacement;

public class StringReplacerImpl implements StringReplacer {

	@Override
	public String replaceString(String input, String toReplace, String replaceStr) throws BadInputException {
		if(input == null || toReplace == null || replaceStr == null) {
			throw new BadInputException();
		}
		
		return input.replace(toReplace, replaceStr);
	}

	@Override
	public String replaceChar(String input, Character match, Character c) throws BadInputException {
		// TODO Auto-generated method stub
		return null;
	}

}
