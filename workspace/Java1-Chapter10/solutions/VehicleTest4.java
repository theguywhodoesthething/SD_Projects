package solutions;

public class VehicleTest4 {
	public static void main(String[] args) {
		Vehicle2 v = new Vehicle2(1000, 3);
		Automobile3 a = new Automobile3(10000, 4, "Subaru", "Outback", 2014);
		Truck4 t = new Truck4(10000, 4, "Toyota", "Tacoma", 2015, 6);
		
		System.out.println(v);
		System.out.println(a);
		System.out.println(t);
	}
}
