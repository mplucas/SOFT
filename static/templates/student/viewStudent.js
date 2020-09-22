'use strict'

module.controller('ViewStudentCtrl', function ($scope, $uibModalInstance, student) {

	$scope.student = student;
	
	$scope.back = function () {
    	$uibModalInstance.dismiss();
  	};
});