package solutions;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StringTest {
	String s;

	@Before
	public void setup() {
		s = "Hello World!";
	}

	@Test
	public void testCharAt() {
		assertEquals('H', s.charAt(0));
		assertEquals('!', s.charAt(s.length() - 1));
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testCharAt2() {
		s.charAt(s.length());
	}

	@Test
	public void testConcat() {
		String substring1 = "Hello ";
		String substring2 = "World!";
		String concatenatedString = substring1.concat(substring2);
		assertEquals(s, concatenatedString);
	}

	@Test
	public void testContains() {
		assertTrue(s.contains("Hello"));
		assertFalse(s.contains("hello"));
	}

	@Test
	public void testEndsWith() {
		assertTrue(s.endsWith("World!"));
		assertFalse(s.endsWith("World"));
	}

	@Test
	public void testIndexOf() {
		assertEquals(4, s.indexOf('o'));
		assertEquals(-1, s.indexOf('z'));
		assertEquals(4, s.indexOf("o"));
		assertEquals(-1, s.indexOf("z"));
		assertEquals(7, s.indexOf('o', 5));
		assertEquals(7, s.indexOf("o", 5));
	}

	@Test
	public void testIsEmpty() {
		String s2 = "";
		assertTrue(s2.isEmpty());
		assertFalse(s.isEmpty());
	}

	@Test
	public void testLastIndexof() {
		assertEquals(7, s.lastIndexOf('o'));
		assertEquals(7, s.lastIndexOf("o"));
		assertEquals(3, s.lastIndexOf('l', 5));
		assertEquals(3, s.lastIndexOf("l", 5));
	}

	@Test
	public void testLength() {
		assertEquals(12, s.length());
	}

	@Test
	public void testReplace() {
		assertEquals("Mello World!", s.replace('H', 'M'));
		assertEquals("Mellow World!", s.replace("Hello", "Mellow"));
	}

	@Test
	public void testSplit() {
		String[] expected1 = { "Hell", " W", "rld!" };
		assertArrayEquals(expected1, s.split("o"));

		String[] expected2 = { "Hell", " World!" };
		assertArrayEquals(expected2, s.split("o", 2));
	}

	@Test
	public void testStartsWith() {
		assertTrue(s.startsWith("Hello"));
		assertFalse(s.startsWith("hello"));
		assertTrue(s.startsWith("World", 6));
	}

	@Test
	public void testSubstring() {
		assertEquals("World!", s.substring(6));
		assertEquals("World", s.substring(6, 11));
	}
	
	@Test
	public void testToLowerCase() {
		assertEquals("hello world!", s.toLowerCase());
	}
	
	@Test
	public void testToUpperCase() {
		assertEquals("HELLO WORLD!", s.toUpperCase());
	}

	@Test
	public void testTrim() {
		String s2 = "\t\t\tHello World!    \n ";
		assertEquals(s, s2.trim());
	}
}
