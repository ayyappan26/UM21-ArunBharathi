package com.ultramain.um21.Employee;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeBussinessObject {
	
	Scanner scanner = new Scanner(System.in);
	
	public void addEmployees() 
	{
		
		EmployeeDAO employeeDAO = new EmployeeDAO();
		int choice;
		char option = 'N';
		System.out.println("Welcome to Employee management system...");
		do 
		{
			
			System.out.println("Enter Your Choice   ");
			System.out.println("1. Register Employee");
			System.out.println("2. View Employee    ");
			System.out.println("3. Modify Employee  ");
			System.out.println("Enter Your Choice : ");

			choice = scanner.nextInt();
			switch (choice) 
			{
				case 1: 
					
					registerEmployee(employeeDAO);
					System.out.println("Do you want to continue (Y/N)");
					option = scanner.next().charAt(0);
					break;
					
				case 2:
					System.out.println("1.View All Details ");
					System.out.println("2.View For a specific Employ ID ");
					int viewChoice = scanner.nextInt();
					switch(viewChoice)
					{
						case 1:
							
							viewDetails(employeeDAO);
							break;
							
						case 2:
							viewByEmpId(employeeDAO);
					}
					
					System.out.println("Do you want to continue (Y/N)");
					option = scanner.next().charAt(0);
					break;
				case 3:
			}
		} while (option == 'Y');
		scanner.close();
	}
	public void viewDetails(EmployeeDAO EmployeeDAO)
	{
		try {
			EmployeeDAO.viewEmployee();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void DeleteEmployeeDetails()
	{
		
	}
	
	public void viewByEmpId(EmployeeDAO EmployeeDAO)
	{
		System.out.println("Enter the Employee ID : ");
		int EmployeeID = scanner.nextInt();
		try {
			EmployeeDAO.displayEmployeeWithId(EmployeeID);
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void registerEmployee(EmployeeDAO employeeDAO)
	{
		EmployeeDTO employeeDTO = getEmpDetails();
		try
		{
			employeeDAO.registerEmployee(employeeDTO);
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	public EmployeeDTO getEmpDetails()
	{
		
		EmployeeDTO employeeDTO = new EmployeeDTO();

		System.out.println("Employee ID         : ");
		employeeDTO.setEmpId(scanner.nextInt());
		
		System.out.println("Employee First Name : ");
		employeeDTO.setFirstName(scanner.next());
		
		System.out.println("Employee Last Name  : ");
		employeeDTO.setLastName(scanner.next());
	
		System.out.println("Employee Salary     : ");
		employeeDTO.setSalary(scanner.nextFloat());
	
		System.out.println("Employee Mobile     : ");
		employeeDTO.setMobile(scanner.nextInt());
	
		System.out.println("Employee Department : ");
		employeeDTO.setDepartment(scanner.next());
		
		return employeeDTO;
		
	}
	
	public static void main(String args[]) {
		
		EmployeeBussinessObject employeeBO = new EmployeeBussinessObject();
		
		
		employeeBO.addEmployees();
		
	}
}
