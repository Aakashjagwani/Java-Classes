package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.LoginDAO;
import com.vo.LoginVO;

@Controller
public class MainController
	{

		@Autowired LoginDAO logindao;
	
		@RequestMapping(value={"/","index.htm"},method=RequestMethod.GET)
		public ModelAndView loadIndex() 
			{
				return new ModelAndView("Admin/Login");
			}
	
	
		@RequestMapping(value = "login.htm",method=RequestMethod.GET)
		public String loadLogin() 
			{
				return "Admin/Login";
			}
		
		@RequestMapping(value="admin.htm",method=RequestMethod.GET)
		public String admin() 
			{
				return "Admin/DashBoard";
			}
		
		@RequestMapping(value = "user.htm",method=RequestMethod.GET)
		public String user(HttpSession session,@ModelAttribute LoginVO loginVO)
			{
				Authentication auth = SecurityContextHolder.getContext().getAuthentication();	
				
				User user=(User)auth.getPrincipal();
				
				String userName=user.getUsername();
				
				System.out.println("userName:"+userName);
				
				loginVO.setLoginUsername(userName);
				
				List ls=this.logindao.getLoginId(loginVO);
				
				LoginVO lvo=(LoginVO)ls.get(0);
				
				int loginId =lvo.getLoginId();
				
				System.out.println("loginId:"+loginId);
				
				session.setAttribute("loginId",loginId);
				
				return "User/UserDashBoard";
			}
	
		@RequestMapping(value = "403page.htm",method=RequestMethod.GET)
		public String AccessDenied()
			{
				return "User/403page";
			}
		
		@RequestMapping(value="logout.htm",method=RequestMethod.GET)
		public String logout(HttpSession session)
			{
				return "Admin/Login";
			}
}
