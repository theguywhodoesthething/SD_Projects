package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Stocks")
public class StockServlet extends HttpServlet {
	private StockDAO stockDAO;
	@Override
	public void init() throws ServletException {
		stockDAO = new StockFileDAO(getServletContext());
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("stocks", stockDAO.getAllStocks());
		req.getRequestDispatcher("/select.jsp").forward(req, resp);
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String symbol = req.getParameter("symbol");
		Stock stock = stockDAO.getStock(symbol);
		if (stock != null) {
			req.setAttribute("stock", stock);
			req.getRequestDispatcher("/results.jsp").forward(req, resp);
		}
		else {
			req.getRequestDispatcher("/error.jsp").forward(req, resp);
		}
	}
}