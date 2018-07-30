package Lecture3;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class insert
 */
@WebServlet("/insert")
public class insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String o1=request.getParameter("a1");
		String o2=request.getParameter("a2");
		String o3=request.getParameter("a3");
		String o4=request.getParameter("a4");
		String o5=request.getParameter("a5");
		 
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost/table","root","root");
			Statement s=c.createStatement();
			s.executeUpdate("INSERT INTO servlet(fn,ln,un,pw,ad) VALUES('"+o1+"','"+o2+"','"+o3+"','"+o4+"','"+o5+"')");
			s.close();
			c.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		response.sendRedirect("Lecture3(DatabaseInsrt)/insrtfn.jsp");
	}
}
