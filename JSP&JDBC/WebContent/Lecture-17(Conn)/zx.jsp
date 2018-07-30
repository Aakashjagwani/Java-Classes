<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

WHAT WOULD YOU LIKE TO DO

	<br><br>
	<a href="connection.jsp?id=1">Search</a><br><br>
	<a href="connection.jsp?id=2">update</a><br><br>
	<a href="connection.jsp?id=3">register</a><br><br>
	<a href="connection.jsp?id=4">delete</a><br><br>
<%
	String o=request.getParameter("fn");
	String o1=request.getParameter("ln");
	String o2=request.getParameter("UN");
	String o3=request.getParameter("PW");
	
	session.setAttribute("as",o);
	session.setAttribute("asd",o1);
	session.setAttribute("asdf",o2);
	session.setAttribute("asdfg",o3);
%>
</body>
</html>