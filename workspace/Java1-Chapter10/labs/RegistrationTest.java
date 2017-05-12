package labs;

public class RegistrationTest {
	public static void main(String[] args) {
		
		Automobile auto0 = new Automobile(3E4, 4, "Toyota", "Camry", 2010);
		Truck truck0 = new Truck(2.8E4, 6, "Ford", "F250", 2016, 7);
		Truck truck1 = new Truck(2.4E4, 4, "Ford", "F150", 2012, 6);
		Automobile auto1 = new Automobile(3E5, 4, "Jaguar", "F-Type", 2011);
		Automobile auto2 = new Automobile(3E2, 4, "Dodge", "Caravan", 2008);
		Bicycle bike = new Bicycle(200, 8);
		
		Vehicle[] vehArr = {auto0, truck0, truck1, auto1, auto2, bike};
		
		
//		int x = (int)(truck0.calculateRegistrationFee() * 100);
//		System.out.println("The the truck 0 reg fee is " + (x/100));
//		x = (int)(truck1.calculateRegistrationFee() * 100);
//		System.out.println("The truck 1 reg fee is " + (x/100));
//		x = (int)(auto.calculateRegistrationFee() * 100);
//		System.out.println("The auto reg fee is " + (x/100));
		
//		for(Automobile i : vehArr)
//			System.out.println(i.calculateRegistrationFee());
		
		for(Vehicle i : vehArr)
			System.out.println(i.toString());
		
		
		
	}

}
