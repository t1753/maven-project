package com.restAPI.dto;

public class EmployeeDTO {
	private Integer employeeId;
	private String firstName;
	private String lastName;
	private Integer jobLevelId;
	private Integer departmentId;
	private String emailId;
	private Integer managerId;
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getJobLevelId() {
		return jobLevelId;
	}
	public void setJobLevelId(Integer jobLevelId) {
		this.jobLevelId = jobLevelId;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", jobLevelId=" + jobLevelId + ", emailId=" + emailId + ", managerId=" + managerId + "]";
	}
	

}
