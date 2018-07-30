<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="Get.jsp">
	User name<input type="text" name="User name" value="Username"><br>
	password<input type="text" name="password" value="password"><br>
	Address<input type="text" name="address" value="Address"><br>
	
	<%@ include file="Login.jsp" %>
	Submit<input type="submit" name="submit" value="submit"><br>
	</form>
</body>
</html>