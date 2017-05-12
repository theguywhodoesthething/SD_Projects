package test;

import static org.junit.Assert.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entities.Payment;
import entities.Rental;

public class PaymentTest {
	private EntityManagerFactory emf = null;
	private EntityManager em = null;

	Payment pay = null;
	Rental rent = null;
	
	@Before
	public void setUp() throws Exception {
		emf = Persistence.createEntityManagerFactory("VideoStore");
		em = emf.createEntityManager();
		pay = em.find(Payment.class, 1);
		rent = em.find(Rental.class, 1);
	}
	
	@Test
	public void test_payment_association() {
		assertEquals("2014-05-25T11:30:37", pay.getPaymentDate().toString());
	}

	@Test
	public void test_rental_payment_association() {
		assertEquals("2014-05-24T22:53:30", rent.getPayments().get(0).getPaymentDate().toString());
	}
	
	@After
	public void tearDown() throws Exception {
		em.close();
		emf.close();
	}
}
