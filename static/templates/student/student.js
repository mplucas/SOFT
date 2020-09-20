'use strict'

module.controller('StudentController', function($http, $scope, $window, StudentService){
	
	$scope.students = [{}];
	$scope.student = {};
	
	$scope.cols = [
		{name: 'document', widthInPercentage: '30' },
		{name: 'name', widthInPercentage: '30' },
		{name: 'fatherName', widthInPercentage: '20' },
		{name: 'motherName', widthInPercentage: '20' },
		{name: 'fatherPhone', widthInPercentage: '20' },
		{name: 'motherPhone', widthInPercentage: '20' },
		{name: 'parentsEmail', widthInPercentage: '20' },
		{name: 'birth', widthInPercentage: '20' }
	];
	
	$scope.listStudents = function(){
				
		StudentService.list().then(function(response){
		
			$scope.students = response.data;
		});
	};
	
	$scope.listStudents();
	
	$scope.save = function(){
		StudentService.save($scope.student).then(function(response){
			$scope.listStudents();
			$scope.student = {};
		},function(http, status){
			console.log()
			$window.alert("n deu boa" + status);
		});
	};
	
	$scope.update = function(student){
		
		$scope.student = angular.copy(student);
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