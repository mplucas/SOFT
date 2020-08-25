package com.example.myapp.model;

import java.sql.Timestamp;

public class Project {

	private Long projectNumber;
	private String financier;
	private float budget;
	private Timestamp startDate;
	private Timestamp endDate;
	
	

	public Project(Long projectNumber, String financier, Timestamp startDate, Timestamp endDate, float budget) {
		this.projectNumber = projectNumber;
		this.financier = financier;
		this.budget = budget;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public float getBudget() {
		return budget;
	}
	
	public void setBudget(float budget) {
		this.budget = budget;
	}

	public Long getProjectNumber() {
		return projectNumber;
	}

	public void setProjectNumber(Long projectNumber) {
		this.projectNumber = projectNumber;
	}

	public String getFinancier() {
		return financier;
	}

	public void setFinancier(String financier) {
		this.financier = financier;
	}

	public Timestamp getStartDate() {
		return startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	public Timestamp getEndDate() {
		return endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	public Project() {}

}