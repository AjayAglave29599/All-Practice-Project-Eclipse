package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Student;

public interface StudentService {
	
	public Student storeStudentData(Student student);
	public List<Student> fetchStudentData();
	public Student upadateStudentData(Student student);
	public String deleteStudentData(Student student);

}
