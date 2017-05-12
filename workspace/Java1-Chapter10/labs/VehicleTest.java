package labs;

public class VehicleTest {

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle(2.5E4, 4);
		Automobile auto = new Automobile(3E4, 4, "Toyota", "Camry", 2010);
		Truck truck0 = new Truck(2.8E4, 4, "Ford", "F250", 2016, 7);
		Truck truck1 = new Truck(2.8E4, 6, "Ford", "F250", 2016, 7);
		
		System.out.println(vehicle.toString());
		System.out.println(auto.toString());
		System.out.println(truck0.toString());
		System.out.println(truck1.toString());
		
		displayAuto(auto);
		displayAuto(truck0);
		displayAuto(truck1);
		
		System.out.println(auto.calculateRegistrationFee());
		System.out.println(truck0.calculateRegistrationFee());
		System.out.println(truck1.calculateRegistrationFee());
		
//		compiles but fails at runtime because the Vehicle does not belong to the Automobile or Truck class
//		System.out.println(((Automobile)vehicle).calculateRegistrationFee());
//		vehicle = new Automobile(3E4, 4, "Toyota", "Camry", 2010);
//		displayAuto((Automobile)vehicle); 
		
	}

	public static void displayAuto(Automobile auto) {
		System.out.println(auto.getNumWheels());
		System.out.println(auto.getYear());
		System.out.println(auto.getPurchasePrice());
		
		if (auto instanceof Truck)
			System.out.println(((Truck) auto).getBedSize());
	}

}
