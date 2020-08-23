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
		{name: 'Nome', widthInPercentage: '30' },
		{name: 'Idade', widthInPercentage: '10' },
		{name: 'Curso', widthInPercentage: '20' },
		{name: 'Departamento', widthInPercentage: '20' }
	];
	
	/*StudentService.list().then(function(response){
		
		$scope.students = response.data;				
	});*/
	
	$scope.save = function(){
		debugger;
		StudentService.save($scope.student).then(function(response){			
			$scope.list();
		},function(http, status){
			console.log()
			$window.alert("n deu boa" + status);
		});
	};
});