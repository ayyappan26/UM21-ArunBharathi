package com.ultramain.um21.Factory;

import com.ultramain.um21.DAO.IDao;

public abstract class AbstractFactory {

	public abstract IDao getDao();
	
	public static AbstractFactory fetFactory(int chice)
	{
		
		AbstractFactory factory = null;
		
		switch(1)
		{
			case 1:
				factory = new OracleFactory();
				break;
		}
		return factory;
	}
}
