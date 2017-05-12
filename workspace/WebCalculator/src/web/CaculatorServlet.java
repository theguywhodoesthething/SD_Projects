package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CaculatorServlet extends HttpServlet {

	private Double firstNum, secondNum;
	private String operator;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.firstNum = Double.parseDouble(req.getParameter("fn"));
		this.secondNum = Double.parseDouble(req.getParameter("sn"));
		this.operator = req.getParameter("op");

		PrintWriter page = new PrintWriter(resp.getOutputStream());
		page.print("<html><head><title>Your Results</title></head></html>");
		page.print("<body><h1>Your Result:</h1>");
		page.print(calculate().toString());
		page.print("<br><p><a href=index.html>Try Again?</a></p>");
		page.println("</body></html>");
		page.close();
	}

	private Double calculate() {
		Double result = 0.0;

		switch (this.operator) {
		case "add":
			result = firstNum + secondNum;
			break;
		case "sub":
			result = firstNum - secondNum;
			break;
		case "div":
			result = firstNum / secondNum;
			break;
		case "mul":
			result = firstNum * secondNum;
			break;
		}
		return result;
	}

}
