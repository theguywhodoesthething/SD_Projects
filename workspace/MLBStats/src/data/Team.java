package data;

public class Team {
	
	private String city;
	private String mascot;
	private String state;
	private String stadium;
	private Integer capacity;
	private String league;
	private String division;
	
	public Team(){}
	
	public Team(String city, String mascot, String state, String stadium, Integer capacity, String league,
			String division) {
		this.city = city;
		this.mascot = mascot;
		this.state = state;
		this.stadium = stadium;
		this.capacity = capacity;
		this.league = league;
		this.division = division;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMascot() {
		return mascot;
	}
	public void setMascot(String mascot) {
		this.mascot = mascot;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStadium() {
		return stadium;
	}
	public void setStadium(String stadium) {
		this.stadium = stadium;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	public String getLeague() {
		return league;
	}
	public void setLeague(String league) {
		this.league = league;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Team [city=");
		builder.append(city);
		builder.append(", mascot=");
		builder.append(mascot);
		builder.append(", state=");
		builder.append(state);
		builder.append(", stadium=");
		builder.append(stadium);
		builder.append(", capacity=");
		builder.append(capacity);
		builder.append(", league=");
		builder.append(league);
		builder.append(", division=");
		builder.append(division);
		builder.append("]");
		return builder.toString();
	}

}
