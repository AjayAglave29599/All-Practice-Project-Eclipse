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
	private ProductRepository  productRepository;

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public List<Product> viewAllProduct() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Product viewProduct(Long id) {
		// TODO Auto-generated method stub
		return productRepository.getById(id);
	}

	@Override
	public Product viewProductByCategory(String name) {
		
		return null;
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public String removeProduct(Product product) {
		// TODO Auto-generated method stub
		productRepository.delete(product);
		return "Deleted";
	}
	

}
