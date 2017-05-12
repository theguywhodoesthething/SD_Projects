package examples;

import java.util.Comparator;

public class CardRankThenSuitComparator implements Comparator<Card> {

	public int compare(Card o1, Card o2) {
		if(o1.getRank().compareTo(o2.getRank()) < 0) {
			return -1;
		} else if (o1.getRank().compareTo(o2.getRank()) > 0) {
			return 1;
		} else {
			if (o1.getSuit().compareTo(o2.getSuit()) < 0) {
				return -1;
			} else if (o1.getSuit().compareTo(o2.getSuit()) > 0) {
				return 1;
			} else { return 0; }

		}
	}

}
