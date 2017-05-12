package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import data.TeamDAO;

@Controller
@SessionAttributes("save")
public class MLBStatsController {
	
	@Autowired
	private TeamDAO teamDAO;
	
	public void setTeamDAO(TeamDAO t) {
		this.teamDAO = t;
	}
	
	@RequestMapping(path="welcome.do", method=RequestMethod.GET) 
	public String getTeams(Model model) {
		
		model.addAttribute("teams", teamDAO.getTeams());
		
		return "home";
		
	}

}
