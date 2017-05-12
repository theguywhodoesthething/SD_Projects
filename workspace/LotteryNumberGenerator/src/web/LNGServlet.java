package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LNGServlet extends HttpServlet {
	
	private Integer amount;
	private Integer range;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.amount = Integer.parseInt(req.getParameter("amount"));
		this.range = Integer.parseInt(req.getParameter("range"));
		String outputNumbers = getLuckyNumbers().toString();
		
		PrintWriter pw = resp.getWriter();
		pw.println("<html>");
		pw.println("<head><title>Lucky Numbers</title>");
		pw.println("<h1>Your Lucky Numbers are:</h1></head>");
		pw.println("  <body>" + outputNumbers + "</body>");
		pw.println("</html>");
		pw.close();
	}

	private List<Integer> getLuckyNumbers() {
		
		List<Integer> nums = new ArrayList<>();
		
		for(int i =0; i < this.amount; i++) {
			int rando;
			Random r = new Random();
			rando = r.nextInt(range+1);
			nums.add(rando);
		}
		
		return new ArrayList<>(nums);
	}

}
