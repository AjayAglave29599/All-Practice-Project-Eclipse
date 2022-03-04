package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.ProductRepository;
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> viewAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public Product viewProduct(String id) {
		// TODO Auto-generated method stub
		return productRepository.getById(id);
	}

	@Override
	public List<Product> viewPrductByCategory(String name) {
		// TODO Auto-generated method stub
		return (List<Product>) productRepository.findAll();
	}

	@Override
	public String removePrduct(String id) {
		// TODO Auto-generated method stub
		productRepository.deleteById(id);
		return "deleted";
	}

}
