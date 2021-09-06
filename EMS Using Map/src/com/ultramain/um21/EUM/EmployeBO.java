package com.ultramain.um21.EUM;

import java.util.Scanner;
import java.util.HashMap;
import java.sql.SQLException;
import java.util.Set;

/**
 * @author Arun Bharathi
 *
 * This Business Object class has the basic methods which will interacts with user 
 */
public class EmployeBO {

	Scanner scanner = new Scanner(System.in);
	int EmployeeId, choice;
	
	HashMap<Integer, EmployeeDTO> map = null;
	public void viewEmployee()
	{
		
		char option = 'N';
		do 
		{
			
			System.out.println("1. All Employee  ");
			System.out.println("2. Employee for Specific ID ");
			System.out.println("Enter Your Choice : ");
			
			choice = scanner.nextInt();
			switch(choice)
			{
				case 1:
					
					viewAllEmployees();
					break;
					
				case 2:
					
					System.out.println("Enter the Employee detail to be viewed : ");
					EmployeeId = scanner.nextInt();
					viewAllEmployees();	
					break;
					
			}
			
			System.out.println("Do you want to continue (Y/N)");
			option = scanner.next().charAt(0);
						
		} while (option == 'Y');

	}
	
	public void viewAllEmployees()
	{
		
		EmployeeDAO employeeDAO = new EmployeeDAO();
		try {
			
			HashMap<Integer, EmployeeDTO > map = employeeDAO.viewAllDetails();
			printDetails(map);
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	
	public void printDetails(HashMap<Integer, EmployeeDTO> map)
	{
		EmployeeDTO employeeDTO = new EmployeeDTO();
		Set<Integer> empIds  = map.keySet();
		if(choice == 1)
		{
			for (Integer empId : empIds) 
			{
				employeeDTO = map.get(empId);
				System.out.println("Employee ID         :  " + employeeDTO.getEmpId());
				System.out.println("Employee First Name :  " + employeeDTO.getFirstName());
				System.out.println("Employee Last Name  :  " + employeeDTO.getLastName());
				System.out.println("Employee Salary     :  " + employeeDTO.getSalary());
				System.out.println("Employee Mobile     :  " + employeeDTO.getMobile());
				System.out.println("Employee Department :  " + employeeDTO.getDepartment());
				System.out.println("-----------------------------------------------------");
				
			}
		}
		
		if(choice == 2)
		{
			if(map.containsKey(EmployeeId))
			{
				
				employeeDTO = map.get(EmployeeId);
				System.out.println("Employee ID         :  " + employeeDTO.getEmpId());
				System.out.println("Employee First Name :  " + employeeDTO.getFirstName());
				System.out.println("Employee Last Name  :  " + employeeDTO.getLastName());
				System.out.println("Employee Salary     :  " + employeeDTO.getSalary());
				System.out.println("Employee Mobile     :  " + employeeDTO.getMobile());
				System.out.println("Employee Department :  " + employeeDTO.getDepartment());
				System.out.println("-----------------------------------------------------");
				
			}
			else
			{
				System.out.println("Employee Details not found.");
			}
		}
	}
}