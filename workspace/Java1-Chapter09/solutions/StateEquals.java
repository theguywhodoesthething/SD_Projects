package solutions;

public class StateEquals {
    public static void main(String[] args) {
        checkEquality(new State5("North Dakota", "ND", "Bismarck"), 
        		      new State5("South Dakota", "SD", "Pierre"));

        checkEquality(new State5("North Dakota", "ND", "Bismarck"), 
        		      new State5("North Dakota", "ND", "Bismarck"));
    }
    
    private static void checkEquality(State5 s1, State5 s2) {
    	if (s1.equals(s2)) {
    		System.out.println("Same Object");
    	}
    	else {
    		System.out.println("Not the same Object");
    	}
    }
}
