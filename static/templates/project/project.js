'use strict'

module.controller('ProjectController', function($http, $scope, $window, ProjectService){
	
	$scope.projects = [{}];
	$scope.project = {};

	$scope.cols = [
		{name: 'projectNumber', widthInPercentage: '30' },
		{name: 'financier', widthInPercentage: '30' },
		{name: 'budget', widthInPercentage: '20'},
		{name: 'startDate', widthInPercentage: '10', isDate: true },
		{name: 'endDate', widthInPercentage: '20', isDate: true }
		
	];
	
	$scope.listProjects = function(){
				
		ProjectService.list().then(function(response){
		
			$scope.projects = response.data;
		});
	};
	
	$scope.listProjects();
	
	$scope.save = function(){
		
		ProjectService.save($scope.project).then(function(response){			
			$scope.listProjects();
			$scope.projects = {};
		},function(http, status){
			console.log()
			$window.alert("n deu boa" + status);
		});
	};
	
	$scope.update = function(project){
		
		$scope.project = angular.copy(project);
	};
	
	$scope.delete = function(project){
		
		ProjectService.delete(project.projectNumber).then(function(response){			
			$scope.listProjects();
		},function(http, status){
			$window.alert("n deu boa" + status);
		});
	};
});