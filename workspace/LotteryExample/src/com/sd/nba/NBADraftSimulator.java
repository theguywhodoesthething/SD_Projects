package com.sd.nba;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NBADraftSimulator {

	private Map<String, Integer> results = new HashMap<>();

	public static void main(String[] args) {
		NBADraftSimulator sim = new NBADraftSimulator();
		sim.runSimulation(1000);
	}

	private void runSimulation(int runs) {
		for (int i = 0; i < runs; i++) {
			NBADraftManager mgr = new NBADraftManager();
			String winner = mgr.getWinner();
//			System.out.println(winner);

			if (results.containsKey(winner)) {
				int teamWins = results.get(winner);
				teamWins++;
				results.put(winner, teamWins);
			} else {
				results.put(winner, 1);
			}
		}
		printResults(runs);
	}

	void printResults(int runs) {
		System.out.println("NBA Draft simulater " + runs + " times.");
		Set<String> teamNames = results.keySet();
		List<String> sortedTeamNames = new ArrayList<>(teamNames);
		
		Collections.sort(sortedTeamNames, new TeamWinsComparator(results));
		
		for (String t : teamNames) {
			int wins = results.get(t);
			System.out.println(t + ": " + wins);
		}
	}
}

class TeamWinsComparator implements Comparator<String> {
	
	Map<String, Integer> teams;
	
	public TeamWinsComparator(Map<String, Integer> teams) {
		this.teams = teams;
	}
	
	@Override
	public int compare(String one, String two) {
		if (teams.get(one) > teams.get(two)){
			return 1;
		} else if (teams.get(one) < teams.get(two)) {
			return -1;
		} else {
			return 0;
		}
	}
}
