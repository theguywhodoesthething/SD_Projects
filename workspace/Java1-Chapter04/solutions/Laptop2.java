package solutions;

public class Laptop2 {
	public static void main(String[] args) {
		String manufacturer;
		String os;
		float price;
		int ramGB;
		int hdGB;
		char wireless;
		boolean hdmi;

		manufacturer = "Apple";
		os = "OS X";
		price = 1299.99F;
		ramGB = 8;
		hdGB = 512;
		wireless = 'N';
		hdmi = true;
		
		System.out.println(manufacturer + " " + os);
		System.out.println("Price: " + price);
		System.out.println("RAM: " + ramGB + "GB");
		System.out.println("HD: " + hdGB + "GB");
		System.out.println("Wireless: " + wireless);
		System.out.println("HDMI: " + hdmi);
	}

}
