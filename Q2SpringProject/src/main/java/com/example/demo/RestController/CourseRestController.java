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

import com.example.demo.Entity.Course;
import com.example.demo.ServiceImpl.CourseServiceImpl;

@RestController
@RequestMapping("/course")
public class CourseRestController {
	
	@Autowired
	private CourseServiceImpl courseServiceImpl;
	
	@PostMapping("/")
	public Course storeData(@RequestBody  Course course)
	{
		return courseServiceImpl.storeCouseData(course);
	}
	
	@GetMapping("/")
	public List<Course> getAll()
	{
		return courseServiceImpl.fetchCourseData();
	}
	
	@PutMapping("/")
	public Course updateData(@RequestBody Course course)
	{
		return courseServiceImpl.upadateCourseData(course); 
	}
	@DeleteMapping("/")
	public String deleteData(@RequestBody Course course)
	{
		courseServiceImpl.deleteCourseData(course);
		return "Deleted";
	}

}
