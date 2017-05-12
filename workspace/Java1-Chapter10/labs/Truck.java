package labs;

public class Truck extends Automobile {

	private Integer bedSize;
	
//	public Truck () {
//		
//	}

	public Truck(double purchasePrice, int numWheels, String make, String model, int year, int bedSize) {
		super(purchasePrice, numWheels, make, model, year);
		this.bedSize = bedSize;		
	}
	
	
	
	public Integer getBedSize() {
		return bedSize;
	}

	public void setBedSize(Integer bedSize) {
		this.bedSize = bedSize;
	}

	@Override
	public String toString() {
		return super.toString() + "It has a bed size of " + bedSize + ".";
	}
	
	@Override
	public double calculateRegistrationFee() {
		
		double regFee = super.calculateRegistrationFee();
		
		if (getNumWheels() == 6) {
			regFee += getPurchasePrice() * 0.015;
		}
		
		return regFee;
	}
	
}
