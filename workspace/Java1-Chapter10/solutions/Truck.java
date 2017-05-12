package solutions;

public class Truck extends Automobile {
	// fields
	private int bedSize;

	// constructors
	public Truck(int price, int wheels, String make, String model, int year, int bedSize) {
		this.purchasePrice = price;
		this.numWheels = wheels;
		this.make = make;
		this.model = model;
		this.year = year;
		this.bedSize = bedSize;
	}

	// methods
	public int getBedSize() {
		return bedSize;
	}

	@Override
	public String toString() {
		return "Truck [purchasePrice=" + purchasePrice + ", numWheels=" + numWheels + ", make=" + make + ", model=" + model + ", year=" + year + ", bedSize=" + bedSize + "]";
	}
}
