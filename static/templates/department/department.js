'use strict'

module.controller('DepartmentController', function($http, $scope, $window, DepartmentService){
	
	$scope.departments = [{}];
	$scope.department = {};
	
	$scope.cols = [
		{name: 'dep_number', widthInPercentage: '30' },
		{name: 'name', widthInPercentage: '30' },
		{name: 'centralOffice', widthInPercentage: '10' }
	];
	
	$scope.listDepartments = function(){
				
		DepartmentService.list().then(function(response){
		
			$scope.departments = response.data;
		});
	};
	
	$scope.listDepartments();
	
	$scope.save = function(){
		
		DepartmentService.save($scope.department).then(function(response){			
			$scope.listDepartments();
			$scope.department = {};
		},function(http, status){
			console.log()
			$window.alert("n deu boa" + status);
		});
	};
	
	$scope.update = function(department){
		
		$scope.department = angular.copy(department);
	};
	
	$scope.delete = function(department){
		
		DepartmentService.delete(department.reg_number).then(function(response){			
			$scope.listDepartments();
		},function(http, status){
			console.log()
			$window.alert("n deu boa" + status);
		});
	};
});