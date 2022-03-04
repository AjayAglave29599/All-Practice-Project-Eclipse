package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Course;
import com.example.demo.Entity.Student;

public interface CourseService {
	
	public Course storeCouseData(Course course);
	public List<Course> fetchCourseData();
	public Course upadateCourseData(Course course);
	public String deleteCourseData(Course course);


}
