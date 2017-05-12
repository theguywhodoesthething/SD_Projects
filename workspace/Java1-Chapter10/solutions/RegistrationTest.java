package solutions;

public class RegistrationTest {
	public static void main(String[] args) {
		Automobile2 a = new Automobile2(20000, 4, "Subaru", "Outback", 2014);
		Truck2 t = new Truck2(20000, 4, "Toyota", "Tacoma", 2015, 6);
		Truck2 dually = new Truck2(60000, 6, "Ford", "F350", 2016, 8);
		
		System.out.printf("Fee: $%.2f%n", a.calculateRegistrationFee());
		System.out.printf("Fee: $%.2f%n", t.calculateRegistrationFee());
		System.out.printf("Fee: $%.2f%n", dually.calculateRegistrationFee());
	}
}
