<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.sql.*" %>
<%
String i=request.getParameter("id");
Class.forName("com.mysql.jdbc.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost/table","root","root");
Statement s=c.createStatement();

ResultSet rs=s.executeQuery("select * from edit where id='"+i+"'");

while(rs.next())
{
	int id=rs.getInt("id");
	String s1=rs.getString("fn");
	String s2=rs.getString("ln");
	
	session.setAttribute("q", s1);
	session.setAttribute("q1", s2);
	
}
String s3=(String)session.getAttribute("q");
String s4=(String)session.getAttribute("q1");

%>

<form action="update.jsp">
	id<input type="hidden" name="ui" value=<%=i%>> 
	First name<input type="text" name="fn" value=<%=s3%>>
	last name<input type="text" name="ln" value=<%=s4%>>
	<input type="submit" name="submit">
</form>
</html>