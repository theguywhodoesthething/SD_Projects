package com.sd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.List;

import org.junit.After;
import org.junit.Test;

public class SDFileReaderTests {
	
	private SDFileReader reader;
	
	@After
	public void tearDown(){
		reader = null;
	}

	@Test(expected = IOException.class)
	public void test_readLines_throws_IOException_for_file_not_found() throws IOException{
		String fileName = "notFoundFile";
		reader = new SDFileReader(fileName);
		reader.readLines();
	}
	
	@Test(expected = IOException.class)
	public void test_readLines_int_throws_IOException_for_file_not_found() throws IOException{
		String fileName = "notFoundFile";
		reader = new SDFileReader(fileName);
		reader.readLines(15);
	}
	
	@Test(expected = IOException.class)
	public void test_splitLines_throws_IOException_for_file_not_found() throws IOException{
		String fileName = "notFoundFile";
		reader = new SDFileReader(fileName);
		reader.splitLines("X");
	}
	
	@Test
	public void test_readLines_returns_empty_list_for_empty_file(){
		try {
			reader = new SDFileReader("emptyFile.txt");
			List<String> lines = reader.readLines();
			assertNotNull(lines);
			assertEquals(0, lines.size());
		} catch (IOException e) {
			fail(e.toString());
		}
	}
	
	@Test
	public void test_readLines_returns_lines_in_file(){
		try {
			reader = new SDFileReader("threeLines.txt");
			List<String> lines = reader.readLines();
			assertNotNull(lines);
			assertEquals(3, lines.size());
			assertEquals("This is line 1", lines.get(0));
			assertEquals("this is line 2", lines.get(1));
			assertEquals("thisssss is line 3", lines.get(2));
		} catch (IOException e) {
			fail(e.toString());
		}
	}
	
	@Test
	public void test_readLines_int_returns_subset_of_lines_in_file(){
		try {
			reader = new SDFileReader("threeLines.txt");
			List<String> lines = reader.readLines(2);
			assertNotNull(lines);
			assertEquals(2, lines.size());
			assertEquals("This is line 1", lines.get(0));
			assertEquals("this is line 2", lines.get(1));
		} catch (IOException e) {
			fail(e.toString());
		}
	}
	
	@Test
	public void test_readLines_int_returns_all_lines_for_number_greater_than_number_of_lines(){
		try {
			reader = new SDFileReader("threeLines.txt");
			List<String> lines = reader.readLines(5);
			assertNotNull(lines);
			assertEquals(3, lines.size());
			assertEquals("This is line 1", lines.get(0));
			assertEquals("this is line 2", lines.get(1));
			assertEquals("thisssss is line 3", lines.get(2));
			lines = reader.readLines(4);
			assertNotNull(lines);
			assertEquals(3, lines.size());
			lines = reader.readLines(3);
			assertNotNull(lines);
			assertEquals(3, lines.size());
		} catch (IOException e) {
			fail(e.toString());
		}
	}
	
	@Test
	public void test_readLines_int_zero_or_below_returns_empty_list(){
		try {
			reader = new SDFileReader("threeLines.txt");
			List<String> lines = reader.readLines(0);
			assertNotNull(lines);
			assertEquals(0, lines.size());
			
			lines = reader.readLines(-1);
			assertNotNull(lines);
			assertEquals(0, lines.size());
		} catch (IOException e) {
			fail(e.toString());
		}
	}
	
	@Test
	public void test_splitLines_returns_empty_list_for_empty_file(){
		try {
			reader = new SDFileReader("emptyFile.txt");
			List<List<String>> lines = reader.splitLines("%");
			assertNotNull(lines);
			assertEquals(0, lines.size());
		} catch (IOException e) {
			fail(e.toString());
		}
	}
	
	@Test
	public void test_splitLines_splits_on_different_delimiters(){
		try {
			reader = new SDFileReader("delims.txt");
			List<List<String>> lines = reader.splitLines("\\$");
			assertNotNull(lines);
			assertEquals(4, lines.size());
			assertEquals("Line,1", lines.get(0).get(0));
			assertEquals("continued", lines.get(0).get(1));
			assertEquals("Line2", lines.get(1).get(0));
			assertEquals("lorem,ipsum", lines.get(1).get(1));
			assertEquals("dolor", lines.get(1).get(2));
			assertEquals("Line,3", lines.get(2).get(0));
			assertEquals("Line 4 is a line", lines.get(3).get(0));
			
			lines = reader.splitLines(",");
			assertNotNull(lines);
			assertEquals(4, lines.size());
			assertEquals("Line", lines.get(0).get(0));
			assertEquals("1$continued", lines.get(0).get(1));
			assertEquals("Line2$lorem", lines.get(1).get(0));
			assertEquals("ipsum$dolor", lines.get(1).get(1));
			assertEquals("Line", lines.get(2).get(0));
			assertEquals("3", lines.get(2).get(1));
			assertEquals("Line 4 is a line", lines.get(3).get(0));
		} catch (IOException e) {
			fail(e.toString());
		}
	}
	
	
	@Test
	public void test_splitLines_using_string_not_in_file_returns_full_lines(){
		try {
			reader = new SDFileReader("threeLines.txt");
			List<List<String>> lines = reader.splitLines("%");
			assertNotNull(lines);
			assertEquals(3, lines.size());
			assertEquals("This is line 1", lines.get(0).get(0));
			assertEquals("this is line 2", lines.get(1).get(0));
			assertEquals("thisssss is line 3", lines.get(2).get(0));
		} catch (IOException e) {
			fail(e.toString());
		}
	}

}
