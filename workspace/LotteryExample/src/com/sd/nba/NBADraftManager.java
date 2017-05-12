package com.sd.nba;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sd.lottery.Ball;
import com.sd.lottery.BallFactory;
import com.sd.lottery.Hopper;

public class NBADraftManager {

	private Hopper nbaHopper = new Hopper();
	private int[] seedCounts = { 250, 199, 156, 119, 88, 63, 43, 28, 17, 11, 8, 7, 6, 5 };
	private BallFactory factory = new BallFactory();
	// private Map<String, Integer> teamBallCounts = new HashMap<>();

	public NBADraftManager() {
		this.loadDefaultHopper();
	}

	public NBADraftManager(List<String> teamNames) {
		this.loadHopperWithTeamNames(teamNames);
	}

	private void loadDefaultHopper() {
		for (int i = 0; i < seedCounts.length; i++) {
			nbaHopper.addBalls(factory.makeBalls(seedCounts[i], "Seed " + (i + 1)));
		}
	}

	private void loadHopperWithTeamNames(List<String> teamNames) {
		for (int i = 0; i < seedCounts.length; i++) {
			nbaHopper.addBalls(factory.makeBalls(seedCounts[i], teamNames.get(i)));
		}
	}

	public String getWinner() {
		Ball winningBall = nbaHopper.draw();
		return winningBall.getName();
	}
}
