package labs;

public class Automobile extends Vehicle {
	
	private String make;
	private String model;
	private int year;
	
	public Automobile (double purchasePrice, int numWheels, String make, String model, int year) {
		super(purchasePrice, numWheels);
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
//	public Automobile () {
////		super(0.0, 0);
////		this.make = null;
////		this.model = null;
////		this.year = 0;
//	}
	
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "This automobile is a " + year + " " + make + " " + model + ". " + super.toString();
	}
	
	public double calculateRegistrationFee() {
		
		int now = java.time.Year.now().getValue();
		double regFee;
		
		regFee = (getPurchasePrice() * 0.01);
				
		if ((now - getYear()) > 5)
			regFee -= getPurchasePrice() * 0.005;
		else
			regFee -= (now - getYear()) * 0.0001;
			
		return regFee;
	}
}
