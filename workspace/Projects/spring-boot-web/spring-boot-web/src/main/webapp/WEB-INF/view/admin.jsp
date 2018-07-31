<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%-- <link href="<c:url value="/resources/view/css/bootstrap.min.css" />" rel="stylesheet"> --%>
<link href="/resources/static/css/bootstrap.min.css" rel="stylesheet">
<!-- <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script type="text/javascript" src="/CRUD/resources/view/student.js"> -->

</script>
</head>
<body>
<div class="container">
<br/><br/>
<h2>Student Information</h2><br/>

<h3>Please login for more information</h3><br>


	<form:form action="login">
			<input type="submit" class="btn btn-primary" value="Login" align="left"/>
	</form:form><br/><br/>
	
	<table class="table table-striped">
			<tr>				
				<th>FirstName</th>
				<th>LastName</th>
				<th>Skill</th>					
			</tr>
			<tr>	
			<c:forEach var="student" items="${STUDENT_LIST}">						
				<td>${student.firstName}</td>
				<td>${student.lastName}</td>				
				<td>${student.skill.skill}</td>					
			</tr>	
			</c:forEach>		
</table><br><br>
</div> 
</body>
</html>