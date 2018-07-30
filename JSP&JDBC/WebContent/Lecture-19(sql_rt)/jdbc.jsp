<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib prefix="j" uri="http://java.sun.com/jstl/sql_rt" %>
	<%@taglib prefix="k" uri="http://java.sun.com/jstl/core_rt" %>
	<j:setDataSource driver="com.mysql.jdbc.Driver" user="root" password="root" url="jdbc:mysql://localhost/table" var="i" scope="session"></j:setDataSource>
	<a href="get.jsp">Get</a>
	<j:update dataSource="${i}"> 
		UPDATE conn SET fn='Aakash' where pw='asdfg'
	</j:update>
	<j:query dataSource="${i}" var="i1">
		SELECT * FROM conn
	</j:query><br>
	<k:forEach items="${i1.rows}" var="p">
	${p.fn}<br>
	${p.ln}<br>
	</k:forEach><br>
</body>
</html>