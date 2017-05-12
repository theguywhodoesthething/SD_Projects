package solutions;

public class State6 {
	// fields
	private String name;
	private String abbreviation;
	private String capital;
	private Integer population;
	private String stateBird;
	
	// constructor
	public State6(String name, String abbreviation, String capital) {
		setName(name);
		setAbbreviation(abbreviation);
		setCapital(capital);
	}

	public State6(String name, String abbreviation, String capital, int population) {
		setName(name);
		setAbbreviation(abbreviation);
		setCapital(capital);
		setPopulation(population);
	}

	// methods
//	public void display() {
//		System.out.println("Name: " + name);
//		System.out.println("Abbrev: " + abbreviation);
//		System.out.println("Capital: " + capital);
//		System.out.println("Population: " + population);
//		System.out.println("State Bird: " + stateBird);
//	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && !name.equals(""))
			this.name = name;
		else 
			throw new IllegalArgumentException("Invalid Name");
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		if (abbreviation != null && !abbreviation.equals(""))
			this.abbreviation = abbreviation;
		else 
			throw new IllegalArgumentException("Invalid Abbreviation");
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		if (capital != null && !capital.equals(""))
			this.capital = capital;
		else 
			throw new IllegalArgumentException("Invalid Capital");
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		if (population >= 0)
			this.population = population;
		else 
			throw new IllegalArgumentException("Invalid Population");
	}

	public String getStateBird() {
		return stateBird;
	}

	public void setStateBird(String stateBird) {
		if (stateBird != null && !stateBird.equals(""))
			this.stateBird = stateBird;
		else 
			throw new IllegalArgumentException("Invalid State Bird");
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name)
		  .append(", abbreviated '")
		  .append(abbreviation)
		  .append("', has ")
		  .append(capital)
		  .append(" as its capital.");
		return sb.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((abbreviation == null) ? 0 : abbreviation.hashCode());
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + population;
		result = prime * result + ((stateBird == null) ? 0 : stateBird.hashCode());
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
		State6 other = (State6) obj;
		if (abbreviation == null) {
			if (other.abbreviation != null)
				return false;
		} else if (!abbreviation.equals(other.abbreviation))
			return false;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (population != other.population)
			return false;
		if (stateBird == null) {
			if (other.stateBird != null)
				return false;
		} else if (!stateBird.equals(other.stateBird))
			return false;
		return true;
	}
}
