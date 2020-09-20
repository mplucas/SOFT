package com.example.myapp.model;

import java.sql.Timestamp;

public class Student {

	private String document;
	private String name;
	private String fatherName;
	private String motherName;
	private String fatherPhone;
	private String motherPhone;
	private String parentsEmail;
	private Timestamp birth;
	
	public Student(String document, String name, String fatherName, String motherName, String fatherPhone,
			String motherPhone, String parentsEmail, Timestamp birth) {
		super();
		this.document = document;
		this.name = name;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.fatherPhone = fatherPhone;
		this.motherPhone = motherPhone;
		this.parentsEmail = parentsEmail;
		this.birth = birth;
	}
	
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getFatherPhone() {
		return fatherPhone;
	}
	public void setFatherPhone(String fatherPhone) {
		this.fatherPhone = fatherPhone;
	}
	public String getMotherPhone() {
		return motherPhone;
	}
	public void setMotherPhone(String motherPhone) {
		this.motherPhone = motherPhone;
	}
	public String getParentsEmail() {
		return parentsEmail;
	}
	public void setParentsEmail(String parentsEmail) {
		this.parentsEmail = parentsEmail;
	}
	public Timestamp getBirth() {
		return birth;
	}
	public void setBirth(Timestamp birth) {
		this.birth = birth;
	}
}

