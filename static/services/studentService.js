'use strict'

module.service('StudentService', function($http) {

	this.save = function(student){
		return $http({
			method: 'POST',
			url: "http://localhost:8080/student",
			data: {
				name: student.name,
				age: student.age,
				course: student.course.courseName
				
			}
		});
	};
	
	this.list = function(){
		return $http.get('/user/list', {});
	};
});