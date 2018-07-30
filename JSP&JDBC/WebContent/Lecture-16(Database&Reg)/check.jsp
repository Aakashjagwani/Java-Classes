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
	String s1=(String) session.getAttribute("as");	
	String s2=(String) session.getAttribute("asd");
	String o1=request.getParameter("pass");
	String o2=request.getParameter("cn");
	
	if(s1.equals(o1))
	{
		out.println("Enter new password");	
	}
	else
	{
		out.println("Old password is not same enter same password");	
	}
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost/table","root","root");
	Statement s=c.createStatement();
	s.executeUpdate("UPDATE reg SET pw='"+o2+"' WHERE un='"+s2+"' ");
	s.close();
	c.close();
	response.sendRedirect("update.jsp");
%>
</body>
</html>