package controller;

import javax.servlet.http.HttpServletRequest;
import java.util.*;
import controller.regVo;
import controller.regdao;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

@Controller
public class Register {
	
	@Autowired
	regdao dao;
	
	@RequestMapping(value="/hii.html",method=RequestMethod.GET)
	public ModelAndView helloworld6() {
			return new ModelAndView("LOL","regis",new regVo());
			
				
	}
	@RequestMapping(value="/hello11.html",method=RequestMethod.POST)
	public ModelAndView helloworld5(@ModelAttribute regVo regvo,HttpServletRequest request,Model model) {
		
		//int s=regvo.getId();
		String s1=regvo.getFn();
		String s2=regvo.getLn();
		
		this.dao.insert(regvo);
	
		String s7="Registered";
		System.out.println(" " +s1+" " + s7+" "+s2);
		return new ModelAndView("welcme","msg","hi");
				
	}
/*	@RequestMapping(value="/hii1.html",method=RequestMethod.GET)
	public ModelAndView helloworld7() {
			return new ModelAndView("Search","regis",new regVo());
			
				
	}
	@RequestMapping(value="/hello2.html",method=RequestMethod.POST)
	public ModelAndView helloworld8(@ModelAttribute regVo regvo,HttpServletRequest request,Model model) {
		
		//int s=regvo.getId();
		String s1=regvo.getFn();
		String s2=regvo.getLn();
		
		List<?> l= this.dao.search(regvo,s1);
	
		
		System.out.println(l.toString());
		return new ModelAndView("welcme","msg",l);
				
	}*/

}