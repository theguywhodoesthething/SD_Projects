package labs;

public class Calculator {
	
	int numInt1, numInt2;
	double numDouble3, numDouble4;
	
	public Calculator() {}
	
	public Calculator(int numInt1, int numInt2) {
		this.numInt1 = numInt1;
		this.numInt2 = numInt2;
	}

	public Calculator(double numDouble3, double numDouble4) {
		this.numDouble3 = numDouble3;
		this.numDouble4 = numDouble4;
	}
	
	public int getNumInt1() {
		return numInt1;
	}

	public void setNumInt1(int numInt1) {
		this.numInt1 = numInt1;
	}

	public int getNumInt2() {
		return numInt2;
	}

	public void setNumInt2(int numInt2) {
		this.numInt2 = numInt2;
	}

	public double getNumDouble3() {
		return numDouble3;
	}

	public void setNumDouble3(double numDouble3) {
		this.numDouble3 = numDouble3;
	}

	public double getNumDouble4() {
		return numDouble4;
	}

	public void setNumDouble4(double numDouble4) {
		this.numDouble4 = numDouble4;
	}

	public int add(int numInt1, int numInt2) {
		return numInt1 + numInt2;
	}
	
	public int subtract(int numInt1, int numInt2) {
		return numInt1 - numInt2;
	}
	
	public int multiply(int numInt1, int numInt2) {
		return numInt1 * numInt2;
	}
	
	public double divide(double numDouble3, double numDouble4) {
		return numDouble3 / numDouble4;
	}

}
