package solutions;

public class MonthTest {
	public static void main(String[] args) {
		Month dec = new Month();
		dec.name = "December";
		dec.abbreviation = "Dec";
		dec.numDays = 31;
		
		dec.display();
	}
}
