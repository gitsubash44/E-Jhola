package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import model.User;

public class DBUtil {
	 private static final String URL = "jdbc:mysql://localhost:3306/e_jhola";
	 private static final String USERNAME = "root";
	 private static final String PASSWORD = "";
    static {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

	public static boolean addUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}
}