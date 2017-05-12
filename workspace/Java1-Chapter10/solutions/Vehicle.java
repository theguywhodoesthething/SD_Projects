package solutions;

public class Vehicle {
	// fields
    protected int purchasePrice;
    protected int numWheels;

    // constructors
    public Vehicle() {
    	
    }
    
    public Vehicle(int price, int wheels) {
        purchasePrice = price;
        numWheels = wheels;
    }

    // methods
	public int getPurchasePrice() {
		return purchasePrice;
	}

	public int getNumWheels() {
		return numWheels;
	}

	@Override
	public String toString() {
		return "Vehicle [purchasePrice=" + purchasePrice + ", numWheels=" + numWheels + "]";
	}
}
