package project;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PigLatin {
	
	private static Scanner kb = new Scanner(System.in);
	private static String word = "";

	public static void main(String[] args) {
		
		
		System.out.println("Welcome to the Pig Latin translator.");
		
		do {
			System.out.println("Please enter a word or type 'q' to quit.");
			
			pigLatin();
			
		} while (!word.equals("q"));


	}
	
	public static void pigLatin() {
		

		String vowel = "^[aeiouAEIOU]";
		String consonantVowel = "^[^aeiouAEIOU][aeiouAEIOU]";
		String twoConsonants = "^[^AEIOUaeiou][^AEIOUaeiou]";
		
		word = kb.nextLine();
		
		Pattern p = Pattern.compile(vowel);
		Matcher m = p.matcher(word);
		
		
		m.
		
		if (m.find()) {		
			System.out.println(word + "way");
		}
		
		Pattern c = Pattern.compile(consonantVowel);
		Matcher d = c.matcher(word);
		
		if(d.find()) {
			char[] arr = new char[word.length()];
			String newWord = "";
			
			for(int i = 0; i < word.length(); i++) {
				arr[i] = word.charAt(i);
			}
			
			for (int i = 0; i < arr.length-1; i++) {
				newWord += arr[i+1];
			}
			
			newWord = newWord + arr[0] + "ay";

			System.out.println(newWord);

		}
		
		Pattern a = Pattern.compile(twoConsonants);
		Matcher b = a.matcher(word);
		
		
		if(b.find()) {
			char[] arr = new char[word.length()];
			String newWord = "";
			
			for(int i = 0; i < word.length(); i++) {
				arr[i] = word.charAt(i);
			}
			
			for (int i = 0; i < arr.length-2; i++) {
				newWord += arr[i+2];
			}
			
			newWord += arr[0] + "" + arr[1] + "ay";

			System.out.println(newWord);

		}
	
	}

}
