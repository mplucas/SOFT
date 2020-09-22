'use strict'

var module = angular.module('myApp', ['ngMaterial', 'ngAnimate', 'ngSanitize', 'ui.bootstrap']);

module.controller('AppController', function($http, $scope, $window, $mdDialog){

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
	
	function DialogController($scope, $mdDialog, dialogError, dialogText) {
		$scope.dialogError = dialogError;
		$scope.dialogText = dialogText;
        $scope.ok = function() {
	      $mdDialog.hide();
	    };
  	};
	
	$scope.alertSaveSuccess = function(ev) {
		$mdDialog.show({
			locals:{dialogError: false, dialogText: 'Salvo com sucesso.'},
			controller: DialogController,
			templateUrl: 'templates/shared/alertDialog.html',
			parent: angular.element(document.body),
			targetEvent: ev,
			clickOutsideToClose:true,
			fullscreen: false
	    });
	};
	
	$scope.alertSaveError = function(ev) {
		$mdDialog.show({
			locals:{dialogError: true, dialogText: 'Erro ao salvar.'},
			controller: DialogController,
			templateUrl: 'templates/shared/alertDialog.html',
			parent: angular.element(document.body),
			targetEvent: ev,
			clickOutsideToClose:true,
			fullscreen: false
	    });
	};
	
	$scope.alertDeleteSuccess = function(ev) {
		$mdDialog.show({
			locals:{dialogError: false, dialogText: 'Excluido com sucesso.'},
			controller: DialogController,
			templateUrl: 'templates/shared/alertDialog.html',
			parent: angular.element(document.body),
			targetEvent: ev,
			clickOutsideToClose:true,
			fullscreen: false
	    });
	};
	
	$scope.alertDeleteError = function(ev) {
		$mdDialog.show({
			locals:{dialogError: true, dialogText: 'Erro ao excluir.'},
			controller: DialogController,
			templateUrl: 'templates/shared/alertDialog.html',
			parent: angular.element(document.body),
			targetEvent: ev,
			clickOutsideToClose:true,
			fullscreen: false
	    });
	};

});
