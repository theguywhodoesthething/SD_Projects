package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.PresidentFileDAO;
import data.PresidentsDAO;

@WebServlet("/presidents")
public class PresidentsServlet extends HttpServlet {

	private PresidentsDAO presidentsDAO;
	private Map<Integer, PresidentsDAO> presidentsList;

	@Override
	public void init() throws ServletException {
		presidentsDAO = new PresidentFileDAO(getServletContext());
		presidentsList = new HashMap<>();
		for (PresidentsDAO p : presidentsDAO.getPresidentsList()) {
			presidentsList.put(p.getPresidentNumber(), p);
		}
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<PresidentsDAO> list = new ArrayList<>();

		for (int i = 1; i <= presidentsList.size(); i++) {
			list.add(presidentsList.get(i));
		}

		req.setAttribute("presidentsList", list);
		req.getRequestDispatcher("/president.jsp").forward(req, resp);
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<PresidentsDAO> list = new ArrayList<>();
		List<PresidentsDAO> matchedList = new ArrayList<>();

		for (int i = 1; i <= presidentsList.size(); i++) {
			list.add(presidentsList.get(i));
		}

		String name = req.getParameter("name");
		String party = req.getParameter("party");
		int term = Integer.parseInt(req.getParameter("term"));

		if (name != null) {
			name = name.toLowerCase().trim();
		}

		if (party != null) {
			party = party.toLowerCase().trim();
		}

		if (name != null && party != null) {
			for (PresidentsDAO p : list) {
				String prezName = p.getFirstName() + p.getMiddleName() + p.getLastName();
				prezName = prezName.toLowerCase();
				if (prezName.contains(name) && party == p.getParty().toLowerCase()) {
					matchedList.add(p);
				}
			}
		} else if (name != null && party == null) {
			for (PresidentsDAO p : list) {
				String prezName = p.getFirstName() + p.getMiddleName() + p.getLastName();
				prezName = prezName.toLowerCase();
				if (prezName.contains(name)) {
					matchedList.add(p);
				}
			}
		} else if (party != null && name == null) {
			for (PresidentsDAO p : list) {
				if (p.getParty().toLowerCase() == party) {
					matchedList.add(p);
				}
			}
		}

		if (matchedList != null) {
			req.setAttribute("matchedList", matchedList);
			req.getRequestDispatcher("/filtered.jsp").forward(req, resp);
		}

		if (term != 0) {
			if (term > presidentsList.size()) {
				term = 1;
			} else if (term < 1) {
				term = presidentsList.size();
			}

			PresidentsDAO president = presidentsList.get(term);

			req.setAttribute("president", president);
			req.getRequestDispatcher("/results.jsp").forward(req, resp);
		}
	}
}