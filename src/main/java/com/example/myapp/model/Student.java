package com.example.myapp.model;

public class Student {

	private String name;
	private Integer age;
	private String course;
	private Long departmentNumber;
	private Long advisorNumber;

	public Student(String name, Integer age, String course, String userType, Long departmentNumber, Long advisorNumber) {
		this.name = name;
		this.age = age;
		this.course = course;
		this.departmentNumber = departmentNumber;
		this.advisorNumber = advisorNumber;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Student() {
	}

	
	public Long getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(Long departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

	public Long getAdvisorNumber() {
		return advisorNumber;
	}

	public void setAdvisorNumber(Long advisorNumber) {
		this.advisorNumber = advisorNumber;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	
	public String getCourse() {
		return course;
	}


}
