package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import data.State;
import data.StateDAO;

@Controller
@SessionAttributes("state")
public class StateController {
	
  @Autowired
  private StateDAO stateDAO;
  
  public void setStateDao(StateDAO s){
	  this.stateDAO = s;
  }
  
  
	@RequestMapping(path="GetStateData.do", 
			params="name",
			method=RequestMethod.GET)
	public String getByName(Model model, @RequestParam("name") String n) {
		model.addAttribute("state", stateDAO.getStateByName(n));
		return "result";
	}
	
	@RequestMapping(path="GetStateData.do",
			params="abbr",
			method=RequestMethod.GET)
	public String getByAbbr(Model model, @RequestParam("abbr") String a) {
		model.addAttribute("state", stateDAO.getStateByAbbreviation(a));
		return "result";
	}
	
	@RequestMapping(path="GetStateData.do", params="previous", method=RequestMethod.GET)
	public String getPreviousStateById(Model model, State s) {

		String previous = "" + (s.getId()-1);
		State st = stateDAO.getStateById(previous);
		
		model.addAttribute("state", st);
		return "result";
	}
	
	@RequestMapping(path="GetStateData.do", params="next", method=RequestMethod.GET)
	public String getNextStateById(Model model, State s) {
		
		String next = ("" + (s.getId()+1));
		State st = stateDAO.getStateById(next);
		
		model.addAttribute("state", st);
		return "result";
	}
	
	@RequestMapping(path="NewState.do",
			method=RequestMethod.POST)
	public String newState(Model model, State state) {
		stateDAO.addState(state);
		model.addAttribute(stateDAO);
		return "result";
	}
}