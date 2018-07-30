<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<form action="../get_state">
		Country:<select name="count">
		<%@taglib prefix="x" uri="http://java.sun.com/jstl/core_rt" %>
		<x:forEach items="${sessionScope.list}" var="i" >
			<option value="${i.id }">
				${i.cn}
			</option>		
		</x:forEach>
		</select>
		State<input type="text" name="pak">
		<input type="submit" value="Ja nikl">
		</form> 
</body>
</html>