package com.test.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {

	public static final String DBDRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://192.168.1.106:3306/db_affairmanage";
	public static final String DBUSER = "root";
	public static final String DBPASSWORD = "root";
	
	/**
	 * ��ȡ���� ������ݿ����Ӷ���
	 * @return
	 */
	public static Connection getConnection(){
		
		Connection conn = null;
		
		try {
			Class.forName(DBDRIVER);
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	/**
	 * �ر����Ӷ���
	 */
	public static void close(Connection conn){
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * �ر�Ԥ��������
	 * @param ps
	 */
	
	public static void close(PreparedStatement ps){
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * �رս����
	 */
	public static void close(ResultSet result){
		if (result != null) {
			try {
				result.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
