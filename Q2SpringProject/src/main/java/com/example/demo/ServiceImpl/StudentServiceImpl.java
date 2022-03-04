package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;
import com.example.demo.Service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student storeStudentData(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public List<Student> fetchStudentData() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student upadateStudentData(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public String deleteStudentData(Student student) {
		// TODO Auto-generated method stub
		studentRepository.delete(student);
		return "deleted Successfully";
	}
	
	

}
