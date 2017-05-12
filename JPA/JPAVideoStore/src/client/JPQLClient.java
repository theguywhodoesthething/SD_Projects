package client;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Customer;
import entities.Rental;
import entities.Store;

public class JPQLClient {
	public static void main(String[] args) {
//
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
//		EntityManager em = emf.createEntityManager();
//
		// Scanner kb = new Scanner(System.in);
		//
		// System.out.println("Please enter the number of ids you would like to
		// see");
		// int id = kb.nextInt();
		//
		// String queryString = "SELECT s FROM Staff AS s WHERE s.id < :id";
		//
		// List<Staff> results = em.createQuery(queryString,
		// Staff.class).setParameter("id", id).getResultList();
		//
		// for(Staff staff: results) {
		// System.out.println(staff.getId() + ", " + staff.getFirstName()
		// + ", " + staff.getLastName());
		// }
		//
		// em.close();
		// emf.close();
		// kb.close();
		//
		//
		// String queryString = "SELECT s FROM Staff AS s WHERE s.id BETWEEN
		// :begin AND :end";
		//
		// List<Staff> results = em.createQuery(queryString,
		// Staff.class).setParameter("begin", 100).setParameter("end",
		// 110).getResultList();
		//
		// for(Staff staff: results) {
		// System.out.println(staff.getFirstName() + ", " + staff.getLastName()
		// + ", " + staff.getEmail());
		// }
		//
		// em.close();
		// emf.close();
		//
		// Scanner kb = new Scanner(System.in);
		//
		// System.out.println("Please enter the number of ids you would like to
		// see.\nBegin:");
		// int begin = kb.nextInt();
		// System.out.println("End:");
		// int end = kb.nextInt();
		//
		//
		// String queryString = "SELECT s FROM Staff AS s WHERE s.id BETWEEN
		// :begin AND :end";
		//
		// List<Staff> results = em.createQuery(queryString,
		// Staff.class).setParameter("begin", begin).setParameter("end",
		// end).getResultList();
		//
		// for(Staff staff: results) {
		// System.out.println(staff.getFirstName() + ", " + staff.getLastName()
		// + ", " + staff.getEmail());
		// }
		//
		// em.close();
		// emf.close();
		// kb.close();
		// }

		Scanner kb = new Scanner(System.in);

		System.out.println("Please enter the number of ids you would like to see.\nBegin:");
		int begin = kb.nextInt();
		System.out.println("End:");
		int end = kb.nextInt();
		
		getRangeOfCustomers(begin, end);

		kb.close();
	}

	public static List<Customer> getRangeOfCustomers(int begin, int end) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
		EntityManager em = emf.createEntityManager();
		
		String queryString = "SELECT c FROM Customer AS c WHERE c.id BETWEEN :begin AND :end";

		List<Customer> results = em.createQuery(queryString, Customer.class).setParameter("begin", begin)
				.setParameter("end", end).getResultList();

		em.close();
		emf.close();
		
		return results;
	}
	
	public static Customer getCustomerByName(String fname, String lname) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
		EntityManager em = emf.createEntityManager();
		
		String queryString = "SELECT c FROM Customer AS c WHERE c.firstName = :fname AND c.lastName = :lname";
		
		Customer customer = null;
		customer = em.createQuery(queryString, Customer.class).setParameter("fname", fname).setParameter("lname", lname).getSingleResult();
		
		em.close();
		emf.close();
		
		return customer;
	}
	
	public static List<Store> getStoresByState(String state) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
		EntityManager em = emf.createEntityManager();
		
		String queryString = "SELECT s FROM Store AS s WHERE s.address.state = :state";
		
		List<Store> stores = em.createQuery(queryString, Store.class).setParameter("state", state)
				.getResultList();
		
		em.close();
		emf.close();
		
		return stores;
	}
	
	public static List<Rental> getRentalsForCustomerWithId(int id) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
		EntityManager em = emf.createEntityManager();
		
		String queryString = "SELECT r FROM Rental AS r WHERE r.customer.id = :id";
		
		List<Rental> rentals = null;
		rentals = em.createQuery(queryString, Rental.class).setParameter("id", id)
				.getResultList();
		
		em.close();
		emf.close();
		
		return rentals;
	}
}
