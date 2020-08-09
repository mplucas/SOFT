'use strict'

var module = angular.module('myApp', [])
module.controller('AppController', function($http, $scope, $window){
		
	
	$scope.userDto = {
            cpf: null,
            name: null,
        };
	
	
	$scope.init = function(){
		$scope.list();		
	}
	
	$scope.saveUser = function(userDto){
		$http({
			method: 'POST',
			url: "http://localhost:8080/user",
			data: {
				name: userDto.name,
				age: userDto.age,
				
			}
		}).success(function(response){			
			$scope.list();
		}).error(function(http, status){
			$window.alert("n deu boa" + status);
		});
	};
	
	$scope.deleteUser = function(user){		
		$http({
			method: 'DELETE',
			url: "http://localhost:8080/user",
			params: { id: user.delId }
		}).then(function(response){
			$scope.list();
			$window.alert("Removing...");			
		});
	};
	
	$scope.list = function(){
		$http.get('/user/list', {}).then(function(response){
			//console.log(response.data);
			$scope.users = response.data;				
		});
	};
	
	$scope.searchById = function(user){	
		$http.get('/user',{					
			params: { id: user.id }
		}).then(function(response){
			console.log("encontrado: ", response.data)
			$scope.userFound = response.data
		});
	};
});
