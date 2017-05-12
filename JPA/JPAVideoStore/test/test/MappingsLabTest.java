package test;

import static org.junit.Assert.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import client.MappingsLab;
import entities.InventoryItem;
import entities.MediaCondition;
import entities.Store;

public class MappingsLabTest {
	
	private EntityManagerFactory emf = null;
	private EntityManager em = null;
	
	InventoryItem ii = null;
	Store store = null;

	@Before
	public void setUp() throws Exception {
		emf = Persistence.createEntityManagerFactory("VideoStore");
		em = emf.createEntityManager();
		
		ii = em.find(InventoryItem.class, 1);
		store = em.find(Store.class, 1);
	}
	
	@Test
	public void test_getInventoryConditionByFilmTitle() {
		assertEquals(21 ,MappingsLab.getInventoryConditionByFilmTitle(MediaCondition.Used,
				"ACADEMY DINOSAUR").size());
	}
	
	@Test
	public void test_checkFilmInventoryForStoreById() {
			
		assertEquals(4, MappingsLab.checkFilmInventoryForStoreById(1,
				"ACADEMY DINOSAUR"));
	}
	
	@Test
	public void test_getFilmsRentedForCustomerWithId() {
		assertEquals(86 ,MappingsLab.getFilmsRentedForCustomerWithId(2).size());
	}

	@After
	public void tearDown() throws Exception {
		em.close();
		emf.close();
	}
}
