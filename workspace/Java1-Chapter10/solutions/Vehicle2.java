package solutions;

public class Vehicle2 {
	// fields
	private int purchasePrice;
	private int numWheels;

    // constructors
    public Vehicle2() {
    	
    }
    
    public Vehicle2(int price, int wheels) {
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
		return this.getClass().getSimpleName() + " purchasePrice=" + purchasePrice + ", numWheels=" + numWheels;
	}
}
