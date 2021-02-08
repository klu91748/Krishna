package com.example.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private String name;
	private String pass;
	
	private String roles;
	
	public User() {
		super();
	}
	public User(String name, String pass, String roles) {
		super();
		this.name = name;
		this.pass = pass;
		this.roles = roles;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public List<String> getRoleList() {
		if (this.roles.length() > 0) {
			return Arrays.asList(this.roles.split(","));
		}
		return new ArrayList<>();
	}
}

