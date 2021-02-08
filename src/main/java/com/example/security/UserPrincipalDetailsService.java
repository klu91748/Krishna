package com.example.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.dao.UserDao;
import com.example.model.User;

@Service
public class UserPrincipalDetailsService implements UserDetailsService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		User user = userDao.findById(name).get();
		UserPrincipal userPrincipal = new UserPrincipal(user);
		return userPrincipal;
	}
}
