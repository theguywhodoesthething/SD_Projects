package solutions;

import java.time.Year;

public class Automobile3 extends Vehicle2 {
	// fields
	private String make;
	private String model;
	private int year;
	
	// constructors
	public Automobile3() {
		
	}
	
	public Automobile3(int price, int wheels, String make, String model, int year) {
		super(price, wheels);
		this.make = make;
		this.model = model;
		this.year = year;
	}

	//methods
	public double calculateRegistrationFee() {
		int howOld = Year.now().getValue() - this.year;
		double feePercent = .01 - (howOld * .0001);
		double fee = this.getPurchasePrice() * feePercent;
		double minimumFee = this.getPurchasePrice() * .005;
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
		return super.toString() + ", make=" + make + ", model=" + model + ", year=" + year;
	}
}
