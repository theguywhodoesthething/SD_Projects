package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hopper {
	private String name;
	private List<PingPongBall> pingPongBalls;
	private int counter = 0;
	
	public Hopper() {
		pingPongBalls = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setPingPongBalls(List<PingPongBall> balls) {
		pingPongBalls = balls;
	}
	
	public void reset() {
		Collections.shuffle(pingPongBalls);
		counter = 0;
	}
	
	public PingPongBall drawBall() {
		return pingPongBalls.get(counter++);
	}
}
