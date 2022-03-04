package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Teacher;
import com.example.demo.Repository.TeacherRepository;
import com.example.demo.Service.TeacherService;
@Service
public class TeacherServiceImpl implements TeacherService{
	

	@Autowired
	private TeacherRepository teacherRepository;
	@Override
	public Teacher storeTeacherData(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherRepository.save(teacher);
	}

	@Override
	public List<Teacher> fetchTeacherData() {
		// TODO Auto-generated method stub
		return teacherRepository.findAll();
	}

	@Override
	public Teacher upadateTeacherData(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherRepository.save(teacher);
	}

	@Override
	public String deleteTeacherData(Teacher teacher) {
		// TODO Auto-generated method stub
		teacherRepository.delete(teacher);
		return "deletedSuccessfully";
	}

}
