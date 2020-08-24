'use strict'

module.controller('StudentController', function($http, $scope, $window, StudentService){
	
	$scope.students = [{}];
	$scope.student = {};
	
	$scope.coursesList = {
		availableCourses: [
			{courseName: 'Computer Science'},
			{courseName: 'Physics Bachelor'},
			{courseName: 'Chemistry Bachelor'},
			{courseName: 'Mechanical Engineering'},
			{courseName: 'Production Engineering'},
			{courseName: 'Civil Engineering'}
		],
		course: {courseName: 'Computer Science'}
	};
	
	$scope.cols = [
		{name: 'reg_number', widthInPercentage: '30' },
		{name: 'name', widthInPercentage: '30' },
		{name: 'age', widthInPercentage: '10' },
		{name: 'course', widthInPercentage: '20' },
		{name: 'departmentNumber', widthInPercentage: '20' },
		{name: 'advisorNumber', widthInPercentage: '20' }
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
		},function(http, status){
			console.log()
			$window.alert("n deu boa" + status);
		});
	};
});