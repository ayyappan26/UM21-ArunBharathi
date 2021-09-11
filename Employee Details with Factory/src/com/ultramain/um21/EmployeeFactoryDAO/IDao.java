package com.ultramain.um21.EmployeeFactoryDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import com.ultramain.um21.DTO.*;

public interface IDao {

	public ArrayList<EmployeeDTO> viewEmployeeByDepartment(String departmentName) throws SQLException;
}
