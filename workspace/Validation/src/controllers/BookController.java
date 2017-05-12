package controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import data.Book;
import data.BookDAO;

@Controller
public class BookController {
	@Autowired
	private BookDAO bookDAO;
	
	@RequestMapping(path="GetBook.do", method=RequestMethod.GET)
	public ModelAndView getBook() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("getbook.jsp");
		mv.addObject("books",  bookDAO.getAllBooks());
		return mv;
	}
	
	@RequestMapping(path="GetBook.do", method=RequestMethod.POST)
	public ModelAndView getBook(String isbn) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("results.jsp");
		mv.addObject("book", bookDAO.getBook(isbn));
		return mv;
	}
	
	@RequestMapping(path="AddBook.do", method=RequestMethod.GET)
	public ModelAndView addBook() {
		// Prime the model with an empty book object so that
		// the form can populate it with values
		Book b = new Book();
		return new ModelAndView("newbook.jsp", "book", b);
	}
	
	@RequestMapping(path="AddBook.do", method=RequestMethod.POST)
	public String addBook(@Valid Book book, Errors errors) {
		if (errors.getErrorCount() != 0) {
			return "newbook.jsp";
		}
		bookDAO.addBook(book);
		// book command object is already stored in the request
		// no need to add it to the ModelAndView again
		return "results.jsp";
	}
}
