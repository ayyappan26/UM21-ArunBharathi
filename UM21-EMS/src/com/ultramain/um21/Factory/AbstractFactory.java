package com.ultramain.um21.Factory;

import com.ultramain.um21.Dao.IDao;

public abstract class AbstractFactory {

	public abstract IDao getDao();
	
	public static AbstractFactory getFactory(int choice)
	{
		AbstractFactory factory = null;
		
		switch(choice)
		{
			case 1:
				
				System.out.println("1. For Oracle");
				factory = new OracleFactory();
				break;
			
			case 2:
				
				System.out.println("2. For MySql");
				factory = new MySqlFactory();
				break;
			
			case 3:
				
				System.out.println("3. For File System");
				factory = new FileSystemFactory();
				break;
		}
		
		return factory;
	}
}
