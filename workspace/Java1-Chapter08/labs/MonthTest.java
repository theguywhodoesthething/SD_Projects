package labs;

import java.util.Scanner;

public class MonthTest {
	public static void main(String[] args) {
		
		char tf;
		
		String[] months = {"January", "Febuary", "March", "April", "May", "June", "July", "August",
							"September", "October", "November", "December"};
		
		String[] daysNum = {"31", "28", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31"};
		
		Month[] myMonth = new Month[12];
		
		for (int i = 0; i < months.length; i++) {
			myMonth[i] = new Month(months[i], months[i].substring(0, 3), daysNum[i]);
		}
		
//		for (int i = 0; i < months.length; i++) {
//			myMonth[i].display();
//		}
//		
//		Month[] myMonth = new Month[12];
//		
//		for (int i = 0; i < 12; i++) {
//			myMonth[i] = new Month();
//		}
//
//		myMonth[0].nameMonth = "January";
//		myMonth[0].numDays = 31;
//		myMonth[0].abbvMonth = "Jan";
//		
//		myMonth[1].nameMonth = "Febuary";
//		myMonth[1].numDays = 28;
//		myMonth[1].abbvMonth = "Feb";
//		
//		myMonth[2].nameMonth = "March";
//		myMonth[2].numDays = 31;
//		myMonth[2].abbvMonth = "Mar";
//		
//		myMonth[3].nameMonth = "April";
//		myMonth[3].numDays = 30;
//		myMonth[3].abbvMonth = "Apr";
//		
//		myMonth[4].nameMonth = "May";
//		myMonth[4].numDays = 31;
//		myMonth[4].abbvMonth = "May";
//		
//		myMonth[5].nameMonth = "June";
//		myMonth[5].numDays = 30;
//		myMonth[5].abbvMonth = "Jun";
//		
//		myMonth[6].nameMonth = "July";
//		myMonth[6].numDays = 31;
//		myMonth[6].abbvMonth = "Jul";
//		
//		myMonth[7].nameMonth = "August";
//		myMonth[7].numDays = 31;
//		myMonth[7].abbvMonth = "Aug";
//		
//		myMonth[8].nameMonth = "September";
//		myMonth[8].numDays = 30;
//		myMonth[8].abbvMonth = "Sep";
//		
//		myMonth[9].nameMonth = "October";
//		myMonth[9].numDays = 31;
//		myMonth[9].abbvMonth = "Oct";
//		
//		myMonth[10].nameMonth = "Novemeber";
//		myMonth[10].numDays = 30;
//		myMonth[10].abbvMonth = "Nov";
//		
//		myMonth[11].nameMonth = "December";
//		myMonth[11].numDays = 31;
//		myMonth[11].abbvMonth = "Dec";
		
		for(int i = 0; i < myMonth.length; i++) {
			myMonth[i].display();
		}
				
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Do you want the long or short version? (L/S): ");
		tf = kb.next().toLowerCase().charAt(0);
		
		for(int i = 0; i < myMonth.length; i++) {
			if (tf == 'l'){
				System.out.println(myMonth[i]);
			}
			else {
				System.out.println(myMonth[i].getNameMonth());
			}
		}
		
//		for(Month i : myMonth) {
//			System.out.println(i);
//		}
		
		int sum = 0;
		
		for (int i = 0; i < myMonth.length; i++) {
			sum += myMonth[i].getNumDays();
		}
		
		System.out.println("The number of days in a year is " + sum);
		
		kb.close();
		
	}
}
