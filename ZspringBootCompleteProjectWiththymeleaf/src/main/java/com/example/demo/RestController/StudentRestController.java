package com.example.demo.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ServiceImpl.StudentServiceImpl;
import com.example.demo.model.Student;

@RestController
@RequestMapping("/Student")
public class StudentRestController {
	
	@Autowired
	private StudentServiceImpl serviceImpl;
	
	@PostMapping("/")
	public void addData(@RequestBody Student student)
	{
		serviceImpl.storeData(student);
	}
	
	@GetMapping("/")
	public List<Student> listData()
	{
		return serviceImpl.fetchData();
		
	}
	@PutMapping("/")
	public void update(@RequestBody Student student)
	{
		serviceImpl.updateData(student);
	}
	@DeleteMapping("/del/{id}")
	public void delete(@PathVariable int id)
	{
		serviceImpl.deleteData(id);
	}

}
