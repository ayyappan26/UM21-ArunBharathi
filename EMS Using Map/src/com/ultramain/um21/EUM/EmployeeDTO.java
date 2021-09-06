package com.ultramain.um21.EUM;

/**
 * @author Arun Bharathi
 *
 * This DTO class will have getters and setters 
 */
public class EmployeeDTO 
{
	private String firstName;
	private String lastName;
	private float salary;
	private int empId;
	private String department;
	private int mobile;
	
	EmployeeDTO(){
		
	}
	
	EmployeeDTO(int empId ,String firstName,String lastName,float salary,int mobile,String department)
	{
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.mobile = mobile;
		this.department = department;
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
