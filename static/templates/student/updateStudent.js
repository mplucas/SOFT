'use strict'

module.controller('UpdateStudentCtrl', function ($scope, $uibModalInstance, student) {

	$scope.student = student;

  	$scope.save = function (ev) {
    	$uibModalInstance.close($scope.student, ev);
  	};

  	$scope.cancel = function () {
    	$uibModalInstance.dismiss();
  	};
});