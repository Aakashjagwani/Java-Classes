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
		<x:forEach items="${sessionScope.list}" var="l" >
		ID 	<input type="button" name="1" value="${l}"/><br><br>		
		</x:forEach>
		<x:forEach items="${sessionScope.list2}" var="l2" >
			COUNTRY <select name="3">
							<option>${l2}</option>
						</select>		<br><br>
		</x:forEach>		
		<x:forEach items="${sessionScope.list1}" var="l1" >
				STATE <select name="2">
							<option>${l1}</option>
						</select>
					<br><br>	
		</x:forEach>	
</body>
</html>