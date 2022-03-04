package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {
	
	public void storeData(Student student);
	public List<Student> fetchData();
	public void updateData(Student student);
	public void deleteData(int id);
	

}
