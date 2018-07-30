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
String s=request.getParameter("Fn");
String s1=request.getParameter("Ln");
String s2=request.getParameter("CT");
String s3=request.getParameter("CO");
String s4=request.getParameter("Adress");
String s5=request.getParameter("q");
String sx[]=request.getParameterValues("hb");

out.println(s); %><br><%
out.println(s1); %><br><%
out.println(s2); %><br><%
out.println(s3); %><br><%
out.println(s4); %><br><%
out.println(s5); %><br><%
for(int i=1;i<=sx.length;i++)
{
	if(sx!=null){
		out.println(sx[i]);
	}
}
%>
</body>
</html>