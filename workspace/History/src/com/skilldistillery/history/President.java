package com.skilldistillery.history;

import java.time.LocalDate;
import java.time.Period;

public class President implements Comparable<President> {
	private int termNumber;
	private String firstName;
	private String middleName;
	private String lastName;
	private int electionsWon;
	private String whyLeftOffice;
	private String party;
	private LocalDate dBegan;
	private LocalDate dEnded;

	public President(int termNumber, String firstName, String middleName, String lastName, int electionsWon,
			String reasonLeftOffice, String party, LocalDate dBegan, LocalDate dEnded) {
		super();
		this.termNumber = termNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.electionsWon = electionsWon;
		this.whyLeftOffice = reasonLeftOffice;
		this.party = party;
		this.dBegan = dBegan;
		this.dEnded = dEnded;
	}
	
	public LocalDate getdBegan() {
		return dBegan;
	}

	public void setdBegan(LocalDate dBegan) {
		this.dBegan = dBegan;
	}

	public LocalDate getdEnded() {
		return dEnded;
	}

	public void setdEnded(LocalDate dEnded) {
		this.dEnded = dEnded;
	}

	public int getTermNumber() {
		return termNumber;
	}

	public void setTermNumber(int termNumber) {
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

	public int getElectionsWon() {
		return electionsWon;
	}

	public void setElectionsWon(int electionsWon) {
		this.electionsWon = electionsWon;
	}

	public String getWhyLeftOffice() {
		return whyLeftOffice;
	}

	public void setWhyLeftOffice(String reasonLeftOffice) {
		this.whyLeftOffice = reasonLeftOffice;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}
	
	public Period getTermLength() {
		
		Period period;
		
		if(this.dEnded != null) {
			period = this.dEnded.until(this.dBegan);
		} else {
			period = LocalDate.now().until(this.dBegan);
		}
		
		return period;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("President [termNumber=");
		builder.append(termNumber);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", middleName=");
		builder.append(middleName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", electionsWon=");
		builder.append(electionsWon);
		builder.append(", whyLeftOffice=");
		builder.append(whyLeftOffice);
		builder.append(", party=");
		builder.append(party);
		builder.append(", dBegan=");
		builder.append(dBegan);
		builder.append(", dEnded=");
		builder.append(dEnded);
		builder.append(", termLength=");
		builder.append(this.getTermLength());
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(President other) {
		if (this.termNumber > other.termNumber) {
			return 1;
		} else if (this.termNumber < other.termNumber) {
			return -1;
		}
		return 0;
	}

}
