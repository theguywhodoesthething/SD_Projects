package solutions;

public class MonthIf {
	public static void main(String[] args) {
		java.util.Scanner keyboard = new java.util.Scanner(System.in);

		System.out.print("Please enter a month: ");
		String month = keyboard.next();
		keyboard.close();

		int days = 0;
		if (month.equals("February")) {
			days = 28;
		}
		else if (month.equals("April") || month.equals("June") 
				|| month.equals("September") || month.equals("November")) {
			days = 30;
		}
		else {
			days = 31;
		}

		System.out.println(month + " has " + days + " days");
	}
}