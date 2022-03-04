package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.ProductRepository;
import com.example.demo.Service.ProductService;
import com.example.demo.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> viewAllProduct() {
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
	public Product viewProduct(String productId) {
		// TODO Auto-generated method stub
		return productRepository.getById(productId);
	}

	@Override
	public Product viewProductByCategory(String name) {
		// TODO Auto-generated method stub
		return productRepository.getOne(name);
	}

	@Override
	public String removeProduct(String productId) {
		// TODO Auto-generated method stub
		productRepository.deleteById(productId);;
		return "Deleted";
	}
	

}
