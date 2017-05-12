package solutions;

public class Bicycle extends Vehicle2 {
    private int numGears;

    public Bicycle(int price, int ngears) {
        super(price, 2);  // all bikes have two wheels
        numGears = ngears;
    }

    public int getNumGears() {
        return numGears;
    }

	@Override
	public String toString() {
		return super.toString() + ", numGears=" + numGears;
	}
}
