package com.ultramain.um21.Factory;

import com.ultramain.um21.Dao.IDao;
import com.ultramain.um21.Dao.OracleDao;

public class OracleFactory extends AbstractFactory{

	public IDao getDao() {
		
		return new OracleDao();
	}

}
