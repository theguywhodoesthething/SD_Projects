package test;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entities.Staff;

public class StaffTest {
	private EntityManagerFactory emf = null;
	private EntityManager em = null;

	Staff staff = null;
	Staff sup = null;

	@Before
	public void setUp() throws Exception {
		emf = Persistence.createEntityManagerFactory("VideoStore");
		em = emf.createEntityManager();
		staff = em.find(Staff.class, 8);
		sup = em.find(Staff.class, 64);
	}
	
	@Test
	public void test_supervisor_employees_association() {
		assertEquals("Mark", staff.getSupervisor().getFirstName());
	}
	
	@Test
	public void test_employees_supervisor_association() {
		assertEquals(2, sup.getEmployees().size());
	}
	
	@After
	public void tearDown() throws Exception {
		em.close();
		emf.close();
	}
}
