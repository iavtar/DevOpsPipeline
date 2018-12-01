package com.iavtar.vpi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.iavtar.vpi.model.User;
import com.iavtar.vpi.repository.UserRepository;


/**
 * @author indra
 * */

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public void saveUser(User user) {
		userRepository.save(user);
	}

	@Override
	public List<User> allUsers() {
		List<User> allUsers = (List<User>) userRepository.findAll();
		return allUsers;
	}

	@Override
	public List<User> adminUsers() {
		List<User> adminUsers = userRepository.findAdminUsers();
		return adminUsers;
	}

	@Override
	public List<User> deactivatedUsers() {
		List<User> deactivatedUsers = userRepository.deactivatedUsers();
		return deactivatedUsers;
	}

}
