<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib prefix="k" uri="http://java.sun.com/jstl/core_rt" %>
	<%@taglib prefix="j" uri="http://java.sun.com/jstl/sql_rt" %>
	<k:set var="i" value="${sessionScope.i}"></k:set>
	
	<j:update dataSource="${i}"> 
		UPDATE conn SET fn='vbn' where pw='asdfg'
	</j:update>
	
</body>
</html>