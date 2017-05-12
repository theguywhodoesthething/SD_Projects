package data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Book {
	@NotNull
	@Size(min=13, max=13, message="ISBN must be of length 13")
	private String isbn;
	@NotNull
	private String title;
	@NotNull
	private String author;
	@Min(0)
	private int totalSold;
	@Min(1400)
	@Max(2020)
	private int yearPublished = 2016;

	public Book() {

	}

	public Book(String isbn, String title, String author, int yearPublished, int totalSold) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.yearPublished = yearPublished;
		this.totalSold = totalSold;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	public int getTotalSold() {
		return totalSold;
	}

	public void setTotalSold(int totalSold) {
		this.totalSold = totalSold;
	}
	
	public String getCSV() {
		return isbn + "," + title + "," + author + "," + yearPublished + "," + totalSold;
	}
}
