package solutions;

import java.time.Year;

public class Truck4 extends Automobile3 {
	// fields
	private int bedSize;

	// constructors
	public Truck4(int price, int wheels, String make, String model, int year, int bedSize) {
		super(price, wheels, make, model, year);
		this.bedSize = bedSize;
	}

	// methods
	@Override
	public double calculateRegistrationFee() {
		int howOld = Year.now().getValue() - this.getYear();
		double feePercent = 0;
		if (getNumWheels() == 6) {
			feePercent = .015 - (howOld * .0001);
			double fee = this.getPurchasePrice() * feePercent;
			double minimumFee = this.getPurchasePrice() * .005;
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
		return super.toString() + ", bedSize=" + bedSize;
	}
}
