package com.car.springbootproject.service;

import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.car.springbootproject.entity.User;
import com.car.springbootproject.entity.UserDetailsImpl;
import com.car.springbootproject.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user=userRepo.findByUserName(username);
		
//		System.out.println("inside impl "+user);
		
		if(user==null) {
			System.out.println("exception thrown");
			throw new UsernameNotFoundException(username + "not found");
		}
		return new UserDetailsImpl(user);
	}

}