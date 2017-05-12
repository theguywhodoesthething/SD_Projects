package solutions;

public class Automobile extends Vehicle {
	// fields
	protected String make;
	protected String model;
	protected int year;
	
	// constructors
	public Automobile() {
		
	}
	
	public Automobile(int price, int wheels, String make, String model, int year) {
		this.purchasePrice = price;
		this.numWheels = wheels;
		this.make = make;
		this.model = model;
		this.year = year;
	}

	//methods
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
