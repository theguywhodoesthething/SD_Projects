package entities;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Rental {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "rental_date")
	private LocalDateTime rentalDate;
	@Column(name = "return_date")
	private LocalDateTime returnDate;
	@ManyToOne
	@JoinColumn(name = "staff_id")
	private Staff staff;
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
    @OneToMany
    @JoinColumn(name="rental_id", referencedColumnName="id")
    private List<Payment> payments;
    @ManyToOne
    @JoinColumn(name = "inventory_id")
    private InventoryItem inventoryItem;
	

	public int getId() {
		return id;
	}

	public LocalDateTime getRentalDate() {
		return rentalDate;
	}

	public void setRentalDate(LocalDateTime rentalDate) {
		this.rentalDate = rentalDate;
	}

	public LocalDateTime getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDateTime returnDate) {
		this.returnDate = returnDate;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	public InventoryItem getInventoryItem() {
		return inventoryItem;
	}

	public void setInventoryItem(InventoryItem inventoryItem) {
		this.inventoryItem = inventoryItem;
	}


}
