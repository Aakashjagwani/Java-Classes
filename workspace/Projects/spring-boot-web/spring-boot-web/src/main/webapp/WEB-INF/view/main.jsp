<div ng-app="mainApp">
<div ng-controller="StudentController">
<h2>Student Information</h2><br/>
<a href="resources/view/add-student.jsp">Add</a><br><br>
<table>
	   <tr>				
		 <th>FirstName</th>
		 <th>LastName</th>
		 <th>Email</th>
		 <th colspan="2">Action</th>
		 </tr>
			<tr ng-repeat="student in students">				
				<td>{{student.firstName}}</td>
				<td>{{student.lastName}}</td>
				<td>{{student.email}}</td>
				<td><a ng-click="getStudent(student.id)">Update</a> |<a ng-click="deleteStudent(student.id)"
						ng-click="if (!(confirm('Are you sure you want to delete this student?')))return false">Delete</a>
			</td>
			</tr>			
</table><br>
</div>
</div>