<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="f" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<f:forEach items="${l}" var="i"> 
<table border="1" >
<tr>
	<td>
		${i.id}
	</td>
	<td>
		${i.fn}
	</td>
	<td>
		${i.ln}
	</td>
</tr>
</table>
</f:forEach>
</body>
</html>