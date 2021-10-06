package com.rogerioitoh.workshopmongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rogerioitoh.workshopmongodb.domain.Post;
import com.rogerioitoh.workshopmongodb.domain.User;
import com.rogerioitoh.workshopmongodb.dto.UserDTO;
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
	
	/*public User insert (User obj)
	{
		return repo.insert(obj);
	}
	
	
	public void delete (String id)
	{
		User user = repo.findById(id).orElse(null);
		if (user == null)
		{
			throw new ObjectNotFoundException("Objeto não encontrado");
		}
				
		repo.deleteById(id);
	}
	
	
	public User update (User obj)
	{
		User newObj = repo.findById(obj.getId()).orElse(null); 
		updateDate(newObj , obj);
	
		return repo.save(newObj);
	}
	
	
	private void updateDate(User newObj, User obj) {
		
		newObj.setName(obj.getName());
		newObj.setEmail(obj.getEmail());
	}

	public User fromDTO (UserDTO objDto)
	{
		return new User(objDto.getId(), objDto.getName() , objDto.getEmail());
	} */
	
	
	
}
