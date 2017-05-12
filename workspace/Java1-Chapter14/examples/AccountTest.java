package examples;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AccountTest {
    @Test
    public void testAccountConstructor() {
        Account a = new Account();
        assertEquals("Acct-1", a.getAccountId());
    }

    @Test
    public void testDeposit() {
        Account a = new Account();
        a.deposit(100.0);
        assertEquals(100.0, a.getBalance(), .01);
    }

    @Test
    public void testWithdraw() {
        Account a = new Account();
        a.deposit(100.0);
        a.withdraw(1.0);
        String message = "Withdraw test failed.";
        assertEquals(message, 99.0, a.getBalance(), .01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeWithdrawal() 
	    throws IllegalArgumentException {

        Account a = new Account();
        a.withdraw(1.0);
    }
}
