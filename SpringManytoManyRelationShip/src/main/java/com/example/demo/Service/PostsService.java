package com.example.demo.Service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.demo.model.Posts;


public interface PostsService {
	
	public List<Posts> listAllPosts();
	public Posts saveposts(Posts posts);
	public Posts updatePosts(Posts posts);
	public String deleteposts(Posts posts);
	

}
