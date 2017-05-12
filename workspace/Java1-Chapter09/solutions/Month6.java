package solutions;

public class Month6 {
	// fields
	private String name;
	private String abbreviation;
	private int numDays;

	// constructor
	public Month6(String name, String abbreviation, int numDays) {
		this.name = name;
		this.abbreviation = abbreviation;
		this.numDays = numDays;
	}
	
	public Month6(String name, String abbreviation, String numDays) {
		this.name = name;
		this.abbreviation = abbreviation;
		this.numDays = Integer.parseInt(numDays);
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((abbreviation == null) ? 0 : abbreviation.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numDays;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Month6 other = (Month6) obj;
		if (abbreviation == null) {
			if (other.abbreviation != null)
				return false;
		} else if (!abbreviation.equals(other.abbreviation))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numDays != other.numDays)
			return false;
		return true;
	}
}
