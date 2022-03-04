package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonRestController {
	@Autowired
	private PersonRepository persinRepository;
	
	@GetMapping(value = { "/api/", "/api/{id}" })
	public Person getDefaultEmployeesByIdWithOptional(@PathVariable Optional<Long> id)
	{
		Person per=new Person();
		  if (id.isPresent()) {
	            //p= personRepository.findById(id.get()).get(); 
			  per=persinRepository.findById(id.get()).get();
			  return per;
	            
	        }
		  else
		  {
		     return per;
		  }
	}
	@GetMapping("/")
    public List<Person> getAllPerson() {
        return persinRepository.findAll();
    }
 
    @PostMapping("/")
    public Person savePerson(@RequestBody Person person) {
        return persinRepository.save(person);
    }
 
    @PutMapping("/")
    public Person updatePerson(@RequestBody Person person) {
        return persinRepository.save(person);
    }
 
    @DeleteMapping("/")
    public String deletePerson(@RequestBody Person person) {
        persinRepository.delete(person);
        return "deleted Successfully";
    }
	
	
	

}
