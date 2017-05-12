package com.sd;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * An SDFileReader object is instantiated with a file name. It reads a file and
 * provides access to the lines in the data. It can also split lines in a file
 * into tokens based on a delimiter.
 *
 */
public class SDFileReader {
	private String fileName;

	public SDFileReader(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * Read all the lines of a file. If the file does not exist, throw an
	 * IOException. (Remember, a subclass of IOException IS-A IOException.)
	 * @return A List of Strings, where each String is a line in the file. If
	 * the file is empty, return an empty list.
	 * @throws IOException
	 */
	public List<String> readLines() throws IOException {
		
		List<String> forReturn = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

		String line;
			
			while ((line = br.readLine()) != null) {
				forReturn.add(line);
			}
			
		} catch (IOException e) {
			System.err.println(e);
			throw e;
		}

		return forReturn;
	}

	/**
	 * Read a subset of lines in a file, starting with the first line.
	 * 
	 * @param numberOfLines
	 *            - the number of lines in the file to read.
	 * @return A List of Strings, where each String is a line in the file. If
	 *         the file is empty, return an empty list. If numberOfLines is
	 *         greater than the actual number of lines in the file, return all
	 *         lines. If numberOfLines is less than or equal to zero, return an
	 *         empty list.
	 * @throws IOException
	 *             if the file does not exist.
	 */
	public List<String> readLines(int numberOfLines) throws IOException {

		List<String> forReturn = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			
			String line;

			while ((line = br.readLine()) != null) {
				forReturn.add(line);
			}
			
			if(forReturn.size() < numberOfLines)
				return forReturn;
			
			
			
		} catch (IOException e) {
			System.err.println(e);
			throw e;
		}

		return forReturn;
	}

	/**
	 * Read the lines in a file and split them based on the given delimiter.
	 * 
	 * @param delimiter
	 * @return A List of Strings for each line in the file, stored in a List. If
	 *         the file is empty, return an empty List<List<String>>.
	 * @throws IOException
	 *             if the file does not exist.
	 */
	public List<List<String>> splitLines(String delimiter) throws IOException {
		
		List<String> lines = readLines();
		
		List<List<String>> result = new ArrayList<>();
		
		if(!lines.isEmpty()) {
			for(String s : lines) {
				String[] sArr = s.split(delimiter);
				List<String> arr = Arrays.asList(sArr);
				result.add(arr);
				}
		}
		
		return result;
	}
}
