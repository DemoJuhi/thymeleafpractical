package com.practise.entities;


import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "Login_Data")

@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
final public class LoginData {
	
	@Override
	public String toString() {
		return "LoginData [username=" + username + ", email=" + email + "]";
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String username;
	private String email;
	public LoginData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginData(String username, String email) {
		super();
		this.username = username;
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
