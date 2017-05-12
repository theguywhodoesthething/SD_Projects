package data;

import java.util.Collection;

public interface BookDAO {
	public Book getBook(String isbn);
	public Collection<Book> getAllBooks();
	public void addBook(Book book);
}
