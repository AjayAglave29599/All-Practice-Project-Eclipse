package com.example.demo.Service;

import java.util.List;

import com.example.demo.model.Product;

public interface ProductService {
	
	public Product addProduct(Product product);
	public List<Product> viewAllProduct();
	public Product viewProduct(Long id);
	public Product viewProductByCategory(String name);
	public Product updateProduct(Product product);
	public String removeProduct(Product product);

}
