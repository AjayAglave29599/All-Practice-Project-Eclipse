package com.example.demo.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Category;
import com.example.demo.serviceImpl.CategoryServiceImpl;

@RestController
@RequestMapping("/category")
public class CategoryRestController {
	
	@Autowired
	private CategoryServiceImpl categoryServiceImpl;
	
	@GetMapping("/")
	public List<Category> display()
	{
		return categoryServiceImpl.viewAllCategory();
	}
	
	@PostMapping("/")
	public Category add(@RequestBody Category category)
	{
		return categoryServiceImpl.addCategory(category);
	}
	@PutMapping("/")
	public Category update(@RequestBody Category category)
	{
		return categoryServiceImpl.updateCategory(category);
	}
	@DeleteMapping("/")
	public String delete(@RequestBody Category category)
	{
		categoryServiceImpl.deleteCategory(category);
		return "Deleted Successfully";
		
	}

}
