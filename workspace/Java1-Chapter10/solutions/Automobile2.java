package solutions;

import java.time.Year;

public class Automobile2 extends Vehicle {
	// fields
	protected String make;
	protected String model;
	protected int year;
	
	// constructors
	public Automobile2() {
		
	}
	
	public Automobile2(int price, int wheels, String make, String model, int year) {
		this.purchasePrice = price;
		this.numWheels = wheels;
		this.make = make;
		this.model = model;
		this.year = year;
	}

	//methods
	public double calculateRegistrationFee() {
		int howOld = Year.now().getValue() - this.year;
		double feePercent = .01 - (howOld * .0001);
		double fee = this.purchasePrice * feePercent;
		double minimumFee = this.purchasePrice * .005;
		return Math.max(fee, minimumFee);
	}
	
	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "Automobile [purchasePrice=" + purchasePrice + ", numWheels=" + numWheels + ", make=" + make + ", model=" + model + ", year=" + year + "]";
	}
}
