<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="Lecture8.*"  %>
<%
	get g=new get();
	g.setFn("Aakash");
	g.setLn("jagwani");
	String s=g.getFn();
	String s1=g.getLn();
	out.println(s);
	out.println(s1);	
%>

</body>
</html>