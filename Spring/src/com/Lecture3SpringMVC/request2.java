package com.Lecture3SpringMVC;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class request2 {
	@RequestMapping(value="/request2.html",method=RequestMethod.GET)
	public ModelAndView reg(){
		return new ModelAndView("getrequest");	
	}
	@RequestMapping(value="/addregistration.html",method=RequestMethod.GET)
	public ModelAndView request3(@RequestParam("fn") String fname,@RequestParam("ln") String lname){
		if(fname.equals("admin") && lname.equals("admin"))
		{
		return new ModelAndView("welcome","msg",fname);
		}
		else
		{
			return new ModelAndView("getrequest");
		}
	}		
}
