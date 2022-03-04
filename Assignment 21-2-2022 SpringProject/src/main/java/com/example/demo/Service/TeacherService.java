package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Student;
import com.example.demo.Entity.Teacher;

public interface TeacherService {
	
	public Teacher storeTeacherData(Teacher teacher);
	public List<Teacher> fetchTeacherData();
	public Teacher upadateTeacherData(Teacher teacher);
	public String deleteTeacherData(Teacher teacher);

}
