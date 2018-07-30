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
	${sessionScope.h }
	<x:set var="i1" value="${sessionScope.h }">
	</x:set>
	${i1}
	<form action="Core_JSTL.jsp">
	<input type="text" name="fn" value="first name">
	<input type="submit" value="submit"> 
	</form>
</body>
</html>