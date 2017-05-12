package com.sd.lottery;

import java.util.ArrayList;
import java.util.List;

public class BallFactory {

	public List<Ball> makeBalls(int count, String name) {

		List<Ball> balls = new ArrayList<>();

		for (int i = 0; i < count; i++) {
			balls.add(new Ball(name));
		}

		return balls;
	}

}
