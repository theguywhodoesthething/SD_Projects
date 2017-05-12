package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String firstName = req.getParameter("fm");
		String lastName = req.getParameter("lm");
		String social = req.getParameter("ssn");
		String dateOfBirth = req.getParameter("dob");
		String school = req.getParameter("sc");
		String outputText = "Hi " + firstName + " " + lastName;
		String relevantInfo = "You were born on " + dateOfBirth + ", your social is " 
								+ social + " and you are attending " + school + ".";
				
		PrintWriter pw = resp.getWriter();
		pw.println("<html>");
		pw.println("<head><title>Hello World</title></head>");
		pw.println("  <body>" + outputText + "<br>");
		pw.println(relevantInfo + "</body>");
		pw.println("</html>");
		pw.close();
	}
}
