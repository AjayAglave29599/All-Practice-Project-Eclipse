package com.example.demo.RestController;


import java.util.List;

import javax.persistence.GeneratedValue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.ServiceImpl.StudentServiceImpl;
import com.example.demo.model.Student;

@Controller
public class StudentWebController {
	
	@Autowired
	private StudentServiceImpl impl;
	
	@GetMapping("/show")
	public String displayData(Model model)
	{
		List<Student> s=impl.fetchData();
		model.addAttribute("stu",s);
		return "display";
	}
	
	@GetMapping("/del1/{id}")
	public String deleteData(@PathVariable int id)
	{
		impl.deleteData(id);
		return "redirect:/show";
	}
	
	@GetMapping("/loademptyform") // loading form
	public String load(Model model)
	{
		Student s=new Student();
		model.addAttribute("frm", s);
		return "form";
	}
}
