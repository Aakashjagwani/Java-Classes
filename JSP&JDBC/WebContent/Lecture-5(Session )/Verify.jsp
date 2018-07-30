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

	String s3=(String) session.getAttribute("qwe");
	String s4=(String) session.getAttribute("zxc");

	String s5=request.getParameter("Un1");
	String s6=request.getParameter("Pw1");
	if(s3.equals(s5) && s4.equals(s6))
	{
		response.sendRedirect("Welcome.jsp");	
	}
	else
	{
		session.setAttribute("w","Wrong username and Password");
		response.sendRedirect("Login.jsp");	
		
	}
%>
</body>
</html>