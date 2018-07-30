package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import databaseAccessObject.DAO;
import valueObject.Regist;
import valueObject.User;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
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
		doGet(request, response);
		
		String s=request.getParameter("fn");
		String s1=request.getParameter("ln");
		String s2=request.getParameter("un");
		String s3=request.getParameter("pw");
		
		User vo=new User();
		vo.setUn(s2);
		vo.setPw(s3);
		DAO d=new DAO();
		d.insert1(vo);
		Regist r=new Regist();
		r.setFn(s);
		r.setLn(s1);
		r.setUn(s2);
		r.setPw(s3);
		r.setV(vo);
		d.insert(r);
		PrintWriter p=response.getWriter();
		p.write("Done Succesfully");
		
	}
}
