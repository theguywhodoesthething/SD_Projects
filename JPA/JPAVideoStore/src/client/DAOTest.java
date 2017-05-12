package client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import data.ActorDAO;
import data.ActorDAOImpl;
import entities.Actor;
import entities.Film;
import entities.Language;

public class DAOTest {

	public static void main(String[] args) {
		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
//		EntityManager em = emf.createEntityManager();
//
//		Actor actor = new Actor();
		ActorDAO dao = new ActorDAOImpl();
//		
//		actor.setFirstName("Jack");
//		actor.setLastName("Hammer");
//		
//		dao.create(actor);
//		
//		actor = em.find(Actor.class, 202);
//		actor.setFirstName("Herbert");
//		
//		dao.update(202, actor);
//		
//		System.out.println(dao.destroy(201));
//		
//		Language language = em.find(Language.class, 1);
//		
//		Film film = new Film();
//		film.setLanguage(language);
//		film.setTitle("The Garbage Collector");
//		film.setRentalRate(4.99);
//		film.setReplacementCost(20.45);
//		
//		dao.createActorAndFilm(actor, film);	
		
//		dao.destroy(212);
		
	}

}
