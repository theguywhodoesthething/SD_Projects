package com.sd.lottery;

public class Ball {
	
	private String name;
	
	public Ball(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ball [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
}
