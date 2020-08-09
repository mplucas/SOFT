package com.example.domain;

import com.example.myapp.constant.UserTypeEnum;

public class Professor extends User{

	private String speciality;
	private Integer sala;

	public Professor() {
		super();
	}

	public Professor(String name, Long reg_number, Integer age, UserTypeEnum userType, String speciality, Integer sala) {
		super(name, reg_number, age, userType);
		this.speciality = speciality;
		this.sala = sala;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public Integer getSala() {
		return sala;
	}

	public void setSala(Integer sala) {
		this.sala = sala;
	}
}

