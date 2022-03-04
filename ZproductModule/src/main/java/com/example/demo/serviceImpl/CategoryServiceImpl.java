package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.CategoryRepository;
import com.example.demo.model.Category;
import com.example.demo.service.CategoryService;

@Service
public class CategoryServiceImpl  implements CategoryService{
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public Category addCategory(Category category) {
		// TODO Auto-generated method stub
		return categoryRepository.save(category);
	}

	@Override
	public List<Category> viewAllCategory() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	@Override
	public Category updateCategory(Category category) {
		// TODO Auto-generated method stub
		return categoryRepository.save(category);
	}

	@Override
	public String deleteCategory(Category category) {
		// TODO Auto-generated method stub
		categoryRepository.delete(category);
		return "deleted Successfully";
	}
	

}
