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

import com.example.demo.Repository.AddressRepository;
import com.example.demo.Repository.UserRepository;
import com.example.demo.entity.Address;
@RestController
@RequestMapping("/Address")
public class AddressRestController {
	
	@Autowired
	private AddressRepository repo;
	
	
	@GetMapping("/all")                 // http://localhost:8080/Address/all
	public List<Address> getAllAddress()
	{
		return repo.findAll();
		
	}
	@PostMapping("/save")              // http://localhost:8080/Address/save
	public Address saveAddress(@RequestBody Address details)
	{
		return repo.save(details);
		
	}
	
	@PutMapping("/update")              // http://localhost:8080/Address/update
	public Address updateAddress(@RequestBody Address details)
	{
		return repo.save(details);
		
	}
	
	@DeleteMapping("/delete")              // http://localhost:8080/Address/delete
	public String deleteAddress(@RequestBody Address details)
	{
		 repo.delete(details);
		 return "Delete successfully";
		
	}

}
