package project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Declaration {

	public static void main(String[] args) {
	
		List<String> sList = new ArrayList<>();
		
		String line = "";
		int wordCount = 0;
		int charCount = 0;
		
		try (BufferedReader br = new BufferedReader(new FileReader("Declaration.txt"))) {
			
			while ((line = br.readLine()) !=null) {
				
				Pattern pw = Pattern.compile("\\b\\w+\\b");
				Matcher mw = pw.matcher(line);
				
				mw.reset(line);
				
				while (mw.find()) {
					 wordCount++;
				}
				
				Pattern pc = Pattern.compile("\\w");
				Matcher mc = pc.matcher(line);
				
				mc.reset(line);
				
				while (mc.find()) {
					charCount++;
				}
				
				sList.add(line);
			}

		} catch (IOException e) {
			System.err.println(e);
		}
		
//		int empLines = 0;
//		
//		for (String i : sList) {
//			
//			Pattern pw = Pattern.compile("^\\n");
//			Matcher mw = pw.matcher(i);
//			
//			mw.reset(i);
//			
//			while (mw.find()) {
//				 empLines++;
//				 sList.remove(i);
//			}
//		}
		
		System.out.println("The line count is " + sList.size());
		System.out.println("The word count is " + wordCount);
		System.out.println("The character count is " + charCount);
//		System.out.println("Empty lines: "  + empLines);

	}

}
