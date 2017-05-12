package web;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Stocks")
public class StockServlet extends HttpServlet {
	@Override
	public void init() throws ServletException {
		// Rather than do this through a Servlet init,
		// it would be better to use a WebListener
		ServletContext context = getServletContext();
		StockDAO stockDAO = new StockFileDAO(context);
		context.setAttribute("stockDAO", stockDAO);
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// List of stocks already available via DAO stored in the 
		// ServletContext, no need to do any additional 
		// setAttribute() calls
		req.getRequestDispatcher("/select.jsp").forward(req, resp);
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String symbol = req.getParameter("symbol");
		ServletContext context = getServletContext();
		StockDAO stockDAO = (StockDAO)context.getAttribute("stockDAO");

		HttpSession session = req.getSession();
		if (session.getAttribute("stocks") == null) {
			// first time
			session.setAttribute("stocks", new HashSet<Stock>());
		}

		Stock stock = stockDAO.getStock(symbol);
		if (stock != null) {
			Set<Stock> stockList = 
					(Set<Stock>) session.getAttribute("stocks");
			stockList.add(stock);
			req.getRequestDispatcher("/select.jsp").forward(req, resp);
		}
		else {
			req.getRequestDispatcher("/error.jsp").forward(req, resp);
		}
	}
}