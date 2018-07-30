package controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import databaseAccessObject.countryDAO;
import valueObject.country_vo;
import valueObject.state_vo;

/**
 * Servlet implementation class get_state
 */
@WebServlet("/get_state")
public class get_state extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public get_state() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		
		String s=request.getParameter("count");
		int i1=Integer.parseInt(s);
		String s1=request.getParameter("pak");
		country_vo d1=new country_vo();
		d1.setId(i1);
		state_vo v=new state_vo();
		v.setV(d1);
		v.setState(s1);
		countryDAO d=new countryDAO();
		d.insert1(v);	
	}
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
