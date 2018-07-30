package com.Lecture3SpringMVC;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class springreq {
	@RequestMapping(value="/springreg.html",method=RequestMethod.GET)
	public ModelAndView reg2()
	{
		return new ModelAndView("getspring","regis",new regvo());	
	}
	@RequestMapping(value="/spring.html",method=RequestMethod.POST)
	public ModelAndView reg3(@ModelAttribute regvo regvo,HttpServletRequest req)
	{
		String fname=regvo.getFn();
		String lname=regvo.getLn();
		if(fname.equals("admin") && lname.equals("admin"))
		{
		return new ModelAndView("welcome","msg",fname);
		}
		else
		{
			return new ModelAndView("redirect:springreg.html");
		}
	}	

}
