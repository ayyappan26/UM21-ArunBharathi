package com.ultramain.um21.EUM;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.ultramain.um21.Connection.*;

/**
 * @author Arun Bharathi
 *
 * The Data Access Object class will interact with SQL to get data from database
 * which will return the data as a Map
 */


public class EmployeeDAO {

	public HashMap<Integer, EmployeeDTO> map = new HashMap<Integer, EmployeeDTO>();
	public ArrayList<EmployeeDTO> arrayList = new ArrayList<EmployeeDTO>();
	public HashMap<String, ArrayList<EmployeeDTO>> hash_map = new HashMap<String, ArrayList<EmployeeDTO>>();
	
	public HashMap<String, ArrayList<EmployeeDTO>> viewAllEmployeeByDepartment() throws SQLException
	{
		
		Connection connection = ConnectionClass.getDbConnection();
		String deptDetails = "SELECT distinct department from Details ";
		PreparedStatement pst = connection.prepareStatement(deptDetails);
		ResultSet rs = pst.executeQuery();
		
		ArrayList<String> arrayListSample = new ArrayList<String>();
		
		while(rs.next())
		{
			arrayListSample.add(rs. getString(1));
		}
        
		for(String dept : arrayListSample)
		{
			 	
			ArrayList<EmployeeDTO> arrayList = viewEmployeesByDepartment(dept);    
			hash_map.put(dept, arrayList);
		}
        
		return hash_map;
	}
	
	
	public HashMap<Integer, EmployeeDTO> viewAllDetails() throws SQLException
	{
		
		Connection connection = ConnectionClass.getDbConnection();
		
		Integer employee_id;
		String first_name;
		String last_name;
		Float salary;
		Integer mobile;
		String department;
		
		String allDetails = "Select * from Details ";
		PreparedStatement pst = connection.prepareStatement(allDetails);
		ResultSet rs = pst.executeQuery();
		
		while(rs.next())
		{
			employee_id = rs.getInt(1);
			first_name = rs.getString(2);
			last_name = rs.getString(3);
			salary = rs.getFloat(4);
			mobile = rs.getInt(5);
			department = rs.getString(6);
			
			
			EmployeeDTO employeeDTO = new EmployeeDTO();
			
			employeeDTO.setEmpId(employee_id);
			employeeDTO.setFirstName(first_name);
			employeeDTO.setLastName(last_name);
			employeeDTO.setSalary(salary);
			employeeDTO.setMobile(mobile);
			employeeDTO.setDepartment(department);
			
			map.put(employee_id, employeeDTO);
			
		}
		
		return map;
	}
	
	public ArrayList<EmployeeDTO> viewEmployeesByDepartment(String department) throws SQLException
	{
		
		Connection connection = ConnectionClass.getDbConnection();
		ArrayList<EmployeeDTO> arrayList = new ArrayList<EmployeeDTO>();
		Integer employee_id;
		String first_name;
		String last_name;
		Float salary;
		Integer mobile;
		String dept;
		
		String deptDetails = " SELECT * from Details WHERE department = ?";
		PreparedStatement pst = connection.prepareStatement(deptDetails);
		pst.setString(1, department);
		ResultSet rs = pst.executeQuery();
	
		
		while(rs.next())
		{
			employee_id = rs.getInt(1);
			first_name = rs.getString(2);
			last_name = rs.getString(3);
			salary = rs.getFloat(4);
			mobile = rs.getInt(5);
			dept = rs.getString(6);
			EmployeeDTO employeeDTO = new EmployeeDTO();
			
			employeeDTO.setEmpId(employee_id);
			employeeDTO.setFirstName(first_name);
			employeeDTO.setLastName(last_name);
			employeeDTO.setSalary(salary);
			employeeDTO.setMobile(mobile);
			employeeDTO.setDepartment(dept);
		
			arrayList.add(employeeDTO);
		}
		
		return arrayList;
		
	}

	
}
