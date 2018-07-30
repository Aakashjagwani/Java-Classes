package Lecture4;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class asd
 */
@WebServlet("/asd")
public class asd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public asd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost/table","root","root");
			Statement s=c.createStatement();
			ResultSet rs=s.executeQuery("SELECT * FROM servlet");
			while(rs.next())
			{
				
				String s1=rs.getString("fn");
				String s2=rs.getString("ln");
				String s3=rs.getString("un");
				String s4=rs.getString("pw");
				String s5=rs.getString("ad");
								
				out.println(s1+"<br>");
				out.println(s2+"<br>");
				out.println(s3+"<br>");
				out.println(s4+"<br>");
				out.println(s5+"<br>");
				out.write("<a href='del?fn="+s1+"'>Delete</a>");
				out.write("   <a href='Lecture4(del&edit)/edit.jsp?fn="+s1+" '>Edit</a> <br>");
				
			
			}
			
		}
		
			catch(Exception e)
			{
				System.out.println(e);
			}		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
