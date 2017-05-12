package labs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterPresidents {
	public static List<President> filterPresidents(List<President> presidents,
			Predicate<President> predicate) {
		List<President> tempList = new ArrayList<>();
		for (President president : presidents) {
			if (predicate.test(president))
				tempList.add(president);
		}
		return tempList;
	}
	
	public static void main(String[] args) {
		ParsePresidents parser = new ParsePresidents();
		parser.parse();
		List<President> presidentsList = parser.getPresidents();
		
		List<President> filteredList = new ArrayList<>();
		
//		filteredList = filterPresidents(presidentsList,
//				(a) -> a.getParty().equals("Republican")
//				);
//		
//		for(President p: filteredList) {
//			System.out.println(p + " " + p.getParty());
//		}
//		
//		filteredList = filterPresidents(presidentsList,
//				(a) -> a.getEndTerm() - a.getStartTerm() < 4
//				);
//		
//		for(President p: filteredList) {
//			System.out.println(p);
//		}
		
		filteredList = filterPresidents(presidentsList,
				(a) -> a.getLastName().startsWith("R")
				);
		
		for(President p: filteredList) {
			System.out.println(p);
		}
	}
}
