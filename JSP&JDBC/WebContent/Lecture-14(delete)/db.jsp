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
	Class.forName("com.mysql.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost/table","root","root");
	Statement s=c.createStatement();
	ResultSet rs=s.executeQuery("SELECT * from del ");
	while(rs.next())
	{
		int i=rs.getInt("id");	
		String s3=rs.getString("fn");
		String s1=rs.getString("ln");
		out.println(i+"<br>");
		out.println(s3+"<br>");
		out.println(s1+"<br>");
		%><a href="table.jsp?id=<%=i%>">Delete</a><br><%
		}
	s.close();
	c.close();
%>	
</body>
</html>