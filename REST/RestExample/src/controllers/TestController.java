package controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import data.User;

@RestController
public class TestController {

	@RequestMapping(path = "ping/{name}", method = RequestMethod.GET)
	public String ping(@PathVariable String name) {
		System.out.println("Inside of TestController ping");
		return "pong " + name;
	}
	
	@RequestMapping(path = "users/{userId}", method = RequestMethod.GET)
	public User show(@PathVariable Integer userId){
		
		
		User u = new User("Andrew Conlin", "Acon", "Andrew@sd.com", "wombat1");
		
		System.out.println(userId);
		
		return u;
		
	}
}