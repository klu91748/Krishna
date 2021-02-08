package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.dao.UserDao;
import com.example.model.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	UserDetailsService userDetailsService;
	
	
	public boolean register(String name, String pass) {
		User user = userDao.findById(name).orElse(null);
		if (user != null) {
			return false;
		}
		user = new User(name, passwordEncoder.encode(pass), "USER");

		userDao.save(user);
		return true;
	}
	
	public User findUser(String name) {
		return userDao.findById(name).get();
	}
	
	public boolean seedDB() {
		userDao.save(new User("user", passwordEncoder.encode("pass"), "USER"));
		userDao.save(new User("admin", passwordEncoder.encode("pass"), "ADMIN"));
		
		return true;
	}

}
