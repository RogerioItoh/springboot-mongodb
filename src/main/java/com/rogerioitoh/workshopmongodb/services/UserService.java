package com.rogerioitoh.workshopmongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rogerioitoh.workshopmongodb.domain.User;
import com.rogerioitoh.workshopmongodb.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo; 
	
	public List<User> findAll(){		
		return repo.findAll();
	}
	
}
