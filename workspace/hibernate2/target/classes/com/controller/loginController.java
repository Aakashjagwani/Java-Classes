package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vo.login;
import com.DAO.*;

/**
 * Servlet implementation class get
 */
@WebServlet("/loginController")
public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
	
	
	
	@Override
	public void init() throws ServletException {
		super.init();
		
	
	}
    public loginController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String email=request.getParameter("em");
		String pass=request.getParameter("pw");
		
//		PrintWriter out = response.getWriter();
//		HttpSession userSession=request.getSession();
//		userSession.setAttribute("loggedUser", email);	
//		userSession.getServletContext();
		
		loginDAO d =new loginDAO();
		login login1 = new login();
		login1.setFirstName(email);
		login1.setPass(pass);
		d.login(login1);
		
		System.out.println(login1);
		
	}

}