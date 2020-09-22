'use strict'

module.controller('StudentController', function($http, $scope, $window, StudentService, $uibModal){
	
	$scope.students = [{}];
	$scope.student = {};
	
	$scope.cols = [
		{name: 'document', display: 'Documento', flex: '40' },
		{name: 'name', display: 'Nome', flex: '40' }
	];
	
	$scope.listStudents = function(){
				
		StudentService.list().then(function(response){
			
			angular.forEach(response.data, function(student){
				student.birth = new Date(student.birth);				
			});
			$scope.students = response.data;
		});
	};
	
	$scope.listStudents();
	
	$scope.cancel = function(){
		
		$scope.student = {};
	};
	
	$scope.save = function(ev){
		StudentService.save($scope.student).then(function(response){
			$scope.listStudents();
			$scope.student = {};				
			$scope.alertSaveSuccess(ev);
			
		},function(http, status){
			console.log()
			if(ev){
				$scope.errorSaveSuccess(ev);
			}
		});
	};
	
	$scope.update = function(student){
		
	    var modalInstance = $uibModal.open({
	      templateUrl: 'templates/student/updateStudent.html',
	      controller: 'UpdateStudentCtrl',
		  size: 'lg',
	      resolve: {
	        student: function () {
	          return angular.copy(student);
	        }
	      }
	    });
	
	    modalInstance.result.then(function (student, ev) {
			$scope.student = student;
	      	$scope.save(ev);
	    });
	};
	
	$scope.delete = function(student){
		
		StudentService.delete(student.document).then(function(response){			
			$scope.listStudents();
		},function(http, status){
			console.log()
			$window.alert("n deu boa" + status);
		});
	};	
});