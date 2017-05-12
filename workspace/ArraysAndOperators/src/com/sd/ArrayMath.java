package com.sd;

/**
 * Fill in the code to get JUnit tests to run successfully. In the /test directory, right-click and
 * choose "Run As -> JUnit Test." The class tests functionality of the ArrayMath class, and all tests
 * fail because you have not implemented the functionality within the methods. Once you do so, the tests
 * will pass.
 *
 */
public class ArrayMath {
	/**
	 * Divide two ints. No error checking for zero is required.
	 * 
	 * @param o1
	 * @param o2
	 * @return result of int division
	 */
	public static int integerDivision(int o1, int o2){
		int result = o1/o2;
		
		//Fill in code here
		
		return result;
	}
	
	/**
	 * Find the remainder of dividing two ints. No error checking for zero is required.
	 * 
	 * (This method should be implemented with as few lines of code as possible.)
	 * 
	 * @param o1
	 * @param o2
	 * @return remainder of int division
	 */
	public static int integerRemainder(int o1, int o2){
		int result = o1 % o2;
		
		//Fill in code here
		
		return result;
	}
	
	/**
	 * Take a two-dimensional array of size n by 2 and divide the number at the 
	 * first index of each row by the number at the second index.
	 *
	 * @param pairs a two-dimensional array of size [n][2].
	 * @return int[] of the same length as pairs, with the result of each division.
	 */
	public static int[] dividePairsOfInts(int[][] pairs){
		
		int[] results = new int[pairs.length];
		
		for (int i = 0; i < pairs.length; i++) {
			
			results[i] = pairs[i][0]/pairs[i][1];
			
		}
		
		//Hint: reassign results to a new array of the correct length
		
		return results;
	}
	
	/**
	 * Take a two-dimensional array of size n by 2 and get the remainder of dividing the number at the 
	 * first index of each row by the number at the second index.
	 *
	 * @param pairs a two-dimensional array of size [n][2].
	 * @return int[] of the same length as pairs, with the remainder of each division.
	 */
	public static int[] dividePairsOfIntsForRemainder(int[][] pairs){
		
		int[] results = new int[pairs.length];
		
		for (int i = 0; i < pairs.length; i++) {
			
			results[i] = pairs[i][0] % pairs[i][1];
			
		}
		
		//Hint: reassign results to a new array of the correct length
		
		return results;
	}
	
	/**
	 * Add all members of the array and return the sum. This does not require checking for a null array.
	 * @param array an array of ints
	 * @return sum of ints
	 */
	public static int sumArray(int[] array){

		int result = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			result += array[i];
			
		}
		
		//Fill in code here
		
		return result;
	}
	
}
