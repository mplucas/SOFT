'use strict'

function TruersGridController() {
	
};

module.component('truersGrid', {
  bindings: {
    items: '=',
	cols: '=',
	onUpdate: '<',
	onDelete: '<',
	onView: '<',
  },
  templateUrl: '/components/truers-grid/truers-grid.html',
  controller: TruersGridController
});