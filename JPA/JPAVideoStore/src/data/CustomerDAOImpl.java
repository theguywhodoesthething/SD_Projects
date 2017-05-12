package data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Customer;

public class CustomerDAOImpl implements CustomerDAO {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
	EntityManager em = emf.createEntityManager();

	@Override
	public List<Customer> index() {
		String query = "SELECT c FROM Customer AS c";
		List<Customer> customers = em.createQuery(query, Customer.class).getResultList();

		return customers;
	}

	@Override
	public Customer show(int id) {

		return em.find(Customer.class, id);
	}

	@Override
	public Customer create(Customer customer) {

		em.getTransaction().begin();
		em.persist(customer);
		em.flush();
		em.getTransaction().commit();

		em.close();
		emf.close();

		return customer;
	}

	@Override
	public Customer update(int id, Customer customer) {

		em.getTransaction().begin();
		Customer managedCustomer = em.find(Customer.class, id);

		if (customer.getFirstName() != null) {
			managedCustomer.setFirstName(customer.getFirstName());
		}

		if (customer.getLastName() != null) {
			managedCustomer.setLastName(customer.getLastName());
		}

		em.persist(managedCustomer);
		em.flush();
		em.getTransaction().commit();

		em.close();
		emf.close();

		return managedCustomer;
	}

	@Override
	public boolean destroy(int id) {

		em.getTransaction().begin();
		Customer customer = em.find(Customer.class, id);
		boolean bool;
		
		if (customer != null) {
			em.remove(customer);
		} else {
			return false;
		}

		em.flush();
		em.getTransaction().commit();
		
		if (em.contains(customer)) {
			bool = false;
		} else {
			bool = true;
		}
		return bool;
	
	}

	@Override
	public Customer findByEmail(String email) {

		String query = "SELECT c FROM Customer AS c JOIN FETCH c.email WHERE c.email = :email";

		Customer customer = em.createQuery(query, Customer.class)
				.setParameter("email", email).getSingleResult();

		return customer;
	}

}
