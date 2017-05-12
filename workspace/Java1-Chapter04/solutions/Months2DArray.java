package solutions;

public class Months2DArray {
    public static void main(String args[]) {

		String[][] months = { 
			{"January", "Jan", "31"},
			{"February", "Feb", "28"},
			{"March", "Mar", "31"},
			{"April", "Apr", "30"},
			{"May", "May", "31"},
			{"June", "Jun", "30"},
			{"July", "Jul", "31"},
			{"August", "Aug", "31"},
			{"September", "Sep", "30"},
			{"October", "Oct", "31"},
			{"November", "Nov", "30"},
			{"December", "Dec", "31"}
		};

		for (int i = 0; i < months.length; i++) {
			String[] monthData = months[i];
			if (monthData[2].equals("31")) {
				System.out.println(monthData[0] + " has " + 
						monthData[2] + " days");
			}
		}
    }
}
