package com.Lecture3SpringMVC;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class hell {
	@RequestMapping(value="/hello.html",method=RequestMethod.GET)
	public ModelAndView helloworld(){
		String s="Welcome to Spring";
		return new ModelAndView("welcome","msg",s);
	}
}
