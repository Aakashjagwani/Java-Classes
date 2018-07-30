<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<%@taglib prefix="x" uri="http://java.sun.com/jstl/core_rt" %>
		<x:forEach items="${sessionScope.list1}" var="l" >
			<table align="center" border="1" >
			<tr>
				<td>${l.id}</td>
				<td>${l.state}</td>
				<td>${l.v.cn}</td>
				<td><a href="../get_val?id=${l.id}&state=${l.state}&country=${l.v.cn}">edit</a></td>
			<tr>
			</table>
		</x:forEach>		
</body>
</html>