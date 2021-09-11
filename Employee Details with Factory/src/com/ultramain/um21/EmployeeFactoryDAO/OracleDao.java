package com.ultramain.um21.EmployeeFactoryDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.ultramain.um21.Data.*;
import com.ultramain.um21.DTO.EmployeeDTO;

public class OracleDao implements IDao{

	
	public ArrayList<EmployeeDTO> viewEmployeeByDepartment(String departmentName) throws SQLException 
	{
		
		ArrayList<EmployeeDTO> arrayList = null;
		
		boolean deptCheck = isDepartmentAvailable(departmentName);
		if(deptCheck==true){
			int deptId = 0;
			deptId = getDeptID(departmentName);
			arrayList = getEmpDetails(deptId);
		}else{
			System.out.println("Invalid department name...");
		}
		return arrayList;
	}

	private boolean isDepartmentAvailable(String departmentName)throws SQLException
	{
		 boolean status = false;
		 Connection con = DataConnect.getDbConnection();
		 String deptQuery = "select count(department_id) from Department where lower(department) = lower(?)";
		 PreparedStatement pst = con.prepareStatement(deptQuery);
			pst.setString(1, departmentName);
			ResultSet rs = pst.executeQuery();
			while(rs.next()){
				int count = rs.getInt(1);
				if(count!=0){
					status = true;
				}
			}
		 return status;

	}
	
	private int getDeptID(String departmentName) throws SQLException {
		int deptId = 0;
		Connection con = DataConnect.getDbConnection();
		String deptQuery = "select department_id from department where lower(department) = lower(?)";
		PreparedStatement pst = con.prepareStatement(deptQuery);
		pst.setString(1, departmentName);
		ResultSet rs = pst.executeQuery();
		
		while(rs.next()){
			deptId= rs.getInt(1);
		}
		return deptId;
	}
	
	private ArrayList<EmployeeDTO> getEmpDetails(int deptId) throws SQLException{
		ArrayList<EmployeeDTO> empList = new ArrayList<>();
		//EmpDto dto  = new EmpDto();
		 Connection con = DataConnect.getDbConnection();
		 String deptQuery = "select empid, firstname, lastname, salary, department, mobile FROM Details WHERE department_id = ?";
		 PreparedStatement pst = con.prepareStatement(deptQuery);
			pst.setInt(1, deptId);
			ResultSet deptResultSet = pst.executeQuery();
			while(deptResultSet.next()){
				EmployeeDTO employeeDto  = new EmployeeDTO();
				employeeDto.setEmployeeId(deptResultSet.getInt(1));
				employeeDto.setFirstName(deptResultSet.getString(2));
				employeeDto.setLastName(deptResultSet.getString(3));
				employeeDto.setSalary(deptResultSet.getFloat(4));
				employeeDto.setDepartment(deptResultSet.getString(5));
				employeeDto.setMobile(deptResultSet.getInt(6));
				empList.add(employeeDto);
			}
		
		return empList;
	}

}
