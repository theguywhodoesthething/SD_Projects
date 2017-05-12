package solutions;

public class MonthEquals {
    public static void main(String[] args) {
        checkEquality(new Month5("January", "Jan", 31), 
        		      new Month5("May", "May", 31));

        checkEquality(new Month5("January", "Jan", 31), 
        		      new Month5("January", "Jan", 31));
    }
    
    private static void checkEquality(Month5 m1, Month5 m2) {
    	if (m1.equals(m2)) {
    		System.out.println("Same Object");
    	}
    	else {
    		System.out.println("Not the same Object");
    	}
    }
}
