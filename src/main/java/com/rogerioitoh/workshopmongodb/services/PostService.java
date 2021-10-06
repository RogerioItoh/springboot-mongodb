package com.rogerioitoh.workshopmongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rogerioitoh.workshopmongodb.domain.Post;
import com.rogerioitoh.workshopmongodb.repository.PostRepository;
import com.rogerioitoh.workshopmongodb.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo; 
	
	public List<Post> findAll(){		
		return repo.findAll();
	}
	
	public Post findById(String id){		
		Post obj = repo.findById(id).orElse(null);
		if (obj == null)
		{
			throw new ObjectNotFoundException("Objeto não encontrado");
		}
		return obj;
	}
	
	
	
}
