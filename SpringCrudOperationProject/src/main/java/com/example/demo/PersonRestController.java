package com.example.demo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonRestController {
	@Autowired
	PersonRepository repo;

	@GetMapping("/")
	public List<Person> getallDetails()
	{
	     return repo.findAll();
	}

	@PostMapping("/")
	public Person saveDetails(@RequestBody Person person)
	{
	    return repo.save(person);
	}

	@PutMapping("/")
	public Person updateDetails(@RequestBody Person person)
	{
	    return repo.save(person);
	}

	@DeleteMapping("/")
	public String deleteDetails(@RequestBody Person person)
	{
	      repo.delete(person);
	     return "Delete Successfully";
	}

}
