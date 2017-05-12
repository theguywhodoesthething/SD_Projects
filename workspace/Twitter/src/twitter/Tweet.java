package twitter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tweet {

	final int TWEET_SIZE = 140;

	private StringBuilder tweet = new StringBuilder("");
	// private char[] letters = new char [140];

	// -------------------------------------------\\

	// ctor
	public Tweet(StringBuilder tweet) {
		this.tweet = tweet;

	}

	public Tweet() {

	}

	// reads the tweet
	public void readInFile(String msg) throws Exception {

		try (BufferedReader br = new BufferedReader(new FileReader(msg))) {
			String line = "";
			while ((line = br.readLine()) != null) {
				tweet.append(line + " ");

			}
		} catch (Exception e) {
			System.err.println(e);
			throw e;
		}
	}

	public void writeATweet(String fileName, int num) throws Exception {
		
		String newFileName;
		String[] splitter = new String[2];
		splitter = fileName.split("\\.");
		newFileName = ((splitter[0]) + (num+1+".") + (splitter[1]));

		try ( PrintWriter pw = new PrintWriter(new FileWriter(newFileName))) {
			
			pw.print(this.tweet);

		} catch (Exception e) {
			System.err.println(e);
			throw e;
		}
	}

	/// this works because we have a generic type class
	public List<Tweet> tweeting() throws Exception {

		List<Tweet> birdy = new ArrayList<>();
		StringBuilder newString = new StringBuilder();
		int charCount = this.tweet.length();
		Tweet bird = new Tweet();
		

		while (charCount != 0) {

			for (int i = 0 ; i < TWEET_SIZE; i++) {
				newString.append(this.tweet.charAt(0));
				this.tweet.deleteCharAt(0);
				charCount--;
				if (charCount == 0)
					break;
			}

			bird.setTweet(newString);
			birdy.add(bird);
			newString = new StringBuilder("");
			bird = new Tweet();
		}

		return birdy;

	}
	
	public List<Tweet> tweetingWordBreak() throws Exception {
		
		List<Tweet> birdy = new ArrayList<>();
//		int charCount = this.tweet.length();
		
		Pattern p = Pattern.compile("(.){140}");
		Matcher m = p.matcher(tweet);		
		
		while (true){
			
			if (m.find()) {
			
				StringBuilder newString = new StringBuilder();
				Tweet bird = new Tweet();
				
				newString.append(m.group());
				bird.setTweet(newString);
				birdy.add(bird);
				
			} else {
				
				StringBuilder newString = new StringBuilder();
				Tweet bird = new Tweet();
				
				newString.append(!m.group());  	// NEED TO FIGURE OUT HOW TO GET THE LAST
				bird.setTweet(newString);		// LINES OF THE TWEET
				birdy.add(bird);
				break;
			}
		}
		
		return birdy;
		
	}

	// getters
	public StringBuilder getTweet() {
		return tweet;
	}

	public void setTweet(StringBuilder tweet) {
		this.tweet = tweet;
	}

}