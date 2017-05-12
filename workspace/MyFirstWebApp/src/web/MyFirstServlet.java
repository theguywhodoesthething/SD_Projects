package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String day = req.getParameter("day");
		String outputText = "";
		int dtf = daysTilFriday(day);
		outputText += "OK, today is " + day + ", only " + dtf + " days until Friday!";
		
		PrintWriter pw = resp.getWriter();
		pw.println("<html>");
		pw.println("<head><title>My First Web App</title></head>");
		pw.println("  <body>" + outputText + "</body>");
		pw.println("</html>");
		pw.close();
	}
	
	private int daysTilFriday(String day) {
		int daysTilFriday = 0;
		
		List<String> week = new ArrayList<>();
		
		week.add("Monday");
		week.add("Tuesday");
		week.add("Wednesday");
		week.add("Thursday");
		week.add("Friday");
		week.add("Saturday");
		week.add("Sunday");

		
		if(week.indexOf(day) <= 4) {
			daysTilFriday = 4-week.indexOf(day);
		} else {
			daysTilFriday = (4-week.indexOf(day)) + 7;
		}
			
		return daysTilFriday;
	}
	
}
