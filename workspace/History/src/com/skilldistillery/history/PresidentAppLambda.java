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
import java.util.function.Predicate;

public class PresidentAppLambda {
	private static final String fileName = "presidents.tsv";
	private List<President> presidents = new ArrayList<>();

	public static void main(String[] args) {
		PresidentAppLambda app = new PresidentAppLambda();
		app.start();
	}

	public void start() {

//		printPresidents(presMatcher(presidents, (a) -> a.getParty().equals("Whig")));
//		printPresidents(presMatcher(presidents, (a) -> a.getFirstName().startsWith("Jo")));
//		printPresidents(presMatcher(presidents, (a) -> a.getWhyLeftOffice().equals("Term ended")));
//		printPresidents(presMatcher(presidents, (a) -> a.getLastName().startsWith("C")));
//		printPresidents(presMatcher(presidents, (a) -> a.getParty().contains("Democrat")));
//		printPresidents(presMatcher(presidents, (a) -> a.getWhyLeftOffice().equals("Died in office")));
//		printPresidents(presMatcher(presidents, (a) -> a.getElectionsWon() == 1));
//		printPresidents(presMatcher(presidents, (a) -> a.getdBegan().toString().startsWith("18")));
		
		List<President> sorted = new ArrayList<>();		
		
//		sorted = presSorter(presidents, 
//				(a,b) -> a.getParty().compareTo(b.getParty())
//				);
//		sorted = presSorter(presidents, 
//				(a,b) -> a.getWhyLeftOffice().compareTo(b.getWhyLeftOffice())
//				);
		sorted = presSorter(presidents, 
				(a,b) -> a.getLastName().compareTo(b.getLastName())
				);
//		sorted = presSorter(presidents, (a,b) -> {
//			
//			Period period1 = a.getTermLength();
//			Period period2 = b.getTermLength();
//			
//			if (period1.getYears() != period2.getYears())
//		    {
//		        return Integer.compare(period1.getYears(), period2.getYears());
//		    }
//		    if (period1.getMonths() != period2.getMonths())
//		    {
//		        return Integer.compare(period1.getMonths(), period2.getMonths());
//		    }
//		    if (period1.getDays() != period2.getDays())
//		    {
//		        return Integer.compare(period1.getDays(), period2.getDays());
//		    }
//		    	return 0;
//		});
		
		printPresidents(sorted);
		
	}
	
	List<President> presMatcher(List<President> pList, Predicate<President> pr) {
		
		List<President> newList = new ArrayList<>();
		
		for(President p: pList) {
			if (pr.test(p)) {
				newList.add(p);
			}
		}
		
		return newList;
	}
	
	List<President> presSorter(List<President> pList, Comparator<President> com) {
		
		List<President> newList = new ArrayList<>(pList);
		
		Collections.sort(newList, com);
		
		return newList;
	}

	public PresidentAppLambda() {
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
