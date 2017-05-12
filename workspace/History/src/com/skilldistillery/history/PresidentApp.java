package com.skilldistillery.history;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PresidentApp {
	private static final String fileName = "presidents.tsv";
	private List<President> presidents = new ArrayList<>();

	public static void main(String[] args) {
		PresidentApp app = new PresidentApp();
		app.start();
	}

	public void start() {

		// class WhyLeftOfficeMatcher implements PresidentMatcher {
		//
		// @Override
		// public boolean matches(President pres, String string) {
		// return pres.getWhyLeftOffice().matches(string);
		// }
		//
		// }

		printPresidents(sort(presidents, new PartyTermComp()));
	}

	public PresidentApp() {
		this.loadPresidents(fileName);
	}

	public List<President> getPresidents() {
		return this.presidents;
	}

	public void printPresidents(List<President> pres) {
		for (President p : pres) {
			System.out.println(p);
		}
	}

	class FirstNameMatcher implements PresidentMatcher {

		@Override
		public boolean matches(President pres, String string) {
			return pres.getFirstName().startsWith(string);
		}

	}

	public List<President> sortByLastName(List<President> pList) {

		List<President> newList = new ArrayList<>(pList);

		Comparator<President> comp = new Comparator<President>() {

			@Override
			public int compare(President o1, President o2) {
				String firstLastName = o1.getLastName();
				String secondLastName = o2.getLastName();

				return firstLastName.compareTo(secondLastName);
			}
		};

		Collections.sort(newList, comp);

		return newList;
	}

	public List<President> sortByReasonLeftOfficeAndTermNum(List<President> pList) {
		
		List<President> newList = new ArrayList<>(pList);
		
		class ReasonLeftOfficeTermComp implements Comparator<President>  {

			@Override
			public int compare(President o1, President o2) {
				Integer firstTerm = o1.getTermNumber();
				Integer secondTerm = o2.getTermNumber();
				String firstWhyLeft = o1.getWhyLeftOffice();
				String secondWhyLeft = o2.getWhyLeftOffice();
				
				int termVal = firstTerm.compareTo(secondTerm);
				int whyLeftVal = firstWhyLeft.compareTo(secondWhyLeft);
				
				if (whyLeftVal != 0) {
					return whyLeftVal;
				} else { return termVal; }
			}
		}
		
		return newList;
	}

	public List<President> sortByLengthOfTerm(List<President> pList) {
			
			List<President> newList = new ArrayList<>(pList);

			Collections.sort(newList, new Comparator<President>(){
			
				public int compare(President a, President b){
					
					Period period1 = a.getTermLength();
					Period period2 = b.getTermLength();

					    if (period1.getYears() != period2.getYears())
					    {
					        return Integer.compare(period1.getYears(), period2.getYears());
					    }
					    if (period1.getMonths() != period2.getMonths())
					    {
					        return Integer.compare(period1.getMonths(), period2.getMonths());
					    }
					    if (period1.getDays() != period2.getDays())
					    {
					        return Integer.compare(period1.getDays(), period2.getDays());
					    }
					    	return 0;
				}
			});
							
			return newList;
		}
	
	public List<President> listOfPresidentsTermStartedIn1800s(String string) {
		
		List<President> filtered = new ArrayList<>();
		
		PresidentMatcher matcher = new PresidentMatcher() {
			
			@Override
			public boolean matches(President pres, String string) {
				return pres.getdBegan().toString().startsWith(string);
			}
		};
		
		for (President p : presidents) {
			if (matcher.matches(p, string)) {
				filtered.add(p);
			}
		}
		return filtered;
	}
	
	public List<President> sort(List<President> presList, Comparator<President> cmp) {
		
		List<President> sorted = new ArrayList<>(presList);
		Collections.sort(sorted, cmp);
		return sorted;
	}


	public List<President> filter(String string) {
		List<President> filtered = new ArrayList<>();

		PresidentMatcher matcher = new PresidentMatcher() {

			@Override
			public boolean matches(President pres, String string) {
				return pres.getElectionsWon() == Integer.parseInt(string);
			}
		};

		for (President p : presidents) {
			if (matcher.matches(p, string)) {
				filtered.add(p);
			}
		}
		return filtered;
	}

	public List<President> sortByPartyAndTermNum(List<President> pList) {

		List<President> newList = new ArrayList<>(pList);
		PartyTermComp comp = new PartyTermComp();
		Collections.sort(newList, comp);

		return newList;
	}

	class PartyTermComp implements Comparator<President> {

		@Override
		public int compare(President o1, President o2) {
			Integer firstTerm = o1.getTermNumber();
			Integer secondTerm = o2.getTermNumber();
			String firstParty = o1.getParty();
			String secondParty = o2.getParty();

			int termVal = firstTerm.compareTo(secondTerm);
			int partyVal = firstParty.compareTo(secondParty);

			if (partyVal != 0) {
				return partyVal;
			} else {
				return termVal;
			}
		}
	}

	private void loadPresidents(String fileName) {
		// File format (tab-separated):
		// # First Middle Last Inaugurated Left office Elections won Reason left
		// office Party
		// 1 George Washington July 1, 1789 March 4, 1797 2 Did not seek
		// re-election Independent
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String record = reader.readLine(); // Read and discard header line
			while ((record = reader.readLine()) != null) {
				String[] col = record.split("\\t");

				int term = Integer.parseInt(col[0]);
				String fName = col[1];
				String mName = col[2];
				String lName = col[3];
				// col[4]: Date term began.
				// col[5]: Date term ended.
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
				LocalDate dBegan = LocalDate.parse(col[4], formatter);
				LocalDate dEnded;

				if (col[5].length() != 0) {
					dEnded = LocalDate.parse(col[5], formatter);
				} else {
					dEnded = null;
				}

				int won = Integer.parseInt(col[6]);
				String whyLeft = col[7];
				String party = col[8];

				President pres = new President(term, fName, mName, lName, won, whyLeft, party, dBegan, dEnded);
				presidents.add(pres);
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.exit(1);
		}
	}

}
