package examples;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class AccountTest2 {
    private Account a;

    @Before
    public void setup() {
        a = new Account();
    }

    @Test
    public void testAccountConstructor() {
        assertEquals("Acct-0", a.getAccountId());
    }

    @Test
    public void testDeposit() {
        a.deposit(100.0);
        assertEquals(100.0, a.getBalance(), .01);
    }

    @Test
    public void testWithdraw() {
        a.deposit(100.0);
        a.withdraw(1.0);
        String message = "Withdraw test failed.";
        assertEquals(message, 99.0, a.getBalance(), .01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeWithdrawal() throws IllegalArgumentException {

        a.withdraw(1.0);
    }
}
