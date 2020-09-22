'use strict'

module.controller('StudentController', function($http, $scope, $window, StudentService){
	
	$scope.students = [{}];
	$scope.student = {};
	
	$scope.cols = [
		{name: 'document', display: 'Documento', widthInPercentage: '30' },
		{name: 'name', display: 'Nome', widthInPercentage: '30' },
		{name: 'fatherName', display: 'Nome do Pai', widthInPercentage: '20' },
		{name: 'motherName', display: 'Nome da Mae', widthInPercentage: '20' },
		{name: 'fatherPhone', display: 'Tel. Pai', widthInPercentage: '20' },
		{name: 'motherPhone', display: 'Tel. Mae', widthInPercentage: '20' },
		{name: 'parentsEmail', display: 'E-mail', widthInPercentage: '20' },
		{name: 'birth', display: 'Dt. Nascimento', widthInPercentage: '20', isDate: true }
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
			if(ev){				
				$scope.alertSaveSuccess(ev);
			}
		},function(http, status){
			console.log()
			if(ev){
				$scope.errorSaveSuccess(ev);
			}
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