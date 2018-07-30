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
	String o=request.getParameter("FN");
	String o1=request.getParameter("LN");
	String o2=request.getParameter("UN");
	String o3=request.getParameter("PW");
	Class.forName("com.mysql.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost/table","root","root");
	Statement s=c.createStatement();
	s.executeUpdate("INSERT INTO reg(fn,ln,un,pw) VALUES('"+o+"','"+o1+"','"+o2+"','"+o3+"')");
	s.close();
	c.close();
	response.sendRedirect("Login.jsp");
%>
		
	
</body>
</html>