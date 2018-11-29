package com.iavtar.vpi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iavtar.vpi.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
	
	@Query("From User u where u.role=admin")
	List<User> findAdminUsers();

	@Query("From User u where u.activateSwitch=a")
	List<User> deactivatedUsers();

}
