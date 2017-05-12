package data;

import java.util.List;

import entities.Customer;

public interface CustomerDAO {
	
	public List<Customer> index();
	public Customer show(int id);
	public Customer create(Customer customer);
	public Customer update(int id, Customer customer);
	public boolean destroy(int id);
	public Customer findByEmail(String email);
}
