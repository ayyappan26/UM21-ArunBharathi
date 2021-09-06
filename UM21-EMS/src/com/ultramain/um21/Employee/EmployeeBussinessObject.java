package com.ultramain.um21.Employee;

import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author Arun Bharathi
 *
 * The Employee Bussiness Object class will have the methods for interact with User and DAO class 
 * 
 */
public class EmployeeBussinessObject {
	
	Scanner scanner = new Scanner(System.in);
	
	/**
	 * 
	 * This method is the basic for the execution to begin to call the other functions
	 */
	public void employeesBasic() 
	{
		
		EmployeeDAO employeeDAO = new EmployeeDAO();
		int choice;
		char option = 'N';
		System.out.println("Welcome to Employee management system...");
		do 
		{
			
			System.out.println("Enter Your Choice    ");
			System.out.println("1. Register an Employee Detail");
			System.out.println("2. View an Employee Detail    ");
			System.out.println("3. Alter an Employee Detail   ");
			System.out.println("4. Delete an Employee Detail  ");
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
					
					updateEmployee(employeeDAO);
					System.out.println("Do you want to continue (Y/N)");
					option = scanner.next().charAt(0);
					break;
					
				case 4:
					
					DeleteEmployeeDetails(employeeDAO);
					System.out.println("Employee Detail deleted Successfully. ");
					System.out.println("Do you want to continue (Y/N)");
					option = scanner.next().charAt(0);
					break;
			}
		} while (option == 'Y');
		scanner.close();
	}
	
	/**
	 * @param EmployeeDAO
	 * 
	 * This method will call viewEmployee method in Data Access Object which displays data in the database
	 */
	public void viewDetails(EmployeeDAO EmployeeDAO)
	{
		try {
			EmployeeDAO.viewEmployee();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * @param EmployeeDAO
	 * 
	 * This method will call deleteEmployeeDetails method in Data Access Object which delete an Employee Detail
	 */
	public void DeleteEmployeeDetails(EmployeeDAO EmployeeDAO)
	{
		System.out.println("Enter the Employee ID : ");
		int EmployeeID = scanner.nextInt();
		try {
			EmployeeDAO.deleteEmployeeDetails(EmployeeID);
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * @param EmployeeDAO
	 * 
	 * This method will call displayEmployeeWithId method in Data Access Object which displays specified Employee Id of an Employee Detail
	 */
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
	
	/**
	 * @param employeeDAO
	 * 
	 * This method will call egisterEmployee method in Data Access Object which call getEmpDetails to get input from user to register
	 */
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
	
	/**
	 * @param employeeDAO
	 * 
	 * This method will call updateEmployeeDetail method in Data Access Object which update the data in the database
	 */
	public void updateEmployee(EmployeeDAO employeeDAO)
	{
		
		System.out.println("Enter the Employee ID to Update :");
		int EmployeeID = scanner.nextInt();
		EmployeeDTO employeeDTO = getEmpDetails();
			
		try
		{
			employeeDAO.updateEmployeeDetail(EmployeeID, employeeDTO);
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	/**
	 * @return EmployeeDTO
	 * 
	 * This method will get input from the user and directs is to EmployeeDTO class for set
	 */
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
	
}
