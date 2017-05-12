package data;

import java.util.List;

public class PresidentsDAOImpl implements PresidentsDAO {
	
	private int presidentNumber;
	private String firstName;
	private String middleName;
	private String lastName;
	private int dateBegin;
	private int dateEnd;
	private String party;
	private String picture;
	private String funFact;
	
	public PresidentsDAOImpl(int presidentNumber, String firstName, String middleName, String lastName, int dateBegin, int dateEnd,
			String picture, String party, String funFact) {
		this.presidentNumber = presidentNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dateBegin = dateBegin;
		this.dateEnd = dateEnd;
		this.party = party;
		this.picture = picture;
		this.funFact = funFact;
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

	public int getDateBegin() {
		return dateBegin;
	}

	public void setDateBegin(int dateBegin) {
		this.dateBegin = dateBegin;
	}

	public int getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(int dateEnd) {
		this.dateEnd = dateEnd;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getFunFact() {
		return funFact;
	}

	public void setFunFact(String funFact) {
		this.funFact = funFact;
	}

	public int getPresidentNumber() {
		return presidentNumber;
	}

	public void setPresidentNumber(int presidentNumber) {
		this.presidentNumber = presidentNumber;
	}

	@Override
	public List<PresidentsDAO> getPresidentsList() {
		// TODO Auto-generated method stub
		return null;
	}	
}
