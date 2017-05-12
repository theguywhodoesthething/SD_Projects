package com.sd.data;

public class Jet {
	private int id;
	private String model;
	private int speed;
	private int range;
	private int price;
	
	public Jet(int id, String model, int speed, int range, int price) {
		super();
		this.id = id;
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
