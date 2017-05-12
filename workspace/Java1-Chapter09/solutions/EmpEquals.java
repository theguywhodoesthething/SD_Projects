package solutions;

public class EmpEquals {
    public static void main(String[] args) {
        checkEquality(new Employee6("Bob", "Dobbs"), 
        		      new Employee6("Bob", "Dobbs"));

        checkEquality(new Employee6("Bob", "Dobbs"), 
  		      new Employee6("Bob", "Barker"));
    }
    
    private static void checkEquality(Employee6 e1, Employee6 e2) {
    	if (e1.equals(e2)) {
    		System.out.println("Same Object");
    	}
    	else {
    		System.out.println("Not the same Object");
    	}
    }
}
