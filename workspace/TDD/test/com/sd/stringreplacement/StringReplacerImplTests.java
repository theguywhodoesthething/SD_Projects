package com.sd.stringreplacement;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringReplacerImplTests {
	private StringReplacerImpl sr;
	
	@Before
	public void setUp() {
		sr = new StringReplacerImpl();
	}
	
	@After 
	public void tearDown() {
		sr = null;
	}
	
	@Test
	public void test_replaceString_replaces_input_with_replacement_Str() {
		String input = "I am a String and an Object!";
		String matchStr = "a ";
		String replacement = "###";
		String expectedOutput = "I am ###String and an Object!";
		
		try {
			assertEquals(expectedOutput, sr.replaceString(input, matchStr, replacement));
		} catch (BadInputException e) {
			e.printStackTrace();
			fail(e.toString());
		}
		
	}
	
	@Test(expected = BadInputException.class)
	public void testReplaceStringThrowsBadInputExceptionForNullInputs() throws BadInputException {
		String input = null;
		String toReplace = null;
		String replaceStr = null;
		sr.replaceString(input, toReplace, replaceStr);
	}
	
	@Test
	public void test_replaceString_throws_BadInputException_for_null_inputs() {
		String dummy = "";
		try{
			sr.replaceString(dummy, dummy, null);
			fail("Should have thrown an exception");
		} catch (BadInputException e) {
//			e.printStackTrace();
		}

		try{
			sr.replaceString(dummy, null, dummy);
			fail("Should have thrown an exception");
		} catch (BadInputException e) {
//			e.printStackTrace();
		}

		try{
			sr.replaceString(null, dummy, dummy);
			fail("Should have thrown an exception");
		} catch (BadInputException e) {
//			e.printStackTrace();
		}
	}
	
	

}
