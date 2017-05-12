package examples;

import static org.junit.Assert.*;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void testEquilateral() {
        Triangle t = new Triangle(3, 3, 3);
        assertTrue(t.isEquilateral());
    }

    @Test
    public void testIsosceles() {
        Triangle t = new Triangle(3, 3, 4);
        assertTrue(t.isIsosceles());
        t = new Triangle(3, 4, 3);
        assertTrue(t.isIsosceles());
        t = new Triangle(4, 3, 3);
        assertTrue(t.isIsosceles());
    }

    @Test
    public void testScalene() {
        Triangle t = new Triangle(3, 4, 5);
        assertTrue(t.isScalene());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testZeroSide1() {
        new Triangle(0, 2, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testZeroSide2() {
        new Triangle(2, 0, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testZeroSide3() {
        new Triangle(2, 2, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeSide1() {
        new Triangle(-1, 2, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeSide2() {
        new Triangle(2, -1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeSide3() {
        new Triangle(2, 2, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSidesNotLongEnough1() {
        new Triangle(3, 1, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSidesNotLongEnough2() {
        new Triangle(1, 3, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSidesNotLongEnough3() {
        new Triangle(1, 1, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSidesNotLongEnough4() {
        new Triangle(2, 1, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSidesNotLongEnough5() {
        new Triangle(1, 2, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSidesNotLongEnough6() {
        new Triangle(1, 1, 2);
    }
}
