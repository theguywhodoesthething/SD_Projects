package labs;

public class Bicycle extends Vehicle {
	
	private int numGears;

	public Bicycle(double purchasePrice, int numGears) {
		super(purchasePrice, 2);
		this.numGears = numGears;
	}

	public int getNumGears() {
		return numGears;
	}

	public void setNumGears(int numGears) {
		this.numGears = numGears;
	}
	
	@Override
	public String toString() {
		return super.toString() + "It has " + numGears + " gears.";
	}

}
