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
		String o=request.getParameter("first name");
		String o1=request.getParameter("last name");
		String o2=request.getParameter("user name");
		String o3=request.getParameter("password");
		String o4=request.getParameter("email");
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost/table","root","root");
		Statement s=c.createStatement();
		s.executeUpdate("INSERT INTO abc(FN,LN,UN,PW,EM) VALUES('"+o+"','"+o1+"','"+o2+"','"+o3+"','"+o4+"')");
		s.close();
		c.close();
	%>
</body>
</html>