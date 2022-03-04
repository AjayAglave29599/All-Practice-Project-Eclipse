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

import com.example.demo.Repository.UserRepository;
import com.example.demo.entity.User;

@RestController
@RequestMapping("/user")
public class UserRestController {
	@Autowired
	private UserRepository repo;
	
	
	@GetMapping("/all")                 // http://localhost:8080/user/all
	public List<User> getAllUser()
	{
		return repo.findAll();
		
	}
	@PostMapping("/save")              // http://localhost:8080/user/save
	public User saveUser(@RequestBody User details)
	{
		return repo.save(details);
		
	}
	
	@PutMapping("/update")              // http://localhost:8080/user/update
	public User updateUser(@RequestBody User details)
	{
		return repo.save(details);
		
	}
	
	@DeleteMapping("/delete")              // http://localhost:8080/user/delete
	public String deleteUser(@RequestBody User details)
	{
		 repo.delete(details);
		 return "Delete successfully";
		
	}

}
