package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import data.PresidentFileDAO;
import data.PresidentsDAO;
import data.PresidentsDAOImpl;

@Controller
public class PresidentController {

	@Autowired
	private PresidentsDAO presidentsDao;
	
	@RequestMapping(path="GetPresident.do", 
			params="term",
			method=RequestMethod.POST)
	public String getByTerm(Model model) {
		model.addAttribute("president");
		return "results";
	}
	
	@RequestMapping(path="Gallery.do", method=RequestMethod.GET)
	public String getByAbbr(Model model, @RequestParam("abbr") String a) {
		PresidentsDAO list = new PresidentFileDAO();
		
		
		model.addAttribute("state", );
		return "president";
	}

}
