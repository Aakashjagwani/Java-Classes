<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="data.jsp">
First Name<input type="text" name="a" value="FIrst name"/><br>
Last name<input type="text" name="a1" value="Last name"/><br>
user name<input type="text" name="a2" value="Username"/><br>
password<input type="password" name="a3" value="Password"/><br>
Permanent_Address<jsp:include page="Address.jsp" ><jsp:param value="p" name="a8"></jsp:param></jsp:include><br>
Resident_Address<jsp:include page="Address.jsp" ><jsp:param value="r" name="a8"></jsp:param></jsp:include><br>
<input type="submit" value="Submit"/>
</form>

</body>
</html>