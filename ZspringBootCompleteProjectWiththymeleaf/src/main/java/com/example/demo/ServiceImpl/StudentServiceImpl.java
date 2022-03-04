package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.StudentRepository;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void storeData(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
		
	}

	@Override
	public List<Student> fetchData() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public void updateData(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
	}

	@Override
	public void deleteData(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById((long) id);
		System.out.println("Deleted Successfully");
	}
	
	

}
