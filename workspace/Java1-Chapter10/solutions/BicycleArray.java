package solutions;

public class BicycleArray {
	public static void main(String[] args) {
		Bicycle[] vehicles = new Bicycle[3];
		vehicles[0] = new Bicycle(100, 10);
		// the following lines won't compile because they aren't 
		// compatible with Bicycle
		//vehicles[1] = new Automobile3(10000, 4, "Subaru", "Outback", 2014);
		//vehicles[2] = new Truck4(10000, 4, "Toyota", "Tacoma", 2015, 6);
		
		for (Bicycle vehicle : vehicles) {
			System.out.println(vehicle);
		}
	}
}
