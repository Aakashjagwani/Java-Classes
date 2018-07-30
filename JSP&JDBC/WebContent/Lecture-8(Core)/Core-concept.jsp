<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="Lecture8.*"%>
<%
	Aakash a2=new Aakash();
	a2.a=10;
	a2.b=20;
	int f=a2.a();
	int g=a2.a1();	
	out.println(f);
	out.println(g);
	a2.a();
	a2.a1();	
%>

</body>
</html>