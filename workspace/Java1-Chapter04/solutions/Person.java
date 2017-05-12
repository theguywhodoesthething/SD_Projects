package solutions;

public class Person {
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

		System.out.println(firstname + " " + lastname + " is " + age);
	}

}
