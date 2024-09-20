package com.kodbook.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodbook.entities.User;
import com.kodbook.repositories.UserRepository;

@Service
public class UserServiceImplementation<UserProfileDTO> implements UserService {
	
	@Autowired
	UserRepository repo;

	public boolean userExists(String username, String email) {
		User u1= repo.findByEmail(email);
		User u2 = repo.findByUsername(username);
		if ( u1 != null || u2 != null ) {
			return true;
		}
		return false;
	}
	
	public void addUser(User user) {
		// TODO Auto-generated method stub
		repo.save(user);	
	}

	
	public boolean validateUser(String username, String password) {
		// TODO Auto-generated method stub
		
		String dbPassword = repo.findByUsername(username).getPassword();
		if ( password.equals(dbPassword) ) {
			return true;
		}
		return false;
	}

	@Override
	public User getUser(String username) {
		// TODO Auto-generated method stub
		return repo.findByUsername(username);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		 repo.save(user);
	}


	

}
