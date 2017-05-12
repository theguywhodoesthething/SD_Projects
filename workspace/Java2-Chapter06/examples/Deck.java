package examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    public static void main(String[] args) {
        List<Card> deck = new ArrayList<>(52);

        for (Rank r : Rank.values()) {
        	for (Suit s : Suit.values()) {
                deck.add(new Card(r, s));
            }
        }
        

        for (Card card : deck) {
            System.out.println(card);
        }
        System.out.println("******************************");
        
        Collections.shuffle(deck);
        
        for (Card card : deck) {
        	System.out.println(card);
        }
        System.out.println("******************************");
        
        CardRankThenSuitComparator comp = new CardRankThenSuitComparator();
        deck.sort(comp);
        
        
        for (Card card : deck) {
        	System.out.println(card);    	
        }
        System.out.println("******************************");    	
    }

}