
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
	
	String s=request.getParameter("a8");
	
%>
<br>
<input type="text" name="a4<%=s%>" value="Enter your Address"/><br>
<input type="text" name="a5<%=s%>" value="Enter your Address"/><br>
</body>
</html>