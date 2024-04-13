package model;

import java.time.LocalDate;

public class User {
	 private String username;
	 private String password;
	 private String email;
	 private LocalDate dateOfBirth;
	 private String gender;
	 private String phoneNumber;
	 
	 
	 public User(String username, LocalDate dateOfBirth, String gender,String email, String phoneNumber, String password) { 
	        this.username = username;
	        this.dateOfBirth = dateOfBirth;
	        this.gender = gender; 
	        this.email = email;
	        this.phoneNumber = phoneNumber;
	        this.password = password;
	    }


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	 
	}