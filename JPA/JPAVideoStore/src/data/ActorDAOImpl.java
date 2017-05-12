package data;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Actor;
import entities.Film;

public class ActorDAOImpl implements ActorDAO {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
	EntityManager em = emf.createEntityManager();


	@Override
	public Actor create(Actor actor) {

		em.getTransaction().begin();
		em.persist(actor);
		em.flush();
		em.getTransaction().commit();

		em.close();
		emf.close();

		return actor;
	}

	@Override
	public Actor update(int id, Actor actor) {

		em.getTransaction().begin();
		Actor managed = em.find(Actor.class, id);

		if (actor.getFirstName() != null) {
			managed.setFirstName(actor.getFirstName());
		}

		if (actor.getLastName() != null) {
			managed.setLastName(actor.getLastName());
		}

		em.persist(managed);
		em.flush();
		em.getTransaction().commit();

		em.close();
		emf.close();

		return actor;
	}

	@Override
	public boolean destroy(int id) {

		em.getTransaction().begin();
		Actor actor = em.find(Actor.class, id);
		boolean bool;
		
		if (actor != null) {
			em.remove(actor);
		} else {
			return false;
		}

		em.flush();
		em.getTransaction().commit();
		
		if (em.contains(actor)) {
			bool = false;
		} else {
			bool = true;
		}
		return bool;
	}

	@Override
	public Actor createActorAndFilm(Actor actor, Film film) {

		em.getTransaction().begin();
		
		if (actor.getFilms() == null) {
			actor.setFilms(new ArrayList<Film>());
		}
		
		actor.getFilms().add(film);
		
		em.persist(actor);
		em.flush();
		em.getTransaction().commit();

		em.close();
		emf.close();

		return actor;
	}
}
