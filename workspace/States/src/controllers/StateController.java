package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import data.State;
import data.StateDAO;

@Controller
public class StateController {
	
	@Autowired
	private StateDAO stateDao;

	@RequestMapping(path="GetStateData.do", 
			params="name",
			method=RequestMethod.GET)
	public ModelAndView getByName(@RequestParam("name") String n) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result.jsp");
		mv.addObject("state", stateDao.getStateByName(n));
		return mv;
	}
	
	@RequestMapping(path="GetStateData.do", 
			params="abbr",
			method=RequestMethod.GET)
	public ModelAndView getByAbbrev(@RequestParam("abbr") String a) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result.jsp");
		mv.addObject("state", stateDao.getStateByAbbreviation(a));
		return mv;
	}

	@RequestMapping(path="NewState.do",
			method=RequestMethod.POST)
	public ModelAndView newState(State state) {
		stateDao.addState(state);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result.jsp");
		return mv;
	}
}
