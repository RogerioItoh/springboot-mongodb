package com.rogerioitoh.workshopmongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rogerioitoh.workshopmongodb.domain.User;
import com.rogerioitoh.workshopmongodb.repository.UserRepository;
import com.rogerioitoh.workshopmongodb.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repo; 
	
	public List<User> findAll(){		
		return repo.findAll();
	}
	
	public User findById(String id){		
		User user = repo.findById(id).orElse(null);
		if (user == null)
		{
			throw new ObjectNotFoundException("Objeto não encontrado");
		}
		return user;
	}
	
	
	
}
