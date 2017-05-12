package com.sd;

import java.io.IOException;

public class SDFTest {

	public static void main(String[] args) {
		
		SDFileReader test = new SDFileReader("threeLines.txt");
				
		try {
			test.readLines();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
