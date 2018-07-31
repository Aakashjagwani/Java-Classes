<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> -->
<title>Registration Form</title>
<link href="/resources/static/css/bootstrap.min.css" rel="stylesheet">
<%-- <link href="<c:url value="/resources/view/css/bootstrap.min.css" />" rel="stylesheet"> --%>
<!-- <link href="/CRUD/resources/view/css/bootstrap.min.css" rel="stylesheet"> -->
</head>
<body>
<div class="container"><br><br>
<form:form action="addStudent" method="post" modelAttribute="student" enctype="multipart/form-data">
	<c:if test = "${student.id != 0}"> 
	<input type="hidden" name="id" value="${student.id}"/> 
	</c:if>
	First Name:<input type="text" name="firstName" value="${student.firstName}" class="form-control"/><br><br>
	Last Name:<input type="text" name="lastName" value="${student.lastName}" class="form-control"/><br><br>
	Email:<input type="text" name="email" value="${student.email}" class="form-control"/><br><br>
	Course:
	<input type="checkbox" name="course" value="Spring"  />Spring
	<input type="checkbox" name="course" value="Angular Js" />Angular Js
	<input type="checkbox" name="course" value="Hibernate" />Hibernate
	<input type="checkbox" name="course" value="Liferay"/>Liferay
	<input type="checkbox" name="course" value="Alfresco" />Alfresco<br><br>	
	Skill: 
	<input type="radio" name="skill" value="Java"/>Java
	<input type="radio" name="skill" value="PHP"/>PHP
	<input type="radio" name="skill" value="JavaScript"/>JavaScript
	<input type="radio" name="skill" value="C#"/>C#
	<br><br>
	<input type="file" name="file" class="file" size="50" /><br><br>
	<input type="submit" class="btn btn-primary" value="submit"><br><br>
	</form:form>
	</div>
</body>
</html>