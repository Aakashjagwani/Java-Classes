package com.Lecture4session;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class session{
	@RequestMapping(value="/regsess.html",method=RequestMethod.GET)
	public ModelAndView helloworld2(){
		String s="Using session for registeration";
		return new ModelAndView("","msg",s);
	}
}		

