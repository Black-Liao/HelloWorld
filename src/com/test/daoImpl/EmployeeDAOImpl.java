package com.test.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.test.bean.Employee;
import com.test.dao.EmployeeDAO;
import com.test.util.DBConnection;

public class EmployeeDAOImpl implements EmployeeDAO{

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> findAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findEmployeeById(int employeeID) {
		Connection conn = DBConnection.getConnection();
		String sql = "select * from tb_employee where employeeID = ?";
		
		PreparedStatement ps = null;
		ResultSet result = null;
		Employee employee = null;
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, employeeID);
			result = ps.executeQuery();
			
			if (result.next()) {
				employee = new Employee();
				employee.setEmployeeID(result.getInt(1));
				employee.setEmployeeName(result.getString(2));
				employee.setEmployeeSex(result.getBoolean(3));
				employee.setEmployeeBirth(result.getDate(4));
				employee.setEmployeePhone(result.getString(5));
				employee.setEmployeePlace(result.getString(6));
				employee.setJoinTime(result.getDate(7));
				employee.setPassword(result.getString(8));
				employee.setLead(result.getBoolean(9));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(conn);
			DBConnection.close(ps);
			DBConnection.close(result);
		}
		
		return employee;
	}

}
