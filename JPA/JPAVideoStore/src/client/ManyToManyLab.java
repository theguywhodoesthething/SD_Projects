package client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Actor;
import entities.Category;
import entities.Film;
import entities.Store;

public class ManyToManyLab {

	public static List<Film> getFilmsForActorsWithId(int id) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
		EntityManager em = emf.createEntityManager();

		String query = "SELECT a FROM Actor AS a JOIN FETCH a.films WHERE a.id = :id";

		Actor actor = null;
		actor = em.createQuery(query, Actor.class).setParameter("id", id).getSingleResult();

		List<Film> films = actor.getFilms();
		
		em.close();
		emf.close();

		return films;
	}
	
	public static List<Film> getFilmsForCategoryWithName(String name) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
		EntityManager em = emf.createEntityManager();
		
		String query = "SELECT c FROM Category AS c JOIN FETCH c.films WHERE c.name = :name";
		
		Category cat = null;
		cat = em.createQuery(query, Category.class).setParameter("name", name).getSingleResult();
		
		List<Film> films = cat.getFilms();
		
		em.close();
		emf.close();
		
		return films;
	}
	
	public static List<Film> getInventoryForStoreWithId(int id) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
		EntityManager em = emf.createEntityManager();
		
		String query = "SELECT s FROM Store AS s JOIN FETCH s.films WHERE s.id = :id";
		
		Store store = null;
		store = em.createQuery(query, Store.class).setParameter("id", id).getSingleResult();
		
		List<Film> films = store.getFilms();
		
		em.close();
		emf.close();
		
		return films;
	}

}
