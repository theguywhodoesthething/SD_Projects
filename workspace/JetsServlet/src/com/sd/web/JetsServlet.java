package com.sd.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sd.data.Jet;
import com.sd.data.JetsDao;
import com.sd.data.StaticJetsDao;

@SuppressWarnings("serial")
public class JetsServlet extends HttpServlet {
	private JetsDao jetsDao;

	public JetsServlet() {
		jetsDao = new StaticJetsDao();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String forReturn = "/results.jsp";
		Jet jet = null;

		if (id == null) {
			req.setAttribute("jets", jetsDao.getJets());
		} else {
			try {
				jet = jetsDao.getJetById(Integer.parseInt(id));
				if (jet == null) {
					forReturn = "/error.jsp";
					req.getRequestDispatcher(forReturn).forward(req, resp);
					return;
				}
			} catch (NumberFormatException e) {
				forReturn = "/error.jsp";
				req.getRequestDispatcher(forReturn).forward(req, resp);
				return;
			}
			List<Jet> jetList = new ArrayList<>();
			jetList.add(jet);
			req.setAttribute("jets", jetList);
		}

		req.getRequestDispatcher(forReturn).forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}

}
