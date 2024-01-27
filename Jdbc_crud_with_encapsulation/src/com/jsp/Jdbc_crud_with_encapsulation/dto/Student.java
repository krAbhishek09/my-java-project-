package com.jsp.Jdbc_crud_with_encapsulation.dto;

public class Student {
	int id;;
	String name;
	String email;
	long phone;
	String gender;
	public Student() {
		super();
	}
	public int getId() {
		return id;
	}
	public Student(int id, String name, String email, long phone, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	

}
