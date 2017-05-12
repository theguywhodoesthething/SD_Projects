package labs;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator calc;

	@Before
	public void setUp() {
		calc = new Calculator();
	}
	
	@After 
	public void tearDown() {
		calc = null;
	}
	
	@Test
	public void test_that_can_add_two_numbers() {
		int num1 = 4, num2 = 4;
		
			assertEquals(num1 + num2, calc.add(num1, num2));
	}
	
	@Test
	public void test_that_can_subtract_two_numbers() {
		int num1 = 4, num2 = 4;
		
			assertEquals(num1 - num2, calc.subtract(num1, num2));
	}
	
	@Test
	public void test_that_can_multiply_two_numbers() {
		int num1 = 4, num2 = 4;

			assertEquals(num1 * num2, calc.multiply(num1, num2));
	}
	
	@Test
	public void test_that_can_divide_two_numbers() {
		double num1 = 4.0, num2 = 4.0;

			assertEquals(num1 / num2, calc.divide(num1, num2), 0.0001);
	}
	
	@Test
	public void test_to_see_if_dividing_by_zero_throw_an_error() {
		double num1 = 0, num2 = 4;
		
		try {
			assertEquals(num1 / num2, calc.divide(num1, num2), 0.0001);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	
	
	
	
	
	
	
	
}