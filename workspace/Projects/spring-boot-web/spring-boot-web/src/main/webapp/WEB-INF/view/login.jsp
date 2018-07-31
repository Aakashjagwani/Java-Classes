<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="/resources/static/css/bootstrap.min.css" rel="stylesheet">
<%-- <link href="<c:url value="/resources/view/css/bootstrap.min.css" />" rel="stylesheet"> --%>
</head>
<body>
<div class="container"><br><br>
<h1 align="center">Login</h1>
	<c:url value="/auth/login_check?targetUrl=${targetUrl}" var="loginUrl" />
	<form name='f' action="${loginUrl}" method='POST'>
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" /> 
			User:<input type='text' name='j_username'value=''  class="form-control"><br><br> 
			Password:<input type='password' name='j_password'  class="form-control" /><br><br>
			Remember Me: <input type="checkbox" name="remember-me" /><br><br>
		<input name="submit" type="submit" class="btn btn-primary" value="submit" />
	</form>
</div>	
</body>
</html>