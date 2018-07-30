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
	<x:set var="i" value="harsh"></x:set>
	${i}
	
	<x:forEach var="k" begin="1" end="2">
	     ${k}
	</x:forEach>
	
	<x:if test="${i eq 'harsh'}">
	${i}
	</x:if>
	
	<x:set scope="session" var="h" value="test"></x:set>
	<a href="get.jsp">get</a>
	
	<x:forTokens items="a;b;c;d" var="j" delims=";">
	${j}
	</x:forTokens>
	
	<x:choose>
	<x:when test="${i eq 'harsh'}" >
	${i}
	</x:when>
	<x:when test="${i eq 'aakash'}" >
	${i}
	</x:when>
	<x:otherwise>
	${i}
	</x:otherwise>
	</x:choose>
	
	<x:set var="o" value="${param.fn}">
	</x:set>
	${o}
</body>
</html>