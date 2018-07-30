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
	String s1=request.getParameter("fn");
	String s2=" ",s3=" ",s4=" ",s5=" ",s6=" ";
	Class.forName("com.mysql.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost/table","root","root");
	Statement s=c.createStatement();
	ResultSet rs=s.executeQuery("SELECT * FROM servlet where fn='"+s1+"' ");
	while(rs.next())
	{
		
		s6=rs.getString("fn");
		s2=rs.getString("ln");
		s3=rs.getString("un");
		s4=rs.getString("pw");
		s5=rs.getString("ad");
	}
%>
<form action="../edit">
	Enter new Details That u want to Update<input type="hidden" name="ad" value=<%=s5%>><br><br> 
	First name<input type="text" name="fn" value=<%=s1%>><br><br>
	last name<input type="text" name="ln" value=<%=s2%>><br><br>
	User name<input type="text" name="un" value=<%=s3%>><br><br>
	Password<input type="password" name="pw" value=<%=s4%>><br><br>
	<input type="submit" name="submit">
</form>
</body>
</html>