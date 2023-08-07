package com.itb.mif3an.academicologin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.data.annotation.Id;

@Entity
@Table (name = "user", uniqueConstraints = @UniqueConstraint (columnNames = "email"))
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
	public Long getId() {
		return id;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
