package solutions;

public class Laptop {
	public static void main(String[] args) {
		float price;
		int ramGB;
		int hdGB;
		char wireless;
		boolean hdmi;

		price = 1299.99F;
		ramGB = 8;
		hdGB = 512;
		wireless = 'N';
		hdmi = true;

		System.out.println("Price: " + price);
		System.out.println("RAM: " + ramGB + "GB");
		System.out.println("HD: " + hdGB + "GB");
		System.out.println("Wireless: " + wireless);
		System.out.println("HDMI: " + hdmi);
	}

}
