package com.example.demo.ServiceImp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.PostRepository;
import com.example.demo.Service.PostsService;
import com.example.demo.model.Posts;

@Service
public class PostsServiceImp implements PostsService {

	public PostRepository postRepository;
	@Override
	public List<Posts> listAllPosts() {
		// TODO Auto-generated method stub
		return postRepository.findAll();
	}

	@Override
	public Posts saveposts(Posts posts) {
		// TODO Auto-generated method stub
		return postRepository.save(posts);
	}

	@Override
	public Posts updatePosts(Posts posts) {
		// TODO Auto-generated method stub
		return postRepository.save(posts);
	}

	@Override
	public String deleteposts(Posts posts) {
		// TODO Auto-generated method stub
		 postRepository.delete(posts);
		return "deleted successFully";
	}

}
