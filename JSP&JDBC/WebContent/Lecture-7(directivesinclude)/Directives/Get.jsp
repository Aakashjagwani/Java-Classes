<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String s=request.getParameter("User name");
	String s1=request.getParameter("password");
	String s2=request.getParameter("address");
	String s3=request.getParameter("First name");
	String s4=request.getParameter("Last name");
	
	out.println(s+"<br>");
	out.println(s1+"<br>");
	out.println(s2+"<br>");
	out.println(s3+"<br>");
	out.println(s4+"<br>");
%>
</body>
</html>