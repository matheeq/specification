package com.specification.model;

import org.hibernate.annotations.Formula;

public class UserResponseDto {
	private int userId;
	private String firstName;
	private String lastName;
	private String email;
	@Formula("concat(firstName,lastName )")
	private String fullName;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public void populateObject(User users) {
		System.out.println("");
		
	}
	
	

}
