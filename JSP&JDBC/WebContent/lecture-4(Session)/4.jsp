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
	String s2=(String) session.getAttribute("abc");
	Integer s1=(Integer) session.getAttribute("xys");
	String s=(String) session.getAttribute("qwe");
	Float s3=(Float) session.getAttribute("rty");
	out.println(s2);
	out.println(s1);
	out.println(s);
	out.println(s3);
	session.removeAttribute("qwe");
%><a href="Fifth.jsp">Next</a>
</body>
</html>