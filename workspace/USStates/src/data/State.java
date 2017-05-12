package data;

public class State {
	private String id;
	private String abbrev;
	private String name;
	private String capital;
	private String latitude;
	private String longitude;
	private int population;
	private String bird;

	public State() {
	}

	public State(String id, String abbreviation, String name, String capital, String latitude, String longitude, int population,
			String bird) {
		this.id = id;
		this.abbrev = abbreviation;
		this.name = name;
		this.capital = capital;
		this.latitude = latitude;
		this.longitude = longitude;
		this.population = population;
		this.bird = bird;
	}
	
	public State(String abbreviation, String name, String capital, String latitude, String longitude, int population,
			String bird) {
		this.abbrev = abbreviation;
		this.name = name;
		this.capital = capital;
		this.latitude = latitude;
		this.longitude = longitude;
		this.population = population;
		this.bird = bird;
	}

	public State(String abbreviation, String name, String capital, String latitude, String longitude, int population) {
		this.abbrev = abbreviation;
		this.name = name;
		this.capital = capital;
		this.latitude = latitude;
		this.longitude = longitude;
		this.population = population;
	}

	public State(String abbreviation, String name, String capital, String latitude, String longitude) {
		this.abbrev = abbreviation;
		this.name = name;
		this.capital = capital;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getAbbreviation() {
		return abbrev;
	}

	public String getName() {
		return name;
	}

	public String getCapital() {
		return capital;
	}

	public String getLatitude() {
		return latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbrev = abbreviation;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "State [abbreviation=" + abbrev + ", name=" + name + ", capital=" + capital + "]";
	}

	public String getBird() {
		return bird;
	}

	public void setBird(String bird) {
		this.bird = bird;
	}

	public Integer getId() {
		return Integer.parseInt(id);
	}

	public void setId(String id) {
		this.id = id;
	}
	
}