package com.example.domain;

import com.example.myapp.constant.UserTypeEnum;

public class Student extends User {

	private String course;
	private Long departmentNumber;
	private Long advisorNumber;
	public Student() {
	}

	public Student(String name, Long reg_number, Integer age, String course, UserTypeEnum userType, Long departmentNumber, Long advisorNumber) {
		super(name, reg_number, age, userType);
		this.course = course;
		this.departmentNumber = departmentNumber;
		this.advisorNumber = advisorNumber;
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
