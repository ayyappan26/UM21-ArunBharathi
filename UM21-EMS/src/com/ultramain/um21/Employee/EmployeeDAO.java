package com.ultramain.um21.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.ultramain.um21.connection.*;

/**
 * @author Arun Bharathi
 * This is the Employee Data Access Object class which interact with Database
 */
public class EmployeeDAO {

	/**
	 * @throws SQLException
	 * 
	 * This method is called in Employee Business Object which will display the data in database
	 */
	public void viewEmployee() throws SQLException
	{
		
		Connection connection = ConnectionClass.getDbConnection();
		
		int employee_id;
		String first_name;
		String last_name;
		float salary;
		int mobile;
		String department;
		
		String sqlQuery = "Select * from Details ";
		PreparedStatement pst = connection.prepareStatement(sqlQuery);
		ResultSet rs = pst.executeQuery();
		
		while(rs.next()){
			employee_id = rs.getInt(1);
			first_name = rs.getString(2);
			last_name = rs.getString(3);
			salary = rs.getFloat(4);
			mobile = rs.getInt(5);
			department = rs.getString(6);
			
			System.out.println("Employee_id : " + employee_id);
			System.out.println("First Name : " + first_name);
			System.out.println("Last Name : " + last_name);
			System.out.println("Salary : " + salary);
			System.out.println("Mobile : " + mobile);
			System.out.println("Department : " +  department);
			System.out.println("----------------------------------");
		}
		
	}
	
	/**
	 * @param EmployeeID
	 * @throws SQLException
	 * 
	 * This method is called in Employee Business Object which will display the Employee detail from database of specified Employee ID 
	 */
	public void displayEmployeeWithId(int EmployeeID) throws SQLException
	{
		
		Connection connection = ConnectionClass.getDbConnection();
		
		String sqlQuery = " SELECT * FROM Details WHERE empId = ?";
		PreparedStatement pst = connection.prepareStatement(sqlQuery);
		
		pst.setInt(1, EmployeeID);
		ResultSet rs = pst.executeQuery();
		
		String first_name;
		String last_name;
		float salary;
		int mobile;
		String department;
		
		rs.next();
		first_name = rs.getString(2);
		last_name = rs.getString(3);
		salary = rs.getFloat(4);
		mobile = rs.getInt(5);
		department = rs.getString(6);
		
		System.out.println("Employee_id : " + EmployeeID);
		System.out.println("First Name : " + first_name);
		System.out.println("Last Name : " + last_name);
		System.out.println("Salary : " + salary);
		System.out.println("Mobile : " + mobile);
		System.out.println("Department : " +  department);
		
	}
	
	/**
	 * @param EmployeeID
	 * @throws SQLException
	 * 
	 * This method will is called in Employee Business Object which will delete Employee detail from database of specified Employee ID
	 */
	public void deleteEmployeeDetails(int EmployeeID) throws SQLException
	{
		Connection connection = ConnectionClass.getDbConnection();
		
		String deleteSql = "DELETE FROM Details WHERE empId = ?";
		PreparedStatement pst = connection.prepareStatement(deleteSql);
		pst.setInt(1, EmployeeID);
		
		ResultSet rs = pst.executeQuery();
		rs.next();
		
	}
	
	/**
	 * @param EmployeeID
	 * @param employeeDTO
	 * @throws SQLException
	 * 
	 * This method will is called in Employee Business Object which will update Employee detail from database of specified Employee ID
	 */
	public void updateEmployeeDetail(int EmployeeID, EmployeeDTO employeeDTO) throws SQLException
	{
		
		Connection connection = ConnectionClass.getDbConnection();
		
		String updateSql = " UPDATE Details SET  empID = ?, firstname = ? , lastname = ? , salary = ? , mobile = ? , department = ? WHERE empID = ?";
		PreparedStatement pst = connection.prepareStatement(updateSql);
		
		
		pst.setInt(1, employeeDTO.getEmpId());
		pst.setString(2, employeeDTO.getFirstName());
		pst.setString(3, employeeDTO.getLastName());
		pst.setFloat(4, employeeDTO.getSalary());
		pst.setInt(5, employeeDTO.getMobile());
		pst.setString(6, employeeDTO.getDepartment());
		pst.setInt(7, EmployeeID);
		
		int rowsUpdated = pst.executeUpdate();
		System.out.println("Rows Updated : " + rowsUpdated);
		
	}
	
	/**
	 * @param employeeDTO
	 * @throws SQLException
	 * 
	 * This method will is called in Employee Business Object which will get user values and add the data in database
	 */
	public void registerEmployee(EmployeeDTO employeeDTO) throws SQLException
	{
		Connection connection = ConnectionClass.getDbConnection();
		
		String sql = "INSERT INTO Details VALUES (?,?,?,?,?,?)";
		PreparedStatement pst = connection.prepareStatement(sql);
		pst.setInt(1, employeeDTO.getEmpId());
		pst.setString(2, employeeDTO.getFirstName());
		pst.setString(3, employeeDTO.getLastName());
		pst.setFloat(4, employeeDTO.getSalary());
		pst.setInt(5, employeeDTO.getMobile());
		pst.setString(6, employeeDTO.getDepartment());
		int rowsUpdated = pst.executeUpdate();
		
		System.out.println("Rows Updated : " + rowsUpdated);
	}
	
}
