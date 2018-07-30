<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Country:<select name="count" onchange="fnchange()" id="1">
		<%@taglib prefix="x" uri="http://java.sun.com/jstl/core_rt" %>
		<x:forEach items="${sessionScope.list3}" var="i" >
			<option value="${i.id }">
				${i.cn}
			</option>		
		</x:forEach>
		</select><br>
State<select id="2"></select>
<script src="get.js"></script>
</body>
</html>