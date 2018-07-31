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
<link href="/resources/static/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<div class="container">
<br/><br/>
<h2>Student Information</h2><br/>

	<sec:authorize access="isRememberMe()">
		<h2># This user is login by "Remember Me Cookies".</h2><br/>
	</sec:authorize>

	<sec:authorize access="isFullyAuthenticated()">
		<h2># This user is login by username / password.</h2><br/>
	</sec:authorize>	
	
	<form:form action="search">
			<h5>Search Student by First Name and Last Name: </h5><input type="text" name="search" class="form-control"/><br><br>
			<input type="submit" class="btn btn-primary" value="Search Student" />
	</form:form><br/><br/><br/>
	
	<sec:authorize access="hasRole('ROLE_USER')">
	<form:form action="addJsp">
			<input type="submit" class="btn btn-primary" value="Add Student" />
	</form:form></sec:authorize><br/><br/>
	
	<table class="table table-striped">
			<tr>				
				<th>FirstName</th>
				<th>LastName</th>
				<th>Email</th>
				<th>Skill</th>
				<th>Course</th>
				<th colspan="2">Action</th>
			</tr>
			<tr>	
			<c:forEach var="student" items="${STUDENT_LIST}">				
				<c:url var="Delete" value="deleteStudent">
					<c:param name="studentId" value="${student.id}"></c:param>
				</c:url>
				<c:url var="Update" value="loadStudent">
					<c:param name="studentId" value="${student.id}"></c:param>
				</c:url>
				<c:url var="Course" value="course">
					<c:param name="studentId" value="${student.id}"></c:param>
				</c:url>				
				<td>${student.firstName}</td>
				<td>${student.lastName}</td>
				<td>${student.email}</td>
				<td>${student.skill.skill}</td>
				<td><a href="${Course}">Course</a>
				<td><sec:authorize access="hasRole('ROLE_USER')"><a href="${Update}">Update</a></sec:authorize> <sec:authorize access="hasRole('ROLE_ADMIN')"><a href="${Delete}"
						onclick="if (!(confirm('Are you sure you want to delete this student?')))return false">Delete</a></sec:authorize>
			</td>			
			</tr>	
			</c:forEach>		
</table><br><br>

<h4><a href="download">Download PDF Document</a><span> | <a href="exportWorld">Download World Document</a></span></h4><br><br>

<form action="j_spring_security_logout"  method="post">
	<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
	<input name="submit"  class="btn btn-primary" type="submit" value="Logout" />
</form>
</div> 
</body>
</html>