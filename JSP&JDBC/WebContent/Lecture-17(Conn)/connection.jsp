<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.sql.*"%>
	<%
	String q=request.getParameter("id");
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost/table","root","root");
	Statement s=c.createStatement();
	int i=Integer.parseInt(q);
	String t=(String) session.getAttribute("as");
	String y=(String) session.getAttribute("asd");
	String u=(String) session.getAttribute("asdf");
	String o=(String) session.getAttribute("asdfg");

	if(i==1)
	{
			
		ResultSet rs=s.executeQuery("SELECT * FROM conn WHERE fn='"+t+"' AND ln='"+y+"' ");
		while(rs.next())
		{
			String s1=rs.getString("fn");
			String s2=rs.getString("ln");
			String s3=rs.getString("un");
			String s4=rs.getString("pw");
			out.println(s1+"<br>");
			out.println(s2+"<br>");
			out.println(s3+"<br>");
			out.println(s4+"<br>");
		}
	}	
	else if(i==2)
		{
			s.executeUpdate("UPDATE conn SET fn='"+t+"',ln='"+y+"',un='"+u+"',pw='"+o+"' WHERE fn='"+t+"' ");			
		}
	else if(i==3)
		{
			s.executeUpdate("INSERT INTO conn(fn,ln,un,pw) VALUES('"+t+"','"+y+"','"+u+"','"+o+"')");
		}
	else
		{
			s.executeUpdate("DELETE From conn where fn='"+t+"' ");	
		}
	s.close();
	c.close();
	%>
</body>
</html>