<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="Login.jsp">Logout</a>
<br>
<%
	String s1=(String) session.getAttribute("asd");
	String s2=(String) session.getAttribute("as");	
%>
	Welcome<br>
<% 
	out.println("Username       "+s1+"<br>");
	out.println("Password       "+s2+"<br>");
%>
<a href="pass.jsp">Change Password</a>
</body>
</html>