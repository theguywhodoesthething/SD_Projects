package employeemenu;

import java.util.Scanner;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		String[] fn = {"Matt", "Walter", "Betty", "Harold", "Marge", "Homer", "Bart", "Bender", "Scruffy"};
		String[] ln = {"Gmur", "White", "White", "Jones", "Simpson", "Simpson", "Simpson", "Rodriguez", "Janitor"};
		Title[] pos = {Title.BOSS, Title.DEV1, Title.DEV1, Title.DEV2, Title.DEV2, Title.INTERN, Title.INTERN, Title.INTERN, Title.JANITOR};
		Employee[] empList = new Employee[100];
		char option;
		
		for(int i = 0; i < empList.length; i++) {
			if (i < fn.length)
				empList[i] = new Employee(fn[i], ln[i], pos[i]);
			else
				empList[i] = new Employee(null, null, Title.EMPTY);
		}

		System.out.println("Welcome to the Employee Database.");
		
		do {
			System.out.println("Please select an option");
			System.out.println("(H)ire, (L)ist, (P)romote, (S)alary, (Q)uit");
			option = kb.next().toLowerCase().charAt(0);
			
			switch(option) {
//				case 'h': // hire();
//					break;
				case 'l': {
						for (Employee i : empList) {
							if (i.getFirstName() != null)
								System.out.println(i.toString());
						}
					};
					break;
				case 'p': {
						Employee e = promote();
						for (int i = 0; i < empList.length; i++) {
							if(e.getFirstName().equals(empList[i].getFirstName()) && e.getLastName().equals(empList[i].getLastName())) {
								empList[i] = e;
								break;
							}
						}
					}
					break;
//				case 's': // salary();
//					break;
				case 'q': System.out.println("Thank you. Have a nice day.");
					break;
				default: System.out.println("I didn't understand you. Please try again.");
			}
		} while (option != 'q');
		
		
//		for(int i = 0; i < fn.length; i++) {
//			System.out.println(i);
//		}
//		for(int i = 0; i < ln.length; i++) {
//			System.out.println(i);
//		}
//		for(int i = 0; i < pos.length; i++) {
//			System.out.println(i);
//		}		
		
		kb.close();
		
	}

	public static Employee promote() {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Who would you like to promote?");
		System.out.print("First name: ");
		String nf = kb.next();
		System.out.print("Last name: ");
		String nl = kb.next();
		System.out.print("What position would you like to promote this employee to? ");
		char newPos = kb.next().toLowerCase().charAt(3);
		
		Title title;
		
		switch (newPos) {
		case 's': title = Title.BOSS;
		break;
		case '1': title = Title.DEV1;
		break;
		case '2': title = Title.DEV2;
		break;
		case 'e': title = Title.INTERN;
		break;
		case 'i': title = Title.JANITOR;
		break;
		default: title = Title.EMPTY;
		}
		
		Employee e = new Employee(nf, nl, title);
		kb.close();
		
		return e;
	}
	
	public void hire() {
		
	}
	
	public void salary() {
		
	}
}