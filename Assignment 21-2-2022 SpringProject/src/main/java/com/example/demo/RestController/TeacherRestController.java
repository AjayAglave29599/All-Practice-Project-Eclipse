package com.example.demo.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Teacher;
import com.example.demo.ServiceImpl.TeacherServiceImpl;

@RestController
@RequestMapping("/teacher")
public class TeacherRestController {
	
	@Autowired
	private TeacherServiceImpl teacherServiceImpl;
	
	@PostMapping("/")
	public Teacher storeData(@RequestBody Teacher teacher)
	{
		return teacherServiceImpl.storeTeacherData(teacher);
	}
	
	@GetMapping("/")
	public List<Teacher> getAll()
	{
		return  teacherServiceImpl.fetchTeacherData();
	}
	
	@DeleteMapping("/")
	public String deleteData(@RequestBody Teacher teacher )
	{
		teacherServiceImpl.deleteTeacherData(teacher);
		return "deleted";
	}
	

}
