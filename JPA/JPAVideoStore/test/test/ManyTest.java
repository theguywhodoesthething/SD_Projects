package test;

import static org.junit.Assert.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import client.ManyToManyLab;
import entities.Actor;
import entities.Category;

public class ManyTest {

	private EntityManagerFactory emf = null;
	private EntityManager em = null;
	Actor actor = null;
	Category cat = null;

	@Before
	public void setUp() throws Exception {
		emf = Persistence.createEntityManagerFactory("VideoStore");
		em = emf.createEntityManager();
		actor = em.find(Actor.class, 1);
		cat = em.find(Category.class, 1);
	}

	@Test
	public void test_getFilmsForActorsWithId() {
		assertEquals(19, ManyToManyLab.getFilmsForActorsWithId(1).size());
	}
	
	@Test
	public void test_getFilmsForCategoryWithName() {
		assertEquals(64, ManyToManyLab.getFilmsForCategoryWithName("Action").size());
	}
	
	@Test
	public void test_getInventoryForStoreWithId() {
		assertEquals(2270, ManyToManyLab.getInventoryForStoreWithId(1).size());
	}

	@After
	public void tearDown() throws Exception {
		em.close();
		emf.close();
	}

}
