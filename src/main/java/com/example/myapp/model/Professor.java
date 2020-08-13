package com.example.myapp.model;

public class Professor{

	private String name;
	private Integer age;
	private String speciality;
	private String classroom;


	public Professor(String name, Integer age, String userType, String speciality, String classroom) {
		this.name = name;
		this.age = age;
		this.speciality = speciality;
		this.classroom = classroom;
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


	public String getClassroom() {
		return classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}


}

