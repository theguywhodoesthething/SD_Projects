package com.sd;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Right-click and choose "Run As -> JUnit Test." Methods of the ArrayMath class are called by each test.
 * They will fail because you have not implemented the functionality within the methods of the ArrayMath class. 
 * Once you do so, the tests will pass.
 * 
 * A good strategy is to work on getting one test to pass at a time.
 *
 */
public class ArrayMathTests {

	@Test
	public void test_integerDivision_divides_as_expected() {
		int result = ArrayMath.integerDivision(21, 5);
		assertEquals(4, result);
		result = ArrayMath.integerDivision(3, 1);
		assertEquals(3, result);
		
		assertEquals(4, ArrayMath.integerDivision(20, 5));
		assertEquals(1, ArrayMath.integerDivision(15, 13));
		assertEquals(0, ArrayMath.integerDivision(13, 15));
	}

	@Test
	public void test_integerRemainder_divides_as_expected() {
		int result = ArrayMath.integerRemainder(21, 5);
		assertEquals(1, result);
		
		assertEquals(0, ArrayMath.integerRemainder(3, 1));
		assertEquals(0, ArrayMath.integerRemainder(6, 2));
		assertEquals(1, ArrayMath.integerRemainder(7, 3));
		assertEquals(2, ArrayMath.integerRemainder(15, 13));
		assertEquals(13, ArrayMath.integerRemainder(13, 15));
	}
	
	@Test
	public void test_dividePairsOfInts_uses_2d_array_and_divides_members(){
		int[][] operands = {
				{12, 4},
				{9, 4},
				{19, 1},
				{16, 8},
				{88, 11},
				{33, 6},
		};
		
		int[] expectedResults = {
			3,
			2,
			19,
			2,
			8,
			5
		};
		
		int[] results = ArrayMath.dividePairsOfInts(operands);
		assertArrayEquals(expectedResults, results);
	}
	@Test
	public void test_dividePairsOfIntsForRemainder_uses_2d_array_and_getsRemainder(){
		int[][] operands = {
				{12, 4},
				{9, 4},
				{1, 19},
				{16, 7},
				{88, 5},
				{32, 6},
		};
		
		int[] expectedResults = {
			0,
			1,
			1,
			2,
			3,
			2
		};
		
		int[] results = ArrayMath.dividePairsOfIntsForRemainder(operands);
		assertArrayEquals(expectedResults, results);
	}
	
	@Test
	public void test_sumArray_adds_all_members(){
		int[] ops;
		ops = new int[]{6, -22, -8, 9, 12};
		
		assertEquals(-3, ArrayMath.sumArray(ops));
		
		int[] ops2 = {1, 2, 3, 4, 5, -9, 2};
		
		assertEquals(8, ArrayMath.sumArray(ops2));
		
		assertEquals(0, ArrayMath.sumArray(new int[]{}));
	}
}
