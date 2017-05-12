package web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import data.NumberGeneratorDAO;
import data.NumberGeneratorDAOImpl;

public class LNGServlet extends HttpServlet {

	private NumberGeneratorDAO rng;

	@Override
	public void init() throws ServletException {
		rng = new NumberGeneratorDAOImpl();
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/results.jsp").forward(req, resp);
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int amount = Integer.parseInt(req.getParameter("amount"));
		int range = Integer.parseInt(req.getParameter("range"));
		List<Integer> list = rng.getLuckyNumbers(range, amount);

		HttpSession session = req.getSession();
		List<List> luckyNums = (List<List>) session.getAttribute("luckyNums");
		if (luckyNums == null) {
			luckyNums = new ArrayList<>();
			session.setAttribute("luckyNums", luckyNums);
		}
		if (list != null) {
			luckyNums.add(list);
		} else {
			req.getRequestDispatcher("/error.jsp").forward(req, resp);
		}
		req.setAttribute("luckyNums", luckyNums);
		req.getRequestDispatcher("/results.jsp").forward(req, resp);
	}
}
