package labs;

public class Vehicle {
	
	private Double purchasePrice;
	private Integer numWheels;
	
	public Vehicle(double purchasePrice, int numWheels) {
		this.purchasePrice = purchasePrice;
		this.numWheels = numWheels;
	}
	
//	public Vehicle() {
////		this.purchasePrice = 0.0;
////		this.numWheels = 0;
//	}
	
	public double getPurchasePrice() {
		return purchasePrice;
	}
	
	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	
	public int getNumWheels() {
		return numWheels;
	}
	
	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}
	
	@Override
	public String toString() {
		return "This vehicle costs " + purchasePrice + " and has " + numWheels + " wheels. ";
	}

}
