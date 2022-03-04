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

import com.example.demo.Entity.Student;
import com.example.demo.ServiceImpl.StudentServiceImpl;

@RestController
@RequestMapping("/student")
public class StudentRestController {
	
	@Autowired
	private StudentServiceImpl studentServiceImpl;
	
	@PostMapping("/")
	public Student storeStudent(@RequestBody Student student)
	{
		return studentServiceImpl.storeStudentData(student);
	}
	
	@GetMapping("/")
	public List<Student> getAll(@RequestBody Student student)
	{
		return studentServiceImpl.fetchStudentData();
	}
	@PutMapping("/")
	public Student updateData(@RequestBody Student student)
	{
		return studentServiceImpl.upadateStudentData(student);
	}
	
	@DeleteMapping("/")
	public String delteData(@RequestBody Student student)
	{
		studentServiceImpl.deleteStudentData(student);
		return "Deleted";
	}

}
