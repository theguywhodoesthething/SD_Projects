package examples;
public class Account {
    private static int nextId = 0;
    private double balance;
    private String id;

    public Account() {
        this(0.0);
    }

    public Account(double initialBalance) {
        setBalance(initialBalance);
        setAccountId(nextId++);
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double b) {
        if (b < 0) {
            throw new IllegalArgumentException(
                    "Negative balance is not allowed");
        }
        balance = b;
    }

    public String getAccountId() {
        return id;
    }

    private void setAccountId(int value) {
        id = "Acct-" + value;
    }

    public void deposit(double amount) {
        setBalance(balance + amount);
    }

    public void withdraw(double amount) {
        setBalance(balance - amount);
    }
}
