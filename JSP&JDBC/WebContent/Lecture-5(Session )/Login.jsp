<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Verify.jsp">
User Name<input type="text" name="Un1" id="3"/><br>
Password<input type="password" name="Pw1" id="4"/><br> 
<input type="Submit" id="5" value="Submit"/>
<%
		String s=(String) session.getAttribute("w");
		if(s!=null)
		{
			out.println(s);
			session.removeAttribute("w");
		}
	
	
%>
</form>
</body>
</html>