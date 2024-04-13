package com.controller.Data;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.util.DBUtil;
import model.User;

public class Userdataimp implements Userdata {
	 @Override
	    public boolean addUser(User user) {
	        String query = "INSERT INTO users (username, date_of_birth, gender, phone_number, email, password) VALUES (?, ?, ?, ?, ?, ?)";

	        try (Connection connection = DBUtil.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

	             preparedStatement.setString(1, user.getUsername());
	             preparedStatement.setDate(2, java.sql.Date.valueOf(user.getDateOfBirth()));
	             preparedStatement.setString(3, user.getGender());
	             preparedStatement.setString(4, user.getPhoneNumber());
	             preparedStatement.setString(5, user.getEmail());
	             preparedStatement.setString(6, user.getPassword());

	            int rowsAffected = preparedStatement.executeUpdate();

	            return rowsAffected > 0;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }

	    @Override
	    public boolean isValidUser(String username, String password) {
	        String query = "SELECT * FROM users WHERE username = ? AND password = ?";
	    	 try (Connection connection = DBUtil.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

	            preparedStatement.setString(1, username);
	            preparedStatement.setString(2, password);

	            ResultSet resultSet = preparedStatement.executeQuery();

	            return resultSet.next();
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
	}
