package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.LoginDAO;
import com.dao.RegestrationDAO;
import com.vo.LoginVO;
import com.vo.RegestrationVO;

@Controller
public class RegestrationController
	{
		@Autowired RegestrationDAO regestrationDAO;
		
		@Autowired LoginDAO loginDAO;
	
		@RequestMapping(method = RequestMethod.GET,value="/loadReg.htm")
		public ModelAndView addReg()
			{
				return new ModelAndView("Admin/Regestration","data",new RegestrationVO());
			}
		
		@RequestMapping(method= RequestMethod.POST,value="insertReg.htm")
		public ModelAndView adddb(@ModelAttribute RegestrationVO registrationVO,LoginVO loginVO)
			{
				String loginUsername=registrationVO.getLoginVO().getLoginUsername();
				String loginPassword=registrationVO.getLoginVO().getLoginPassword();
			
				loginVO.setLoginUsername(loginUsername);
				loginVO.setLoginPassword(loginPassword);
				loginVO.setLoginRole("ROLE_USER");
				loginVO.setLoginEnable("1");
				
				this.loginDAO.insert(loginVO);
				
				registrationVO.setLoginVO(loginVO);
						
				this.regestrationDAO.insert(registrationVO);		
		
				return new ModelAndView("redirect:index.htm");
			}
				
	}
