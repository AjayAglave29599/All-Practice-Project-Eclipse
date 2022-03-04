package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Product;

public interface ProductService {
	
	public List<Product> viewAllProducts();
	public Product addProduct(Product product);
	public Product updateProduct(Product product);
	public Product viewProduct(String id);
	public List<Product> viewPrductByCategory(String name);
	public String removePrduct(String id);
	
	

}
