package com.example.demo.Service;

import java.util.List;

import com.example.demo.model.Category;

public interface CategoryService {
	
	public List<Category> viewAllCategory();
	public Category addCategory(Category category);
	public Category updtateCategory(Category category);
	public String removeCategory(Category category);
	
   

}
