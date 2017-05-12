package test;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import client.JPQLClient;

public class JPQLTest {

	private EntityManagerFactory emf = null;
	private EntityManager em = null;

	@Before
	public void setUp() throws Exception {
		emf = Persistence.createEntityManagerFactory("VideoStore");
		em = emf.createEntityManager();
	}

	@Test
	public void test_getRangeOfCustomers() {
		assertEquals(10, JPQLClient.getRangeOfCustomers(0, 10).size());
	}

	@Test
	public void test_getCustomerByName() {
		assertEquals("LUCILLE.HOLMES@sdvidcustomer.org", JPQLClient.getCustomerByName("Lucille", "Holmes").getEmail());
	}

	@Test
	public void test_getRentalsForCustomerWithId() {
		assertEquals(95, JPQLClient.getRentalsForCustomerWithId(1).size());
	}

	@Test
	public void test_getStoresByState() {
		assertEquals(2, JPQLClient.getStoresByState("California").size());
	}

//	@Rule
//	public final ExpectedException exception = ExpectedException.none();
//
//	@Test
//	public void doStuffThrowsIndexOutOfBoundsException() {
//
//		JPQLClient.getCustomerByName("Barbados", "Slim");
//		exception.expect(NoResultException.class);
//	}

	@After
	public void tearDown() throws Exception {
		em.close();
		emf.close();
	}

}
