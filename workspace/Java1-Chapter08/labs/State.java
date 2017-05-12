package labs;

public class State {
	
	private String name;
	private String abbreviation;
	private String capital;
	private int population;
	private String bird;
	
	public State (String name, String abbreviation, String capital) {
		this.setName(name);
		this.setAbbreviation(abbreviation);
		this.setCapital(capital);
	}
	
	public State (String name, String abbreviation, String capital, int population) {
		this(name, abbreviation, capital);
		this.setPopulation(population);
	}
	
//	public String display() {
//		String display = "Name: " + name + " Abv: " + abbreviation + " Capital: " + capital +
//							" Pop: " + population + " Bird: " + bird;
//		return display;
//	}
	
	@Override
	public String toString() {
		StringBuilder a = new StringBuilder();
		
		a.append("State [name=");
		a.append(name);
		a.append(", abbreviation=");
		a.append(abbreviation);
		a.append(", capital=");
		a.append(capital);
		a.append(", population=");
		a.append(population);
		a.append(", bird=");
		a.append(bird);
		a.append("]");
		
		return a.toString();
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((abbreviation == null) ? 0 : abbreviation.hashCode());
		result = prime * result + ((bird == null) ? 0 : bird.hashCode());
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + population;
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
		State other = (State) obj;
		if (abbreviation == null) {
			if (other.abbreviation != null)
				return false;
		} else if (!abbreviation.equals(other.abbreviation))
			return false;
		if (bird == null) {
			if (other.bird != null)
				return false;
		} else if (!bird.equals(other.bird))
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
		return true;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null && name != "")
			this.name = name;
	}
	public String getAbbreviation() {
		return abbreviation;
	}
	public void setAbbreviation(String abbreviation) {
		if(abbreviation != null && abbreviation != "")
			this.abbreviation = abbreviation;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		if(capital != null && capital != "")
			this.capital = capital;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		if(population > 0)
			this.population = population;
	}
	public String getBird() {
		return bird;
	}
	public void setBird(String bird) {
		if(bird != null && bird != "")
			this.bird = bird;
	}
	
	


}
