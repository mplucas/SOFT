package com.example.myapp.feauture;

public class Department {

	private Long dep_number;
	private String departmentName;
	private String leaderOffice;
	
	public Department(Long dep_number, String departmentName, String leaderOffice) {
		this.dep_number = dep_number;
		this.departmentName = departmentName;
		this.leaderOffice = leaderOffice;
	}
	
	public Long getDep_number() {
		return dep_number;
	}
	public void setDep_number(Long dep_number) {
		this.dep_number = dep_number;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getLeaderOffice() {
		return leaderOffice;
	}
	public void setLeaderOffice(String leaderOffice) {
		this.leaderOffice = leaderOffice;
	}
}
