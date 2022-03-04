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
import com.example.demo.ServiceImpl.CategoryServiceImpl;
import com.example.demo.model.Category;

@RestController
@RequestMapping("/category")
public class CategoryRestController {
	
	@Autowired
	private CategoryServiceImpl categoryServiceImpl;
	
	@GetMapping("/")
	public List<Category> dispay()
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
	@DeleteMapping("/delete")
	public String delete(@RequestBody Category category)
	{
		categoryServiceImpl.removeCategory(category);
		return "deleted Successfully";
		
	}
	

}
