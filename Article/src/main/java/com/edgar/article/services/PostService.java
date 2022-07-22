package com.edgar.article.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edgar.article.models.Post;
import com.edgar.article.repositories.PostRepository;

@Service
public class PostService {
	
	
	@Autowired
	private PostRepository pRep; 
	
	//get all 
	public List<Post> getall(){
		return pRep.findAll();
	}
	
	// add to post 
	public Post addNew (Post post) {
		return pRep.save(post);
	}

}
