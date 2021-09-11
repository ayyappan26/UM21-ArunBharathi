package com.ultramain.um21.AbstractFactory;

import com.ultramain.um21.EmployeeFactoryDAO.IDao;
import com.ultramain.um21.EmployeeFactoryDAO.OracleDao;

public class OracleFactory extends AbstractFactory {

	public IDao getDao() {
		
		return new OracleDao();
	}

}
