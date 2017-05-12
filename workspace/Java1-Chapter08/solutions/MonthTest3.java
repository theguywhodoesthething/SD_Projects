package solutions;

public class MonthTest3 {
	public static void main(String[] args) {
		Month2[] months = new Month2[12];
		months[0] = new Month2();
		months[0].name = "January";
		months[0].abbreviation = "Jan";
		months[0].numDays = 31;
		months[1] = new Month2();
		months[1].name = "February";
		months[1].abbreviation = "Feb";
		months[1].numDays = 28;
		months[2] = new Month2();
		months[2].name = "March";
		months[2].abbreviation = "Mar";
		months[2].numDays = 31;
		months[3] = new Month2();
		months[3].name = "April";
		months[3].abbreviation = "Apr";
		months[3].numDays = 30;
		months[4] = new Month2();
		months[4].name = "May";
		months[4].abbreviation = "May";
		months[4].numDays = 31;
		months[5] = new Month2();
		months[5].name = "June";
		months[5].abbreviation = "Jun";
		months[5].numDays = 30;
		months[6] = new Month2();
		months[6].name = "July";
		months[6].abbreviation = "Jul";
		months[6].numDays = 31;
		months[7] = new Month2();
		months[7].name = "August";
		months[7].abbreviation = "Aug";
		months[7].numDays = 31;
		months[8] = new Month2();
		months[8].name = "September";
		months[8].abbreviation = "Sep";
		months[8].numDays = 30;
		months[9] = new Month2();
		months[9].name = "October";
		months[9].abbreviation = "Oct";
		months[9].numDays = 31;
		months[10] = new Month2();
		months[10].name = "November";
		months[10].abbreviation = "Nov";
		months[10].numDays = 30;
		months[11] = new Month2();
		months[11].name = "December";
		months[11].abbreviation = "Dec";
		months[11].numDays = 31;
		
		for (Month2 month : months) {
			month.display();
		}
	}
}
