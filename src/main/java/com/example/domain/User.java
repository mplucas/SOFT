package com.example.domain;

import com.example.myapp.constant.UserTypeEnum;

public class User {
	private Long reg_number;
	private String name;
	private Integer age;
	UserTypeEnum userType;
	
	public User(String name, Long reg_number, Integer age, UserTypeEnum userType) {
		this.name = name;
		this.reg_number = reg_number;
		this.age = age;
		this.userType = userType;
	}
	
	public UserTypeEnum getUserType() {
		return userType;
	}

	public void setUserType(UserTypeEnum userType) {
		this.userType = userType;
	}

	public Long getReg_number() {
		return reg_number;
	}

	public void setReg_number(Long reg_number) {
		this.reg_number = reg_number;
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

	public User() {}
	
}