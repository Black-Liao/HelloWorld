package com.test.dao;

import java.util.List;

import com.test.bean.Employee;

public interface EmployeeDAO {

	public void addEmployee(Employee employee);
	public void updateEmployee(Employee employee);
	public void deleteEmployee(Employee employee);
	public List<Employee> findAllEmployee();
	public Employee findEmployeeById(int employeeID);
	
}
