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
	String Fn1=request.getParameter("a");
	String Ln1=request.getParameter("a1");
	String Un2=request.getParameter("a2");
	String Pw3=request.getParameter("a3");
	String add1=request.getParameter("a4p");
	String add2=request.getParameter("a4r");
	String add3=request.getParameter("a5p");
	String add4=request.getParameter("a5r");



	
	out.println(Fn1);%><br><%
	out.println(Ln1);%><br><%
	out.println(Un2);%><br><%
	out.println(Pw3);%><br><%
	out.println(add1);%><br><%
	out.println(add2);%><br><%
	out.println(add3);%><br><%
	out.println(add4);%><br><%
%>
</body>
</html>