package solutions;

public class Reverse {
	public static void main(String[] args) {
		int number = 123456;
		int reverse = 0;
		
		System.out.println("Original: " + number);
		while (number != 0) {
			reverse = reverse * 10;
			reverse = reverse + number % 10;
			number = number / 10;
		}
		

		System.out.println("Reverse: " + reverse);
	}
}
