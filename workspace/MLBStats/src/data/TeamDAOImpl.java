package data;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;

public class TeamDAOImpl implements TeamDAO {
	private static final String FILE_NAME = "/WEB-INF/Teams.csv";
	private List<Team> teams = new ArrayList<>();

	@Autowired
	private WebApplicationContext wac;

	@PostConstruct
	public void init() {

		try (InputStream is = wac.getServletContext().getResourceAsStream(FILE_NAME);
				BufferedReader buf = new BufferedReader(new InputStreamReader(is));) {
			String line = buf.readLine();
			while ((line = buf.readLine()) != null) {
				String[] tokens = line.split(",");
				String city = tokens[0];
				String mascot = tokens[1];
				String state = tokens[2];
				String stadium = tokens[3];
				Integer capacity = Integer.parseInt(tokens[4]);
				String league = tokens[5];
				String division = tokens[6];
				teams.add(new Team(city, mascot, state, stadium, capacity, league, division));
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	@Override
	public List<Team> getTeams() {
		return teams;
	}
}
