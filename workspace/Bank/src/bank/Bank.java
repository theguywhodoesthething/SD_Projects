package bank;

public class Bank {
	
	public static final Integer ROUTING_NUMBER = 12345;
	
	private static BankAccount[] accounts = new BankAccount[7];
	
	public static void main(String[] args) {
		
		int index = 0;
		accounts[index++] = new CheckingAccount("Roland Yaw", 300.0);
		accounts[index++] = new CheckingAccount("Bart Simpson", 300.0);
		accounts[index++] = new CheckingAccount("Homer Simpson", 300.0);
		accounts[index++] = new CheckingAccount("Bill Murray", 300.0);
		accounts[index++] = new CheckingAccount("Donald Duck", 300.0);
		accounts[index++] = new CheckingAccount("Tom Hanks", 300.0);
		accounts[index++] = new CheckingAccount("Tom Hanks", 300.0);
		
		for(BankAccount i : accounts) {
			System.out.println(i.hashCode());
		}
		
	
		for(int i = 0; i < (accounts.length); i++){
			for(int j = i + 1; j < (accounts.length); j++){
				System.out.println(accounts[i] + " =? " + accounts[j]);
				if (accounts[i].equals(accounts[j])) {
						System.out.println("************TRUE****************");
				}
			}
			System.out.println("\n");
		}

		for(int i = 0; i < (accounts.length); i++){
			for(int j = i + 1; j < (accounts.length); j++){
				System.out.println(accounts[i] + " =? " + accounts[j]);
				if ((accounts[i].hashCode()) == (accounts[j].hashCode())) {
					System.out.println("************TRUE****************");
				}
			}
			System.out.println("\n");
			
		}
	}
}
