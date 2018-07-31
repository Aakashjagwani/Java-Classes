<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="/resources/static/css/bootstrap.min.css" rel="stylesheet">
<!-- <link href="/CRUD/resources/view/css/bootstrap.min.css" rel="stylesheet"> -->
</head>
<body>
	<div class="container"><br><br>
		<c:set var= "student" value="${STUDENT}"/>
		<h1>Course Enroll by <c:out value="${student.firstName}"/></h1><br><br>
		<table class="table table-striped">
			<tr>
				<th>Id</th>
				<th>Course</th>
			</tr>			
				<tr>
					<c:forEach var="course" items="${STUDENT.getCourseList()}">
						<td>${course.id}</td>
						<td>${course.name}</td>				
				</tr>
				</c:forEach>			
		</table>		
	</div>
</body>
</html>