package com.iavtar.vpi.service;

import java.util.List;

import com.iavtar.vpi.model.User;


public interface UserService {

	void saveUser(User user);
	
	List<User> allUsers();
	
	List<User> adminUsers();
	
	List<User> deactivatedUsers();
	
}
