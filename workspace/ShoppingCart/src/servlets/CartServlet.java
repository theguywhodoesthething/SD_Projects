//package servlets;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import data.Item;
//import data.ItemDAO;
//import data.ItemDAOMemoryImpl;
//
//public class CartServlet extends HttpServlet {
//	List<Item> cart = new ArrayList<>();
//	ItemDAO dao;
//	
//	@Override
//	public void init() throws ServletException {
//		dao = new ItemDAOMemoryImpl();
//	}
//
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		PrintWriter page = new PrintWriter (resp.getOutputStream());
//		page.print("<html><head><title>Your Cart</title></head></html>");
//		page.print("<body><h1>Your Cart:</h1>");
//		page.print(cart.toString());
//		page.println("</body></html>");
//		page.close();
//	}
//
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String upc = req.getParameter("item");
//		Item item = dao.getItem(upc);
//		PrintWriter page = new PrintWriter (resp.getOutputStream());
//		page.print("<html><head><title>Item Added</title></head></html>");
//		if(item != null){
//			cart.add(item);
//			page.print("<body><h1>Item Added:</h1>");
//			page.print(item.toString());			
//		} else {
//			page.print("<body><h1>Item Not Found</h1>Invalid upc: " + upc);
//		}
//		page.println("</body></html>");
//		page.close();
//	}
//	
//}
