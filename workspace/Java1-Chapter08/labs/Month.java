package labs;

public class Month {
	
	private String nameMonth;
	private String abbvMonth;
	private int numDays;
	
	public Month (String nameMonth, int numDays) {
		this.nameMonth = nameMonth;
		this.numDays = numDays;
	}
	
	public Month (String nameMonth, String abbvMonth, int numDays) {
		this(nameMonth, numDays);
		this.abbvMonth = abbvMonth;
	}
	
	public Month (String nameMonth, String abbvMonth, String numDays) {
		this(nameMonth, abbvMonth, Integer.parseInt(numDays));
	}
	
	// getters for all private variables
	
	public String getNameMonth () {
		return nameMonth;
	}
	public String getAbbvMonth () {
		return abbvMonth;
	}
	public int getNumDays () {
		return numDays;
	}
	
	// setters for all private variables
	
	public void setNameMonth(String nameMonth) {
		this.nameMonth = nameMonth;
	}
	public void setAbbvMonth(String abbvMonth) {
		this.abbvMonth = abbvMonth;
	}
	public void setNumDays(int numDays) {
		this.numDays = numDays;
	}

	public void display() {
		
		System.out.println("" + getNameMonth() + " has " + numDays + " days in it.");
		
		
		return;
	}

	@Override
	public String toString() {
		return "Month [nameMonth=" + nameMonth + ", abbvMonth=" + abbvMonth + ", numDays=" + numDays + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((abbvMonth == null) ? 0 : abbvMonth.hashCode());
		result = prime * result + ((nameMonth == null) ? 0 : nameMonth.hashCode());
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
		Month other = (Month) obj;
		if (abbvMonth == null) {
			if (other.abbvMonth != null)
				return false;
		} else if (!abbvMonth.equals(other.abbvMonth))
			return false;
		if (nameMonth == null) {
			if (other.nameMonth != null)
				return false;
		} else if (!nameMonth.equals(other.nameMonth))
			return false;
		if (numDays != other.numDays)
			return false;
		return true;
	}
	
	
	
//	public void display(boolean detailed) {
//		
//		String toDisplay = "The month name is " + nameMonth;
//		
//		if (detailed) {
//			toDisplay += " and it has " + numDays + " days in it. The abbreviation is " + abbvMonth;
//		}
//		
//		System.out.println(toDisplay);
//		
//		return;
//	}

}
