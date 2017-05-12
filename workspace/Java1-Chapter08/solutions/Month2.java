package solutions;

public class Month2 {
	String name;
	String abbreviation;
	int numDays;

	public void display() {
		System.out.println(name + " has " + numDays + " days");
	}

	public void display(boolean detailed) {
		System.out.println("Name: " + name);
		if (detailed) {
			System.out.println("Abbrev: " + abbreviation);
			System.out.println("Days: " + numDays);
		} 
	}
}
