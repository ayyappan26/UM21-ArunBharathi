package com.ultramain.um21.BO;

import java.sql.SQLException;
import java.util.ArrayList;
import com.ultramain.um21.AbstractFactory.AbstractFactory;
import com.ultramain.um21.DTO.EmployeeDTO;
import com.ultramain.um21.EmployeeFactoryDAO.IDao;
import com.ultramain.um21.Utility.Scan;


public class EmployeeBO 
{
	
	public void viewEmployeesByDeptartment()
	{
		
		ArrayList<EmployeeDTO> arrayList = null;
		
		AbstractFactory factory = AbstractFactory.getFactory(1);
		IDao dao = factory.getDao();
		
		System.out.println("Enter the department name : ");
		String departmentName = Scan.getInstance().next();
		
		try {
			arrayList = dao.viewEmployeeByDepartment(departmentName);
			if(!arrayList.isEmpty())
			{
				for(EmployeeDTO empDto : arrayList)
				{
					System.out.println("Employee Id  : " + empDto.getEmployeeId());
					System.out.println("First Name   : " + empDto.getFirstName());
					System.out.println("Last Name    : " + empDto.getLastName());
					System.out.println("Salary       : " + empDto.getSalary());
					System.out.println("Mobile       : " + empDto.getMobile());
					System.out.println("Department   : " + empDto.getDepartment());
					System.out.println("----------------------------------------------");
				}
			}
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}
}
