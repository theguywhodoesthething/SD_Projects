package examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParsePresidents {
	private static final String INPUT_FILE = "presidents.csv";
	private List<President> presidents = new ArrayList<>();
	
	public void parse() {
		try (BufferedReader buf = new BufferedReader(
				new FileReader(INPUT_FILE))) {

			String line;
			while ((line = buf.readLine()) != null) {
				President p = buildPresident(line);
				presidents.add(p);
			}

		} catch (IOException e) {
			System.err.println(e);
		}
	}

	private President buildPresident(String line) {
		String[] tokens = line.split(",");
	    int number = Integer.parseInt(tokens[0].trim());
	    String fname = tokens[1].trim();
	    String mname = tokens[2].trim();
	    String lname = tokens[3].trim();
	    int[] termArray = getTerms(tokens[4].trim());
	    String party = tokens[5].trim();

		return new President(number, fname, mname, lname, termArray[0], termArray[1], party);
	}

	private int[] getTerms(String terms) {
		// The terms are separated by a dash
		String[] termTokens = terms.split("-");
		int startTerm = Integer.parseInt(termTokens[0]);
		int endTerm = Integer.parseInt(termTokens[1]);
		return new int[] { startTerm, endTerm };
	}

	public List<President> getPresidents() {
		return presidents;
	}
}
