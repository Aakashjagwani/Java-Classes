package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {
	
	@RequestMapping(value="/")
	public ModelAndView hello(){
		System.out.println("In Hello Controller");
		ModelAndView model = new ModelAndView();
		model.setViewName("index");		
		model.addObject("name","Juhi Soni");
		return model;
		
	}
	
	@RequestMapping(value = "/login")
	public ModelAndView login() {
		ModelAndView model = new ModelAndView();		
		model.setViewName("login");
		return model;		
	}
}
