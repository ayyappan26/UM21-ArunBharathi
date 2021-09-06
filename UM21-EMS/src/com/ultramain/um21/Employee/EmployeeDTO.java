package com.ultramain.um21.Employee;


/**
 * @author Arun Bharathi
 *
 * This is DTO class for Employee Manage System which has getters and setters 
 */
public class EmployeeDTO 
{
	
	private String firstName;
	private String lastName;
	private float salary;
	private int empId;
	private String department;
	private int mobile;
	
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
	
	public float getSalary() {
		return salary;
	}
	
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public int getMobile() {
		return mobile;
	}
	
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	
}
