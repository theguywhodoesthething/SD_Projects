package data;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

public class PresidentFileDAO implements PresidentsDAO {

	private ServletContext servletContext;
	private List<PresidentsDAO> presidentsList;

	public PresidentFileDAO(ServletContext servletContext) {
		this.servletContext = servletContext;
		this.presidentsList = new ArrayList<>();
		loadStocksFromFile();
	}

	private void loadStocksFromFile() {
		InputStream is = servletContext.getResourceAsStream("presidents.csv");
		try (BufferedReader buf = new BufferedReader(new InputStreamReader(is))) {
			String line;

			while ((line = buf.readLine()) != null) {
				String[] tokens = line.split(",");
				int presidentNumber = Integer.parseInt(tokens[0].trim());
				String firstName = tokens[1].trim();
				String middleName = tokens[2].trim();
				String lastName = tokens[3].trim();
				String date = tokens[4].trim();
				String picture = tokens[5].trim();
				String party = tokens[6].trim();
				String funFact = tokens[7].trim();
				String[] dateTokens = date.split("-");
				int dateBegin = Integer.parseInt(dateTokens[0].trim());
				int dateEnd = Integer.parseInt(dateTokens[1].trim());
				presidentsList.add(new PresidentsDAOImpl(presidentNumber, firstName, middleName, lastName, dateBegin, dateEnd, picture, party, funFact));
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	public List<PresidentsDAO> getPresidentsList() {
		return this.presidentsList;
	}

	@Override
	public int getPresidentNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMiddleName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDateBegin() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDateEnd() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getParty() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPicture() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFunFact() {
		// TODO Auto-generated method stub
		return null;
	}
}
