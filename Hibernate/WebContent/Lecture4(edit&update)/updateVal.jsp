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
	<x:forEach items="${sessionScope.list}" var="i" >
	    
	    <form action="../Update">
	    <input type="hidden" value="${i.id}" name="id"><br><br>
		Enter new First name<input type="text" value="${i.fn}" name="fn"><br><br>
		Enter new Last name<input type="text" value="${i.ln}" name="ln"><br><br>
		<input type="submit">	
		</form>     
	</x:forEach>
</body>
</html>