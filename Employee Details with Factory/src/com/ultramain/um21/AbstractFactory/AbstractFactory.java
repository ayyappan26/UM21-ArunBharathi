package com.ultramain.um21.AbstractFactory;

import com.ultramain.um21.EmployeeFactoryDAO.*;

public abstract class AbstractFactory {

	public abstract IDao getDao();
	public static AbstractFactory getFactory(int choice)
	{
		AbstractFactory factory = null;
		switch(choice)
		{
			case 1:
				factory = new OracleFactory();
		}
		
		return factory;
	}
	
}
