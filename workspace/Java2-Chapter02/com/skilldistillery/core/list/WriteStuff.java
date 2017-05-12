package com.skilldistillery.core.list;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteStuff {

	public static void main(String[] args) {

		try {
//			FileWriter fw = new FileWriter("stuff.txt");
//			fw.write("Written by FileWriter\n");
//			PrintWriter pw = new PrintWriter(fw);
//			pw.println("Written by PrintWriter");
			PrintWriter pw = new PrintWriter(new FileWriter("stuff.txt"));
			pw.println("Written by PrintWriter");
			writeInt(pw, "Write it!");
			pw.close();
//			fw.close();			
		} catch (IOException e) {
			System.err.println(e);
			e.printStackTrace();
		}
		
//		Read Stuff
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
		}

	}
	

}
