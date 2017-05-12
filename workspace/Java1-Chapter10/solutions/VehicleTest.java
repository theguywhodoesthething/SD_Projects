package solutions;

public class VehicleTest {
	public static void main(String[] args) {
		Vehicle v = new Vehicle(1000, 3);
		Automobile a = new Automobile(10000, 4, "Subaru", "Outback", 2014);
		Truck t = new Truck(10000, 4, "Toyota", "Tacoma", 2015, 6);
		
		System.out.println(v);
		System.out.println(a);
		System.out.println(t);
	}
}
