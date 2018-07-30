<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.sql.*" %>
	<%
	String s1=" ",s2=" ";
	String o=request.getParameter("UN");
	String o1=request.getParameter("PW");
	
	session.setAttribute("asd",o);
	session.setAttribute("as",o1);
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost/table","root","root");
	Statement s=c.createStatement();
	ResultSet rs=s.executeQuery("SELECT * from reg");
	int i1=0;
	while(rs.next())
	{
		int i=rs.getInt("id");	
		 s1=rs.getString("un");
		 s2=rs.getString("pw");
		 i1=1;
	}

	//if(o.equals(s1) && o1.equals(s2))
		//response.sendRedirect("Welcome.jsp");
	//else
		//response.sendRedirect("reg.jsp");
	if(i1==0)
		response.sendRedirect("reg.jsp");
	else
		response.sendRedirect("Welcome.jsp");
	
	s.close();
	c.close();
	%>
</body>
</html>