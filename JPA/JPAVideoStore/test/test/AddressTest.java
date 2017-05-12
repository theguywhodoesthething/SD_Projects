package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entities.Actor;
import entities.Address;
import entities.Category;
import entities.Customer;
import entities.Film;
import entities.InventoryItem;
import entities.Language;
import entities.Rental;
import entities.Staff;
import entities.Store;

public class AddressTest {

	private EntityManagerFactory emf = null;
	private EntityManager em = null;
	Customer cust = null;
	Film film = null;
	Language lang = null;
	Address add = null;
	Staff st = null;
	Rental rent = null;
	Store store = null;
	Actor actor = null;
	Category cat = null;
	InventoryItem ii = null;

	@Before
	public void setUp() throws Exception {
		emf = Persistence.createEntityManagerFactory("VideoStore");
		em = emf.createEntityManager();
		cust = em.find(Customer.class, 1);
		film = em.find(Film.class, 1);
		lang = em.find(Language.class, 1);
		add = em.find(Address.class, 1);
		st = em.find(Staff.class, 1);
		rent = em.find(Rental.class, 1);
		store = em.find(Store.class, 1);
		actor = em.find(Actor.class, 1);
		cat = em.find(Category.class, 1);
		ii = em.find(InventoryItem.class, 1);
	}

	@Test
	public void test_customer_mappings() {
		assertEquals("Mary", cust.getFirstName());
		assertEquals("Smithers", cust.getLastName());
		assertEquals("MARY.SMITH@sdvidcustomer.org", cust.getEmail());
	}

	@Test
	public void test_language_mappings() {
		assertEquals("English", lang.getName());
	}

	@Test
	public void test_film_mappings() {
		assertEquals("ACADEMY DINOSAUR", film.getTitle());
		assertEquals("A Epic Drama of a Feminist And a Mad Scientist who must Battle a Teacher in The Canadian Rockies",
				film.getDescription());
		assertEquals("1993-01-01", film.getReleaseYear().toString());
	}

	@Test
	public void test_address_mappings() {
		assertEquals("47 MySakila Drive", add.getStreet());
		assertEquals("Lethbridge", add.getCity());
		assertEquals("Alberta", add.getState());
	}

	@Test
	public void test_staff_mappings() {
		assertEquals("Larry", st.getFirstName());
		assertEquals("Kong", st.getLastName());
		assertEquals("larry.kong@example.com", st.getEmail());
	}

	@Test
	public void test_rental_mappings() {
		assertEquals("2014-05-24T22:53:30", rent.getRentalDate().toString());
		assertEquals("2014-05-26T22:04:30", rent.getReturnDate().toString());
	}

	@Test
	public void test_customer_temporal() {
		assertEquals("2014-05-25", cust.getCreatedAt().toString());
	}

	@Test
	public void films_have_ratings() {
		assertEquals("PG", film.getRating().toString());
	}

	@Test
	public void test_address_customer_association() {
		Customer cust = em.find(Customer.class, 2);
		Address address = cust.getAddress();
		assertEquals("1121 Loja Avenue", address.getStreet());
		assertEquals("", address.getStreet2());
		assertEquals("San Bernardino", address.getCity());
		assertEquals("17886", address.getPostalCode());
	}
	
	@Test
	public void test_address_store_association() {
		Address address = store.getAddress();
		assertEquals("Seattle", address.getCity());
	}
	
	@Test
	public void test_address_country_association() {
		assertEquals("CA", add.getCountry().getCountryCode());
	}
	
	@Test
	public void test_language_film_association() {
		List<Film> films = new ArrayList<>();
		films = lang.getFilms();
		assertEquals(981, films.size());
		assertEquals("ACE GOLDFINGER", films.get(0).getTitle());
	}
	
	@Test
	public void test_film_language_association() {
		assertEquals("Japanese", film.getLanguage().getName());
	}
	
	@Test
	public void test_staff_address_association() {
		assertEquals("370 E. Rochelle Blvd", st.getAddress().getStreet());
	}
	
	@Test
	public void test_rental_staff_association() {
		assertEquals("William", rent.getStaff().getFirstName());
	}
	
	@Test
	public void test_rental_customer_association() {
		assertEquals("Charlotte", rent.getCustomer().getFirstName());
	}
	
	@Test
	public void test_store_staff_association() {
		assertEquals("Mitchel", store.getStaffs().get(1).getFirstName());
	}
	
	@Test
	public void test_store_manager_association() {
		assertEquals("Dutch", store.getManager().getFirstName());
	}
	
	@Test
	public void test_film_actor_association() {
		assertEquals(19, actor.getFilms().size());
	}
	
	@Test
	public void test_actor_film_association() {
		assertEquals(10, film.getActors().size());
	}
	
	@Test
	public void test_film_category_association() {
		assertEquals("Documentary", film.getCategories().get(0).getName());
	}
	
	@Test
	public void test_category_film_association() {
		assertEquals(64, cat.getFilms().size());
	}
	
	@Test
	public void test_film_store_association() {
		assertEquals(28, film.getStores().size());
	}
	
	@Test
	public void test_store_film_association() {
		assertEquals(2270, store.getFilms().size());
	}
	
	@Test
	public void test_inventoryItem_association() {
		assertEquals("Used", ii.getMediaCondition().toString());
	}
	
	@Test
	public void test_inventoryItem_film_association() {
		assertEquals("ACADEMY DINOSAUR", ii.getFilm().getTitle());
	}
	
	@Test
	public void test_film_inventoryItem_association() {
		assertEquals(28, film.getInventoryItems().size());
	}
	
	@Test
	public void test_inventoryItem_store_association() {
		assertEquals("Dutch", ii.getStore().getManager().getFirstName());
	}
	
	@Test
	public void test_store_inventoryItem_association() {
		assertEquals(2270, store.getInventoryItems().size());
	}
	
	@Test
	public void test_inventoryItem_rental_association() {
		assertEquals(3, ii.getRentals().size());
	}
	
	@Test
	public void test_rental_inventoryItem_association() {
		assertEquals("MONTEREY LABYRINTH", rent.getInventoryItem().getFilm().getTitle());
	}

	@After
	public void tearDown() throws Exception {
		em.close();
		emf.close();
	}

	public static void main(String[] args) {

		// EntityManagerFactory emf =
		// Persistence.createEntityManagerFactory("VideoStore");
		// EntityManager em = emf.createEntityManager();
		// Address add = em.find(Address.class, 5);
		// System.out.println(add);

		// EntityManagerFactory emf =
		// Persistence.createEntityManagerFactory("VideoStore");
		// EntityManager em = emf.createEntityManager();
		// Staff st = em.find(Staff.class, 5);
		// System.out.println(st);

		// EntityManagerFactory emf =
		// Persistence.createEntityManagerFactory("VideoStore");
		// EntityManager em = emf.createEntityManager();
		// Language lan = em.find(Language.class, 5);
		// System.out.println(lan);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
		EntityManager em = emf.createEntityManager();
		Film film = em.find(Film.class, 5);
		System.out.println(film);

	}
}
