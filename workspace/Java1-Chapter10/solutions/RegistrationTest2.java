package solutions;

public class RegistrationTest2 {
	public static void main(String[] args) {
		Automobile2[] autos = new Automobile2[5];
		autos[0] = new Automobile2(20000, 4, "Subaru", "Outback", 2014);
		autos[1] = new Truck2(20000, 4, "Toyota", "Tacoma", 2015, 6);
		autos[2] = new Truck2(60000, 6, "Ford", "F350", 2016, 8);
		autos[3] = new Automobile2(500, 4, "Honda", "Accord", 1988);
		autos[4] = new Automobile2(5000, 4, "Dodge", "Dart", 1975);
		
		for (Automobile2 auto : autos) {
			System.out.printf("Fee: $%.2f%n", auto.calculateRegistrationFee());
		}
	}
}
