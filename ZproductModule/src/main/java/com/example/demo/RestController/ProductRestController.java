package com.example.demo.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.serviceImpl.ProductServiceImpl;

@RestController
@RequestMapping("/product")
public class ProductRestController {
	
	@Autowired
	private ProductServiceImpl productServiceImpl;
	
	@GetMapping("/")
	public List<Product> display()
	{
		return productServiceImpl.viewAllProducts();
	}
	
	@PostMapping("/")
	public Product add(@RequestBody Product product)
	{
		return productServiceImpl.addProduct(product);
	}
	
	@PutMapping("/")
	public Product update(@RequestBody Product product)
	{
		return productServiceImpl.updateProduct(product);
	}
	
	@GetMapping("/i/{id}")
	public Product displayProductById(@PathVariable String id)
	{
		return productServiceImpl.viewProduct(id);
	}
	
	@GetMapping("/n/{name}")
	public List<Product> displayProductbyCategory(@PathVariable() String name)
	{
		return productServiceImpl.viewPrductByCategory(name);
	}
	
	@DeleteMapping("/del/{id}")
	public String delete(@PathVariable String id)
	{
		productServiceImpl.removePrduct(id);
		return "Deleted Succesfully";
	}
	
	
	
}
