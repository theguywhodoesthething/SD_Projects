package com.sd;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class BucketTest {

	public static void main(String[] args) {
		
		List<String> stateNames = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader("StateNames.txt"))) {
			String line = "";
			while ((line = br.readLine()) != null) {
				stateNames.add(line);

			}
		} catch (Exception e) {
			System.err.println(e);
		}
		
		
		for (String name : stateNames) {
			int h = name.hashCode();
			System.out.println((h%4) + ": " + name + ": " + h);
		}

	}

}
