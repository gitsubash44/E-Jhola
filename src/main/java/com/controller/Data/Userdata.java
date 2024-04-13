package com.controller.Data;

import model.User;

public interface Userdata {

	boolean addUser(User user);
	boolean isValidUser(String username, String password);
}

