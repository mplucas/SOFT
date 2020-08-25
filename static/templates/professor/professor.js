'use strict'

module.controller('ProfessorController', function($http, $scope, $window, ProfessorService){
	
	$scope.profs = [{}];
	$scope.professor = {};
	

	$scope.cols = [
		{name: 'reg_number', widthInPercentage: '30' },
		{name: 'name', widthInPercentage: '30' },
		{name: 'age', widthInPercentage: '10' },
		{name: 'speciality', widthInPercentage: '20' },
		{name: 'classRoom', widthInPercentage: '20' }
	];
	
	$scope.listProfs = function(){
				
		ProfessorService.list().then(function(response){
		
			$scope.profs = response.data;
		});
	};
	
	$scope.listProfs();
	
	$scope.save = function(){
		
		ProfessorService.save($scope.professor).then(function(response){			
			$scope.listProfs();
			$scope.professor = {};
		},function(http, status){
			console.log()
			$window.alert("n deu boa" + status);
		});
	};
	
	$scope.update = function(professor){
		
		$scope.professor = angular.copy(professor);
	};
	
	$scope.delete = function(professor){
		
		ProfessorService.delete(professor.reg_number).then(function(response){			
			$scope.listProfs();
		},function(http, status){
			console.log()
			$window.alert("n deu boa" + status);
		});
	};
});