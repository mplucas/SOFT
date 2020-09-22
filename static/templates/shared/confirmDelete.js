'use strict'

module.controller('ConfirmDeleteCtrl', function ($scope, $uibModalInstance) {

  	$scope.delete = function () {
    	$uibModalInstance.close();
  	};

  	$scope.cancel = function () {
    	$uibModalInstance.dismiss();
  	};
});