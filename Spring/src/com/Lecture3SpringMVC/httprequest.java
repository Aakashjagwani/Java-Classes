package com.Lecture3SpringMVC;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class  httprequest{
	@RequestMapping(value="/httpreq.html",method=RequestMethod.GET)
	public ModelAndView reg1()
	{
	return new ModelAndView("gethttpreq");	
	}	
	@RequestMapping(value="/addregistration1.html",method=RequestMethod.GET)
	public ModelAndView request1(HttpServletRequest req){		
		String fname=req.getParameter("fn");
		String lname=req.getParameter("ln");
		
		if(fname.equals("Aakash") && lname.equals("Aakash"))
		{
		return new ModelAndView("welcome","msg",fname);
		}
		else
		{
			return new ModelAndView("getrequest");
		}
	}
}
