package com.test.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class test {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn = null;
		PreparedStatement pst = null;
		
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://192.168.14.104", "root", "user");
		System.out.println(conn);
//		pst = conn.prepareStatement("")
		
	}
	
}
