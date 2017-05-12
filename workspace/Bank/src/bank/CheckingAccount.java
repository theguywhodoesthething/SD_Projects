package bank;

public class CheckingAccount extends BankAccount {

	public CheckingAccount (String name, Double initialDeposit) {
		super(name, initialDeposit);
	}

	@Override
	public void deposit(double d) {
		// TODO Auto-generated method stub
		super.deposit(d);
		System.out.println("Checking deposit made: " + d);
	}

	@Override
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder(64);
		
		sb.append("name: ");
		sb.append(getName());
		sb.append("\tbalance: ");
		sb.append(getBalance());

		return sb.toString();
	}
	
	public int hashCode() {
		return super.hashCode();
	}
	
}
