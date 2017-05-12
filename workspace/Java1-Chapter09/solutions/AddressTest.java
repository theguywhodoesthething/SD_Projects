package solutions;

public class AddressTest {
	public static void main(String[] args) {
		Address add = new Address(218, "S. 8th St", "Denver", "CO", new StringBuilder("81101"));
		System.out.println(add);
		
		int houseNum = -1;
		StringBuilder zip = new StringBuilder("80111");
		System.out.println("House Num: " + houseNum + " Zip: " + zip);
		add.setHouseNumber(houseNum);
		add.setZipcode(zip);
		System.out.println("House Num: " + houseNum + " Zip: " + zip);
		
		System.out.println(add);
	}
}
