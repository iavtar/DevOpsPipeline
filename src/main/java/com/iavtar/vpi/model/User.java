package com.iavtar.vpi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String fName;
	private String lName;
	private Integer phoneNumber;
	private String email;
	private String userName;
	private String password;
	private String role;
	private char activateSwitch;

	public User() {
	}

	public User(Integer id, String fName, String lName, Integer phoneNumber, String email, String userName) {
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.userName = userName;
	}

	public User(Integer id, String fName, String lName, Integer phoneNumber, String email, String userName,
			String password, String role) {
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.role = role;
	}

	public User(Integer id, String fName, String lName, Integer phoneNumber, String email, String userName,
			String role) {
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.userName = userName;
		this.role = role;
	}

	
	
	public User(Integer id, String fName, String lName, Integer phoneNumber, String email, String userName,
			char activateSwitch) {
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.userName = userName;
		this.activateSwitch = activateSwitch;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

	public char getActivateSwitch() {
		return activateSwitch;
	}

	public void setActivateSwitch(char activateSwitch) {
		this.activateSwitch = activateSwitch;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}

}
