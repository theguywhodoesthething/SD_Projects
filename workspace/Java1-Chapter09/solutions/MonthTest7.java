package solutions;

public class MonthTest7 {
	public static void main(String[] args) {
		Month6[] months = new Month6[12];
		months[0] = new Month6("January", "Jan", 31);
		months[1] = new Month6("February", "Feb", 28);
		months[2] = new Month6("March", "Mar", 31);
		months[3] = new Month6("April", "Apr", 30);
		months[4] = new Month6("May", "May", 31);
		months[5] = new Month6("June", "Jun", 30);
		months[6] = new Month6("July", "Jul", 31);
		months[7] = new Month6("August", "Aug", 31);
		months[8] = new Month6("September", "Sep", 30);
		months[9] = new Month6("October", "Oct", 31);
		months[10] = new Month6("November", "Nov", 30);
		months[11] = new Month6("December", "Dec", "31");  // use three string cstr
		
		int totalDays = 0;
		for (Month6 month : months) {
			totalDays += month.getNumDays();
			System.out.println(month);
		}
		System.out.println("Total Days: " + totalDays);
	}
}
