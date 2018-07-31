(function(){
	
	angular.module("mainApp",[])
	.controller("StudentController",StudentController);
	
	StudentController.$inject = [ "$scope", "$http"];
	function StudentController($scope, $http){
			$scope.getAll = function(){
			console.log("In getAll");
			$http.get("http://localhost:8080/CRUD/student/getAll")
			.success(function(data) {
				console.log(data);
				$scope.students = data;
			});
			
		}();
		
		$scope.saveStudent = function(){	
						
			$scope.student = {
					"firstName":$scope.firstName,
					"lastName":$scope.lastName,
					"email":$scope.email
			};	
			
		    $http({
		    url: "http://localhost:8080/CRUD/student/saveStudent",
		    method: "POST",
		    headers: {
		    	   'Content-Type': "application/json"
		    },
		    data:$scope.student
		    }).success(function(data) {
		    	console.log("save success");
		    });
		};
		
		$scope.deleteStudent = function(id){
			console.log(id);
			$http.get("http://localhost:8080/CRUD/student/deleteStudent", {
				 params: {'id': id} 
			}).success(function(data) {
			    	console.log("save success");
			    });
			
		};
		
	};
	
	
		
})();