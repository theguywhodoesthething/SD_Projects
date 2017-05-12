package client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Film;
import entities.InventoryItem;
import entities.MediaCondition;

public class MappingsLab {
	
	public static List<InventoryItem> getInventoryConditionByFilmTitle(MediaCondition condition, String title) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
		EntityManager em = emf.createEntityManager();

		String query = "SELECT i FROM InventoryItem AS i"
						+ " WHERE i.film.title = :title AND i.mediaCondition = :cond";

		List<InventoryItem> ii = null;
		ii = em.createQuery(query, InventoryItem.class).setParameter("title", title)
				.setParameter("cond", condition).getResultList();
		
		em.close();
		emf.close();

		return ii;
	}
	
	public static int checkFilmInventoryForStoreById(int id, String title) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
		EntityManager em = emf.createEntityManager();
		
		String query = "SELECT COUNT(i) FROM InventoryItem AS i"
				+ " WHERE i.film.title = :title AND i.store.id = :id";
		
		Long ii = em.createQuery(query, Long.class).setParameter("title", title)
				.setParameter("id", id).getSingleResult();
		
		int n = ii.intValue();
		
		em.close();
		emf.close();
		
		return n;
	}
	
	public static List<Film> getFilmsRentedForCustomerWithId(int id) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
		EntityManager em = emf.createEntityManager();
		
		String query = "SELECT r.inventoryItem.film FROM Rental AS r"
				+ " WHERE r.customer.id = :id";
		
		List<Film> films = em.createQuery(query, Film.class).setParameter("id", id).getResultList();
				
		em.close();
		emf.close();
				
		return films;
	}
	
//	public static List<InventoryItem> checkFilmInventoryForStoreById(int id, String title) {
//		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
//		EntityManager em = emf.createEntityManager();
//		
//		String query = "SELECT i FROM InventoryItem AS i"
//				+ " WHERE i.film.title = :title AND i.store.id = :id";
//		
//		List<InventoryItem> ii = null;
//		ii = em.createQuery(query, InventoryItem.class).setParameter("title", title)
//				.setParameter("id", id).getResultList();
//		
//		em.close();
//		emf.close();
//		
//		return ii;
//	}
}
