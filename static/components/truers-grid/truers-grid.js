'use strict'

var TruersGridController = function(){
	debugger;
};

module.component('truersGrid', {
  bindings: {
    items: '=',
	cols: '='
  },
  templateUrl: '/components/truers-grid/truers-grid.html',
  controller: TruersGridController
});