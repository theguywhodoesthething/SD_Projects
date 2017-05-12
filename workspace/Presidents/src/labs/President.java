package labs;

public class President {
	
	private Integer termNumber;
	private String firstName;
	private String middleName;
	private String lastName;
	private Integer startYear;
	private Integer endYear;
	private String party;
	
	public President() {}
	
	public President(Integer termNumber, String firstName, String middleName, String lastName, Integer startYear,
			Integer endYear, String party) {
		super();
		this.termNumber = termNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.startYear = startYear;
		this.endYear = endYear;
		this.party = party;
	}

	public Integer getTermNumber() {
		return termNumber;
	}

	public void setTermNumber(Integer termNumber) {
		this.termNumber = termNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getStartYear() {
		return startYear;
	}

	public void setStartYear(Integer startYear) {
		this.startYear = startYear;
	}

	public Integer getEndYear() {
		return endYear;
	}

	public void setEndYear(Integer endYear) {
		this.endYear = endYear;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[termNumber=");
		builder.append(termNumber);
		builder.append("\nfirstName=");
		builder.append(firstName);
		builder.append("\nmiddleName=");
		builder.append(middleName);
		builder.append("\nlastName=");
		builder.append(lastName);
		builder.append("\nstartYear=");
		builder.append(startYear);
		builder.append("\nendYear=");
		builder.append(endYear);
		builder.append("\nparty=");
		builder.append(party);
		builder.append("]\n");
		return builder.toString();
	}
	
}
