package solutions;

public class ObjectArray {
	public static void main(String[] args) {
		Object[] vehicles = new Object[3];
		vehicles[0] = new Bicycle(100, 10);
		vehicles[1] = new Automobile3(10000, 4, "Subaru", "Outback", 2014);
		vehicles[2] = new Truck4(10000, 4, "Toyota", "Tacoma", 2015, 6);
		
		for (Object vehicle : vehicles) {
			System.out.println(vehicle);
		}
	}
}
