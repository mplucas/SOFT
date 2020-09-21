'use strict'

var module = angular.module('myApp', ['ngMaterial']);

module.controller('AppController', function($http, $scope, $window){

	$scope.init = function(){

		$scope.entities = [
			{name: 'home', display: 'Home', disabled: true},
			{name: 'user', display: 'Usuarios', disabled: true},
			{name: 'student', display: 'Alunos'},
			{name: 'class', display: 'Turmas', disabled: true},
			{name: 'grade', display: 'Notas', disabled: true},
			{name: 'grades', display: 'Boletim', disabled: true},
			{name: 'course', display: 'Cursos', disabled: true},
		]; 
		
		$scope.selectEntity = function(entity){
			
			$scope.selectedEntityPath = '/templates/' + entity.name + '/' + entity.name + '.html';
		};
		
		$scope.selectEntity($scope.entities[2]);
	};

});
