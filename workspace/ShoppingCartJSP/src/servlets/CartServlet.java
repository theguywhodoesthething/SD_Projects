package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import data.Item;
import data.ItemDAO;
import data.ItemDAOMemoryImpl;

public class CartServlet extends HttpServlet {
//	List<Item> cart = new ArrayList<>();
	ItemDAO dao;
	
	@Override
	public void init() throws ServletException {
		dao = new ItemDAOMemoryImpl();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Item> inv = dao.getInventory();
		req.setAttribute("inventory", inv);
		HttpSession session = req.getSession();
		List<Item> cart = (List<Item>)session.getAttribute("cart");
		if(cart == null) {
			cart = new ArrayList<>();
			session.setAttribute("cart", cart);
		}
		req.getRequestDispatcher("/shop.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		List<Item> cart = (List<Item>)session.getAttribute("cart");
		if(cart == null) {
			cart = new ArrayList<>();
			session.setAttribute("cart", cart);
		}
		String upc = req.getParameter("product");
		Item item = dao.getItem(upc);
//		System.out.println(upc);
		List<Item> inv = dao.getInventory();
		req.setAttribute("inventory", inv);
		if(item != null){
			cart.add(item);
//			System.out.println("Item added");
			req.setAttribute("addedItem", item);
		} else {
//			System.out.println("Item not added");
		}
		req.setAttribute("cart", cart);
		req.getRequestDispatcher("/shop.jsp").forward(req, resp);
	}
	
}
