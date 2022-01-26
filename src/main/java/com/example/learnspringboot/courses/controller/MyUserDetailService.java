package com.example.learnspringboot.courses.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class MyUserDetailService implements UserDetailsService {
	
	@Autowired
	private userRepo repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		
		users user=repo.findByUsername(username);
		if(user==null)
		{
			 throw new UsernameNotFoundException("User not Found getting 404 error");
		}
		// TODO Auto-generated method stub
		return new userPrinciple(user);
	}

}
