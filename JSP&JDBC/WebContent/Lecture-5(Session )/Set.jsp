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
	String Fn1=request.getParameter("Fn");
	String Ln1=request.getParameter("Ln");
	String Un2=request.getParameter("Un");
	String Pw3=request.getParameter("Pw");

	session.setAttribute("str",Fn1);
	session.setAttribute("asd",Ln1);
	session.setAttribute("qwe",Un2);
	session.setAttribute("zxc",Pw3);
%>
<a href="Login.jsp">Next</a>
</body>
</html>