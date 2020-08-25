'use strict'

module.controller('ProjectController', function($filter, $http, $scope, $window, ProjectService, ProfessorService){
	
	$scope.projects = [{}];
	$scope.project = {};
	$scope.professors = [{}];

	$scope.cols = [
		{name: 'projectNumber', widthInPercentage: '30' },
		{name: 'financier', widthInPercentage: '30' },
		{name: 'budget', widthInPercentage: '20'},
		{name: 'startDate', widthInPercentage: '10', isDate: true },
		{name: 'endDate', widthInPercentage: '20', isDate: true },
		{name: 'profLeaderRegAndName', widthInPercentage: '10'}
	];
	
	$scope.listProjects = function(){
				
		ProjectService.list().then(function(response){
		
			$scope.projects = response.data;
			angular.forEach($scope.projects, function(project){
				project.startDate = $filter('date')(project.startDate, "dd/MM/yyyy");				
				project.endDate = $filter('date')(project.endDate, "dd/MM/yyyy");				
				if(project.profLeader && project.profLeader.reg_number){
					project.profLeaderRegAndName = project.profLeader.reg_number.toString() + ' - ' + project.profLeader.name; 
				}
			});
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
	
	ProfessorService.list().then(function(response){
		
		$scope.professors = response.data;
	});
});