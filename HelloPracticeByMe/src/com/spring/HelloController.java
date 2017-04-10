package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController{

	@RequestMapping("/welcome/{countryName}/{userName}")
	public ModelAndView handleRequestInternal(@PathVariable("userName") String name,@PathVariable("countryName") String country) {
		ModelAndView model=new ModelAndView("hello");
		model.addObject("welcomeHere","Hi "+ name +" You made it!!!!"+ "You are from " + country);
		return model;
	}
}
