package entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Category {

	@Id
	private int id;
	private String name;
	@ManyToMany
	@JoinTable(name = "film_category", 
	joinColumns = @JoinColumn(name = "category_id"), 
	inverseJoinColumns = @JoinColumn(name = "film_id"))
	List<Film> films;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Film> getFilms() {
		return films;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", films=" + films + "]";
	}

}
