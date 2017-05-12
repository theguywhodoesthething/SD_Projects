package com.skilldistillery.core.list;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadStuff {

	public static void main(String[] args) {

		try {
			
			BufferedReader br = new BufferedReader(new FileReader("hello.txt"));
			String line = "";
			while ((line = br.readLine()) != null) {
				System.out.println("Read from file: " + line);
				
				String[] words = line.split(" ");
				for (String word : words) {
					System.out.println("word: " + word);
				}
			}
			br.close();
			
			
			
		} catch (IOException e) {
			System.err.println(e);
			e.printStackTrace();
		}
		
	}

}
