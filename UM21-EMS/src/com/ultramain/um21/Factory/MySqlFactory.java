package com.ultramain.um21.Factory;

import com.ultramain.um21.Dao.IDao;
import com.ultramain.um21.Dao.MySqlDao;

public class MySqlFactory extends AbstractFactory{

	public IDao getDao() {
		
		return new MySqlDao();
	}

}
