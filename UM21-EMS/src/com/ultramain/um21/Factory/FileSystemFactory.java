package com.ultramain.um21.Factory;

import com.ultramain.um21.Dao.FileSystemDao;
import com.ultramain.um21.Dao.IDao;

public class FileSystemFactory extends AbstractFactory{

	public IDao getDao() {
		
		return new FileSystemDao();
	}

}
