package labs;

import java.io.*;
import java.util.*;

public class PresidentTest {

	public static void main(String[] args) {

//		System.out.println(readInPresidents());
		
//		printPresidents(readInPresidents());
		
		filterPres(readInPresidents());
		
//		writeParties(readInPresidents());

	}
	
	public static ArrayList<President> readInPresidents() {
		
		ArrayList<President> listPresidents = new ArrayList<>();
		
		printPresidents(listPresidents);
		
			try (BufferedReader br = new BufferedReader(new FileReader("presidents.csv"))) {

			String line = "";
			
			while ((line = br.readLine()) != null) {
				
				Integer termNumber;
				Integer startYear;
				Integer endYear;				
				
				String[] words = line.split(", ");
				String[] years = words[4].split("-");
								
				termNumber = Integer.parseInt(words[0]);
				startYear = Integer.parseInt(years[0]);
				endYear = Integer.parseInt(years[1]);
				
				President pres = new President(termNumber, words[1], words[2], words[3], startYear, endYear, words[5]);
				
				listPresidents.add(pres);
			}	
		} catch (IOException e) {
			System.err.println(e);
			e.printStackTrace();
		}

		return listPresidents;
		
	}
	
	public static void printPresidents(ArrayList<President> pres) {
		
		for (President i : pres) {
			System.out.println(i.toString() + "\n");
		}
		
	}
	
	public static void filterPres(ArrayList<President> pres) {
	
		ArrayList<President> oneD = new ArrayList<>();
		

		
		for (int i = 0; i < pres.size(); i++) {
			if(pres.get(i).getParty().equals("Whig")) {
				oneD.add(pres.get(i));
			}
		}

		System.out.println("\nWhigs:\n\n" + oneD);
		oneD.clear();
		
		for (int i = 0; i < pres.size(); i++) {

			if(!pres.get(i).getMiddleName().equals("")) {
				oneD.add(pres.get(i));
			}
		}
		
		System.out.println("\nPresidents with a middle name:\n\n" + oneD);
		oneD.clear();
		
		for (int i = 0; i < pres.size(); i++) {

			if(pres.get(i).getEndYear() - pres.get(i).getStartYear() < 4) {
				oneD.add(pres.get(i));
			}
		}
		
		System.out.println("\nPresidents who served for less than 4 years:\n\n" + oneD);
		oneD.clear();
		
		
		for (int i = 0; i < pres.size(); i++) {
			
			if(pres.get(i).getLastName().charAt(0) == 'R') {
				oneD.add(pres.get(i));
			}
		}
		
		System.out.println("\nPresidents whose last name begins with 'R':\n\n" + oneD);
		oneD.clear();

	}
	
	public static void writeParties(ArrayList<President> pres) {
		
		for(President i : pres) {
			try (PrintWriter pw = new PrintWriter(new FileWriter(i.getParty() + ".txt"))){
				
				pw.println(i.getFirstName() + " " + i.getLastName());

		
			} catch (IOException e) {
				System.err.println(e);
				e.printStackTrace();
			}
		}
	}

}
