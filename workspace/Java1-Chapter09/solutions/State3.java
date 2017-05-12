package solutions;

public class State3 {
	// fields
	private String name;
	private String abbreviation;
	private String capital;
	private int population;
	private String stateBird;
	
	// constructor
	public State3(String name, String abbreviation, String capital) {
		setName(name);
		setAbbreviation(abbreviation);
		setCapital(capital);
	}

	public State3(String name, String abbreviation, String capital, int population) {
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
		return name + ", abbreviated '" + abbreviation + "', has " + capital + " as its capital.";
	}
}
