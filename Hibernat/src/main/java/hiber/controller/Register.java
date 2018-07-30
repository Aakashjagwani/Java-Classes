package hiber.controller;


import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hiber.DAO.*;
import hiber.VO.*;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Register() {
        super();
        
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		
		String s=request.getParameter("fn");
		String s1=request.getParameter("ln");
		String s2=request.getParameter("un");
		String s3=request.getParameter("pw");
		
		RegDao d=new RegDao();
		Regist r=new Regist();
		r.setFn(s);
		r.setLn(s1);
		r.setUn(s2);
		r.setPw(s3);
		d.insert(r);
//		List<?> l = d.search(r);
//		HttpSession session = request.getSession();
//		session.setAttribute("list", l);
		PrintWriter p=response.getWriter();
		p.write("Done Succesfully");
		
	}
}
