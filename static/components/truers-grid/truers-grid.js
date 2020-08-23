'use strict'

var TruersGridController = function(){

};

module.component('truersGrid', {
  bindings: {
    items: '=',
	cols: '='
  },
  templateUrl: '/components/truers-grid/truers-grid.html',
  controller: TruersGridController
});