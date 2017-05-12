package solutions;

public class PersonValid {
	private static String firstname;
	private static String lastname;
	private static int age;

	public static void main(String[] args) {
		java.util.Scanner keyboard = new java.util.Scanner(System.in);

		System.out.print("First name: ");
		firstname = keyboard.nextLine();
		System.out.print("Last name: ");
		lastname = keyboard.nextLine();
		System.out.print("Age: ");
		age = keyboard.nextInt();
		keyboard.close();

		boolean valid = true;
		if (firstname == null || firstname.equals("")) {
			System.out.println("Firstname cannot be empty.");
			valid = false;
		}
		if (lastname == null || lastname.equals("")) {
			System.out.println("Lastname cannot be empty.");
			valid = false;
		}
		if (firstname.equals(lastname)) {
			System.out.println("First and lastname cannot be the same.");
			valid = false;
		}
		if (age < 0) {
			System.out.println("Age must be greater than zero.");
			valid = false;
		}

		if (valid) {
			System.out.println(firstname + " " + lastname + " is " + age);
		}
	}

}
