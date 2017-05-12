package entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "inventory_item")
public class InventoryItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "media_condition")
	@Enumerated(EnumType.STRING)
	private MediaCondition mediaCondition;
	@ManyToOne
	@JoinColumn(name = "film_id")
	private Film film;
	@ManyToOne
	@JoinColumn(name = "store_id")
	private Store store;
	@OneToMany(mappedBy = "inventoryItem")
	private List<Rental> rentals;

	public MediaCondition getMediaCondition() {
		return mediaCondition;
	}

	public void setMediaCondition(MediaCondition mediaCondition) {
		this.mediaCondition = mediaCondition;
	}

	public int getId() {
		return id;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public List<Rental> getRentals() {
		return rentals;
	}

	public void setRentals(List<Rental> rentals) {
		this.rentals = rentals;
	}
	
}