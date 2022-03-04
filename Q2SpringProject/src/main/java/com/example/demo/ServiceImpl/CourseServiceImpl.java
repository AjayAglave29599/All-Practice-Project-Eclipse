package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Course;
import com.example.demo.Repository.CourseRepository;
import com.example.demo.Service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepository courseRepository;

	@Override
	public Course storeCouseData(Course course) {
		// TODO Auto-generated method stub
		return courseRepository.save(course);
	}

	@Override
	public List<Course> fetchCourseData() {
		// TODO Auto-generated method stub
		return courseRepository.findAll();
	}

	@Override
	public Course upadateCourseData(Course course) {
		// TODO Auto-generated method stub
		return courseRepository.save(course);
	}

	@Override
	public String deleteCourseData(Course course) {
		// TODO Auto-generated method stub
		courseRepository.delete(course);
		return "deletedSuccessfully";
	}
	

}
