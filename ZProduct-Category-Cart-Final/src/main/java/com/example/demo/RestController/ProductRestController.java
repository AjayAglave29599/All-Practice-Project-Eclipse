package com.example.demo.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.ServiceImpl.ProductServiceImpl;
import com.example.demo.model.Product;

@RestController
@RequestMapping("/product")
public class ProductRestController {
	
	@Autowired
	private ProductServiceImpl productServiceImpl;
	
	
	@GetMapping("/")
	public List<Product> display()
	{
		return productServiceImpl.viewAllProduct();
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
	
	@GetMapping("/{productId}")
	public Product displayById(@PathVariable("productId") String productId)
	{
		return productServiceImpl.viewProduct(productId);
	}
	
	@GetMapping("/{name}")
	public Product displayByCategory(@PathVariable("name") String name )
	{
		return productServiceImpl.viewProductByCategory(name);
	}
	
	@DeleteMapping("/del/{productId}")
	public String delete(@PathVariable("productId") String productId)
	{
		productServiceImpl.removeProduct(productId);
		return "deleted Successfully";
	}
}
