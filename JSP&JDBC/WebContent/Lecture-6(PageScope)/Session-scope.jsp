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
	String w=(String) request.getAttribute("j");
	String s=(String) session.getAttribute("k");
	String q=(String) application.getAttribute("p");
	out.println(w);
	out.println(s);
	out.println(q);
		
	session.invalidate();
%>
<a href="Session scope.jsp">Next</a>
</body>
</html>