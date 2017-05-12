package solutions;

public class Address {
	private int houseNumber;
	private String street;
	private String city;
	private String state;
	private StringBuilder zipcode;
	
	public Address(int houseNumber, String street, String city, String state, StringBuilder zipcode) {
		super();
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		if (houseNumber < 1) {
			houseNumber = 1;
		}
		this.houseNumber = houseNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public StringBuilder getZipcode() {
		return zipcode;
	}

	public void setZipcode(StringBuilder zipcode) {
		if (zipcode.length() == 5) {
			zipcode.append("-0000");
		}
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", zipcode=" + zipcode + "]";
	}
}
