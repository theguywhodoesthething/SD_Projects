package solutions;

public class MonthTest6 {
	public static void main(String[] args) {
		Month4[] months = new Month4[12];
		months[0] = new Month4("January", "Jan", 31);
		months[1] = new Month4("February", "Feb", 28);
		months[2] = new Month4("March", "Mar", 31);
		months[3] = new Month4("April", "Apr", 30);
		months[4] = new Month4("May", "May", 31);
		months[5] = new Month4("June", "Jun", 30);
		months[6] = new Month4("July", "Jul", 31);
		months[7] = new Month4("August", "Aug", 31);
		months[8] = new Month4("September", "Sep", 30);
		months[9] = new Month4("October", "Oct", 31);
		months[10] = new Month4("November", "Nov", 30);
		months[11] = new Month4("December", "Dec", 31);
		
		int totalDays = 0;
		for (Month4 month : months) {
			totalDays += month.getNumDays();
			System.out.println(month);
		}
		System.out.println("Total Days: " + totalDays);
	}
}
