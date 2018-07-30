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
	session.setAttribute("abc","Pradeep");
	session.setAttribute("xys",123);
	session.setAttribute("qwe","Aakash");
	session.setAttribute("rty",40.562f);
%><a href="third.jsp">Next</a> 
</body>
</html>