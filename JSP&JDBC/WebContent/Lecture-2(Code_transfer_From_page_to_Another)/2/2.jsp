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
String s1="Admin";
String s2="Akash";
String s=request.getParameter("Un");
String s3=request.getParameter("Pw");
if(s.equals(s1) && s3.equals(s2))
{
	
	response.sendRedirect("wel.jsp");	
}
else
{
	response.sendRedirect("req.jsp");
}
%>
</body>
</html>