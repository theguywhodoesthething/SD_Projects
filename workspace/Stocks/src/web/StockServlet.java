package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StockPrice")
public class StockServlet extends HttpServlet {
	private StockDAO stockDAO;
	@Override
	public void init() throws ServletException {
		System.out.println("In init() method");
		stockDAO = new StockFileDAO(getServletContext());
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String symbol = req.getParameter("symbol");
		double amount = stockDAO.getPrice(symbol);

		PrintWriter pw = resp.getWriter();
		pw.println("<html>");
		pw.println("<head><title>Stocks</title></head>");
		pw.print("<body>");
		if (amount != -1) {
			pw.printf("<p>%s = %.2f</p>", symbol, amount);
		}
		else {
			pw.println("<p>Invalid Symbol</p>");
			pw.println("<p><a href=\"select.html\">Try Again?</a></p>");
		}
				
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
	}

	@Override
	public void destroy() {
		System.out.println("In destroy method");
	}
}

	