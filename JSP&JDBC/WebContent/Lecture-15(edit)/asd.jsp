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
	ResultSet rs=s.executeQuery("SELECT * from edit");
	while(rs.next())
	{
		int i=rs.getInt("id");	
		String s1=rs.getString("fn");
		String s2=rs.getString("ln");
		out.println(i+"<br>");
		out.println(s1+"<br>");
		out.println(s2+"<br>");	
		%><a href="edit.jsp?id=<%=i%>">edit</a><br><%
	}
	s.close();
	c.close();
%>
</body>
</html>