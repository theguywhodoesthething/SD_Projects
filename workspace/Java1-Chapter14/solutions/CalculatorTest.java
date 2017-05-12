package solutions;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(11, Calculator.add(9, 2), .001);
    }

    @Test
    public void testSubtract() {
        assertEquals(7, Calculator.subtract(9, 2), .001);
    }

    @Test
    public void testMultiply() {
        assertEquals(11, Calculator.add(9, 2), .001);
    }

    @Test
    public void testIntegerDivision() {
        assertEquals(4.0, Calculator.divide(9, 2), .001);
    }

    @Test
    public void testFloatingPointDivision() {
        assertEquals(4.5, Calculator.divide(9.0, 2.0), .001);
    }

}
