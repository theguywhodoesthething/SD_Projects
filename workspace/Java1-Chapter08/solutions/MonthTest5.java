package solutions;

public class MonthTest5 {
	public static void main(String[] args) {
		Month3[] months = new Month3[12];
		months[0] = new Month3("January", "Jan", 31);
		months[1] = new Month3("February", "Feb", 28);
		months[2] = new Month3("March", "Mar", 31);
		months[3] = new Month3("April", "Apr", 30);
		months[4] = new Month3("May", "May", 31);
		months[5] = new Month3("June", "Jun", 30);
		months[6] = new Month3("July", "Jul", 31);
		months[7] = new Month3("August", "Aug", 31);
		months[8] = new Month3("September", "Sep", 30);
		months[9] = new Month3("October", "Oct", 31);
		months[10] = new Month3("November", "Nov", 30);
		months[11] = new Month3("December", "Dec", 31);
		
		int totalDays = 0;
		for (Month3 month : months) {
			totalDays += month.getNumDays();
			month.display();
		}
		System.out.println("Total Days: " + totalDays);
	}
}
