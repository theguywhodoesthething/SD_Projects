package twitter;

import java.util.List;

public class TwitterSD9 {

    public static void main(String[] args) throws Exception {
        
        Tweet twitterBird = new Tweet();
        twitterBird.readInFile("msg.txt");
//        System.out.println(twitterBird.getTweet());
        
        List<Tweet> allTweets = twitterBird.tweetingWordBreak();
        
//        int count = 0;
//        
//        for(int i = 0; i < allTweets.size(); i++){
//        	allTweets.get(i).writeATweet("Tweet.txt", i);
//        	count = i;
//        }
//        
//        System.out.println("You wrote " + (count + 1) + " Tweets.");
        
        for(int i = 0; i < allTweets.size(); i++){
        	
        	System.out.println(allTweets.get(i).getTweet() + "\nYou wrote " + (i + 1) + " Tweets.");

        }
        
        
    }
}