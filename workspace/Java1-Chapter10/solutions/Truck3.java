package solutions;

import java.time.Year;

public class Truck3 extends Automobile2 {
	// fields
	private int bedSize;

	// constructors
	public Truck3(int price, int wheels, String make, String model, int year, int bedSize) {
		this.purchasePrice = price;
		this.numWheels = wheels;
		this.make = make;
		this.model = model;
		this.year = year;
		this.bedSize = bedSize;
	}

	// methods
	@Override
	public double calculateRegistrationFee() {
		int howOld = Year.now().getValue() - this.year;
		double feePercent = 0;
		if (numWheels == 6) {
			feePercent = .015 - (howOld * .0001);
			double fee = this.purchasePrice * feePercent;
			double minimumFee = this.purchasePrice * .005;
			return Math.max(fee, minimumFee);
		} 
		else {
		    return super.calculateRegistrationFee();
		}
	}
	
	public int getBedSize() {
		return bedSize;
	}

	@Override
	public String toString() {
		return "Truck [purchasePrice=" + purchasePrice + ", numWheels=" + numWheels + ", make=" + make + ", model=" + model + ", year=" + year + ", bedSize=" + bedSize + "]";
	}
}
