package solutions;

public class MonthSwitch {
	public static void main(String[] args) {
		java.util.Scanner keyboard = new java.util.Scanner(System.in);

		System.out.print("Please enter a month: ");
		String month = keyboard.next();
		keyboard.close();

		int days = 0;
		switch (month) {
		case "February":
			days = 28;
			break;
		case "April":
		case "June":
		case "September":
		case "November":
			days = 30;
			break;
		default:
			days = 31;
		}

		System.out.println(month + " has " + days + " days");
	}
}