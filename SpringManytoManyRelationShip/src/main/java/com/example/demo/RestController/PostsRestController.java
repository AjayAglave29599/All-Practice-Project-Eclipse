package com.example.demo.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ServiceImp.PostsServiceImp;
import com.example.demo.model.Posts;

@RestController
@RequestMapping(name = "/posts")
public class PostsRestController {
	
	@Autowired
	public PostsServiceImp postServiceImp;
	
	@GetMapping("/")
	public List<Posts> getAllPosts()
	{
		return postServiceImp.listAllPosts();
	}
	
	@PostMapping("/")
	public Posts storePosts( @RequestBody Posts posts)
	{
		return postServiceImp.saveposts(posts);
	}
	@PutMapping("/")
	public Posts updatePosts(@RequestBody Posts posts)
	{
		return postServiceImp.updatePosts(posts);
	}
	@DeleteMapping("/")
	 public String deletePosts(@RequestBody Posts posts)
	 {
		 postServiceImp.deleteposts(posts);
		return "deleted";
		 
	 }
	

}
