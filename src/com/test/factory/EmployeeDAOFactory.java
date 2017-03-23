package com.test.factory;

import com.test.dao.EmployeeDAO;
import com.test.daoImpl.EmployeeDAOImpl;

public class EmployeeDAOFactory {

	public static EmployeeDAO getEmployeeDAOInstance(){
		return  new EmployeeDAOImpl();
	}
	
}
