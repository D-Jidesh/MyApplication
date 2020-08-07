package com.example.my_project.my_app.web.dto;

public class UserRegistrationDto {
	private String name;
	private int age;
	private String email;
	private String number;
	private String password;
	
	
	public UserRegistrationDto(String name, int age, String email, String number, String password) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.number = number;
		this.password = password;
	}
	public UserRegistrationDto() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
