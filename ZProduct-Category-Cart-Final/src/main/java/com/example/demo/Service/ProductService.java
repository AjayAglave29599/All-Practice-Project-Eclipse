package com.example.demo.Service;

import java.util.List;

import com.example.demo.model.Product;

public interface ProductService {
	
	public List<Product> viewAllProduct();
	public Product addProduct(Product product);
	public Product updateProduct(Product product);
	public Product viewProduct(String productId);
	public Product viewProductByCategory(String name);
	public String removeProduct(String productId);
	
	
	

}
