package solutions;

public class Month4 {
	// fields
	private String name;
	private String abbreviation;
	private int numDays;

	// constructor
	public Month4(String name, String abbreviation, int numDays) {
		this.name = name;
		this.abbreviation = abbreviation;
		this.numDays = numDays;
	}
	
	// methods
//	public void display() {
//		System.out.println(name + " has " + numDays + " days");
//	}

	public void display(boolean detailed) {
		System.out.println("Name: " + name);
		if (detailed) {
			System.out.println("Abbrev: " + abbreviation);
			System.out.println("Days: " + numDays);
		} 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public int getNumDays() {
		return numDays;
	}

	public void setNumDays(int numDays) {
		this.numDays = numDays;
	}

	@Override
	public String toString() {
		return "Month [name=" + name + ", abbreviation=" + abbreviation + ", numDays=" + numDays + "]";
	}
}
