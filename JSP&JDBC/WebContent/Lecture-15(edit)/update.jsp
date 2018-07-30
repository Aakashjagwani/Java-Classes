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
		String s1=request.getParameter("ui");	
		String s2=request.getParameter("fn");
		String s3=request.getParameter("ln");
		out.println(s1);
		out.println(s2);
		out.println(s3);
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost/table","root","root");
		Statement s=c.createStatement();
		s.executeUpdate("update edit set fn='"+s2+"',ln='"+s3+"' where id='"+s1+"' ");
		s.close();
		c.close();
	%>
</body>
</html>