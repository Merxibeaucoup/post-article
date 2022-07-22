package com.edgar.article.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edgar.article.models.Post;
import com.edgar.article.services.PostService;

@RestController
public class ArticleController {
	
	
	@Autowired
	private PostService pServ;
	
	
	@PostMapping("/posts")
	public Post addPost(@RequestBody Post post) {
		
		if(post.getDate()==null) {
			post.setDate(new Date());
		}
		return pServ.addNew(post);
	}
	
	@GetMapping("/posts")
	public List<Post> getAll(){
		return pServ.getall();
	}

}
