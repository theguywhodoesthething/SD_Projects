package com.sd.lottery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hopper {

	List<Ball> hopper = new ArrayList<>();

	public void addBall(Ball b) {
		hopper.add(b);
	}

	public void addBalls(List<Ball> balls) {
		hopper.addAll(balls);
		this.shuffle();
	}

	public void shuffle() {
		Collections.shuffle(this.hopper);
	}

	public Ball draw() {
		return hopper.remove(0);
	}

	public Ball peek() {
		return hopper.get(0);
	}
}
